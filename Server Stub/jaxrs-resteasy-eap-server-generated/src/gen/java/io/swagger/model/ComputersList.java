package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ComputersListComputerId;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="In this case batteries and bios are inventory sections defined in Map.pm file")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-12-02T10:39:09.334447740Z[GMT]")
public class ComputersList   {
  private ComputersListComputerId computerId = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("{computer_id}")
  public ComputersListComputerId getComputerId() {
    return computerId;
  }
  public void setComputerId(ComputersListComputerId computerId) {
    this.computerId = computerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputersList computersList = (ComputersList) o;
    return Objects.equals(computerId, computersList.computerId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
