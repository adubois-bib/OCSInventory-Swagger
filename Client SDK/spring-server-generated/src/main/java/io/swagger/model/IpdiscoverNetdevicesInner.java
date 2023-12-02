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
 * IpdiscoverNetdevicesInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")


public class IpdiscoverNetdevicesInner   {
  @JsonProperty("DATE")
  private OffsetDateTime DATE = null;

  @JsonProperty("HARDWARE_ID")
  private Integer HARDWARE_ID = null;

  @JsonProperty("IP")
  private String IP = null;

  @JsonProperty("MAC")
  private String MAC = null;

  @JsonProperty("MASK")
  private String MASK = null;

  @JsonProperty("NAME")
  private String NAME = null;

  @JsonProperty("NETID")
  private String NETID = null;

  @JsonProperty("TAG")
  private String TAG = null;

  public IpdiscoverNetdevicesInner DATE(OffsetDateTime DATE) {
    this.DATE = DATE;
    return this;
  }

  /**
   * Get DATE
   * @return DATE
   **/
  @Schema(example = "2023-06-08T12:15:08Z", description = "")
  
    @Valid
    public OffsetDateTime getDATE() {
    return DATE;
  }

  public void setDATE(OffsetDateTime DATE) {
    this.DATE = DATE;
  }

  public IpdiscoverNetdevicesInner HARDWARE_ID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
    return this;
  }

  /**
   * Get HARDWARE_ID
   * @return HARDWARE_ID
   **/
  @Schema(example = "16", description = "")
  
    public Integer getHARDWAREID() {
    return HARDWARE_ID;
  }

  public void setHARDWAREID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
  }

  public IpdiscoverNetdevicesInner IP(String IP) {
    this.IP = IP;
    return this;
  }

  /**
   * Get IP
   * @return IP
   **/
  @Schema(example = "172.18.25.254", description = "")
  
    public String getIP() {
    return IP;
  }

  public void setIP(String IP) {
    this.IP = IP;
  }

  public IpdiscoverNetdevicesInner MAC(String MAC) {
    this.MAC = MAC;
    return this;
  }

  /**
   * Get MAC
   * @return MAC
   **/
  @Schema(example = "00:0d:b9:51:fc:aa", description = "")
  
    public String getMAC() {
    return MAC;
  }

  public void setMAC(String MAC) {
    this.MAC = MAC;
  }

  public IpdiscoverNetdevicesInner MASK(String MASK) {
    this.MASK = MASK;
    return this;
  }

  /**
   * Get MASK
   * @return MASK
   **/
  @Schema(example = "255.255.255.0", description = "")
  
    public String getMASK() {
    return MASK;
  }

  public void setMASK(String MASK) {
    this.MASK = MASK;
  }

  public IpdiscoverNetdevicesInner NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

  /**
   * Get NAME
   * @return NAME
   **/
  @Schema(example = "-", description = "")
  
    public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public IpdiscoverNetdevicesInner NETID(String NETID) {
    this.NETID = NETID;
    return this;
  }

  /**
   * Get NETID
   * @return NETID
   **/
  @Schema(example = "172.18.25.0", description = "")
  
    public String getNETID() {
    return NETID;
  }

  public void setNETID(String NETID) {
    this.NETID = NETID;
  }

  public IpdiscoverNetdevicesInner TAG(String TAG) {
    this.TAG = TAG;
    return this;
  }

  /**
   * Get TAG
   * @return TAG
   **/
  @Schema(example = "DEV-MACHINE", description = "")
  
    public String getTAG() {
    return TAG;
  }

  public void setTAG(String TAG) {
    this.TAG = TAG;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpdiscoverNetdevicesInner ipdiscoverNetdevicesInner = (IpdiscoverNetdevicesInner) o;
    return Objects.equals(this.DATE, ipdiscoverNetdevicesInner.DATE) &&
        Objects.equals(this.HARDWARE_ID, ipdiscoverNetdevicesInner.HARDWARE_ID) &&
        Objects.equals(this.IP, ipdiscoverNetdevicesInner.IP) &&
        Objects.equals(this.MAC, ipdiscoverNetdevicesInner.MAC) &&
        Objects.equals(this.MASK, ipdiscoverNetdevicesInner.MASK) &&
        Objects.equals(this.NAME, ipdiscoverNetdevicesInner.NAME) &&
        Objects.equals(this.NETID, ipdiscoverNetdevicesInner.NETID) &&
        Objects.equals(this.TAG, ipdiscoverNetdevicesInner.TAG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE, HARDWARE_ID, IP, MAC, MASK, NAME, NETID, TAG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpdiscoverNetdevicesInner {\n");
    
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("    HARDWARE_ID: ").append(toIndentedString(HARDWARE_ID)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    MAC: ").append(toIndentedString(MAC)).append("\n");
    sb.append("    MASK: ").append(toIndentedString(MASK)).append("\n");
    sb.append("    NAME: ").append(toIndentedString(NAME)).append("\n");
    sb.append("    NETID: ").append(toIndentedString(NETID)).append("\n");
    sb.append("    TAG: ").append(toIndentedString(TAG)).append("\n");
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
