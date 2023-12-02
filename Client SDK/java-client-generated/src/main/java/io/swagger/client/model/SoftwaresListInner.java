/*
 * OCS Inventory Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SoftwaresListInner
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-02T10:36:23.345231699Z[GMT]")

public class SoftwaresListInner {
  @SerializedName("NAME")
  private String NAME = null;

  @SerializedName("PUBLISHER")
  private String PUBLISHER = null;

  @SerializedName("VERSION")
  private String VERSION = null;

  public SoftwaresListInner NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

   /**
   * Get NAME
   * @return NAME
  **/
  @Schema(example = "7-Zip 16.02", description = "")
  public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public SoftwaresListInner PUBLISHER(String PUBLISHER) {
    this.PUBLISHER = PUBLISHER;
    return this;
  }

   /**
   * Get PUBLISHER
   * @return PUBLISHER
  **/
  @Schema(example = "Igor Pavlov", description = "")
  public String getPUBLISHER() {
    return PUBLISHER;
  }

  public void setPUBLISHER(String PUBLISHER) {
    this.PUBLISHER = PUBLISHER;
  }

  public SoftwaresListInner VERSION(String VERSION) {
    this.VERSION = VERSION;
    return this;
  }

   /**
   * Get VERSION
   * @return VERSION
  **/
  @Schema(example = "16.02", description = "")
  public String getVERSION() {
    return VERSION;
  }

  public void setVERSION(String VERSION) {
    this.VERSION = VERSION;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwaresListInner softwaresListInner = (SoftwaresListInner) o;
    return Objects.equals(this.NAME, softwaresListInner.NAME) &&
        Objects.equals(this.PUBLISHER, softwaresListInner.PUBLISHER) &&
        Objects.equals(this.VERSION, softwaresListInner.VERSION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NAME, PUBLISHER, VERSION);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwaresListInner {\n");
    
    sb.append("    NAME: ").append(toIndentedString(NAME)).append("\n");
    sb.append("    PUBLISHER: ").append(toIndentedString(PUBLISHER)).append("\n");
    sb.append("    VERSION: ").append(toIndentedString(VERSION)).append("\n");
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
