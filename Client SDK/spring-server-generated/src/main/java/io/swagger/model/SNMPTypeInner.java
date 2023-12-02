package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SNMPTypeInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")


public class SNMPTypeInner   {
  @JsonProperty("ID")
  private Integer ID = null;

  @JsonProperty("TABLE_TYPE_NAME")
  private String TABLE_TYPE_NAME = null;

  @JsonProperty("TYPE_NAME")
  private String TYPE_NAME = null;

  public SNMPTypeInner ID(Integer ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
   **/
  @Schema(example = "13", description = "")
  
    public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public SNMPTypeInner TABLE_TYPE_NAME(String TABLE_TYPE_NAME) {
    this.TABLE_TYPE_NAME = TABLE_TYPE_NAME;
    return this;
  }

  /**
   * Get TABLE_TYPE_NAME
   * @return TABLE_TYPE_NAME
   **/
  @Schema(example = "snmp_default", description = "")
  
    public String getTABLETYPENAME() {
    return TABLE_TYPE_NAME;
  }

  public void setTABLETYPENAME(String TABLE_TYPE_NAME) {
    this.TABLE_TYPE_NAME = TABLE_TYPE_NAME;
  }

  public SNMPTypeInner TYPE_NAME(String TYPE_NAME) {
    this.TYPE_NAME = TYPE_NAME;
    return this;
  }

  /**
   * Get TYPE_NAME
   * @return TYPE_NAME
   **/
  @Schema(example = "Default", description = "")
  
    public String getTYPENAME() {
    return TYPE_NAME;
  }

  public void setTYPENAME(String TYPE_NAME) {
    this.TYPE_NAME = TYPE_NAME;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SNMPTypeInner snMPTypeInner = (SNMPTypeInner) o;
    return Objects.equals(this.ID, snMPTypeInner.ID) &&
        Objects.equals(this.TABLE_TYPE_NAME, snMPTypeInner.TABLE_TYPE_NAME) &&
        Objects.equals(this.TYPE_NAME, snMPTypeInner.TYPE_NAME);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
