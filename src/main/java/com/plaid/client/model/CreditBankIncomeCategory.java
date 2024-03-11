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
 * The income category. Note that the &#x60;CASH&#x60; value has been deprecated and is used only for existing legacy implementations. It has been replaced by the new categories &#x60;CASH_DEPOSIT&#x60; (representing cash or check deposits) and &#x60;TRANSFER_FROM_APPLICATION&#x60; (representing cash transfers originating from apps, such as Zelle or Venmo).
 */
@JsonAdapter(CreditBankIncomeCategory.Adapter.class)
public enum CreditBankIncomeCategory {
  
  SALARY("SALARY"),
  
  UNEMPLOYMENT("UNEMPLOYMENT"),
  
  CASH("CASH"),
  
  GIG_ECONOMY("GIG_ECONOMY"),
  
  RENTAL("RENTAL"),
  
  CHILD_SUPPORT("CHILD_SUPPORT"),
  
  MILITARY("MILITARY"),
  
  RETIREMENT("RETIREMENT"),
  
  LONG_TERM_DISABILITY("LONG_TERM_DISABILITY"),
  
  BANK_INTEREST("BANK_INTEREST"),
  
  CASH_DEPOSIT("CASH_DEPOSIT"),
  
  TRANSFER_FROM_APPLICATION("TRANSFER_FROM_APPLICATION"),
  
  TAX_REFUND("TAX_REFUND"),
  
  BENEFIT_OTHER("BENEFIT_OTHER"),
  
  OTHER("OTHER"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CreditBankIncomeCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreditBankIncomeCategory fromValue(String value) {
    for (CreditBankIncomeCategory b : CreditBankIncomeCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return CreditBankIncomeCategory.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<CreditBankIncomeCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreditBankIncomeCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreditBankIncomeCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreditBankIncomeCategory.fromValue(value);
    }
  }
}

