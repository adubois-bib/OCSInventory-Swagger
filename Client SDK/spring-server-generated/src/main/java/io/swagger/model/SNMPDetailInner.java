package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SNMPDetailInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")


public class SNMPDetailInner   {
  @JsonProperty("DefaultAddressIP")
  private String defaultAddressIP = null;

  @JsonProperty("DefaultDescription")
  private String defaultDescription = null;

  @JsonProperty("DefaultGateway")
  private String defaultGateway = null;

  @JsonProperty("DefaultLocation")
  private String defaultLocation = null;

  @JsonProperty("DefaultMacAddress")
  private String defaultMacAddress = null;

  @JsonProperty("DefaultName")
  private String defaultName = null;

  @JsonProperty("DefaultUptime")
  private String defaultUptime = null;

  @JsonProperty("ID")
  private Integer ID = null;

  @JsonProperty("LASTDATE")
  private OffsetDateTime LASTDATE = null;

  public SNMPDetailInner defaultAddressIP(String defaultAddressIP) {
    this.defaultAddressIP = defaultAddressIP;
    return this;
  }

  /**
   * Get defaultAddressIP
   * @return defaultAddressIP
   **/
  @Schema(example = "127.0.0.1", description = "")
  
    public String getDefaultAddressIP() {
    return defaultAddressIP;
  }

  public void setDefaultAddressIP(String defaultAddressIP) {
    this.defaultAddressIP = defaultAddressIP;
  }

  public SNMPDetailInner defaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
    return this;
  }

  /**
   * Get defaultDescription
   * @return defaultDescription
   **/
  @Schema(example = "This is a description", description = "")
  
    public String getDefaultDescription() {
    return defaultDescription;
  }

  public void setDefaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
  }

  public SNMPDetailInner defaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
    return this;
  }

  /**
   * Get defaultGateway
   * @return defaultGateway
   **/
  @Schema(example = "172.18.25.254", description = "")
  
    public String getDefaultGateway() {
    return defaultGateway;
  }

  public void setDefaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
  }

  public SNMPDetailInner defaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
    return this;
  }

  /**
   * Get defaultLocation
   * @return defaultLocation
   **/
  @Schema(example = "Here", description = "")
  
    public String getDefaultLocation() {
    return defaultLocation;
  }

  public void setDefaultLocation(String defaultLocation) {
    this.defaultLocation = defaultLocation;
  }

  public SNMPDetailInner defaultMacAddress(String defaultMacAddress) {
    this.defaultMacAddress = defaultMacAddress;
    return this;
  }

  /**
   * Get defaultMacAddress
   * @return defaultMacAddress
   **/
  @Schema(description = "")
  
    public String getDefaultMacAddress() {
    return defaultMacAddress;
  }

  public void setDefaultMacAddress(String defaultMacAddress) {
    this.defaultMacAddress = defaultMacAddress;
  }

  public SNMPDetailInner defaultName(String defaultName) {
    this.defaultName = defaultName;
    return this;
  }

  /**
   * Get defaultName
   * @return defaultName
   **/
  @Schema(example = "My Equipment", description = "")
  
    public String getDefaultName() {
    return defaultName;
  }

  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }

  public SNMPDetailInner defaultUptime(String defaultUptime) {
    this.defaultUptime = defaultUptime;
    return this;
  }

  /**
   * Get defaultUptime
   * @return defaultUptime
   **/
  @Schema(description = "")
  
    public String getDefaultUptime() {
    return defaultUptime;
  }

  public void setDefaultUptime(String defaultUptime) {
    this.defaultUptime = defaultUptime;
  }

  public SNMPDetailInner ID(Integer ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
   **/
  @Schema(example = "1", description = "")
  
    public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public SNMPDetailInner LASTDATE(OffsetDateTime LASTDATE) {
    this.LASTDATE = LASTDATE;
    return this;
  }

  /**
   * Get LASTDATE
   * @return LASTDATE
   **/
  @Schema(example = "2023-06-08T12:22:18Z", description = "")
  
    @Valid
    public OffsetDateTime getLASTDATE() {
    return LASTDATE;
  }

  public void setLASTDATE(OffsetDateTime LASTDATE) {
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
    return Objects.equals(this.defaultAddressIP, snMPDetailInner.defaultAddressIP) &&
        Objects.equals(this.defaultDescription, snMPDetailInner.defaultDescription) &&
        Objects.equals(this.defaultGateway, snMPDetailInner.defaultGateway) &&
        Objects.equals(this.defaultLocation, snMPDetailInner.defaultLocation) &&
        Objects.equals(this.defaultMacAddress, snMPDetailInner.defaultMacAddress) &&
        Objects.equals(this.defaultName, snMPDetailInner.defaultName) &&
        Objects.equals(this.defaultUptime, snMPDetailInner.defaultUptime) &&
        Objects.equals(this.ID, snMPDetailInner.ID) &&
        Objects.equals(this.LASTDATE, snMPDetailInner.LASTDATE);
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
