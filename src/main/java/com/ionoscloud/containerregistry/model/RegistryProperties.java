/*
 * Container Registry service
 * ## Overview Container Registry service enables IONOS clients to manage docker and OCI compliant registries for use by their managed Kubernetes clusters. Use a Container Registry to ensure you have a privately accessed registry to efficiently support image pulls. ## Changelog ### 1.1.0  - Added new endpoints for Repositories  - Added new endpoints for Artifacts  - Added new endpoints for Vulnerabilities  - Added registry vulnerabilityScanning feature 
 *
 * The version of the OpenAPI document: 1.1.0
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
import com.ionoscloud.containerregistry.model.RegistryFeatures;
import com.ionoscloud.containerregistry.model.StorageUsage;
import com.ionoscloud.containerregistry.model.WeeklySchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RegistryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T14:36:52.394811Z[Etc/UTC]")

public class RegistryProperties {
  
  public static final String SERIALIZED_NAME_GARBAGE_COLLECTION_SCHEDULE = "garbageCollectionSchedule";
  @SerializedName(SERIALIZED_NAME_GARBAGE_COLLECTION_SCHEDULE)
  private WeeklySchedule garbageCollectionSchedule;


  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;


  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;


  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_STORAGE_USAGE = "storageUsage";
  @SerializedName(SERIALIZED_NAME_STORAGE_USAGE)
  private StorageUsage storageUsage;


  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private RegistryFeatures features;

  

  public RegistryProperties garbageCollectionSchedule(WeeklySchedule garbageCollectionSchedule) {
    
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



  public RegistryProperties hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-registry.cr.ionos.com", value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }



  public RegistryProperties location(String location) {
    
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



  public RegistryProperties name(String name) {
    
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



  public RegistryProperties storageUsage(StorageUsage storageUsage) {
    
    this.storageUsage = storageUsage;
    return this;
  }

   /**
   * Get storageUsage
   * @return storageUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageUsage getStorageUsage() {
    return storageUsage;
  }


  public void setStorageUsage(StorageUsage storageUsage) {
    this.storageUsage = storageUsage;
  }



  public RegistryProperties features(RegistryFeatures features) {
    
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RegistryFeatures getFeatures() {
    return features;
  }


  public void setFeatures(RegistryFeatures features) {
    this.features = features;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryProperties registryProperties = (RegistryProperties) o;
    return Objects.equals(this.garbageCollectionSchedule, registryProperties.garbageCollectionSchedule) && Objects.equals(this.hostname, registryProperties.hostname) && Objects.equals(this.location, registryProperties.location) && Objects.equals(this.name, registryProperties.name) && Objects.equals(this.storageUsage, registryProperties.storageUsage) && Objects.equals(this.features, registryProperties.features);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryProperties {\n");
    
    sb.append("    garbageCollectionSchedule: ").append(toIndentedString(garbageCollectionSchedule)).append("\n");

    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");

    sb.append("    location: ").append(toIndentedString(location)).append("\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    storageUsage: ").append(toIndentedString(storageUsage)).append("\n");

    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

