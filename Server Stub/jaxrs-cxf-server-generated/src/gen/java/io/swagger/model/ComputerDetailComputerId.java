package io.swagger.model;

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

public class ComputerDetailComputerId   {
  
  @Schema(description = "")
  private List<ComputersListComputerIdBios> bios = null;
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

  public ComputerDetailComputerId bios(List<ComputersListComputerIdBios> bios) {
    this.bios = bios;
    return this;
  }

  public ComputerDetailComputerId addBiosItem(ComputersListComputerIdBios biosItem) {
    this.bios.add(biosItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
