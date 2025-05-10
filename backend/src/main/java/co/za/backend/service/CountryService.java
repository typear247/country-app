package co.za.backend.service;

import co.za.backend.model.Country;
import co.za.backend.model.CountryDetails;

import java.util.List;

public interface CountryService {

    List<Country> getAllCountries();
    CountryDetails getCountryByName(String name);

}
