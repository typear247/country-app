package co.za.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;


import javax.annotation.processing.Generated;
import java.util.Objects;

/**
 * CountryDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-08T18:53:49.781190300+02:00[Africa/Johannesburg]", comments = "Generator version: 7.13.0")
public class CountryDetails {

  private @Nullable String name;

  private @Nullable Integer population;

  private @Nullable String capital;

  private @Nullable String flag;

  public CountryDetails(String name, Integer population, String capital, String flag) {
    this.name = name;
    this.population = population;
    this.capital = capital;
    this.flag = flag;
  }

  public CountryDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CountryDetails population(Integer population) {
    this.population = population;
    return this;
  }

  /**
   * Get population
   * @return population
   */
  
  @Schema(name = "population", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("population")
  public Integer getPopulation() {
    return population;
  }

  public void setPopulation(Integer population) {
    this.population = population;
  }

  public CountryDetails capital(String capital) {
    this.capital = capital;
    return this;
  }

  /**
   * Get capital
   * @return capital
   */
  
  @Schema(name = "capital", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capital")
  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public CountryDetails flag(String flag) {
    this.flag = flag;
    return this;
  }

  /**
   * Get flag
   * @return flag
   */
  
  @Schema(name = "flag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flag")
  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryDetails countryDetails = (CountryDetails) o;
    return Objects.equals(this.name, countryDetails.name) &&
        Objects.equals(this.population, countryDetails.population) &&
        Objects.equals(this.capital, countryDetails.capital) &&
        Objects.equals(this.flag, countryDetails.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, population, capital, flag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    population: ").append(toIndentedString(population)).append("\n");
    sb.append("    capital: ").append(toIndentedString(capital)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

