package io.swagger.model;

import io.swagger.model.ComputerDetailComputerId;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComputerDetail   {

  private @Valid ComputerDetailComputerId computerId = null;

  /**
   **/
  public ComputerDetail computerId(ComputerDetailComputerId computerId) {
    this.computerId = computerId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("{computer_id}")

  public ComputerDetailComputerId getComputerId() {
    return computerId;
  }
  public void setComputerId(ComputerDetailComputerId computerId) {
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
    ComputerDetail computerDetail = (ComputerDetail) o;
    return Objects.equals(computerId, computerDetail.computerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerDetail {\n");
    
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
