package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChatNachricht
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-13T11:05:20.560Z")

public class ChatNachricht   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nachricht")
  private String nachricht = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("zeitpunkt")
  private OffsetDateTime zeitpunkt = null;

  public ChatNachricht id(Integer id) {
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

  public ChatNachricht nachricht(String nachricht) {
    this.nachricht = nachricht;
    return this;
  }

  /**
   * Get nachricht
   * @return nachricht
  **/
  @ApiModelProperty(value = "")


  public String getNachricht() {
    return nachricht;
  }

  public void setNachricht(String nachricht) {
    this.nachricht = nachricht;
  }

  public ChatNachricht name(String name) {
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

  public ChatNachricht zeitpunkt(OffsetDateTime zeitpunkt) {
    this.zeitpunkt = zeitpunkt;
    return this;
  }

  /**
   * Get zeitpunkt
   * @return zeitpunkt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getZeitpunkt() {
    return zeitpunkt;
  }

  public void setZeitpunkt(OffsetDateTime zeitpunkt) {
    this.zeitpunkt = zeitpunkt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatNachricht chatNachricht = (ChatNachricht) o;
    return Objects.equals(this.id, chatNachricht.id) &&
        Objects.equals(this.nachricht, chatNachricht.nachricht) &&
        Objects.equals(this.name, chatNachricht.name) &&
        Objects.equals(this.zeitpunkt, chatNachricht.zeitpunkt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nachricht, name, zeitpunkt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatNachricht {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nachricht: ").append(toIndentedString(nachricht)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    zeitpunkt: ").append(toIndentedString(zeitpunkt)).append("\n");
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

