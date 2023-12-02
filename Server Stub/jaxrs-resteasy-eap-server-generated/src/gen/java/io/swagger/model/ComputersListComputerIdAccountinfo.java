package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-12-02T10:39:09.334447740Z[GMT]")
public class ComputersListComputerIdAccountinfo   {
  private Integer HARDWARE_ID = null;
  private String TAG = null;

  /**
   **/
  
  @Schema(example = "16", description = "")
  @JsonProperty("HARDWARE_ID")
  public Integer getHARDWAREID() {
    return HARDWARE_ID;
  }
  public void setHARDWAREID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
  }

  /**
   **/
  
  @Schema(example = "DEV-MACHINE", description = "")
  @JsonProperty("TAG")
  public String getTAG() {
    return TAG;
  }
  public void setTAG(String TAG) {
    this.TAG = TAG;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputersListComputerIdAccountinfo computersListComputerIdAccountinfo = (ComputersListComputerIdAccountinfo) o;
    return Objects.equals(HARDWARE_ID, computersListComputerIdAccountinfo.HARDWARE_ID) &&
        Objects.equals(TAG, computersListComputerIdAccountinfo.TAG);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
