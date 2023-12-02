package io.swagger.model;


import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class SoftwaresListInner   {
  
  @Schema(example = "7-Zip 16.02", description = "")
  private String NAME = null;
  
  @Schema(example = "Igor Pavlov", description = "")
  private String PUBLISHER = null;
  
  @Schema(example = "16.02", description = "")
  private String VERSION = null;
 /**
   * Get NAME
   * @return NAME
  **/
  @JsonProperty("NAME")
  public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public SoftwaresListInner NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

 /**
   * Get PUBLISHER
   * @return PUBLISHER
  **/
  @JsonProperty("PUBLISHER")
  public String getPUBLISHER() {
    return PUBLISHER;
  }

  public void setPUBLISHER(String PUBLISHER) {
    this.PUBLISHER = PUBLISHER;
  }

  public SoftwaresListInner PUBLISHER(String PUBLISHER) {
    this.PUBLISHER = PUBLISHER;
    return this;
  }

 /**
   * Get VERSION
   * @return VERSION
  **/
  @JsonProperty("VERSION")
  public String getVERSION() {
    return VERSION;
  }

  public void setVERSION(String VERSION) {
    this.VERSION = VERSION;
  }

  public SoftwaresListInner VERSION(String VERSION) {
    this.VERSION = VERSION;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
