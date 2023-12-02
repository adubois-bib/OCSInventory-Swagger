package io.swagger.model;

import io.swagger.model.ComputersListComputerIdAccountinfo;
import io.swagger.model.ComputersListComputerIdBios;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComputersListComputerId   {

  private @Valid List<ComputersListComputerIdAccountinfo> accountinfo = new ArrayList<ComputersListComputerIdAccountinfo>();

  private @Valid List<String> batteries = new ArrayList<String>();

  private @Valid List<ComputersListComputerIdBios> bios = new ArrayList<ComputersListComputerIdBios>();

  /**
   **/
  public ComputersListComputerId accountinfo(List<ComputersListComputerIdAccountinfo> accountinfo) {
    this.accountinfo = accountinfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accountinfo")

  public List<ComputersListComputerIdAccountinfo> getAccountinfo() {
    return accountinfo;
  }
  public void setAccountinfo(List<ComputersListComputerIdAccountinfo> accountinfo) {
    this.accountinfo = accountinfo;
  }

  /**
   **/
  public ComputersListComputerId batteries(List<String> batteries) {
    this.batteries = batteries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("batteries")

  public List<String> getBatteries() {
    return batteries;
  }
  public void setBatteries(List<String> batteries) {
    this.batteries = batteries;
  }

  /**
   **/
  public ComputersListComputerId bios(List<ComputersListComputerIdBios> bios) {
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
    ComputersListComputerId computersListComputerId = (ComputersListComputerId) o;
    return Objects.equals(accountinfo, computersListComputerId.accountinfo) &&
        Objects.equals(batteries, computersListComputerId.batteries) &&
        Objects.equals(bios, computersListComputerId.bios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountinfo, batteries, bios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputersListComputerId {\n");
    
    sb.append("    accountinfo: ").append(toIndentedString(accountinfo)).append("\n");
    sb.append("    batteries: ").append(toIndentedString(batteries)).append("\n");
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
