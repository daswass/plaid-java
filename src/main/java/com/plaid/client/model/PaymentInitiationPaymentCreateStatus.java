/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.121.0
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
 * For a payment returned by this endpoint, there is only one possible value:  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: The initial phase of the payment
 */
@JsonAdapter(PaymentInitiationPaymentCreateStatus.Adapter.class)
public enum PaymentInitiationPaymentCreateStatus {
  
  PAYMENT_STATUS_INPUT_NEEDED("PAYMENT_STATUS_INPUT_NEEDED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentInitiationPaymentCreateStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentInitiationPaymentCreateStatus fromValue(String value) {
    for (PaymentInitiationPaymentCreateStatus b : PaymentInitiationPaymentCreateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PaymentInitiationPaymentCreateStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PaymentInitiationPaymentCreateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentInitiationPaymentCreateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentInitiationPaymentCreateStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentInitiationPaymentCreateStatus.fromValue(value);
    }
  }
}

