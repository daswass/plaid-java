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
 * Commonly used term to describe the line item.
 */
@JsonAdapter(TotalCanonicalDescription.Adapter.class)
public enum TotalCanonicalDescription {
  
  BONUS("BONUS"),
  
  COMMISSION("COMMISSION"),
  
  OVERTIME("OVERTIME"),
  
  PAID_TIME_OFF("PAID TIME OFF"),
  
  REGULAR_PAY("REGULAR PAY"),
  
  VACATION("VACATION"),
  
  EMPLOYEE_MEDICARE("EMPLOYEE MEDICARE"),
  
  FICA("FICA"),
  
  SOCIAL_SECURITY_EMPLOYEE_TAX("SOCIAL SECURITY EMPLOYEE TAX"),
  
  MEDICAL("MEDICAL"),
  
  VISION("VISION"),
  
  DENTAL("DENTAL"),
  
  NET_PAY("NET PAY"),
  
  TAXES("TAXES"),
  
  NOT_FOUND("NOT_FOUND"),
  
  OTHER("OTHER"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TotalCanonicalDescription(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TotalCanonicalDescription fromValue(String value) {
    for (TotalCanonicalDescription b : TotalCanonicalDescription.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<TotalCanonicalDescription> {
    @Override
    public void write(final JsonWriter jsonWriter, final TotalCanonicalDescription enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TotalCanonicalDescription read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TotalCanonicalDescription.fromValue(value);
    }
  }
}

