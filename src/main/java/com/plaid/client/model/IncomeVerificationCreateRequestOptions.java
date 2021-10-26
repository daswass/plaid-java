/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.40.3
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
import java.util.ArrayList;
import java.util.List;

/**
 * IncomeVerificationCreateRequestOptions defines the optional arguments schema for &#x60;/income/verification/create&#x60;
 */
@ApiModel(description = "IncomeVerificationCreateRequestOptions defines the optional arguments schema for `/income/verification/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class IncomeVerificationCreateRequestOptions {
  public static final String SERIALIZED_NAME_ACCESS_TOKENS = "access_tokens";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKENS)
  private List<String> accessTokens = null;


  public IncomeVerificationCreateRequestOptions accessTokens(List<String> accessTokens) {
    
    this.accessTokens = accessTokens;
    return this;
  }

  public IncomeVerificationCreateRequestOptions addAccessTokensItem(String accessTokensItem) {
    if (this.accessTokens == null) {
      this.accessTokens = new ArrayList<>();
    }
    this.accessTokens.add(accessTokensItem);
    return this;
  }

   /**
   * An array of access tokens corresponding to the Items that will be cross-referenced with the product data. If the &#x60;transactions&#x60; product was not initialized for the Items during link, it will be initialized after this Link session.
   * @return accessTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of access tokens corresponding to the Items that will be cross-referenced with the product data. If the `transactions` product was not initialized for the Items during link, it will be initialized after this Link session.")

  public List<String> getAccessTokens() {
    return accessTokens;
  }


  public void setAccessTokens(List<String> accessTokens) {
    this.accessTokens = accessTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationCreateRequestOptions incomeVerificationCreateRequestOptions = (IncomeVerificationCreateRequestOptions) o;
    return Objects.equals(this.accessTokens, incomeVerificationCreateRequestOptions.accessTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationCreateRequestOptions {\n");
    sb.append("    accessTokens: ").append(toIndentedString(accessTokens)).append("\n");
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

