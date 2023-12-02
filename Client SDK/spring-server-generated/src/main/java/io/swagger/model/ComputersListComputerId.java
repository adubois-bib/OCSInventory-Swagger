package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ComputersListComputerIdAccountinfo;
import io.swagger.model.ComputersListComputerIdBios;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComputersListComputerId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-02T10:36:41.547536827Z[GMT]")


public class ComputersListComputerId   {
  @JsonProperty("accountinfo")
  @Valid
  private List<ComputersListComputerIdAccountinfo> accountinfo = null;

  @JsonProperty("batteries")
  @Valid
  private List<String> batteries = null;

  @JsonProperty("bios")
  @Valid
  private List<ComputersListComputerIdBios> bios = null;

  public ComputersListComputerId accountinfo(List<ComputersListComputerIdAccountinfo> accountinfo) {
    this.accountinfo = accountinfo;
    return this;
  }

  public ComputersListComputerId addAccountinfoItem(ComputersListComputerIdAccountinfo accountinfoItem) {
    if (this.accountinfo == null) {
      this.accountinfo = new ArrayList<ComputersListComputerIdAccountinfo>();
    }
    this.accountinfo.add(accountinfoItem);
    return this;
  }

  /**
   * Get accountinfo
   * @return accountinfo
   **/
  @Schema(description = "")
      @Valid
    public List<ComputersListComputerIdAccountinfo> getAccountinfo() {
    return accountinfo;
  }

  public void setAccountinfo(List<ComputersListComputerIdAccountinfo> accountinfo) {
    this.accountinfo = accountinfo;
  }

  public ComputersListComputerId batteries(List<String> batteries) {
    this.batteries = batteries;
    return this;
  }

  public ComputersListComputerId addBatteriesItem(String batteriesItem) {
    if (this.batteries == null) {
      this.batteries = new ArrayList<String>();
    }
    this.batteries.add(batteriesItem);
    return this;
  }

  /**
   * Get batteries
   * @return batteries
   **/
  @Schema(description = "")
  
    public List<String> getBatteries() {
    return batteries;
  }

  public void setBatteries(List<String> batteries) {
    this.batteries = batteries;
  }

  public ComputersListComputerId bios(List<ComputersListComputerIdBios> bios) {
    this.bios = bios;
    return this;
  }

  public ComputersListComputerId addBiosItem(ComputersListComputerIdBios biosItem) {
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
    ComputersListComputerId computersListComputerId = (ComputersListComputerId) o;
    return Objects.equals(this.accountinfo, computersListComputerId.accountinfo) &&
        Objects.equals(this.batteries, computersListComputerId.batteries) &&
        Objects.equals(this.bios, computersListComputerId.bios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountinfo, batteries, bios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputersListComputerId {\n");
    
    sb.append("    accountinfo: ").append(toIndentedString(accountinfo)).append("\n");
    sb.append("    batteries: ").append(toIndentedString(batteries)).append("\n");
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
