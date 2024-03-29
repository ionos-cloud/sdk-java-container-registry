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
import com.ionoscloud.containerregistry.model.ArtifactRead;
import com.ionoscloud.containerregistry.model.Links;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RegistryArtifactsReadList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-15T14:36:52.394811Z[Etc/UTC]")

public class RegistryArtifactsReadList {
  
  /**
   * Gets or Sets id
   */
  @JsonAdapter(IdEnum.Adapter.class)
  public enum IdEnum {
    ARTIFACTS("artifacts");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdEnum fromValue(String value) {

      for (IdEnum b : IdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private IdEnum id;


  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COLLECTION("collection");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {

      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ArtifactRead> items = null;


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;


  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Links links;

  

  public RegistryArtifactsReadList id(IdEnum id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public IdEnum getId() {
    return id;
  }


  public void setId(IdEnum id) {
    this.id = id;
  }



  public RegistryArtifactsReadList type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  public RegistryArtifactsReadList href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "https://api.ionos.com/containerregistries/registries/artifacts", required = true, value = "")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }



  public RegistryArtifactsReadList items(List<ArtifactRead> items) {
    
    this.items = items;
    return this;
  }

  public RegistryArtifactsReadList addItemsItem(ArtifactRead itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ArtifactRead>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ArtifactRead> getItems() {
    return items;
  }


  public void setItems(List<ArtifactRead> items) {
    this.items = items;
  }



   /**
   * The offset specified in the request (if none was specified, the default offset is 0) (not implemented yet). 
   * minimum: 0
   * @return offset
  **/
  @ApiModelProperty(example = "0", required = true, value = "The offset specified in the request (if none was specified, the default offset is 0) (not implemented yet). ")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }



   /**
   * The limit specified in the request (if none was specified, use the endpoint&#39;s default pagination limit) (not implemented yet, always return number of items). 
   * minimum: 0
   * @return limit
  **/
  @ApiModelProperty(example = "42", required = true, value = "The limit specified in the request (if none was specified, use the endpoint's default pagination limit) (not implemented yet, always return number of items). ")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }



  public RegistryArtifactsReadList links(Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")

  public Links getLinks() {
    return links;
  }


  public void setLinks(Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryArtifactsReadList registryArtifactsReadList = (RegistryArtifactsReadList) o;
    return Objects.equals(this.id, registryArtifactsReadList.id) && Objects.equals(this.type, registryArtifactsReadList.type) && Objects.equals(this.href, registryArtifactsReadList.href) && Objects.equals(this.items, registryArtifactsReadList.items) && Objects.equals(this.offset, registryArtifactsReadList.offset) && Objects.equals(this.limit, registryArtifactsReadList.limit) && Objects.equals(this.links, registryArtifactsReadList.links);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryArtifactsReadList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    href: ").append(toIndentedString(href)).append("\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");

    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");

    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");

    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

