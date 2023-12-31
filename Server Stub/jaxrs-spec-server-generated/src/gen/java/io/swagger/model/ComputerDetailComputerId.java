package io.swagger.model;

import io.swagger.model.ComputersListComputerIdBios;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComputerDetailComputerId   {

  private @Valid List<ComputersListComputerIdBios> bios = new ArrayList<ComputersListComputerIdBios>();

  /**
   **/
  public ComputerDetailComputerId bios(List<ComputersListComputerIdBios> bios) {
    this.bios = bios;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bios")

  public List<ComputersListComputerIdBios> getBios() {
    return bios;
  }
  public void setBios(List<ComputersListComputerIdBios> bios) {
    this.bios = bios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerDetailComputerId computerDetailComputerId = (ComputerDetailComputerId) o;
    return Objects.equals(bios, computerDetailComputerId.bios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerDetailComputerId {\n");
    
    sb.append("    bios: ").append(toIndentedString(bios)).append("\n");
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
