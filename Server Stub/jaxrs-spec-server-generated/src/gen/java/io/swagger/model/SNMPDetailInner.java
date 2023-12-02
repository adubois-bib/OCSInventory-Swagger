package io.swagger.model;

import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SNMPDetailInner   {

  private @Valid String defaultAddressIP = null;

  private @Valid String defaultDescription = null;

  private @Valid String defaultGateway = null;

  private @Valid String defaultLocation = null;

  private @Valid String defaultMacAddress = null;

  private @Valid String defaultName = null;

  private @Valid String defaultUptime = null;

  private @Valid Integer ID = null;

  private @Valid Date LASTDATE = null;

  /**
   **/
  public SNMPDetailInner defaultAddressIP(String defaultAddressIP) {
    this.defaultAddressIP = defaultAddressIP;
    return this;
  }

  
  @ApiModelProperty(example = "127.0.0.1", value = "")
  @JsonProperty("DefaultAddressIP")

  public String getDefaultAddressIP() {
    return defaultAddressIP;
  }
  public void setDefaultAddressIP(String defaultAddressIP) {
    this.defaultAddressIP = defaultAddressIP;
  }

  /**
   **/
  public SNMPDetailInner defaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
    return this;
  }

  
  @ApiModelProperty(example = "This is a description", value = "")
  @JsonProperty("DefaultDescription")

  public String getDefaultDescription() {
    return defaultDescription;
  }
  public void setDefaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
  }

  /**
   **/
  public SNMPDetailInner defaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
    return this;
  }

  
  @ApiModelProperty(example = "172.18.25.254", value = "")
  @JsonProperty("DefaultGateway")

  public String getDefaultGateway() {
    return defaultGateway;
  }
  public void setDefaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
  }

  /**
   **/
  public SNMPDetailInner defaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
    return this;
  }

  
  @ApiModelProperty(example = "Here", value = "")
  @JsonProperty("DefaultLocation")

  public String getDefaultLocation() {
    return defaultLocation;
  }
  public void setDefaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
  }

  /**
   **/
  public SNMPDetailInner defaultMacAddress(String defaultMacAddress) {
    this.defaultMacAddress = defaultMacAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DefaultMacAddress")

  public String getDefaultMacAddress() {
    return defaultMacAddress;
  }
  public void setDefaultMacAddress(String defaultMacAddress) {
    this.defaultMacAddress = defaultMacAddress;
  }

  /**
   **/
  public SNMPDetailInner defaultName(String defaultName) {
    this.defaultName = defaultName;
    return this;
  }

  
  @ApiModelProperty(example = "My Equipment", value = "")
  @JsonProperty("DefaultName")

  public String getDefaultName() {
    return defaultName;
  }
  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }

  /**
   **/
  public SNMPDetailInner defaultUptime(String defaultUptime) {
    this.defaultUptime = defaultUptime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DefaultUptime")

  public String getDefaultUptime() {
    return defaultUptime;
  }
  public void setDefaultUptime(String defaultUptime) {
    this.defaultUptime = defaultUptime;
  }

  /**
   **/
  public SNMPDetailInner ID(Integer ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty("ID")

  public Integer getID() {
    return ID;
  }
  public void setID(Integer ID) {
    this.ID = ID;
  }

  /**
   **/
  public SNMPDetailInner LASTDATE(Date LASTDATE) {
    this.LASTDATE = LASTDATE;
    return this;
  }

  
  @ApiModelProperty(example = "2023-06-08T12:22:18Z", value = "")
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
