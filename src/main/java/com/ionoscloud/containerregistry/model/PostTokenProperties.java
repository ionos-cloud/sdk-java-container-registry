/*
 * Container Registry service
 * Container Registry service enables IONOS clients to manage docker and OCI compliant registries for use by their managed Kubernetes clusters. Use a Container Registry to ensure you have a privately accessed registry to efficiently support image pulls.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@cloud.ionos.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.containerregistry.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ionoscloud.containerregistry.model.Scope;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * PostTokenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T15:19:22.180Z[Etc/UTC]")

public class PostTokenProperties {
  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<Scope> scopes = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {

      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;


  public PostTokenProperties expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public PostTokenProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "push-token", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostTokenProperties scopes(List<Scope> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public PostTokenProperties addScopesItem(Scope scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<Scope>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Scope> getScopes() {
    return scopes;
  }


  public void setScopes(List<Scope> scopes) {
    this.scopes = scopes;
  }


  public PostTokenProperties status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTokenProperties postTokenProperties = (PostTokenProperties) o;
    return Objects.equals(this.expiryDate, postTokenProperties.expiryDate) && Objects.equals(this.name, postTokenProperties.name) && Objects.equals(this.scopes, postTokenProperties.scopes) && Objects.equals(this.status, postTokenProperties.status);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTokenProperties {\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

