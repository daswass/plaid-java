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
 * The payment decision from the risk assessment.  &#x60;APPROVE&#x60;: approve the transaction without requiring further actions from your customers. For example, use this field if you are placing a standard hold for all the approved transactions before making funds available to your customers. You should also use this field if you decide to accelerate the fund availability for your customers.  &#x60;REVIEW&#x60;: the transaction requires manual review  &#x60;REJECT&#x60;: reject the transaction  &#x60;TAKE_OTHER_RISK_MEASURES&#x60;: for example, placing a longer hold on funds than those approved transactions or introducing customer frictions such as step-up verification/authentication  &#x60;NOT_EVALUATED&#x60;: if only logging the Signal results without using them  Possible values:  &#x60;APPROVE&#x60;, &#x60;REVIEW&#x60;, &#x60;REJECT&#x60;, &#x60;TAKE_OTHER_RISK_MEASURES&#x60;, &#x60;NOT_EVALUATED&#x60; 
 */
@JsonAdapter(SignalDecisionOutcome.Adapter.class)
public enum SignalDecisionOutcome {
  
  APPROVE("APPROVE"),
  
  REVIEW("REVIEW"),
  
  REJECT("REJECT"),
  
  TAKE_OTHER_RISK_MEASURES("TAKE_OTHER_RISK_MEASURES"),
  
  NOT_EVALUATED("NOT_EVALUATED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  SignalDecisionOutcome(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SignalDecisionOutcome fromValue(String value) {
    for (SignalDecisionOutcome b : SignalDecisionOutcome.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<SignalDecisionOutcome> {
    @Override
    public void write(final JsonWriter jsonWriter, final SignalDecisionOutcome enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SignalDecisionOutcome read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SignalDecisionOutcome.fromValue(value);
    }
  }
}

