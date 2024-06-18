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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.AccountIdentityMatchScore;
import com.plaid.client.model.Item;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IdentityMatchResponse defines the response schema for &#x60;/identity/match&#x60;
 */
@ApiModel(description = "IdentityMatchResponse defines the response schema for `/identity/match`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class IdentityMatchResponse {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountIdentityMatchScore> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private Item item;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public IdentityMatchResponse accounts(List<AccountIdentityMatchScore> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public IdentityMatchResponse addAccountsItem(AccountIdentityMatchScore accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * The accounts for which Identity match has been requested
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "The accounts for which Identity match has been requested")

  public List<AccountIdentityMatchScore> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountIdentityMatchScore> accounts) {
    this.accounts = accounts;
  }


  public IdentityMatchResponse item(Item item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(required = true, value = "")

  public Item getItem() {
    return item;
  }


  public void setItem(Item item) {
    this.item = item;
  }


  public IdentityMatchResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityMatchResponse identityMatchResponse = (IdentityMatchResponse) o;
    return Objects.equals(this.accounts, identityMatchResponse.accounts) &&
        Objects.equals(this.item, identityMatchResponse.item) &&
        Objects.equals(this.requestId, identityMatchResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, item, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityMatchResponse {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

