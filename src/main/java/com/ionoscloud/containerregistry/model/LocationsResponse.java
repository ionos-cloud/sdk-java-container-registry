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
import com.ionoscloud.containerregistry.model.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LocationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-21T15:19:22.180Z[Etc/UTC]")

public class LocationsResponse {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Location> items = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public LocationsResponse href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public LocationsResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LocationsResponse items(List<Location> items) {
    
    this.items = items;
    return this;
  }

  public LocationsResponse addItemsItem(Location itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Location>();
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

  public List<Location> getItems() {
    return items;
  }


  public void setItems(List<Location> items) {
    this.items = items;
  }


  public LocationsResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationsResponse locationsResponse = (LocationsResponse) o;
    return Objects.equals(this.href, locationsResponse.href) && Objects.equals(this.id, locationsResponse.id) && Objects.equals(this.items, locationsResponse.items) && Objects.equals(this.type, locationsResponse.type);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationsResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
