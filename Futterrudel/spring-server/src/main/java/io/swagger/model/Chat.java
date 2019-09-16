package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ChatNachricht;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Chat
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-13T11:05:20.560Z")

public class Chat   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nachrichten")
  @Valid
  private List<ChatNachricht> nachrichten = null;

  public Chat id(Integer id) {
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

  public Chat nachrichten(List<ChatNachricht> nachrichten) {
    this.nachrichten = nachrichten;
    return this;
  }

  public Chat addNachrichtenItem(ChatNachricht nachrichtenItem) {
    if (this.nachrichten == null) {
      this.nachrichten = new ArrayList<ChatNachricht>();
    }
    this.nachrichten.add(nachrichtenItem);
    return this;
  }

  /**
   * Get nachrichten
   * @return nachrichten
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ChatNachricht> getNachrichten() {
    return nachrichten;
  }

  public void setNachrichten(List<ChatNachricht> nachrichten) {
    this.nachrichten = nachrichten;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chat chat = (Chat) o;
    return Objects.equals(this.id, chat.id) &&
        Objects.equals(this.nachrichten, chat.nachrichten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nachrichten);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chat {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nachrichten: ").append(toIndentedString(nachrichten)).append("\n");
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

