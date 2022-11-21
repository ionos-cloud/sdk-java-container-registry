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
import com.ionoscloud.containerregistry.model.WeeklySchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PostRegistryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T15:19:22.180Z[Etc/UTC]")

public class PostRegistryProperties {
  public static final String SERIALIZED_NAME_GARBAGE_COLLECTION_SCHEDULE = "garbageCollectionSchedule";
  @SerializedName(SERIALIZED_NAME_GARBAGE_COLLECTION_SCHEDULE)
  private WeeklySchedule garbageCollectionSchedule;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public PostRegistryProperties garbageCollectionSchedule(WeeklySchedule garbageCollectionSchedule) {
    
    this.garbageCollectionSchedule = garbageCollectionSchedule;
    return this;
  }

   /**
   * Get garbageCollectionSchedule
   * @return garbageCollectionSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WeeklySchedule getGarbageCollectionSchedule() {
    return garbageCollectionSchedule;
  }


  public void setGarbageCollectionSchedule(WeeklySchedule garbageCollectionSchedule) {
    this.garbageCollectionSchedule = garbageCollectionSchedule;
  }


  public PostRegistryProperties location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "de/txl", required = true, value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public PostRegistryProperties name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "my-registry", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRegistryProperties postRegistryProperties = (PostRegistryProperties) o;
    return Objects.equals(this.garbageCollectionSchedule, postRegistryProperties.garbageCollectionSchedule) && Objects.equals(this.location, postRegistryProperties.location) && Objects.equals(this.name, postRegistryProperties.name);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRegistryProperties {\n");
    sb.append("    garbageCollectionSchedule: ").append(toIndentedString(garbageCollectionSchedule)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

