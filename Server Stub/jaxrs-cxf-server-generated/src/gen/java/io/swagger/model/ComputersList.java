package io.swagger.model;

import io.swagger.model.ComputersListComputerId;
import io.swagger.v3.oas.annotations.media.Schema;
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

/**
  * In this case batteries and bios are inventory sections defined in Map.pm file
 **/
@Schema(description="In this case batteries and bios are inventory sections defined in Map.pm file")
public class ComputersList   {
  
  @Schema(description = "")
  private ComputersListComputerId computerId = null;
 /**
   * Get computerId
   * @return computerId
  **/
  @JsonProperty("{computer_id}")
  public ComputersListComputerId getComputerId() {
    return computerId;
  }

  public void setComputerId(ComputersListComputerId computerId) {
    this.computerId = computerId;
  }

  public ComputersList computerId(ComputersListComputerId computerId) {
    this.computerId = computerId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
