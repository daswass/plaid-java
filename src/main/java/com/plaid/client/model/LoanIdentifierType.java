/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
 * A value from a MISMO prescribed list that specifies the type of loan identifier.
 */
@JsonAdapter(LoanIdentifierType.Adapter.class)
public enum LoanIdentifierType {
  
  LENDERLOAN("LenderLoan"),
  
  UNIVERSALLOAN("UniversalLoan"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  LoanIdentifierType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LoanIdentifierType fromValue(String value) {
    for (LoanIdentifierType b : LoanIdentifierType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<LoanIdentifierType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LoanIdentifierType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LoanIdentifierType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LoanIdentifierType.fromValue(value);
    }
  }
}
