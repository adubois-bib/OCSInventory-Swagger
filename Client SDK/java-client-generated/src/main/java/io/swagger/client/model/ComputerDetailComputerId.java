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
import io.swagger.client.model.ComputersListComputerIdBios;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ComputerDetailComputerId
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-12-02T10:36:23.345231699Z[GMT]")

public class ComputerDetailComputerId {
  @SerializedName("bios")
  private List<ComputersListComputerIdBios> bios = null;

  public ComputerDetailComputerId bios(List<ComputersListComputerIdBios> bios) {
    this.bios = bios;
    return this;
  }

  public ComputerDetailComputerId addBiosItem(ComputersListComputerIdBios biosItem) {
    if (this.bios == null) {
      this.bios = new ArrayList<ComputersListComputerIdBios>();
    }
    this.bios.add(biosItem);
    return this;
  }

   /**
   * Get bios
   * @return bios
  **/
  @Schema(description = "")
  public List<ComputersListComputerIdBios> getBios() {
    return bios;
  }

  public void setBios(List<ComputersListComputerIdBios> bios) {
    this.bios = bios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerDetailComputerId computerDetailComputerId = (ComputerDetailComputerId) o;
    return Objects.equals(this.bios, computerDetailComputerId.bios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bios);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerDetailComputerId {\n");
    
    sb.append("    bios: ").append(toIndentedString(bios)).append("\n");
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