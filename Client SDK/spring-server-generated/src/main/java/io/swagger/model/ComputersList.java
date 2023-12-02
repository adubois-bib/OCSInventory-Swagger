package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ComputersListComputerId;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * In this case batteries and bios are inventory sections defined in Map.pm file
 */
@Schema(description = "In this case batteries and bios are inventory sections defined in Map.pm file")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")


public class ComputersList   {
  @JsonProperty("{computer_id}")
  private ComputersListComputerId computerId = null;

  public ComputersList computerId(ComputersListComputerId computerId) {
    this.computerId = computerId;
    return this;
  }

  /**
   * Get computerId
   * @return computerId
   **/
  @Schema(description = "")
  
    @Valid
    public ComputersListComputerId getComputerId() {
    return computerId;
  }

  public void setComputerId(ComputersListComputerId computerId) {
    this.computerId = computerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputersList computersList = (ComputersList) o;
    return Objects.equals(this.computerId, computersList.computerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputersList {\n");
    
    sb.append("    computerId: ").append(toIndentedString(computerId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
