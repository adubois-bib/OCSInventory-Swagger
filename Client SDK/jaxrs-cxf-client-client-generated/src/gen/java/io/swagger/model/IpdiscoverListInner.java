package io.swagger.model;


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

public class IpdiscoverListInner   {
  
  @Schema(example = "172.18.25.0", description = "")
  private String NETID = null;
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

  public IpdiscoverListInner NETID(String NETID) {
    this.NETID = NETID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpdiscoverListInner {\n");
    
    sb.append("    NETID: ").append(toIndentedString(NETID)).append("\n");
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
