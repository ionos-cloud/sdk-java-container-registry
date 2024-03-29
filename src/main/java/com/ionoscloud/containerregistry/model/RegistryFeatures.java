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
import com.ionoscloud.containerregistry.model.FeatureVulnerabilityScanning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Optional registry features.  __Note__: some may incur additional charges - see individual feature descriptions for details
 */
@ApiModel(description = "Optional registry features.  __Note__: some may incur additional charges - see individual feature descriptions for details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T14:36:52.394811Z[Etc/UTC]")

public class RegistryFeatures {
  
  public static final String SERIALIZED_NAME_VULNERABILITY_SCANNING = "vulnerabilityScanning";
  @SerializedName(SERIALIZED_NAME_VULNERABILITY_SCANNING)
  private FeatureVulnerabilityScanning vulnerabilityScanning;

  

  public RegistryFeatures vulnerabilityScanning(FeatureVulnerabilityScanning vulnerabilityScanning) {
    
    this.vulnerabilityScanning = vulnerabilityScanning;
    return this;
  }

   /**
   * Get vulnerabilityScanning
   * @return vulnerabilityScanning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeatureVulnerabilityScanning getVulnerabilityScanning() {
    return vulnerabilityScanning;
  }


  public void setVulnerabilityScanning(FeatureVulnerabilityScanning vulnerabilityScanning) {
    this.vulnerabilityScanning = vulnerabilityScanning;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryFeatures registryFeatures = (RegistryFeatures) o;
    return Objects.equals(this.vulnerabilityScanning, registryFeatures.vulnerabilityScanning);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryFeatures {\n");
    
    sb.append("    vulnerabilityScanning: ").append(toIndentedString(vulnerabilityScanning)).append("\n");
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

