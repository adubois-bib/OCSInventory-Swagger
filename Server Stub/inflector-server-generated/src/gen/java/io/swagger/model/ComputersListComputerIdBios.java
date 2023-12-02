package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-12-02T10:39:03.986280886Z[GMT]")

public class ComputersListComputerIdBios   {
  @JsonProperty("ASSETTAG")
  private String ASSETTAG = null;
  @JsonProperty("BDATE")
  private String BDATE = null;
  @JsonProperty("BMANUFACTURER")
  private String BMANUFACTURER = null;
  @JsonProperty("BVERSION")
  private String BVERSION = null;
  @JsonProperty("HARDWARE_ID")
  private Integer HARDWARE_ID = null;
  @JsonProperty("MMANUFACTURER")
  private String MMANUFACTURER = null;
  @JsonProperty("MMODEL")
  private String MMODEL = null;
  @JsonProperty("MSN")
  private String MSN = null;
  @JsonProperty("SMANUFACTURER")
  private String SMANUFACTURER = null;
  @JsonProperty("SMODEL")
  private String SMODEL = null;
  @JsonProperty("SSN")
  private String SSN = null;
  @JsonProperty("TYPE")
  private String TYPE = null;
  /**
   **/
  public ComputersListComputerIdBios ASSETTAG(String ASSETTAG) {
    this.ASSETTAG = ASSETTAG;
    return this;
  }

  
  @Schema(description = "")
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

  
  @Schema(example = "04/16/2021", description = "")
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

  
  @Schema(example = "Dell Inc.", description = "")
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

  
  @Schema(example = "2.5.1", description = "")
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

  
  @Schema(example = "16", description = "")
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

  
  @Schema(example = "Dell Inc.", description = "")
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

  
  @Schema(example = "045M96", description = "")
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

  
  @Schema(description = "")
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

  
  @Schema(description = "")
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

  
  @Schema(example = "PowerEdge R340", description = "")
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

  
  @Schema(description = "")
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

  
  @Schema(example = "Rack Mount Chassis", description = "")
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
