package io.swagger.model;

import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IpdiscoverNetdevicesInner   {

  private @Valid Date DATE = null;

  private @Valid Integer HARDWARE_ID = null;

  private @Valid String IP = null;

  private @Valid String MAC = null;

  private @Valid String MASK = null;

  private @Valid String NAME = null;

  private @Valid String NETID = null;

  private @Valid String TAG = null;

  /**
   **/
  public IpdiscoverNetdevicesInner DATE(Date DATE) {
    this.DATE = DATE;
    return this;
  }

  
  @ApiModelProperty(example = "2023-06-08T12:15:08Z", value = "")
  @JsonProperty("DATE")

  public Date getDATE() {
    return DATE;
  }
  public void setDATE(Date DATE) {
    this.DATE = DATE;
  }

  /**
   **/
  public IpdiscoverNetdevicesInner HARDWARE_ID(Integer HARDWARE_ID) {
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
  public IpdiscoverNetdevicesInner IP(String IP) {
    this.IP = IP;
    return this;
  }

  
  @ApiModelProperty(example = "172.18.25.254", value = "")
  @JsonProperty("IP")

  public String getIP() {
    return IP;
  }
  public void setIP(String IP) {
    this.IP = IP;
  }

  /**
   **/
  public IpdiscoverNetdevicesInner MAC(String MAC) {
    this.MAC = MAC;
    return this;
  }

  
  @ApiModelProperty(example = "00:0d:b9:51:fc:aa", value = "")
  @JsonProperty("MAC")

  public String getMAC() {
    return MAC;
  }
  public void setMAC(String MAC) {
    this.MAC = MAC;
  }

  /**
   **/
  public IpdiscoverNetdevicesInner MASK(String MASK) {
    this.MASK = MASK;
    return this;
  }

  
  @ApiModelProperty(example = "255.255.255.0", value = "")
  @JsonProperty("MASK")

  public String getMASK() {
    return MASK;
  }
  public void setMASK(String MASK) {
    this.MASK = MASK;
  }

  /**
   **/
  public IpdiscoverNetdevicesInner NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

  
  @ApiModelProperty(example = "-", value = "")
  @JsonProperty("NAME")

  public String getNAME() {
    return NAME;
  }
  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  /**
   **/
  public IpdiscoverNetdevicesInner NETID(String NETID) {
    this.NETID = NETID;
    return this;
  }

  
  @ApiModelProperty(example = "172.18.25.0", value = "")
  @JsonProperty("NETID")

  public String getNETID() {
    return NETID;
  }
  public void setNETID(String NETID) {
    this.NETID = NETID;
  }

  /**
   **/
  public IpdiscoverNetdevicesInner TAG(String TAG) {
    this.TAG = TAG;
    return this;
  }

  
  @ApiModelProperty(example = "DEV-MACHINE", value = "")
  @JsonProperty("TAG")

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
    return Objects.equals(DATE, ipdiscoverNetdevicesInner.DATE) &&
        Objects.equals(HARDWARE_ID, ipdiscoverNetdevicesInner.HARDWARE_ID) &&
        Objects.equals(IP, ipdiscoverNetdevicesInner.IP) &&
        Objects.equals(MAC, ipdiscoverNetdevicesInner.MAC) &&
        Objects.equals(MASK, ipdiscoverNetdevicesInner.MASK) &&
        Objects.equals(NAME, ipdiscoverNetdevicesInner.NAME) &&
        Objects.equals(NETID, ipdiscoverNetdevicesInner.NETID) &&
        Objects.equals(TAG, ipdiscoverNetdevicesInner.TAG);
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
