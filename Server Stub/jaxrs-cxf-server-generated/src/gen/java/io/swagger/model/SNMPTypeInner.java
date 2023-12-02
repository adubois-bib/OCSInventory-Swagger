package io.swagger.model;

import javax.validation.constraints.*;

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

public class SNMPTypeInner   {
  
  @Schema(example = "13", description = "")
  private Integer ID = null;
  
  @Schema(example = "snmp_default", description = "")
  private String TABLE_TYPE_NAME = null;
  
  @Schema(example = "Default", description = "")
  private String TYPE_NAME = null;
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

  public SNMPTypeInner ID(Integer ID) {
    this.ID = ID;
    return this;
  }

 /**
   * Get TABLE_TYPE_NAME
   * @return TABLE_TYPE_NAME
  **/
  @JsonProperty("TABLE_TYPE_NAME")
  public String getTABLETYPENAME() {
    return TABLE_TYPE_NAME;
  }

  public void setTABLETYPENAME(String TABLE_TYPE_NAME) {
    this.TABLE_TYPE_NAME = TABLE_TYPE_NAME;
  }

  public SNMPTypeInner TABLE_TYPE_NAME(String TABLE_TYPE_NAME) {
    this.TABLE_TYPE_NAME = TABLE_TYPE_NAME;
    return this;
  }

 /**
   * Get TYPE_NAME
   * @return TYPE_NAME
  **/
  @JsonProperty("TYPE_NAME")
  public String getTYPENAME() {
    return TYPE_NAME;
  }

  public void setTYPENAME(String TYPE_NAME) {
    this.TYPE_NAME = TYPE_NAME;
  }

  public SNMPTypeInner TYPE_NAME(String TYPE_NAME) {
    this.TYPE_NAME = TYPE_NAME;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SNMPTypeInner {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    TABLE_TYPE_NAME: ").append(toIndentedString(TABLE_TYPE_NAME)).append("\n");
    sb.append("    TYPE_NAME: ").append(toIndentedString(TYPE_NAME)).append("\n");
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
