package co.za.backend.controller;

import co.za.backend.model.Country;
import co.za.backend.model.CountryDetails;
import co.za.backend.service.CountryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "countries", description = "the countries API")
public class CountryController {

    @Autowired
    private CountryService countryService;

    /**
     * GET /countries : Retrieve all countries
     *
     * @return A list of countries (status code 200)
     */
    @Operation(
            operationId = "countriesGet",
            summary = "Retrieve all countries",
            responses = {
                    @ApiResponse(responseCode = "200", description = "A list of countries", content = {
                            @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Country.class)))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/countries",
            produces = { "application/json" }
    )
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    /**
     * GET /countries/{name} : Retrieve details about a specific country
     *
     * @param name  (required)
     * @return Details about the country (status code 200)
     */
    @Operation(
            operationId = "countriesNameGet",
            summary = "Retrieve details about a specific country",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Details about the country", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = CountryDetails.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/countries/{name}",
            produces = { "application/json" }
    )
    public CountryDetails getCountryDetails(@PathVariable String name) {
        return countryService.getCountryByName(name);
    }
}
