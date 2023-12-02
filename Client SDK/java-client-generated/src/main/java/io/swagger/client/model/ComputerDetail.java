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
import io.swagger.client.model.ComputerDetailComputerId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ComputerDetail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-02T10:36:23.345231699Z[GMT]")

public class ComputerDetail {
  @SerializedName("{computer_id}")
  private ComputerDetailComputerId computerId = null;

  public ComputerDetail computerId(ComputerDetailComputerId computerId) {
    this.computerId = computerId;
    return this;
  }

   /**
   * Get computerId
   * @return computerId
  **/
  @Schema(description = "")
  public ComputerDetailComputerId getComputerId() {
    return computerId;
  }

  public void setComputerId(ComputerDetailComputerId computerId) {
    this.computerId = computerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerDetail computerDetail = (ComputerDetail) o;
    return Objects.equals(this.computerId, computerDetail.computerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerDetail {\n");
    
    sb.append("    computerId: ").append(toIndentedString(computerId)).append("\n");
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
