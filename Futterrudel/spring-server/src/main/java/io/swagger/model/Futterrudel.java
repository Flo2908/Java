package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Chat;
import io.swagger.model.Person;
import io.swagger.model.WerIsstWas;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Futterrudel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-13T11:05:20.560Z")

public class Futterrudel   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("verzehrort")
  private String verzehrort = null;

  @JsonProperty("timeslot")
  private OffsetDateTime timeslot = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("personen")
  @Valid
  private List<Person> personen = null;

  @JsonProperty("organisiator")
  private Person organisiator = null;

  @JsonProperty("chat")
  private Chat chat = null;

  @JsonProperty("werisstwas")
  private WerIsstWas werisstwas = null;

  public Futterrudel id(Integer id) {
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

  public Futterrudel name(String name) {
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

  public Futterrudel verzehrort(String verzehrort) {
    this.verzehrort = verzehrort;
    return this;
  }

  /**
   * Get verzehrort
   * @return verzehrort
  **/
  @ApiModelProperty(value = "")


  public String getVerzehrort() {
    return verzehrort;
  }

  public void setVerzehrort(String verzehrort) {
    this.verzehrort = verzehrort;
  }

  public Futterrudel timeslot(OffsetDateTime timeslot) {
    this.timeslot = timeslot;
    return this;
  }

  /**
   * Get timeslot
   * @return timeslot
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimeslot() {
    return timeslot;
  }

  public void setTimeslot(OffsetDateTime timeslot) {
    this.timeslot = timeslot;
  }

  public Futterrudel limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Futterrudel personen(List<Person> personen) {
    this.personen = personen;
    return this;
  }

  public Futterrudel addPersonenItem(Person personenItem) {
    if (this.personen == null) {
      this.personen = new ArrayList<Person>();
    }
    this.personen.add(personenItem);
    return this;
  }

  /**
   * Get personen
   * @return personen
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Person> getPersonen() {
    return personen;
  }

  public void setPersonen(List<Person> personen) {
    this.personen = personen;
  }

  public Futterrudel organisiator(Person organisiator) {
    this.organisiator = organisiator;
    return this;
  }

  /**
   * Get organisiator
   * @return organisiator
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Person getOrganisiator() {
    return organisiator;
  }

  public void setOrganisiator(Person organisiator) {
    this.organisiator = organisiator;
  }

  public Futterrudel chat(Chat chat) {
    this.chat = chat;
    return this;
  }

  /**
   * Get chat
   * @return chat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Chat getChat() {
    return chat;
  }

  public void setChat(Chat chat) {
    this.chat = chat;
  }

  public Futterrudel werisstwas(WerIsstWas werisstwas) {
    this.werisstwas = werisstwas;
    return this;
  }

  /**
   * Get werisstwas
   * @return werisstwas
  **/
  @ApiModelProperty(value = "")

  @Valid

  public WerIsstWas getWerisstwas() {
    return werisstwas;
  }

  public void setWerisstwas(WerIsstWas werisstwas) {
    this.werisstwas = werisstwas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Futterrudel futterrudel = (Futterrudel) o;
    return Objects.equals(this.id, futterrudel.id) &&
        Objects.equals(this.name, futterrudel.name) &&
        Objects.equals(this.verzehrort, futterrudel.verzehrort) &&
        Objects.equals(this.timeslot, futterrudel.timeslot) &&
        Objects.equals(this.limit, futterrudel.limit) &&
        Objects.equals(this.personen, futterrudel.personen) &&
        Objects.equals(this.organisiator, futterrudel.organisiator) &&
        Objects.equals(this.chat, futterrudel.chat) &&
        Objects.equals(this.werisstwas, futterrudel.werisstwas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, verzehrort, timeslot, limit, personen, organisiator, chat, werisstwas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Futterrudel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    verzehrort: ").append(toIndentedString(verzehrort)).append("\n");
    sb.append("    timeslot: ").append(toIndentedString(timeslot)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    personen: ").append(toIndentedString(personen)).append("\n");
    sb.append("    organisiator: ").append(toIndentedString(organisiator)).append("\n");
    sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
    sb.append("    werisstwas: ").append(toIndentedString(werisstwas)).append("\n");
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

