/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.39.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BankTransferBalance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-15T19:47:39.714Z[GMT]")
public class BankTransferBalance {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private String available;

  public static final String SERIALIZED_NAME_TRANSACTABLE = "transactable";
  @SerializedName(SERIALIZED_NAME_TRANSACTABLE)
  private String transactable;


  public BankTransferBalance available(String available) {
    
    this.available = available;
    return this;
  }

   /**
   * The total available balance - the sum of all successful debit transfer amounts minus all credit transfer amounts.
   * @return available
  **/
  @ApiModelProperty(required = true, value = "The total available balance - the sum of all successful debit transfer amounts minus all credit transfer amounts.")

  public String getAvailable() {
    return available;
  }


  public void setAvailable(String available) {
    this.available = available;
  }


  public BankTransferBalance transactable(String transactable) {
    
    this.transactable = transactable;
    return this;
  }

   /**
   * The transactable balance shows the amount in your account that you are able to use for transfers, and is essentially your available balance minus your minimum balance.
   * @return transactable
  **/
  @ApiModelProperty(required = true, value = "The transactable balance shows the amount in your account that you are able to use for transfers, and is essentially your available balance minus your minimum balance.")

  public String getTransactable() {
    return transactable;
  }


  public void setTransactable(String transactable) {
    this.transactable = transactable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferBalance bankTransferBalance = (BankTransferBalance) o;
    return Objects.equals(this.available, bankTransferBalance.available) &&
        Objects.equals(this.transactable, bankTransferBalance.transactable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, transactable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferBalance {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    transactable: ").append(toIndentedString(transactable)).append("\n");
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
