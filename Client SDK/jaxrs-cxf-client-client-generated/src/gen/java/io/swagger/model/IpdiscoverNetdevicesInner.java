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

public class IpdiscoverNetdevicesInner   {
  
  @Schema(example = "2023-06-08T12:15:08Z", description = "")
  private Date DATE = null;
  
  @Schema(example = "16", description = "")
  private Integer HARDWARE_ID = null;
  
  @Schema(example = "172.18.25.254", description = "")
  private String IP = null;
  
  @Schema(example = "00:0d:b9:51:fc:aa", description = "")
  private String MAC = null;
  
  @Schema(example = "255.255.255.0", description = "")
  private String MASK = null;
  
  @Schema(example = "-", description = "")
  private String NAME = null;
  
  @Schema(example = "172.18.25.0", description = "")
  private String NETID = null;
  
  @Schema(example = "DEV-MACHINE", description = "")
  private String TAG = null;
 /**
   * Get DATE
   * @return DATE
  **/
  @JsonProperty("DATE")
  public Date getDATE() {
    return DATE;
  }

  public void setDATE(Date DATE) {
    this.DATE = DATE;
  }

  public IpdiscoverNetdevicesInner DATE(Date DATE) {
    this.DATE = DATE;
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

  public IpdiscoverNetdevicesInner HARDWARE_ID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
    return this;
  }

 /**
   * Get IP
   * @return IP
  **/
  @JsonProperty("IP")
  public String getIP() {
    return IP;
  }

  public void setIP(String IP) {
    this.IP = IP;
  }

  public IpdiscoverNetdevicesInner IP(String IP) {
    this.IP = IP;
    return this;
  }

 /**
   * Get MAC
   * @return MAC
  **/
  @JsonProperty("MAC")
  public String getMAC() {
    return MAC;
  }

  public void setMAC(String MAC) {
    this.MAC = MAC;
  }

  public IpdiscoverNetdevicesInner MAC(String MAC) {
    this.MAC = MAC;
    return this;
  }

 /**
   * Get MASK
   * @return MASK
  **/
  @JsonProperty("MASK")
  public String getMASK() {
    return MASK;
  }

  public void setMASK(String MASK) {
    this.MASK = MASK;
  }

  public IpdiscoverNetdevicesInner MASK(String MASK) {
    this.MASK = MASK;
    return this;
  }

 /**
   * Get NAME
   * @return NAME
  **/
  @JsonProperty("NAME")
  public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public IpdiscoverNetdevicesInner NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

 /**
   * Get NETID
   * @return NETID
  **/
  @JsonProperty("NETID")
  public String getNETID() {
    return NETID;
  }

  public void setNETID(String NETID) {
    this.NETID = NETID;
  }

  public IpdiscoverNetdevicesInner NETID(String NETID) {
    this.NETID = NETID;
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

  public IpdiscoverNetdevicesInner TAG(String TAG) {
    this.TAG = TAG;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
