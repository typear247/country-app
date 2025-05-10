//package co.za.backend;
//
//import co.za.backend.model.Country;
//import co.za.backend.model.CountryDetails;
//import co.za.backend.service.CountryService;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.junit.jupiter.api.Test;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.ArgumentMatchers.eq;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class CountryServiceImplementationMockTest {
//
//    @InjectMocks
//    CountryService countryService;
//
//    @Test
//    void testGetAllCountries() {
//        Country country =new Country("Japan", "red.dot");
//        List<Country> countryList = new ArrayList<>();
//        countryList.add(country);
//
//        when(countryService.getAllCountries()).thenReturn(countryList);
//
//
//        List<Country> result = countryService.getAllCountries();
//
//        assertEquals(1, result.size());
//        assertEquals("Japan", result.get(0).getName());
//    }
//
//    @Test
//    void testGetCountryByName() {
//
//        CountryDetails countryDetails =new CountryDetails("South Africa",123,"JHB","za.png");
//        when(countryService.getCountryByName("South Africa")).thenReturn(countryDetails);
//
//        CountryDetails result = countryService.getCountryByName("South Africa");
//        assertEquals("JHB", result.getCapital());
//    }
//
//}
