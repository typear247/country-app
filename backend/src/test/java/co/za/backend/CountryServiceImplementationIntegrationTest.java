package co.za.backend;

import co.za.backend.model.Country;
import co.za.backend.model.CountryDetails;
import co.za.backend.service.CountryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
public class CountryServiceImplementationIntegrationTest {


    @Autowired
    private CountryService countryService;

    @Test
    public void testGetAllCountries() {
        List<Country> countries = countryService.getAllCountries();
        assertFalse(countries.isEmpty());
    }

    @Test
    public void testGetCountryByName() {
        CountryDetails countryDetails = countryService.getCountryByName("South Africa");
        assertNotNull(countryDetails);
        assertEquals("South Africa", countryDetails.getName());
    }
}
