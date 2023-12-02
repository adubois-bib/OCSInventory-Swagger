package io.swagger.model;

import java.util.Date;

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

public class SNMPDetailInner   {
  
  @Schema(example = "127.0.0.1", description = "")
  private String defaultAddressIP = null;
  
  @Schema(example = "This is a description", description = "")
  private String defaultDescription = null;
  
  @Schema(example = "172.18.25.254", description = "")
  private String defaultGateway = null;
  
  @Schema(example = "Here", description = "")
  private String defaultLocation = null;
  
  @Schema(description = "")
  private String defaultMacAddress = null;
  
  @Schema(example = "My Equipment", description = "")
  private String defaultName = null;
  
  @Schema(description = "")
  private String defaultUptime = null;
  
  @Schema(example = "1", description = "")
  private Integer ID = null;
  
  @Schema(example = "2023-06-08T12:22:18Z", description = "")
  private Date LASTDATE = null;
 /**
   * Get defaultAddressIP
   * @return defaultAddressIP
  **/
  @JsonProperty("DefaultAddressIP")
  public String getDefaultAddressIP() {
    return defaultAddressIP;
  }

  public void setDefaultAddressIP(String defaultAddressIP) {
    this.defaultAddressIP = defaultAddressIP;
  }

  public SNMPDetailInner defaultAddressIP(String defaultAddressIP) {
    this.defaultAddressIP = defaultAddressIP;
    return this;
  }

 /**
   * Get defaultDescription
   * @return defaultDescription
  **/
  @JsonProperty("DefaultDescription")
  public String getDefaultDescription() {
    return defaultDescription;
  }

  public void setDefaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
  }

  public SNMPDetailInner defaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
    return this;
  }

 /**
   * Get defaultGateway
   * @return defaultGateway
  **/
  @JsonProperty("DefaultGateway")
  public String getDefaultGateway() {
    return defaultGateway;
  }

  public void setDefaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
  }

  public SNMPDetailInner defaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
    return this;
  }

 /**
   * Get defaultLocation
   * @return defaultLocation
  **/
  @JsonProperty("DefaultLocation")
  public String getDefaultLocation() {
    return defaultLocation;
  }

  public void setDefaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
  }

  public SNMPDetailInner defaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
    return this;
  }

 /**
   * Get defaultMacAddress
   * @return defaultMacAddress
  **/
  @JsonProperty("DefaultMacAddress")
  public String getDefaultMacAddress() {
    return defaultMacAddress;
  }

  public void setDefaultMacAddress(String defaultMacAddress) {
    this.defaultMacAddress = defaultMacAddress;
  }

  public SNMPDetailInner defaultMacAddress(String defaultMacAddress) {
    this.defaultMacAddress = defaultMacAddress;
    return this;
  }

 /**
   * Get defaultName
   * @return defaultName
  **/
  @JsonProperty("DefaultName")
  public String getDefaultName() {
    return defaultName;
  }

  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }

  public SNMPDetailInner defaultName(String defaultName) {
    this.defaultName = defaultName;
    return this;
  }

 /**
   * Get defaultUptime
   * @return defaultUptime
  **/
  @JsonProperty("DefaultUptime")
  public String getDefaultUptime() {
    return defaultUptime;
  }

  public void setDefaultUptime(String defaultUptime) {
    this.defaultUptime = defaultUptime;
  }

  public SNMPDetailInner defaultUptime(String defaultUptime) {
    this.defaultUptime = defaultUptime;
    return this;
  }

 /**
   * Get ID
   * @return ID
  **/
  @JsonProperty("ID")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public SNMPDetailInner ID(Integer ID) {
    this.ID = ID;
    return this;
  }

 /**
   * Get LASTDATE
   * @return LASTDATE
  **/
  @JsonProperty("LASTDATE")
  public Date getLASTDATE() {
    return LASTDATE;
  }

  public void setLASTDATE(Date LASTDATE) {
    this.LASTDATE = LASTDATE;
  }

  public SNMPDetailInner LASTDATE(Date LASTDATE) {
    this.LASTDATE = LASTDATE;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
