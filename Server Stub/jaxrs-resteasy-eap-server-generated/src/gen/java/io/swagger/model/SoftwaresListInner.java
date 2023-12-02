package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-12-02T10:39:09.334447740Z[GMT]")
public class SoftwaresListInner   {
  private String NAME = null;
  private String PUBLISHER = null;
  private String VERSION = null;

  /**
   **/
  
  @Schema(example = "7-Zip 16.02", description = "")
  @JsonProperty("NAME")
  public String getNAME() {
    return NAME;
  }
  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  /**
   **/
  
  @Schema(example = "Igor Pavlov", description = "")
  @JsonProperty("PUBLISHER")
  public String getPUBLISHER() {
    return PUBLISHER;
  }
  public void setPUBLISHER(String PUBLISHER) {
    this.PUBLISHER = PUBLISHER;
  }

  /**
   **/
  
  @Schema(example = "16.02", description = "")
  @JsonProperty("VERSION")
  public String getVERSION() {
    return VERSION;
  }
  public void setVERSION(String VERSION) {
    this.VERSION = VERSION;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
