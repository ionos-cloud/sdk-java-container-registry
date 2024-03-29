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
import com.ionoscloud.containerregistry.model.Metadata;
import com.ionoscloud.containerregistry.model.RepositoryMetadataAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * RepositoryMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T14:36:52.394811Z[Etc/UTC]")

public class RepositoryMetadata {
  
  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;


  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;


  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private OffsetDateTime lastModifiedDate;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID = "lastModifiedByUserId";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID)
  private String lastModifiedByUserId;


  public static final String SERIALIZED_NAME_RESOURCE_U_R_N = "resourceURN";
  @SerializedName(SERIALIZED_NAME_RESOURCE_U_R_N)
  private String resourceURN;


  public static final String SERIALIZED_NAME_ARTIFACT_COUNT = "artifactCount";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_COUNT)
  private Long artifactCount;


  public static final String SERIALIZED_NAME_PULL_COUNT = "pullCount";
  @SerializedName(SERIALIZED_NAME_PULL_COUNT)
  private Long pullCount;


  public static final String SERIALIZED_NAME_PUSH_COUNT = "pushCount";
  @SerializedName(SERIALIZED_NAME_PUSH_COUNT)
  private Long pushCount;


  public static final String SERIALIZED_NAME_LAST_PULLED_AT = "lastPulledAt";
  @SerializedName(SERIALIZED_NAME_LAST_PULLED_AT)
  private OffsetDateTime lastPulledAt;


  public static final String SERIALIZED_NAME_LAST_PUSHED_AT = "lastPushedAt";
  @SerializedName(SERIALIZED_NAME_LAST_PUSHED_AT)
  private OffsetDateTime lastPushedAt;


  public static final String SERIALIZED_NAME_LAST_SEVERITY = "lastSeverity";
  @SerializedName(SERIALIZED_NAME_LAST_SEVERITY)
  private String lastSeverity;

  

  public RepositoryMetadata createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * The ISO 8601 creation timestamp.
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-10T13:37:50+01:00", value = "The ISO 8601 creation timestamp.")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }



  public RepositoryMetadata createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Unique name of the identity that created the resource.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ionos:identity:::users/87f9a82e-b28d-49ed-9d04-fba2c0459cd3", value = "Unique name of the identity that created the resource.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }



  public RepositoryMetadata createdByUserId(String createdByUserId) {
    
    this.createdByUserId = createdByUserId;
    return this;
  }

   /**
   * Get createdByUserId
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "87f9a82e-b28d-49ed-9d04-fba2c0459cd3", value = "")

  public String getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }



  public RepositoryMetadata lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * The ISO 8601 modified timestamp.
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-11T13:37:50+01:00", value = "The ISO 8601 modified timestamp.")

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }



  public RepositoryMetadata lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Unique name of the identity that last modified the resource.
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ionos:identity:::users/87f9a82e-b28d-49ed-9d04-fba2c0459cd3", value = "Unique name of the identity that last modified the resource.")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }



  public RepositoryMetadata lastModifiedByUserId(String lastModifiedByUserId) {
    
    this.lastModifiedByUserId = lastModifiedByUserId;
    return this;
  }

   /**
   * Get lastModifiedByUserId
   * @return lastModifiedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "87f9a82e-b28d-49ed-9d04-fba2c0459cd3", value = "")

  public String getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }


  public void setLastModifiedByUserId(String lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
  }



  public RepositoryMetadata resourceURN(String resourceURN) {
    
    this.resourceURN = resourceURN;
    return this;
  }

   /**
   * Unique name of the resource.
   * @return resourceURN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ionos:<product>:<location>:<contract>:<resource-path>", value = "Unique name of the resource.")

  public String getResourceURN() {
    return resourceURN;
  }


  public void setResourceURN(String resourceURN) {
    this.resourceURN = resourceURN;
  }



  public RepositoryMetadata artifactCount(Long artifactCount) {
    
    this.artifactCount = artifactCount;
    return this;
  }

   /**
   * Get artifactCount
   * @return artifactCount
  **/
  @ApiModelProperty(example = "125", required = true, value = "")

  public Long getArtifactCount() {
    return artifactCount;
  }


  public void setArtifactCount(Long artifactCount) {
    this.artifactCount = artifactCount;
  }



  public RepositoryMetadata pullCount(Long pullCount) {
    
    this.pullCount = pullCount;
    return this;
  }

   /**
   * Get pullCount
   * @return pullCount
  **/
  @ApiModelProperty(example = "4200", required = true, value = "")

  public Long getPullCount() {
    return pullCount;
  }


  public void setPullCount(Long pullCount) {
    this.pullCount = pullCount;
  }



  public RepositoryMetadata pushCount(Long pushCount) {
    
    this.pushCount = pushCount;
    return this;
  }

   /**
   * Get pushCount
   * @return pushCount
  **/
  @ApiModelProperty(example = "200", required = true, value = "")

  public Long getPushCount() {
    return pushCount;
  }


  public void setPushCount(Long pushCount) {
    this.pushCount = pushCount;
  }



  public RepositoryMetadata lastPulledAt(OffsetDateTime lastPulledAt) {
    
    this.lastPulledAt = lastPulledAt;
    return this;
  }

   /**
   * Get lastPulledAt
   * @return lastPulledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastPulledAt() {
    return lastPulledAt;
  }


  public void setLastPulledAt(OffsetDateTime lastPulledAt) {
    this.lastPulledAt = lastPulledAt;
  }



  public RepositoryMetadata lastPushedAt(OffsetDateTime lastPushedAt) {
    
    this.lastPushedAt = lastPushedAt;
    return this;
  }

   /**
   * Get lastPushedAt
   * @return lastPushedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastPushedAt() {
    return lastPushedAt;
  }


  public void setLastPushedAt(OffsetDateTime lastPushedAt) {
    this.lastPushedAt = lastPushedAt;
  }



  public RepositoryMetadata lastSeverity(String lastSeverity) {
    
    this.lastSeverity = lastSeverity;
    return this;
  }

   /**
   * The maximum vulnerability severity of the artifact last pushed in the repository, if any
   * @return lastSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum vulnerability severity of the artifact last pushed in the repository, if any")

  public String getLastSeverity() {
    return lastSeverity;
  }


  public void setLastSeverity(String lastSeverity) {
    this.lastSeverity = lastSeverity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryMetadata repositoryMetadata = (RepositoryMetadata) o;
    return Objects.equals(this.createdDate, repositoryMetadata.createdDate) && Objects.equals(this.createdBy, repositoryMetadata.createdBy) && Objects.equals(this.createdByUserId, repositoryMetadata.createdByUserId) && Objects.equals(this.lastModifiedDate, repositoryMetadata.lastModifiedDate) && Objects.equals(this.lastModifiedBy, repositoryMetadata.lastModifiedBy) && Objects.equals(this.lastModifiedByUserId, repositoryMetadata.lastModifiedByUserId) && Objects.equals(this.resourceURN, repositoryMetadata.resourceURN) && Objects.equals(this.artifactCount, repositoryMetadata.artifactCount) && Objects.equals(this.pullCount, repositoryMetadata.pullCount) && Objects.equals(this.pushCount, repositoryMetadata.pushCount) && Objects.equals(this.lastPulledAt, repositoryMetadata.lastPulledAt) && Objects.equals(this.lastPushedAt, repositoryMetadata.lastPushedAt) && Objects.equals(this.lastSeverity, repositoryMetadata.lastSeverity);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryMetadata {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");

    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");

    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");

    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");

    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");

    sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");

    sb.append("    resourceURN: ").append(toIndentedString(resourceURN)).append("\n");

    sb.append("    artifactCount: ").append(toIndentedString(artifactCount)).append("\n");

    sb.append("    pullCount: ").append(toIndentedString(pullCount)).append("\n");

    sb.append("    pushCount: ").append(toIndentedString(pushCount)).append("\n");

    sb.append("    lastPulledAt: ").append(toIndentedString(lastPulledAt)).append("\n");

    sb.append("    lastPushedAt: ").append(toIndentedString(lastPushedAt)).append("\n");

    sb.append("    lastSeverity: ").append(toIndentedString(lastSeverity)).append("\n");
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

