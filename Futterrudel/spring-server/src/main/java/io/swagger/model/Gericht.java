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
 * Gericht
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-13T11:05:20.560Z")

public class Gericht   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ort")
  private String ort = null;

  @JsonProperty("preis")
  private Float preis = null;

  @JsonProperty("img")
  private String img = null;

  @JsonProperty("kategorie")
  private String kategorie = null;

  public Gericht id(Integer id) {
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

  public Gericht name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gericht ort(String ort) {
    this.ort = ort;
    return this;
  }

  /**
   * Get ort
   * @return ort
  **/
  @ApiModelProperty(value = "")


  public String getOrt() {
    return ort;
  }

  public void setOrt(String ort) {
    this.ort = ort;
  }

  public Gericht preis(Float preis) {
    this.preis = preis;
    return this;
  }

  /**
   * Get preis
   * @return preis
  **/
  @ApiModelProperty(value = "")


  public Float getPreis() {
    return preis;
  }

  public void setPreis(Float preis) {
    this.preis = preis;
  }

  public Gericht img(String img) {
    this.img = img;
    return this;
  }

  /**
   * Get img
   * @return img
  **/
  @ApiModelProperty(value = "")


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public Gericht kategorie(String kategorie) {
    this.kategorie = kategorie;
    return this;
  }

  /**
   * Get kategorie
   * @return kategorie
  **/
  @ApiModelProperty(value = "")


  public String getKategorie() {
    return kategorie;
  }

  public void setKategorie(String kategorie) {
    this.kategorie = kategorie;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gericht gericht = (Gericht) o;
    return Objects.equals(this.id, gericht.id) &&
        Objects.equals(this.name, gericht.name) &&
        Objects.equals(this.ort, gericht.ort) &&
        Objects.equals(this.preis, gericht.preis) &&
        Objects.equals(this.img, gericht.img) &&
        Objects.equals(this.kategorie, gericht.kategorie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ort, preis, img, kategorie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gericht {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ort: ").append(toIndentedString(ort)).append("\n");
    sb.append("    preis: ").append(toIndentedString(preis)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    kategorie: ").append(toIndentedString(kategorie)).append("\n");
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

