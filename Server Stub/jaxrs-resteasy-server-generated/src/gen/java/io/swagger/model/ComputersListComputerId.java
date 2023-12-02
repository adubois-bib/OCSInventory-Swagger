package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ComputersListComputerIdAccountinfo;
import io.swagger.model.ComputersListComputerIdBios;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-12-02T10:39:08.091957794Z[GMT]")
public class ComputersListComputerId   {
  private List<ComputersListComputerIdAccountinfo> accountinfo = new ArrayList<ComputersListComputerIdAccountinfo>();  private List<String> batteries = new ArrayList<String>();  private List<ComputersListComputerIdBios> bios = new ArrayList<ComputersListComputerIdBios>();

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("accountinfo")
  public List<ComputersListComputerIdAccountinfo> getAccountinfo() {
    return accountinfo;
  }
  public void setAccountinfo(List<ComputersListComputerIdAccountinfo> accountinfo) {
    this.accountinfo = accountinfo;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("batteries")
  public List<String> getBatteries() {
    return batteries;
  }
  public void setBatteries(List<String> batteries) {
    this.batteries = batteries;
  }

  /**
   **/
  
  @Schema(description = "")
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
