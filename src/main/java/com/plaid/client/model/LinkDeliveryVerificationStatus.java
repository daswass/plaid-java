/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.0
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
 * Indicates an Item&#39;s micro-deposit-based verification status.
 */
@JsonAdapter(LinkDeliveryVerificationStatus.Adapter.class)
public enum LinkDeliveryVerificationStatus {
  
  AUTOMATICALLY_VERIFIED("automatically_verified"),
  
  PENDING_AUTOMATIC_VERIFICATION("pending_automatic_verification"),
  
  PENDING_MANUAL_VERIFICATION("pending_manual_verification"),
  
  MANUALLY_VERIFIED("manually_verified"),
  
  VERIFICATION_EXPIRED("verification_expired"),
  
  VERIFICATION_FAILED("verification_failed"),
  
  DATABASE_MATCHED("database_matched"),
  
  DATABASE_INSIGHTS_PASS("database_insights_pass"),
  
  DATABASE_INSIGHTS_PASS_WITH_CAUTION("database_insights_pass_with_caution"),
  
  DATABASE_INSIGHTS_FAIL("database_insights_fail"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  LinkDeliveryVerificationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LinkDeliveryVerificationStatus fromValue(String value) {
    for (LinkDeliveryVerificationStatus b : LinkDeliveryVerificationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return LinkDeliveryVerificationStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<LinkDeliveryVerificationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LinkDeliveryVerificationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LinkDeliveryVerificationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LinkDeliveryVerificationStatus.fromValue(value);
    }
  }
}

