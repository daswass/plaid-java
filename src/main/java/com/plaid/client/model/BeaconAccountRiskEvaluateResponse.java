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
import com.plaid.client.model.BeaconAccountRiskEvaluateAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BeaconAccountRiskEvaluateResponse defines the response schema for &#x60;/beacon/account_risk/v1/evaluate&#x60;
 */
@ApiModel(description = "BeaconAccountRiskEvaluateResponse defines the response schema for `/beacon/account_risk/v1/evaluate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T18:48:06.627309Z[Etc/UTC]")
public class BeaconAccountRiskEvaluateResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<BeaconAccountRiskEvaluateAccount> accounts = new ArrayList<>();


  public BeaconAccountRiskEvaluateResponse requestId(String requestId) {
    
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


  public BeaconAccountRiskEvaluateResponse accounts(List<BeaconAccountRiskEvaluateAccount> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public BeaconAccountRiskEvaluateResponse addAccountsItem(BeaconAccountRiskEvaluateAccount accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * The accounts for which a risk evaluation has been requested.
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "The accounts for which a risk evaluation has been requested.")

  public List<BeaconAccountRiskEvaluateAccount> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<BeaconAccountRiskEvaluateAccount> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconAccountRiskEvaluateResponse beaconAccountRiskEvaluateResponse = (BeaconAccountRiskEvaluateResponse) o;
    return Objects.equals(this.requestId, beaconAccountRiskEvaluateResponse.requestId) &&
        Objects.equals(this.accounts, beaconAccountRiskEvaluateResponse.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconAccountRiskEvaluateResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

