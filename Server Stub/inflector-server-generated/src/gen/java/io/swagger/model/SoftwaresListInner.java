package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2023-12-02T10:39:03.986280886Z[GMT]")

public class SoftwaresListInner   {
  @JsonProperty("NAME")
  private String NAME = null;
  @JsonProperty("PUBLISHER")
  private String PUBLISHER = null;
  @JsonProperty("VERSION")
  private String VERSION = null;
  /**
   **/
  public SoftwaresListInner NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

  
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
  public SoftwaresListInner PUBLISHER(String PUBLISHER) {
    this.PUBLISHER = PUBLISHER;
    return this;
  }

  
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
  public SoftwaresListInner VERSION(String VERSION) {
    this.VERSION = VERSION;
    return this;
  }

  
  @Schema(example = "16.02", description = "")
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
