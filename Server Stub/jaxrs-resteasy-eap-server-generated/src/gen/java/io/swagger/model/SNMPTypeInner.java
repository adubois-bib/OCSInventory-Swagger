package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-12-02T10:39:09.334447740Z[GMT]")
public class SNMPTypeInner   {
  private Integer ID = null;
  private String TABLE_TYPE_NAME = null;
  private String TYPE_NAME = null;

  /**
   **/
  
  @Schema(example = "13", description = "")
  @JsonProperty("ID")
  public Integer getID() {
    return ID;
  }
  public void setID(Integer ID) {
    this.ID = ID;
  }

  /**
   **/
  
  @Schema(example = "snmp_default", description = "")
  @JsonProperty("TABLE_TYPE_NAME")
  public String getTABLETYPENAME() {
    return TABLE_TYPE_NAME;
  }
  public void setTABLETYPENAME(String TABLE_TYPE_NAME) {
    this.TABLE_TYPE_NAME = TABLE_TYPE_NAME;
  }

  /**
   **/
  
  @Schema(example = "Default", description = "")
  @JsonProperty("TYPE_NAME")
  public String getTYPENAME() {
    return TYPE_NAME;
  }
  public void setTYPENAME(String TYPE_NAME) {
    this.TYPE_NAME = TYPE_NAME;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SNMPTypeInner snMPTypeInner = (SNMPTypeInner) o;
    return Objects.equals(ID, snMPTypeInner.ID) &&
        Objects.equals(TABLE_TYPE_NAME, snMPTypeInner.TABLE_TYPE_NAME) &&
        Objects.equals(TYPE_NAME, snMPTypeInner.TYPE_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, TABLE_TYPE_NAME, TYPE_NAME);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
