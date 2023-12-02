package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComputersListComputerIdAccountinfo   {

  private @Valid Integer HARDWARE_ID = null;

  private @Valid String TAG = null;

  /**
   **/
  public ComputersListComputerIdAccountinfo HARDWARE_ID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
    return this;
  }

  
  @ApiModelProperty(example = "16", value = "")
  @JsonProperty("HARDWARE_ID")

  public Integer getHARDWAREID() {
    return HARDWARE_ID;
  }
  public void setHARDWAREID(Integer HARDWARE_ID) {
    this.HARDWARE_ID = HARDWARE_ID;
  }

  /**
   **/
  public ComputersListComputerIdAccountinfo TAG(String TAG) {
    this.TAG = TAG;
    return this;
  }

  
  @ApiModelProperty(example = "DEV-MACHINE", value = "")
  @JsonProperty("TAG")

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
