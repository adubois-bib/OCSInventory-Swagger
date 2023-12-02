package io.swagger.model;

import io.swagger.model.ComputersListComputerId;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * In this case batteries and bios are inventory sections defined in Map.pm file
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@Schema(description = "In this case batteries and bios are inventory sections defined in Map.pm file")

public class ComputersList   {

  private @Valid ComputersListComputerId computerId = null;

  /**
   **/
  public ComputersList computerId(ComputersListComputerId computerId) {
    this.computerId = computerId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("{computer_id}")

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
