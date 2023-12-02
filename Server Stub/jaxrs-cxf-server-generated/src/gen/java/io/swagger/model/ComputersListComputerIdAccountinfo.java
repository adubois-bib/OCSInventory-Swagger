package io.swagger.model;

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

public class ComputersListComputerIdAccountinfo   {
  
  @Schema(example = "16", description = "")
  private Integer HARDWARE_ID = null;
  
  @Schema(example = "DEV-MACHINE", description = "")
  private String TAG = null;
 /**
   * Get HARDWARE_ID
   * @return HARDWARE_ID
  **/
  @JsonProperty("HARDWARE_ID")
  public Integer getHARDWAREID() {
    return HARDWARE_ID;
  }

  public void setHARDWAREID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
  }

  public ComputersListComputerIdAccountinfo HARDWARE_ID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
    return this;
  }

 /**
   * Get TAG
   * @return TAG
  **/
  @JsonProperty("TAG")
  public String getTAG() {
    return TAG;
  }

  public void setTAG(String TAG) {
    this.TAG = TAG;
  }

  public ComputersListComputerIdAccountinfo TAG(String TAG) {
    this.TAG = TAG;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputersListComputerIdAccountinfo {\n");
    
    sb.append("    HARDWARE_ID: ").append(toIndentedString(HARDWARE_ID)).append("\n");
    sb.append("    TAG: ").append(toIndentedString(TAG)).append("\n");
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
