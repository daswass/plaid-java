/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.WalletTransactionCounterpartyNumbers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing the e-wallet transaction&#39;s counterparty
 */
@ApiModel(description = "An object representing the e-wallet transaction's counterparty")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-01T18:55:04.982Z[GMT]")
public class WalletTransactionCounterparty {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBERS = "numbers";
  @SerializedName(SERIALIZED_NAME_NUMBERS)
  private WalletTransactionCounterpartyNumbers numbers;


  public WalletTransactionCounterparty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the counterparty
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the counterparty")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WalletTransactionCounterparty numbers(WalletTransactionCounterpartyNumbers numbers) {
    
    this.numbers = numbers;
    return this;
  }

   /**
   * Get numbers
   * @return numbers
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionCounterpartyNumbers getNumbers() {
    return numbers;
  }


  public void setNumbers(WalletTransactionCounterpartyNumbers numbers) {
    this.numbers = numbers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionCounterparty walletTransactionCounterparty = (WalletTransactionCounterparty) o;
    return Objects.equals(this.name, walletTransactionCounterparty.name) &&
        Objects.equals(this.numbers, walletTransactionCounterparty.numbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, numbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionCounterparty {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

