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

public class ComputersListComputerIdBios   {
  
  @Schema(description = "")
  private String ASSETTAG = null;
  
  @Schema(example = "04/16/2021", description = "")
  private String BDATE = null;
  
  @Schema(example = "Dell Inc.", description = "")
  private String BMANUFACTURER = null;
  
  @Schema(example = "2.5.1", description = "")
  private String BVERSION = null;
  
  @Schema(example = "16", description = "")
  private Integer HARDWARE_ID = null;
  
  @Schema(example = "Dell Inc.", description = "")
  private String MMANUFACTURER = null;
  
  @Schema(example = "045M96", description = "")
  private String MMODEL = null;
  
  @Schema(description = "")
  private String MSN = null;
  
  @Schema(description = "")
  private String SMANUFACTURER = null;
  
  @Schema(example = "PowerEdge R340", description = "")
  private String SMODEL = null;
  
  @Schema(description = "")
  private String SSN = null;
  
  @Schema(example = "Rack Mount Chassis", description = "")
  private String TYPE = null;
 /**
   * Get ASSETTAG
   * @return ASSETTAG
  **/
  @JsonProperty("ASSETTAG")
  public String getASSETTAG() {
    return ASSETTAG;
  }

  public void setASSETTAG(String ASSETTAG) {
    this.ASSETTAG = ASSETTAG;
  }

  public ComputersListComputerIdBios ASSETTAG(String ASSETTAG) {
    this.ASSETTAG = ASSETTAG;
    return this;
  }

 /**
   * Get BDATE
   * @return BDATE
  **/
  @JsonProperty("BDATE")
  public String getBDATE() {
    return BDATE;
  }

  public void setBDATE(String BDATE) {
    this.BDATE = BDATE;
  }

  public ComputersListComputerIdBios BDATE(String BDATE) {
    this.BDATE = BDATE;
    return this;
  }

 /**
   * Get BMANUFACTURER
   * @return BMANUFACTURER
  **/
  @JsonProperty("BMANUFACTURER")
  public String getBMANUFACTURER() {
    return BMANUFACTURER;
  }

  public void setBMANUFACTURER(String BMANUFACTURER) {
    this.BMANUFACTURER = BMANUFACTURER;
  }

  public ComputersListComputerIdBios BMANUFACTURER(String BMANUFACTURER) {
    this.BMANUFACTURER = BMANUFACTURER;
    return this;
  }

 /**
   * Get BVERSION
   * @return BVERSION
  **/
  @JsonProperty("BVERSION")
  public String getBVERSION() {
    return BVERSION;
  }

  public void setBVERSION(String BVERSION) {
    this.BVERSION = BVERSION;
  }

  public ComputersListComputerIdBios BVERSION(String BVERSION) {
    this.BVERSION = BVERSION;
    return this;
  }

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

  public ComputersListComputerIdBios HARDWARE_ID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
    return this;
  }

 /**
   * Get MMANUFACTURER
   * @return MMANUFACTURER
  **/
  @JsonProperty("MMANUFACTURER")
  public String getMMANUFACTURER() {
    return MMANUFACTURER;
  }

  public void setMMANUFACTURER(String MMANUFACTURER) {
    this.MMANUFACTURER = MMANUFACTURER;
  }

  public ComputersListComputerIdBios MMANUFACTURER(String MMANUFACTURER) {
    this.MMANUFACTURER = MMANUFACTURER;
    return this;
  }

 /**
   * Get MMODEL
   * @return MMODEL
  **/
  @JsonProperty("MMODEL")
  public String getMMODEL() {
    return MMODEL;
  }

  public void setMMODEL(String MMODEL) {
    this.MMODEL = MMODEL;
  }

  public ComputersListComputerIdBios MMODEL(String MMODEL) {
    this.MMODEL = MMODEL;
    return this;
  }

 /**
   * Get MSN
   * @return MSN
  **/
  @JsonProperty("MSN")
  public String getMSN() {
    return MSN;
  }

  public void setMSN(String MSN) {
    this.MSN = MSN;
  }

  public ComputersListComputerIdBios MSN(String MSN) {
    this.MSN = MSN;
    return this;
  }

 /**
   * Get SMANUFACTURER
   * @return SMANUFACTURER
  **/
  @JsonProperty("SMANUFACTURER")
  public String getSMANUFACTURER() {
    return SMANUFACTURER;
  }

  public void setSMANUFACTURER(String SMANUFACTURER) {
    this.SMANUFACTURER = SMANUFACTURER;
  }

  public ComputersListComputerIdBios SMANUFACTURER(String SMANUFACTURER) {
    this.SMANUFACTURER = SMANUFACTURER;
    return this;
  }

 /**
   * Get SMODEL
   * @return SMODEL
  **/
  @JsonProperty("SMODEL")
  public String getSMODEL() {
    return SMODEL;
  }

  public void setSMODEL(String SMODEL) {
    this.SMODEL = SMODEL;
  }

  public ComputersListComputerIdBios SMODEL(String SMODEL) {
    this.SMODEL = SMODEL;
    return this;
  }

 /**
   * Get SSN
   * @return SSN
  **/
  @JsonProperty("SSN")
  public String getSSN() {
    return SSN;
  }

  public void setSSN(String SSN) {
    this.SSN = SSN;
  }

  public ComputersListComputerIdBios SSN(String SSN) {
    this.SSN = SSN;
    return this;
  }

 /**
   * Get TYPE
   * @return TYPE
  **/
  @JsonProperty("TYPE")
  public String getTYPE() {
    return TYPE;
  }

  public void setTYPE(String TYPE) {
    this.TYPE = TYPE;
  }

  public ComputersListComputerIdBios TYPE(String TYPE) {
    this.TYPE = TYPE;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputersListComputerIdBios {\n");
    
    sb.append("    ASSETTAG: ").append(toIndentedString(ASSETTAG)).append("\n");
    sb.append("    BDATE: ").append(toIndentedString(BDATE)).append("\n");
    sb.append("    BMANUFACTURER: ").append(toIndentedString(BMANUFACTURER)).append("\n");
    sb.append("    BVERSION: ").append(toIndentedString(BVERSION)).append("\n");
    sb.append("    HARDWARE_ID: ").append(toIndentedString(HARDWARE_ID)).append("\n");
    sb.append("    MMANUFACTURER: ").append(toIndentedString(MMANUFACTURER)).append("\n");
    sb.append("    MMODEL: ").append(toIndentedString(MMODEL)).append("\n");
    sb.append("    MSN: ").append(toIndentedString(MSN)).append("\n");
    sb.append("    SMANUFACTURER: ").append(toIndentedString(SMANUFACTURER)).append("\n");
    sb.append("    SMODEL: ").append(toIndentedString(SMODEL)).append("\n");
    sb.append("    SSN: ").append(toIndentedString(SSN)).append("\n");
    sb.append("    TYPE: ").append(toIndentedString(TYPE)).append("\n");
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
