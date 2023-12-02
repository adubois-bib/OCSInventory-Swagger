package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SoftwaresListInner   {

  private @Valid String NAME = null;

  private @Valid String PUBLISHER = null;

  private @Valid String VERSION = null;

  /**
   **/
  public SoftwaresListInner NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

  
  @ApiModelProperty(example = "7-Zip 16.02", value = "")
  @JsonProperty("NAME")

  public String getNAME() {
    return NAME;
  }
  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  /**
   **/
  public SoftwaresListInner PUBLISHER(String PUBLISHER) {
    this.PUBLISHER = PUBLISHER;
    return this;
  }

  
  @ApiModelProperty(example = "Igor Pavlov", value = "")
  @JsonProperty("PUBLISHER")

  public String getPUBLISHER() {
    return PUBLISHER;
  }
  public void setPUBLISHER(String PUBLISHER) {
    this.PUBLISHER = PUBLISHER;
  }

  /**
   **/
  public SoftwaresListInner VERSION(String VERSION) {
    this.VERSION = VERSION;
    return this;
  }

  
  @ApiModelProperty(example = "16.02", value = "")
  @JsonProperty("VERSION")

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
    return Objects.equals(NAME, softwaresListInner.NAME) &&
        Objects.equals(PUBLISHER, softwaresListInner.PUBLISHER) &&
        Objects.equals(VERSION, softwaresListInner.VERSION);
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
