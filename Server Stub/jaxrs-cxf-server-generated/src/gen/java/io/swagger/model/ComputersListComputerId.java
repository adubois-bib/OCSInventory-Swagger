package io.swagger.model;

import io.swagger.model.ComputersListComputerIdAccountinfo;
import io.swagger.model.ComputersListComputerIdBios;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class ComputersListComputerId   {
  
  @Schema(description = "")
  private List<ComputersListComputerIdAccountinfo> accountinfo = null;
  
  @Schema(description = "")
  private List<String> batteries = null;
  
  @Schema(description = "")
  private List<ComputersListComputerIdBios> bios = null;
 /**
   * Get accountinfo
   * @return accountinfo
  **/
  @JsonProperty("accountinfo")
  public List<ComputersListComputerIdAccountinfo> getAccountinfo() {
    return accountinfo;
  }

  public void setAccountinfo(List<ComputersListComputerIdAccountinfo> accountinfo) {
    this.accountinfo = accountinfo;
  }

  public ComputersListComputerId accountinfo(List<ComputersListComputerIdAccountinfo> accountinfo) {
    this.accountinfo = accountinfo;
    return this;
  }

  public ComputersListComputerId addAccountinfoItem(ComputersListComputerIdAccountinfo accountinfoItem) {
    this.accountinfo.add(accountinfoItem);
    return this;
  }

 /**
   * Get batteries
   * @return batteries
  **/
  @JsonProperty("batteries")
  public List<String> getBatteries() {
    return batteries;
  }

  public void setBatteries(List<String> batteries) {
    this.batteries = batteries;
  }

  public ComputersListComputerId batteries(List<String> batteries) {
    this.batteries = batteries;
    return this;
  }

  public ComputersListComputerId addBatteriesItem(String batteriesItem) {
    this.batteries.add(batteriesItem);
    return this;
  }

 /**
   * Get bios
   * @return bios
  **/
  @JsonProperty("bios")
  public List<ComputersListComputerIdBios> getBios() {
    return bios;
  }

  public void setBios(List<ComputersListComputerIdBios> bios) {
    this.bios = bios;
  }

  public ComputersListComputerId bios(List<ComputersListComputerIdBios> bios) {
    this.bios = bios;
    return this;
  }

  public ComputersListComputerId addBiosItem(ComputersListComputerIdBios biosItem) {
    this.bios.add(biosItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
