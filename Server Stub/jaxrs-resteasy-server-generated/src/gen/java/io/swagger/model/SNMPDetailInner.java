package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-12-02T10:39:08.091957794Z[GMT]")
public class SNMPDetailInner   {
  private String defaultAddressIP = null;  private String defaultDescription = null;  private String defaultGateway = null;  private String defaultLocation = null;  private String defaultMacAddress = null;  private String defaultName = null;  private String defaultUptime = null;  private Integer ID = null;  private Date LASTDATE = null;

  /**
   **/
  
  @Schema(example = "127.0.0.1", description = "")
  @JsonProperty("DefaultAddressIP")
  public String getDefaultAddressIP() {
    return defaultAddressIP;
  }
  public void setDefaultAddressIP(String defaultAddressIP) {
    this.defaultAddressIP = defaultAddressIP;
  }

  /**
   **/
  
  @Schema(example = "This is a description", description = "")
  @JsonProperty("DefaultDescription")
  public String getDefaultDescription() {
    return defaultDescription;
  }
  public void setDefaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
  }

  /**
   **/
  
  @Schema(example = "172.18.25.254", description = "")
  @JsonProperty("DefaultGateway")
  public String getDefaultGateway() {
    return defaultGateway;
  }
  public void setDefaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
  }

  /**
   **/
  
  @Schema(example = "Here", description = "")
  @JsonProperty("DefaultLocation")
  public String getDefaultLocation() {
    return defaultLocation;
  }
  public void setDefaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("DefaultMacAddress")
  public String getDefaultMacAddress() {
    return defaultMacAddress;
  }
  public void setDefaultMacAddress(String defaultMacAddress) {
    this.defaultMacAddress = defaultMacAddress;
  }

  /**
   **/
  
  @Schema(example = "My Equipment", description = "")
  @JsonProperty("DefaultName")
  public String getDefaultName() {
    return defaultName;
  }
  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("DefaultUptime")
  public String getDefaultUptime() {
    return defaultUptime;
  }
  public void setDefaultUptime(String defaultUptime) {
    this.defaultUptime = defaultUptime;
  }

  /**
   **/
  
  @Schema(example = "1", description = "")
  @JsonProperty("ID")
  public Integer getID() {
    return ID;
  }
  public void setID(Integer ID) {
    this.ID = ID;
  }

  /**
   **/
  
  @Schema(example = "2023-06-08T12:22:18Z", description = "")
  @JsonProperty("LASTDATE")
  public Date getLASTDATE() {
    return LASTDATE;
  }
  public void setLASTDATE(Date LASTDATE) {
    this.LASTDATE = LASTDATE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SNMPDetailInner snMPDetailInner = (SNMPDetailInner) o;
    return Objects.equals(defaultAddressIP, snMPDetailInner.defaultAddressIP) &&
        Objects.equals(defaultDescription, snMPDetailInner.defaultDescription) &&
        Objects.equals(defaultGateway, snMPDetailInner.defaultGateway) &&
        Objects.equals(defaultLocation, snMPDetailInner.defaultLocation) &&
        Objects.equals(defaultMacAddress, snMPDetailInner.defaultMacAddress) &&
        Objects.equals(defaultName, snMPDetailInner.defaultName) &&
        Objects.equals(defaultUptime, snMPDetailInner.defaultUptime) &&
        Objects.equals(ID, snMPDetailInner.ID) &&
        Objects.equals(LASTDATE, snMPDetailInner.LASTDATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAddressIP, defaultDescription, defaultGateway, defaultLocation, defaultMacAddress, defaultName, defaultUptime, ID, LASTDATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SNMPDetailInner {\n");
    
    sb.append("    defaultAddressIP: ").append(toIndentedString(defaultAddressIP)).append("\n");
    sb.append("    defaultDescription: ").append(toIndentedString(defaultDescription)).append("\n");
    sb.append("    defaultGateway: ").append(toIndentedString(defaultGateway)).append("\n");
    sb.append("    defaultLocation: ").append(toIndentedString(defaultLocation)).append("\n");
    sb.append("    defaultMacAddress: ").append(toIndentedString(defaultMacAddress)).append("\n");
    sb.append("    defaultName: ").append(toIndentedString(defaultName)).append("\n");
    sb.append("    defaultUptime: ").append(toIndentedString(defaultUptime)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    LASTDATE: ").append(toIndentedString(LASTDATE)).append("\n");
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
