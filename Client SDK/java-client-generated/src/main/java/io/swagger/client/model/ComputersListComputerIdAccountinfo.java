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
 * ComputersListComputerIdAccountinfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-02T10:36:23.345231699Z[GMT]")

public class ComputersListComputerIdAccountinfo {
  @SerializedName("HARDWARE_ID")
  private Integer HARDWARE_ID = null;

  @SerializedName("TAG")
  private String TAG = null;

  public ComputersListComputerIdAccountinfo HARDWARE_ID(Integer HARDWARE_ID) {
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

  public ComputersListComputerIdAccountinfo TAG(String TAG) {
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
    ComputersListComputerIdAccountinfo computersListComputerIdAccountinfo = (ComputersListComputerIdAccountinfo) o;
    return Objects.equals(this.HARDWARE_ID, computersListComputerIdAccountinfo.HARDWARE_ID) &&
        Objects.equals(this.TAG, computersListComputerIdAccountinfo.TAG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(HARDWARE_ID, TAG);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputersListComputerIdAccountinfo {\n");
    
    sb.append("    HARDWARE_ID: ").append(toIndentedString(HARDWARE_ID)).append("\n");
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
