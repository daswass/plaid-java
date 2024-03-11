/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.499.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Types of document formats. (Suggested values)
 */
@JsonAdapter(FDXContentTypes.Adapter.class)
public enum FDXContentTypes {
  
  APPLICATION_PDF("application/pdf"),
  
  IMAGE_GIF("image/gif"),
  
  IMAGE_JPEG("image/jpeg"),
  
  IMAGE_TIFF("image/tiff"),
  
  IMAGE_PNG("image/png"),
  
  APPLICATION_JSON("application/json"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  FDXContentTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FDXContentTypes fromValue(String value) {
    for (FDXContentTypes b : FDXContentTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return FDXContentTypes.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<FDXContentTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final FDXContentTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FDXContentTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FDXContentTypes.fromValue(value);
    }
  }
}

