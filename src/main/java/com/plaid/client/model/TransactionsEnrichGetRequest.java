/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.385.1
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
import com.plaid.client.model.ClientProvidedTransaction;
import com.plaid.client.model.TransactionsEnrichRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsEnrichGetRequest defines the request schema for &#x60;/transactions/enrich&#x60;.
 */
@ApiModel(description = "TransactionsEnrichGetRequest defines the request schema for `/transactions/enrich`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class TransactionsEnrichGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<ClientProvidedTransaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private TransactionsEnrichRequestOptions options;


  public TransactionsEnrichGetRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public TransactionsEnrichGetRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public TransactionsEnrichGetRequest accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The account type for the requested transactions (either &#x60;depository&#x60; or &#x60;credit&#x60;).
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "The account type for the requested transactions (either `depository` or `credit`).")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public TransactionsEnrichGetRequest transactions(List<ClientProvidedTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public TransactionsEnrichGetRequest addTransactionsItem(ClientProvidedTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * An array of transaction objects to be enriched by Plaid. Maximum of 100 transactions per request.
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "An array of transaction objects to be enriched by Plaid. Maximum of 100 transactions per request.")

  public List<ClientProvidedTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<ClientProvidedTransaction> transactions) {
    this.transactions = transactions;
  }


  public TransactionsEnrichGetRequest options(TransactionsEnrichRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionsEnrichRequestOptions getOptions() {
    return options;
  }


  public void setOptions(TransactionsEnrichRequestOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsEnrichGetRequest transactionsEnrichGetRequest = (TransactionsEnrichGetRequest) o;
    return Objects.equals(this.clientId, transactionsEnrichGetRequest.clientId) &&
        Objects.equals(this.secret, transactionsEnrichGetRequest.secret) &&
        Objects.equals(this.accountType, transactionsEnrichGetRequest.accountType) &&
        Objects.equals(this.transactions, transactionsEnrichGetRequest.transactions) &&
        Objects.equals(this.options, transactionsEnrichGetRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accountType, transactions, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsEnrichGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

