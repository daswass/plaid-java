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
 * The status of this Identity Verification attempt.   &#x60;active&#x60; - The Identity Verification attempt is incomplete. The user may have completed part of the session, but has neither failed or passed.  &#x60;success&#x60; - The Identity Verification attempt has completed, passing all steps defined to the associated Identity Verification template  &#x60;failed&#x60; - The user failed one or more steps in the session and was told to contact support.  &#x60;expired&#x60; - The Identity Verification attempt was active for a long period of time without being completed and was automatically marked as expired. Note that sessions currently do not expire. Automatic expiration is expected to be enabled in the future.  &#x60;canceled&#x60; - The Identity Verification attempt was canceled, either via the dashboard by a user, or via API. The user may have completed part of the session, but has neither failed or passed.  &#x60;pending_review&#x60; - The Identity Verification attempt template was configured to perform a screening that had one or more hits needing review.
 */
@JsonAdapter(IdentityVerificationStatus.Adapter.class)
public enum IdentityVerificationStatus {
  
  ACTIVE("active"),
  
  SUCCESS("success"),
  
  FAILED("failed"),
  
  EXPIRED("expired"),
  
  CANCELED("canceled"),
  
  PENDING_REVIEW("pending_review"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  IdentityVerificationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdentityVerificationStatus fromValue(String value) {
    for (IdentityVerificationStatus b : IdentityVerificationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return IdentityVerificationStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<IdentityVerificationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final IdentityVerificationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IdentityVerificationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IdentityVerificationStatus.fromValue(value);
    }
  }
}

