package co.za.backend.service.impl;

import co.za.backend.model.Country;
import co.za.backend.model.CountryDetails;
import co.za.backend.service.CountryService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CountryServiceImplementation implements CountryService {
    private final RestTemplate restTemplate = new RestTemplate();

    private final String apiUrl = "https://restcountries.com/v3.1/all";

    public List<Country> getAllCountries() {
        ResponseEntity<List<Map<String, Object>>> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<>() {});
        return response.getBody().stream()
                .map(c -> new Country(
                        ((Map<String, String>) c.get("name")).get("common"),
                        ((Map<String, String>) c.get("flags")).get("png")))
                .collect(Collectors.toList());
    }

    public CountryDetails getCountryByName(String name) {
        var url = "https://restcountries.com/v3.1/name/" + name;
        var response = restTemplate.getForObject(url, List.class);
        var country = (Map<String, Object>) ((List<?>) response).get(0);
        var nameMap = (Map<String, String>) country.get("name");
        var capitalList = (List<String>) country.get("capital");
        var flags = (Map<String, String>) country.get("flags");

        return new CountryDetails(
                nameMap.get("common"),
                (Integer) country.get("population"),
                capitalList.get(0),
                flags.get("png")
        );
    }
}


