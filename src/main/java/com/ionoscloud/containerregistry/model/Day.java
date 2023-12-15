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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Day
 */
@JsonAdapter(Day.Adapter.class)
public enum Day {
  
  MONDAY("Monday"),
  
  TUESDAY("Tuesday"),
  
  WEDNESDAY("Wednesday"),
  
  THURSDAY("Thursday"),
  
  FRIDAY("Friday"),
  
  SATURDAY("Saturday"),
  
  SUNDAY("Sunday");

  private String value;

  Day(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Day fromValue(String value) {
    for (Day b : Day.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Day> {
    @Override
    public void write(final JsonWriter jsonWriter, final Day enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Day read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Day.fromValue(value);
    }
  }
}

