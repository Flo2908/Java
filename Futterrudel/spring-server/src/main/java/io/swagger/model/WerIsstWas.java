package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WerIsstWas
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-13T11:05:20.560Z")

public class WerIsstWas   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("gerichtId")
  private Integer gerichtId = null;

  @JsonProperty("personenId")
  private Integer personenId = null;

  @JsonProperty("anzahl")
  private Integer anzahl = null;

  public WerIsstWas id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WerIsstWas gerichtId(Integer gerichtId) {
    this.gerichtId = gerichtId;
    return this;
  }

  /**
   * Get gerichtId
   * @return gerichtId
  **/
  @ApiModelProperty(value = "")


  public Integer getGerichtId() {
    return gerichtId;
  }

  public void setGerichtId(Integer gerichtId) {
    this.gerichtId = gerichtId;
  }

  public WerIsstWas personenId(Integer personenId) {
    this.personenId = personenId;
    return this;
  }

  /**
   * Get personenId
   * @return personenId
  **/
  @ApiModelProperty(value = "")


  public Integer getPersonenId() {
    return personenId;
  }

  public void setPersonenId(Integer personenId) {
    this.personenId = personenId;
  }

  public WerIsstWas anzahl(Integer anzahl) {
    this.anzahl = anzahl;
    return this;
  }

  /**
   * Get anzahl
   * @return anzahl
  **/
  @ApiModelProperty(value = "")


  public Integer getAnzahl() {
    return anzahl;
  }

  public void setAnzahl(Integer anzahl) {
    this.anzahl = anzahl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WerIsstWas werIsstWas = (WerIsstWas) o;
    return Objects.equals(this.id, werIsstWas.id) &&
        Objects.equals(this.gerichtId, werIsstWas.gerichtId) &&
        Objects.equals(this.personenId, werIsstWas.personenId) &&
        Objects.equals(this.anzahl, werIsstWas.anzahl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gerichtId, personenId, anzahl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WerIsstWas {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gerichtId: ").append(toIndentedString(gerichtId)).append("\n");
    sb.append("    personenId: ").append(toIndentedString(personenId)).append("\n");
    sb.append("    anzahl: ").append(toIndentedString(anzahl)).append("\n");
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

