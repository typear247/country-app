package co.za.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.lang.Nullable;


import javax.annotation.processing.Generated;
import java.util.Objects;

/**
 * Country
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-08T18:53:49.781190300+02:00[Africa/Johannesburg]", comments = "Generator version: 7.13.0")
public class Country {

  private @Nullable String name;

  private @Nullable String flag;

  public Country(String name, String flag) {
    this.name = name;
    this.flag = flag;
  }

  public Country name(String name) {
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

  public Country flag(String flag) {
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
    Country country = (Country) o;
    return Objects.equals(this.name, country.name) &&
        Objects.equals(this.flag, country.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, flag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

