package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ComputersListComputerIdBios;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComputerDetailComputerId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")


public class ComputerDetailComputerId   {
  @JsonProperty("bios")
  @Valid
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
      @Valid
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
