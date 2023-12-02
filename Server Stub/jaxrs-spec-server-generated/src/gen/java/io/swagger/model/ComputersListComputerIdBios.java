package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComputersListComputerIdBios   {

  private @Valid String ASSETTAG = null;

  private @Valid String BDATE = null;

  private @Valid String BMANUFACTURER = null;

  private @Valid String BVERSION = null;

  private @Valid Integer HARDWARE_ID = null;

  private @Valid String MMANUFACTURER = null;

  private @Valid String MMODEL = null;

  private @Valid String MSN = null;

  private @Valid String SMANUFACTURER = null;

  private @Valid String SMODEL = null;

  private @Valid String SSN = null;

  private @Valid String TYPE = null;

  /**
   **/
  public ComputersListComputerIdBios ASSETTAG(String ASSETTAG) {
    this.ASSETTAG = ASSETTAG;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ASSETTAG")

  public String getASSETTAG() {
    return ASSETTAG;
  }
  public void setASSETTAG(String ASSETTAG) {
    this.ASSETTAG = ASSETTAG;
  }

  /**
   **/
  public ComputersListComputerIdBios BDATE(String BDATE) {
    this.BDATE = BDATE;
    return this;
  }

  
  @ApiModelProperty(example = "04/16/2021", value = "")
  @JsonProperty("BDATE")

  public String getBDATE() {
    return BDATE;
  }
  public void setBDATE(String BDATE) {
    this.BDATE = BDATE;
  }

  /**
   **/
  public ComputersListComputerIdBios BMANUFACTURER(String BMANUFACTURER) {
    this.BMANUFACTURER = BMANUFACTURER;
    return this;
  }

  
  @ApiModelProperty(example = "Dell Inc.", value = "")
  @JsonProperty("BMANUFACTURER")

  public String getBMANUFACTURER() {
    return BMANUFACTURER;
  }
  public void setBMANUFACTURER(String BMANUFACTURER) {
    this.BMANUFACTURER = BMANUFACTURER;
  }

  /**
   **/
  public ComputersListComputerIdBios BVERSION(String BVERSION) {
    this.BVERSION = BVERSION;
    return this;
  }

  
  @ApiModelProperty(example = "2.5.1", value = "")
  @JsonProperty("BVERSION")

  public String getBVERSION() {
    return BVERSION;
  }
  public void setBVERSION(String BVERSION) {
    this.BVERSION = BVERSION;
  }

  /**
   **/
  public ComputersListComputerIdBios HARDWARE_ID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
    return this;
  }

  
  @ApiModelProperty(example = "16", value = "")
  @JsonProperty("HARDWARE_ID")

  public Integer getHARDWAREID() {
    return HARDWARE_ID;
  }
  public void setHARDWAREID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
  }

  /**
   **/
  public ComputersListComputerIdBios MMANUFACTURER(String MMANUFACTURER) {
    this.MMANUFACTURER = MMANUFACTURER;
    return this;
  }

  
  @ApiModelProperty(example = "Dell Inc.", value = "")
  @JsonProperty("MMANUFACTURER")

  public String getMMANUFACTURER() {
    return MMANUFACTURER;
  }
  public void setMMANUFACTURER(String MMANUFACTURER) {
    this.MMANUFACTURER = MMANUFACTURER;
  }

  /**
   **/
  public ComputersListComputerIdBios MMODEL(String MMODEL) {
    this.MMODEL = MMODEL;
    return this;
  }

  
  @ApiModelProperty(example = "045M96", value = "")
  @JsonProperty("MMODEL")

  public String getMMODEL() {
    return MMODEL;
  }
  public void setMMODEL(String MMODEL) {
    this.MMODEL = MMODEL;
  }

  /**
   **/
  public ComputersListComputerIdBios MSN(String MSN) {
    this.MSN = MSN;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("MSN")

  public String getMSN() {
    return MSN;
  }
  public void setMSN(String MSN) {
    this.MSN = MSN;
  }

  /**
   **/
  public ComputersListComputerIdBios SMANUFACTURER(String SMANUFACTURER) {
    this.SMANUFACTURER = SMANUFACTURER;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SMANUFACTURER")

  public String getSMANUFACTURER() {
    return SMANUFACTURER;
  }
  public void setSMANUFACTURER(String SMANUFACTURER) {
    this.SMANUFACTURER = SMANUFACTURER;
  }

  /**
   **/
  public ComputersListComputerIdBios SMODEL(String SMODEL) {
    this.SMODEL = SMODEL;
    return this;
  }

  
  @ApiModelProperty(example = "PowerEdge R340", value = "")
  @JsonProperty("SMODEL")

  public String getSMODEL() {
    return SMODEL;
  }
  public void setSMODEL(String SMODEL) {
    this.SMODEL = SMODEL;
  }

  /**
   **/
  public ComputersListComputerIdBios SSN(String SSN) {
    this.SSN = SSN;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SSN")

  public String getSSN() {
    return SSN;
  }
  public void setSSN(String SSN) {
    this.SSN = SSN;
  }

  /**
   **/
  public ComputersListComputerIdBios TYPE(String TYPE) {
    this.TYPE = TYPE;
    return this;
  }

  
  @ApiModelProperty(example = "Rack Mount Chassis", value = "")
  @JsonProperty("TYPE")

  public String getTYPE() {
    return TYPE;
  }
  public void setTYPE(String TYPE) {
    this.TYPE = TYPE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputersListComputerIdBios computersListComputerIdBios = (ComputersListComputerIdBios) o;
    return Objects.equals(ASSETTAG, computersListComputerIdBios.ASSETTAG) &&
        Objects.equals(BDATE, computersListComputerIdBios.BDATE) &&
        Objects.equals(BMANUFACTURER, computersListComputerIdBios.BMANUFACTURER) &&
        Objects.equals(BVERSION, computersListComputerIdBios.BVERSION) &&
        Objects.equals(HARDWARE_ID, computersListComputerIdBios.HARDWARE_ID) &&
        Objects.equals(MMANUFACTURER, computersListComputerIdBios.MMANUFACTURER) &&
        Objects.equals(MMODEL, computersListComputerIdBios.MMODEL) &&
        Objects.equals(MSN, computersListComputerIdBios.MSN) &&
        Objects.equals(SMANUFACTURER, computersListComputerIdBios.SMANUFACTURER) &&
        Objects.equals(SMODEL, computersListComputerIdBios.SMODEL) &&
        Objects.equals(SSN, computersListComputerIdBios.SSN) &&
        Objects.equals(TYPE, computersListComputerIdBios.TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSETTAG, BDATE, BMANUFACTURER, BVERSION, HARDWARE_ID, MMANUFACTURER, MMODEL, MSN, SMANUFACTURER, SMODEL, SSN, TYPE);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
