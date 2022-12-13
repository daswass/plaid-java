/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.205.3
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
 * Best guess frequency of transactions of the end customer.
 */
@JsonAdapter(TransactionFrequency.Adapter.class)
public enum TransactionFrequency {
  
  ONCE_PER_MONTH("once_per_month"),
  
  TWICE_PER_MONTH("twice_per_month"),
  
  FOUR_TIMES_PER_MONTH("four_times_per_month"),
  
  DAILY("daily"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransactionFrequency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionFrequency fromValue(String value) {
    for (TransactionFrequency b : TransactionFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransactionFrequency.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransactionFrequency> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionFrequency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionFrequency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionFrequency.fromValue(value);
    }
  }
}
