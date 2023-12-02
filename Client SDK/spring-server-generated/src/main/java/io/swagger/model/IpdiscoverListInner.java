package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IpdiscoverListInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")


public class IpdiscoverListInner   {
  @JsonProperty("NETID")
  private String NETID = null;

  public IpdiscoverListInner NETID(String NETID) {
    this.NETID = NETID;
    return this;
  }

  /**
   * Get NETID
   * @return NETID
   **/
  @Schema(example = "172.18.25.0", description = "")
  
    public String getNETID() {
    return NETID;
  }

  public void setNETID(String NETID) {
    this.NETID = NETID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpdiscoverListInner ipdiscoverListInner = (IpdiscoverListInner) o;
    return Objects.equals(this.NETID, ipdiscoverListInner.NETID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NETID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpdiscoverListInner {\n");
    
    sb.append("    NETID: ").append(toIndentedString(NETID)).append("\n");
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
