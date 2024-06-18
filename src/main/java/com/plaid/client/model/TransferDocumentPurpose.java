/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.525.1
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
 * Specifies the purpose of the uploaded file.  &#x60;\&quot;DUE_DILIGENCE\&quot;&#x60; - The transfer due diligence document of the originator.
 */
@JsonAdapter(TransferDocumentPurpose.Adapter.class)
public enum TransferDocumentPurpose {
  
  DUE_DILIGENCE("DUE_DILIGENCE"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferDocumentPurpose(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferDocumentPurpose fromValue(String value) {
    for (TransferDocumentPurpose b : TransferDocumentPurpose.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferDocumentPurpose.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferDocumentPurpose> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferDocumentPurpose enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferDocumentPurpose read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferDocumentPurpose.fromValue(value);
    }
  }
}

