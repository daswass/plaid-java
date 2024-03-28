/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
 * The attributes object contains data that can be used to assess account risk. Examples of data include: &#x60;days_since_first_plaid_connection&#x60;: The number of days since the first time the Item was connected to an application via Plaid &#x60;plaid_connections_count_7d&#x60;: The number of times the Item has been connected to applications via Plaid over the past 7 days &#x60;plaid_connections_count_30d&#x60;: The number of times the Item has been connected to applications via Plaid over the past 30 days &#x60;total_plaid_connections_count&#x60;: The number of times the Item has been connected to applications via Plaid For the full list and detailed documentation of core attributes available, or to request that core attributes not be returned, contact Sales or your Plaid account manager
 */
@ApiModel(description = "The attributes object contains data that can be used to assess account risk. Examples of data include: `days_since_first_plaid_connection`: The number of days since the first time the Item was connected to an application via Plaid `plaid_connections_count_7d`: The number of times the Item has been connected to applications via Plaid over the past 7 days `plaid_connections_count_30d`: The number of times the Item has been connected to applications via Plaid over the past 30 days `total_plaid_connections_count`: The number of times the Item has been connected to applications via Plaid For the full list and detailed documentation of core attributes available, or to request that core attributes not be returned, contact Sales or your Plaid account manager")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class BeaconAccountRiskEvaluateAccountAttributes {
  public static final String SERIALIZED_NAME_DAYS_SINCE_FIRST_PLAID_CONNECTION = "days_since_first_plaid_connection";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_FIRST_PLAID_CONNECTION)
  private Integer daysSinceFirstPlaidConnection;

  public static final String SERIALIZED_NAME_DAYS_SINCE_ACCOUNT_CREATION = "days_since_account_creation";
  @SerializedName(SERIALIZED_NAME_DAYS_SINCE_ACCOUNT_CREATION)
  private Integer daysSinceAccountCreation;

  public static final String SERIALIZED_NAME_IS_ACCOUNT_CLOSED = "is_account_closed";
  @SerializedName(SERIALIZED_NAME_IS_ACCOUNT_CLOSED)
  private Boolean isAccountClosed;

  public static final String SERIALIZED_NAME_IS_ACCOUNT_FROZEN_OR_RESTRICTED = "is_account_frozen_or_restricted";
  @SerializedName(SERIALIZED_NAME_IS_ACCOUNT_FROZEN_OR_RESTRICTED)
  private Boolean isAccountFrozenOrRestricted;

  public static final String SERIALIZED_NAME_TOTAL_PLAID_CONNECTIONS_COUNT = "total_plaid_connections_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLAID_CONNECTIONS_COUNT)
  private Integer totalPlaidConnectionsCount;

  public static final String SERIALIZED_NAME_PLAID_CONNECTIONS_COUNT7D = "plaid_connections_count_7d";
  @SerializedName(SERIALIZED_NAME_PLAID_CONNECTIONS_COUNT7D)
  private Integer plaidConnectionsCount7d;

  public static final String SERIALIZED_NAME_PLAID_CONNECTIONS_COUNT30D = "plaid_connections_count_30d";
  @SerializedName(SERIALIZED_NAME_PLAID_CONNECTIONS_COUNT30D)
  private Integer plaidConnectionsCount30d;

  public static final String SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT3D = "failed_plaid_non_oauth_authentication_attempts_count_3d";
  @SerializedName(SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT3D)
  private Integer failedPlaidNonOauthAuthenticationAttemptsCount3d;

  public static final String SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT3D = "plaid_non_oauth_authentication_attempts_count_3d";
  @SerializedName(SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT3D)
  private Integer plaidNonOauthAuthenticationAttemptsCount3d;

  public static final String SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT7D = "failed_plaid_non_oauth_authentication_attempts_count_7d";
  @SerializedName(SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT7D)
  private Integer failedPlaidNonOauthAuthenticationAttemptsCount7d;

  public static final String SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT7D = "plaid_non_oauth_authentication_attempts_count_7d";
  @SerializedName(SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT7D)
  private Integer plaidNonOauthAuthenticationAttemptsCount7d;

  public static final String SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT30D = "failed_plaid_non_oauth_authentication_attempts_count_30d";
  @SerializedName(SERIALIZED_NAME_FAILED_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT30D)
  private Integer failedPlaidNonOauthAuthenticationAttemptsCount30d;

  public static final String SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT30D = "plaid_non_oauth_authentication_attempts_count_30d";
  @SerializedName(SERIALIZED_NAME_PLAID_NON_OAUTH_AUTHENTICATION_ATTEMPTS_COUNT30D)
  private Integer plaidNonOauthAuthenticationAttemptsCount30d;

  public static final String SERIALIZED_NAME_DISTINCT_IP_ADDRESSES_COUNT3D = "distinct_ip_addresses_count_3d";
  @SerializedName(SERIALIZED_NAME_DISTINCT_IP_ADDRESSES_COUNT3D)
  private Integer distinctIpAddressesCount3d;

  public static final String SERIALIZED_NAME_DISTINCT_IP_ADDRESSES_COUNT7D = "distinct_ip_addresses_count_7d";
  @SerializedName(SERIALIZED_NAME_DISTINCT_IP_ADDRESSES_COUNT7D)
  private Integer distinctIpAddressesCount7d;

  public static final String SERIALIZED_NAME_DISTINCT_IP_ADDRESSES_COUNT30D = "distinct_ip_addresses_count_30d";
  @SerializedName(SERIALIZED_NAME_DISTINCT_IP_ADDRESSES_COUNT30D)
  private Integer distinctIpAddressesCount30d;

  public static final String SERIALIZED_NAME_DISTINCT_IP_ADDRESSES_COUNT90D = "distinct_ip_addresses_count_90d";
  @SerializedName(SERIALIZED_NAME_DISTINCT_IP_ADDRESSES_COUNT90D)
  private Integer distinctIpAddressesCount90d;

  public static final String SERIALIZED_NAME_DISTINCT_USER_AGENTS_COUNT3D = "distinct_user_agents_count_3d";
  @SerializedName(SERIALIZED_NAME_DISTINCT_USER_AGENTS_COUNT3D)
  private Integer distinctUserAgentsCount3d;

  public static final String SERIALIZED_NAME_DISTINCT_USER_AGENTS_COUNT7D = "distinct_user_agents_count_7d";
  @SerializedName(SERIALIZED_NAME_DISTINCT_USER_AGENTS_COUNT7D)
  private Integer distinctUserAgentsCount7d;

  public static final String SERIALIZED_NAME_DISTINCT_USER_AGENTS_COUNT30D = "distinct_user_agents_count_30d";
  @SerializedName(SERIALIZED_NAME_DISTINCT_USER_AGENTS_COUNT30D)
  private Integer distinctUserAgentsCount30d;

  public static final String SERIALIZED_NAME_DISTINCT_USER_AGENTS_COUNT90D = "distinct_user_agents_count_90d";
  @SerializedName(SERIALIZED_NAME_DISTINCT_USER_AGENTS_COUNT90D)
  private Integer distinctUserAgentsCount90d;

  public static final String SERIALIZED_NAME_ADDRESS_CHANGE_COUNT28D = "address_change_count_28d";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CHANGE_COUNT28D)
  private Integer addressChangeCount28d;

  public static final String SERIALIZED_NAME_EMAIL_CHANGE_COUNT28D = "email_change_count_28d";
  @SerializedName(SERIALIZED_NAME_EMAIL_CHANGE_COUNT28D)
  private Integer emailChangeCount28d;

  public static final String SERIALIZED_NAME_PHONE_CHANGE_COUNT28D = "phone_change_count_28d";
  @SerializedName(SERIALIZED_NAME_PHONE_CHANGE_COUNT28D)
  private Integer phoneChangeCount28d;

  public static final String SERIALIZED_NAME_ADDRESS_CHANGE_COUNT90D = "address_change_count_90d";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CHANGE_COUNT90D)
  private Integer addressChangeCount90d;

  public static final String SERIALIZED_NAME_EMAIL_CHANGE_COUNT90D = "email_change_count_90d";
  @SerializedName(SERIALIZED_NAME_EMAIL_CHANGE_COUNT90D)
  private Integer emailChangeCount90d;

  public static final String SERIALIZED_NAME_PHONE_CHANGE_COUNT90D = "phone_change_count_90d";
  @SerializedName(SERIALIZED_NAME_PHONE_CHANGE_COUNT90D)
  private Integer phoneChangeCount90d;


  public BeaconAccountRiskEvaluateAccountAttributes daysSinceFirstPlaidConnection(Integer daysSinceFirstPlaidConnection) {
    
    this.daysSinceFirstPlaidConnection = daysSinceFirstPlaidConnection;
    return this;
  }

   /**
   * The number of days since the first time the Item was connected to an application via Plaid
   * @return daysSinceFirstPlaidConnection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days since the first time the Item was connected to an application via Plaid")

  public Integer getDaysSinceFirstPlaidConnection() {
    return daysSinceFirstPlaidConnection;
  }


  public void setDaysSinceFirstPlaidConnection(Integer daysSinceFirstPlaidConnection) {
    this.daysSinceFirstPlaidConnection = daysSinceFirstPlaidConnection;
  }


  public BeaconAccountRiskEvaluateAccountAttributes daysSinceAccountCreation(Integer daysSinceAccountCreation) {
    
    this.daysSinceAccountCreation = daysSinceAccountCreation;
    return this;
  }

   /**
   * The age of the account as reported by the FI, when available.
   * @return daysSinceAccountCreation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The age of the account as reported by the FI, when available.")

  public Integer getDaysSinceAccountCreation() {
    return daysSinceAccountCreation;
  }


  public void setDaysSinceAccountCreation(Integer daysSinceAccountCreation) {
    this.daysSinceAccountCreation = daysSinceAccountCreation;
  }


  public BeaconAccountRiskEvaluateAccountAttributes isAccountClosed(Boolean isAccountClosed) {
    
    this.isAccountClosed = isAccountClosed;
    return this;
  }

   /**
   * Indicates if the account has been closed by the financial institution or the consumer, or is at risk of being closed
   * @return isAccountClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the account has been closed by the financial institution or the consumer, or is at risk of being closed")

  public Boolean getIsAccountClosed() {
    return isAccountClosed;
  }


  public void setIsAccountClosed(Boolean isAccountClosed) {
    this.isAccountClosed = isAccountClosed;
  }


  public BeaconAccountRiskEvaluateAccountAttributes isAccountFrozenOrRestricted(Boolean isAccountFrozenOrRestricted) {
    
    this.isAccountFrozenOrRestricted = isAccountFrozenOrRestricted;
    return this;
  }

   /**
   * Indicates whether the account has withdrawals and transfers disabled or if access to the account is restricted. This could be due to a freeze by the credit issuer, legal restrictions (e.g., sanctions), or regulatory requirements limiting monthly withdrawals, among other reasons
   * @return isAccountFrozenOrRestricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the account has withdrawals and transfers disabled or if access to the account is restricted. This could be due to a freeze by the credit issuer, legal restrictions (e.g., sanctions), or regulatory requirements limiting monthly withdrawals, among other reasons")

  public Boolean getIsAccountFrozenOrRestricted() {
    return isAccountFrozenOrRestricted;
  }


  public void setIsAccountFrozenOrRestricted(Boolean isAccountFrozenOrRestricted) {
    this.isAccountFrozenOrRestricted = isAccountFrozenOrRestricted;
  }


  public BeaconAccountRiskEvaluateAccountAttributes totalPlaidConnectionsCount(Integer totalPlaidConnectionsCount) {
    
    this.totalPlaidConnectionsCount = totalPlaidConnectionsCount;
    return this;
  }

   /**
   * The total number of times the item has been connected to applications via Plaid
   * @return totalPlaidConnectionsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of times the item has been connected to applications via Plaid")

  public Integer getTotalPlaidConnectionsCount() {
    return totalPlaidConnectionsCount;
  }


  public void setTotalPlaidConnectionsCount(Integer totalPlaidConnectionsCount) {
    this.totalPlaidConnectionsCount = totalPlaidConnectionsCount;
  }


  public BeaconAccountRiskEvaluateAccountAttributes plaidConnectionsCount7d(Integer plaidConnectionsCount7d) {
    
    this.plaidConnectionsCount7d = plaidConnectionsCount7d;
    return this;
  }

   /**
   * The number of times the Item has been connected to applications via Plaid over the past 7 days
   * @return plaidConnectionsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times the Item has been connected to applications via Plaid over the past 7 days")

  public Integer getPlaidConnectionsCount7d() {
    return plaidConnectionsCount7d;
  }


  public void setPlaidConnectionsCount7d(Integer plaidConnectionsCount7d) {
    this.plaidConnectionsCount7d = plaidConnectionsCount7d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes plaidConnectionsCount30d(Integer plaidConnectionsCount30d) {
    
    this.plaidConnectionsCount30d = plaidConnectionsCount30d;
    return this;
  }

   /**
   * The number of times the Item has been connected to applications via Plaid over the past 30 days
   * @return plaidConnectionsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times the Item has been connected to applications via Plaid over the past 30 days")

  public Integer getPlaidConnectionsCount30d() {
    return plaidConnectionsCount30d;
  }


  public void setPlaidConnectionsCount30d(Integer plaidConnectionsCount30d) {
    this.plaidConnectionsCount30d = plaidConnectionsCount30d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes failedPlaidNonOauthAuthenticationAttemptsCount3d(Integer failedPlaidNonOauthAuthenticationAttemptsCount3d) {
    
    this.failedPlaidNonOauthAuthenticationAttemptsCount3d = failedPlaidNonOauthAuthenticationAttemptsCount3d;
    return this;
  }

   /**
   * The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 3 days
   * @return failedPlaidNonOauthAuthenticationAttemptsCount3d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 3 days")

  public Integer getFailedPlaidNonOauthAuthenticationAttemptsCount3d() {
    return failedPlaidNonOauthAuthenticationAttemptsCount3d;
  }


  public void setFailedPlaidNonOauthAuthenticationAttemptsCount3d(Integer failedPlaidNonOauthAuthenticationAttemptsCount3d) {
    this.failedPlaidNonOauthAuthenticationAttemptsCount3d = failedPlaidNonOauthAuthenticationAttemptsCount3d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes plaidNonOauthAuthenticationAttemptsCount3d(Integer plaidNonOauthAuthenticationAttemptsCount3d) {
    
    this.plaidNonOauthAuthenticationAttemptsCount3d = plaidNonOauthAuthenticationAttemptsCount3d;
    return this;
  }

   /**
   * The number of non-OAuth authentication attempts via Plaid for this bank account over the past 3 days
   * @return plaidNonOauthAuthenticationAttemptsCount3d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of non-OAuth authentication attempts via Plaid for this bank account over the past 3 days")

  public Integer getPlaidNonOauthAuthenticationAttemptsCount3d() {
    return plaidNonOauthAuthenticationAttemptsCount3d;
  }


  public void setPlaidNonOauthAuthenticationAttemptsCount3d(Integer plaidNonOauthAuthenticationAttemptsCount3d) {
    this.plaidNonOauthAuthenticationAttemptsCount3d = plaidNonOauthAuthenticationAttemptsCount3d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes failedPlaidNonOauthAuthenticationAttemptsCount7d(Integer failedPlaidNonOauthAuthenticationAttemptsCount7d) {
    
    this.failedPlaidNonOauthAuthenticationAttemptsCount7d = failedPlaidNonOauthAuthenticationAttemptsCount7d;
    return this;
  }

   /**
   * The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 7 days
   * @return failedPlaidNonOauthAuthenticationAttemptsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 7 days")

  public Integer getFailedPlaidNonOauthAuthenticationAttemptsCount7d() {
    return failedPlaidNonOauthAuthenticationAttemptsCount7d;
  }


  public void setFailedPlaidNonOauthAuthenticationAttemptsCount7d(Integer failedPlaidNonOauthAuthenticationAttemptsCount7d) {
    this.failedPlaidNonOauthAuthenticationAttemptsCount7d = failedPlaidNonOauthAuthenticationAttemptsCount7d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes plaidNonOauthAuthenticationAttemptsCount7d(Integer plaidNonOauthAuthenticationAttemptsCount7d) {
    
    this.plaidNonOauthAuthenticationAttemptsCount7d = plaidNonOauthAuthenticationAttemptsCount7d;
    return this;
  }

   /**
   * The number of non-OAuth authentication attempts via Plaid for this bank account over the past 7 days
   * @return plaidNonOauthAuthenticationAttemptsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of non-OAuth authentication attempts via Plaid for this bank account over the past 7 days")

  public Integer getPlaidNonOauthAuthenticationAttemptsCount7d() {
    return plaidNonOauthAuthenticationAttemptsCount7d;
  }


  public void setPlaidNonOauthAuthenticationAttemptsCount7d(Integer plaidNonOauthAuthenticationAttemptsCount7d) {
    this.plaidNonOauthAuthenticationAttemptsCount7d = plaidNonOauthAuthenticationAttemptsCount7d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes failedPlaidNonOauthAuthenticationAttemptsCount30d(Integer failedPlaidNonOauthAuthenticationAttemptsCount30d) {
    
    this.failedPlaidNonOauthAuthenticationAttemptsCount30d = failedPlaidNonOauthAuthenticationAttemptsCount30d;
    return this;
  }

   /**
   * The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 30 days
   * @return failedPlaidNonOauthAuthenticationAttemptsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of failed non-OAuth authentication attempts via Plaid for this bank account over the past 30 days")

  public Integer getFailedPlaidNonOauthAuthenticationAttemptsCount30d() {
    return failedPlaidNonOauthAuthenticationAttemptsCount30d;
  }


  public void setFailedPlaidNonOauthAuthenticationAttemptsCount30d(Integer failedPlaidNonOauthAuthenticationAttemptsCount30d) {
    this.failedPlaidNonOauthAuthenticationAttemptsCount30d = failedPlaidNonOauthAuthenticationAttemptsCount30d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes plaidNonOauthAuthenticationAttemptsCount30d(Integer plaidNonOauthAuthenticationAttemptsCount30d) {
    
    this.plaidNonOauthAuthenticationAttemptsCount30d = plaidNonOauthAuthenticationAttemptsCount30d;
    return this;
  }

   /**
   * The number of non-OAuth authentication attempts via Plaid for this bank account over the past 30 days
   * @return plaidNonOauthAuthenticationAttemptsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of non-OAuth authentication attempts via Plaid for this bank account over the past 30 days")

  public Integer getPlaidNonOauthAuthenticationAttemptsCount30d() {
    return plaidNonOauthAuthenticationAttemptsCount30d;
  }


  public void setPlaidNonOauthAuthenticationAttemptsCount30d(Integer plaidNonOauthAuthenticationAttemptsCount30d) {
    this.plaidNonOauthAuthenticationAttemptsCount30d = plaidNonOauthAuthenticationAttemptsCount30d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes distinctIpAddressesCount3d(Integer distinctIpAddressesCount3d) {
    
    this.distinctIpAddressesCount3d = distinctIpAddressesCount3d;
    return this;
  }

   /**
   * The number of distinct IP addresses linked to the same bank account during Plaid authentication in the last 3 days
   * @return distinctIpAddressesCount3d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of distinct IP addresses linked to the same bank account during Plaid authentication in the last 3 days")

  public Integer getDistinctIpAddressesCount3d() {
    return distinctIpAddressesCount3d;
  }


  public void setDistinctIpAddressesCount3d(Integer distinctIpAddressesCount3d) {
    this.distinctIpAddressesCount3d = distinctIpAddressesCount3d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes distinctIpAddressesCount7d(Integer distinctIpAddressesCount7d) {
    
    this.distinctIpAddressesCount7d = distinctIpAddressesCount7d;
    return this;
  }

   /**
   * The number of distinct IP addresses linked to the same bank account during Plaid authentication in the last 7 days
   * @return distinctIpAddressesCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of distinct IP addresses linked to the same bank account during Plaid authentication in the last 7 days")

  public Integer getDistinctIpAddressesCount7d() {
    return distinctIpAddressesCount7d;
  }


  public void setDistinctIpAddressesCount7d(Integer distinctIpAddressesCount7d) {
    this.distinctIpAddressesCount7d = distinctIpAddressesCount7d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes distinctIpAddressesCount30d(Integer distinctIpAddressesCount30d) {
    
    this.distinctIpAddressesCount30d = distinctIpAddressesCount30d;
    return this;
  }

   /**
   * The number of distinct IP addresses linked to the same bank account during Plaid authentication in the last 30 days
   * @return distinctIpAddressesCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of distinct IP addresses linked to the same bank account during Plaid authentication in the last 30 days")

  public Integer getDistinctIpAddressesCount30d() {
    return distinctIpAddressesCount30d;
  }


  public void setDistinctIpAddressesCount30d(Integer distinctIpAddressesCount30d) {
    this.distinctIpAddressesCount30d = distinctIpAddressesCount30d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes distinctIpAddressesCount90d(Integer distinctIpAddressesCount90d) {
    
    this.distinctIpAddressesCount90d = distinctIpAddressesCount90d;
    return this;
  }

   /**
   * The number of distinct IP addresses linked to the same bank account during Plaid authentication in the last 90 days
   * @return distinctIpAddressesCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of distinct IP addresses linked to the same bank account during Plaid authentication in the last 90 days")

  public Integer getDistinctIpAddressesCount90d() {
    return distinctIpAddressesCount90d;
  }


  public void setDistinctIpAddressesCount90d(Integer distinctIpAddressesCount90d) {
    this.distinctIpAddressesCount90d = distinctIpAddressesCount90d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes distinctUserAgentsCount3d(Integer distinctUserAgentsCount3d) {
    
    this.distinctUserAgentsCount3d = distinctUserAgentsCount3d;
    return this;
  }

   /**
   * The number of distinct user agents linked to the same bank account during Plaid authentication in the last 3 days
   * @return distinctUserAgentsCount3d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of distinct user agents linked to the same bank account during Plaid authentication in the last 3 days")

  public Integer getDistinctUserAgentsCount3d() {
    return distinctUserAgentsCount3d;
  }


  public void setDistinctUserAgentsCount3d(Integer distinctUserAgentsCount3d) {
    this.distinctUserAgentsCount3d = distinctUserAgentsCount3d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes distinctUserAgentsCount7d(Integer distinctUserAgentsCount7d) {
    
    this.distinctUserAgentsCount7d = distinctUserAgentsCount7d;
    return this;
  }

   /**
   * The number of distinct user agents linked to the same bank account during Plaid authentication in the last 7 days
   * @return distinctUserAgentsCount7d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of distinct user agents linked to the same bank account during Plaid authentication in the last 7 days")

  public Integer getDistinctUserAgentsCount7d() {
    return distinctUserAgentsCount7d;
  }


  public void setDistinctUserAgentsCount7d(Integer distinctUserAgentsCount7d) {
    this.distinctUserAgentsCount7d = distinctUserAgentsCount7d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes distinctUserAgentsCount30d(Integer distinctUserAgentsCount30d) {
    
    this.distinctUserAgentsCount30d = distinctUserAgentsCount30d;
    return this;
  }

   /**
   * The number of distinct user agents linked to the same bank account during Plaid authentication in the last 30 days
   * @return distinctUserAgentsCount30d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of distinct user agents linked to the same bank account during Plaid authentication in the last 30 days")

  public Integer getDistinctUserAgentsCount30d() {
    return distinctUserAgentsCount30d;
  }


  public void setDistinctUserAgentsCount30d(Integer distinctUserAgentsCount30d) {
    this.distinctUserAgentsCount30d = distinctUserAgentsCount30d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes distinctUserAgentsCount90d(Integer distinctUserAgentsCount90d) {
    
    this.distinctUserAgentsCount90d = distinctUserAgentsCount90d;
    return this;
  }

   /**
   * The number of distinct user agents linked to the same bank account during Plaid authentication in the last 90 days
   * @return distinctUserAgentsCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of distinct user agents linked to the same bank account during Plaid authentication in the last 90 days")

  public Integer getDistinctUserAgentsCount90d() {
    return distinctUserAgentsCount90d;
  }


  public void setDistinctUserAgentsCount90d(Integer distinctUserAgentsCount90d) {
    this.distinctUserAgentsCount90d = distinctUserAgentsCount90d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes addressChangeCount28d(Integer addressChangeCount28d) {
    
    this.addressChangeCount28d = addressChangeCount28d;
    return this;
  }

   /**
   * The number of times the account&#39;s addresses on file have changed over the past 28 days
   * @return addressChangeCount28d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times the account's addresses on file have changed over the past 28 days")

  public Integer getAddressChangeCount28d() {
    return addressChangeCount28d;
  }


  public void setAddressChangeCount28d(Integer addressChangeCount28d) {
    this.addressChangeCount28d = addressChangeCount28d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes emailChangeCount28d(Integer emailChangeCount28d) {
    
    this.emailChangeCount28d = emailChangeCount28d;
    return this;
  }

   /**
   * The number of times the account&#39;s email addresses on file have changed over the past 28 days
   * @return emailChangeCount28d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times the account's email addresses on file have changed over the past 28 days")

  public Integer getEmailChangeCount28d() {
    return emailChangeCount28d;
  }


  public void setEmailChangeCount28d(Integer emailChangeCount28d) {
    this.emailChangeCount28d = emailChangeCount28d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes phoneChangeCount28d(Integer phoneChangeCount28d) {
    
    this.phoneChangeCount28d = phoneChangeCount28d;
    return this;
  }

   /**
   * The number of times the account&#39;s phone numbers on file have changed over the past 28 days
   * @return phoneChangeCount28d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times the account's phone numbers on file have changed over the past 28 days")

  public Integer getPhoneChangeCount28d() {
    return phoneChangeCount28d;
  }


  public void setPhoneChangeCount28d(Integer phoneChangeCount28d) {
    this.phoneChangeCount28d = phoneChangeCount28d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes addressChangeCount90d(Integer addressChangeCount90d) {
    
    this.addressChangeCount90d = addressChangeCount90d;
    return this;
  }

   /**
   * The number of times the account&#39;s addresses on file have changed over the past 90 days
   * @return addressChangeCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times the account's addresses on file have changed over the past 90 days")

  public Integer getAddressChangeCount90d() {
    return addressChangeCount90d;
  }


  public void setAddressChangeCount90d(Integer addressChangeCount90d) {
    this.addressChangeCount90d = addressChangeCount90d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes emailChangeCount90d(Integer emailChangeCount90d) {
    
    this.emailChangeCount90d = emailChangeCount90d;
    return this;
  }

   /**
   * The number of times the account&#39;s email addresses on file have changed over the past 90 days
   * @return emailChangeCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times the account's email addresses on file have changed over the past 90 days")

  public Integer getEmailChangeCount90d() {
    return emailChangeCount90d;
  }


  public void setEmailChangeCount90d(Integer emailChangeCount90d) {
    this.emailChangeCount90d = emailChangeCount90d;
  }


  public BeaconAccountRiskEvaluateAccountAttributes phoneChangeCount90d(Integer phoneChangeCount90d) {
    
    this.phoneChangeCount90d = phoneChangeCount90d;
    return this;
  }

   /**
   * The number of times the account&#39;s phone numbers on file have changed over the past 90 days
   * @return phoneChangeCount90d
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times the account's phone numbers on file have changed over the past 90 days")

  public Integer getPhoneChangeCount90d() {
    return phoneChangeCount90d;
  }


  public void setPhoneChangeCount90d(Integer phoneChangeCount90d) {
    this.phoneChangeCount90d = phoneChangeCount90d;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconAccountRiskEvaluateAccountAttributes beaconAccountRiskEvaluateAccountAttributes = (BeaconAccountRiskEvaluateAccountAttributes) o;
    return Objects.equals(this.daysSinceFirstPlaidConnection, beaconAccountRiskEvaluateAccountAttributes.daysSinceFirstPlaidConnection) &&
        Objects.equals(this.daysSinceAccountCreation, beaconAccountRiskEvaluateAccountAttributes.daysSinceAccountCreation) &&
        Objects.equals(this.isAccountClosed, beaconAccountRiskEvaluateAccountAttributes.isAccountClosed) &&
        Objects.equals(this.isAccountFrozenOrRestricted, beaconAccountRiskEvaluateAccountAttributes.isAccountFrozenOrRestricted) &&
        Objects.equals(this.totalPlaidConnectionsCount, beaconAccountRiskEvaluateAccountAttributes.totalPlaidConnectionsCount) &&
        Objects.equals(this.plaidConnectionsCount7d, beaconAccountRiskEvaluateAccountAttributes.plaidConnectionsCount7d) &&
        Objects.equals(this.plaidConnectionsCount30d, beaconAccountRiskEvaluateAccountAttributes.plaidConnectionsCount30d) &&
        Objects.equals(this.failedPlaidNonOauthAuthenticationAttemptsCount3d, beaconAccountRiskEvaluateAccountAttributes.failedPlaidNonOauthAuthenticationAttemptsCount3d) &&
        Objects.equals(this.plaidNonOauthAuthenticationAttemptsCount3d, beaconAccountRiskEvaluateAccountAttributes.plaidNonOauthAuthenticationAttemptsCount3d) &&
        Objects.equals(this.failedPlaidNonOauthAuthenticationAttemptsCount7d, beaconAccountRiskEvaluateAccountAttributes.failedPlaidNonOauthAuthenticationAttemptsCount7d) &&
        Objects.equals(this.plaidNonOauthAuthenticationAttemptsCount7d, beaconAccountRiskEvaluateAccountAttributes.plaidNonOauthAuthenticationAttemptsCount7d) &&
        Objects.equals(this.failedPlaidNonOauthAuthenticationAttemptsCount30d, beaconAccountRiskEvaluateAccountAttributes.failedPlaidNonOauthAuthenticationAttemptsCount30d) &&
        Objects.equals(this.plaidNonOauthAuthenticationAttemptsCount30d, beaconAccountRiskEvaluateAccountAttributes.plaidNonOauthAuthenticationAttemptsCount30d) &&
        Objects.equals(this.distinctIpAddressesCount3d, beaconAccountRiskEvaluateAccountAttributes.distinctIpAddressesCount3d) &&
        Objects.equals(this.distinctIpAddressesCount7d, beaconAccountRiskEvaluateAccountAttributes.distinctIpAddressesCount7d) &&
        Objects.equals(this.distinctIpAddressesCount30d, beaconAccountRiskEvaluateAccountAttributes.distinctIpAddressesCount30d) &&
        Objects.equals(this.distinctIpAddressesCount90d, beaconAccountRiskEvaluateAccountAttributes.distinctIpAddressesCount90d) &&
        Objects.equals(this.distinctUserAgentsCount3d, beaconAccountRiskEvaluateAccountAttributes.distinctUserAgentsCount3d) &&
        Objects.equals(this.distinctUserAgentsCount7d, beaconAccountRiskEvaluateAccountAttributes.distinctUserAgentsCount7d) &&
        Objects.equals(this.distinctUserAgentsCount30d, beaconAccountRiskEvaluateAccountAttributes.distinctUserAgentsCount30d) &&
        Objects.equals(this.distinctUserAgentsCount90d, beaconAccountRiskEvaluateAccountAttributes.distinctUserAgentsCount90d) &&
        Objects.equals(this.addressChangeCount28d, beaconAccountRiskEvaluateAccountAttributes.addressChangeCount28d) &&
        Objects.equals(this.emailChangeCount28d, beaconAccountRiskEvaluateAccountAttributes.emailChangeCount28d) &&
        Objects.equals(this.phoneChangeCount28d, beaconAccountRiskEvaluateAccountAttributes.phoneChangeCount28d) &&
        Objects.equals(this.addressChangeCount90d, beaconAccountRiskEvaluateAccountAttributes.addressChangeCount90d) &&
        Objects.equals(this.emailChangeCount90d, beaconAccountRiskEvaluateAccountAttributes.emailChangeCount90d) &&
        Objects.equals(this.phoneChangeCount90d, beaconAccountRiskEvaluateAccountAttributes.phoneChangeCount90d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysSinceFirstPlaidConnection, daysSinceAccountCreation, isAccountClosed, isAccountFrozenOrRestricted, totalPlaidConnectionsCount, plaidConnectionsCount7d, plaidConnectionsCount30d, failedPlaidNonOauthAuthenticationAttemptsCount3d, plaidNonOauthAuthenticationAttemptsCount3d, failedPlaidNonOauthAuthenticationAttemptsCount7d, plaidNonOauthAuthenticationAttemptsCount7d, failedPlaidNonOauthAuthenticationAttemptsCount30d, plaidNonOauthAuthenticationAttemptsCount30d, distinctIpAddressesCount3d, distinctIpAddressesCount7d, distinctIpAddressesCount30d, distinctIpAddressesCount90d, distinctUserAgentsCount3d, distinctUserAgentsCount7d, distinctUserAgentsCount30d, distinctUserAgentsCount90d, addressChangeCount28d, emailChangeCount28d, phoneChangeCount28d, addressChangeCount90d, emailChangeCount90d, phoneChangeCount90d);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconAccountRiskEvaluateAccountAttributes {\n");
    sb.append("    daysSinceFirstPlaidConnection: ").append(toIndentedString(daysSinceFirstPlaidConnection)).append("\n");
    sb.append("    daysSinceAccountCreation: ").append(toIndentedString(daysSinceAccountCreation)).append("\n");
    sb.append("    isAccountClosed: ").append(toIndentedString(isAccountClosed)).append("\n");
    sb.append("    isAccountFrozenOrRestricted: ").append(toIndentedString(isAccountFrozenOrRestricted)).append("\n");
    sb.append("    totalPlaidConnectionsCount: ").append(toIndentedString(totalPlaidConnectionsCount)).append("\n");
    sb.append("    plaidConnectionsCount7d: ").append(toIndentedString(plaidConnectionsCount7d)).append("\n");
    sb.append("    plaidConnectionsCount30d: ").append(toIndentedString(plaidConnectionsCount30d)).append("\n");
    sb.append("    failedPlaidNonOauthAuthenticationAttemptsCount3d: ").append(toIndentedString(failedPlaidNonOauthAuthenticationAttemptsCount3d)).append("\n");
    sb.append("    plaidNonOauthAuthenticationAttemptsCount3d: ").append(toIndentedString(plaidNonOauthAuthenticationAttemptsCount3d)).append("\n");
    sb.append("    failedPlaidNonOauthAuthenticationAttemptsCount7d: ").append(toIndentedString(failedPlaidNonOauthAuthenticationAttemptsCount7d)).append("\n");
    sb.append("    plaidNonOauthAuthenticationAttemptsCount7d: ").append(toIndentedString(plaidNonOauthAuthenticationAttemptsCount7d)).append("\n");
    sb.append("    failedPlaidNonOauthAuthenticationAttemptsCount30d: ").append(toIndentedString(failedPlaidNonOauthAuthenticationAttemptsCount30d)).append("\n");
    sb.append("    plaidNonOauthAuthenticationAttemptsCount30d: ").append(toIndentedString(plaidNonOauthAuthenticationAttemptsCount30d)).append("\n");
    sb.append("    distinctIpAddressesCount3d: ").append(toIndentedString(distinctIpAddressesCount3d)).append("\n");
    sb.append("    distinctIpAddressesCount7d: ").append(toIndentedString(distinctIpAddressesCount7d)).append("\n");
    sb.append("    distinctIpAddressesCount30d: ").append(toIndentedString(distinctIpAddressesCount30d)).append("\n");
    sb.append("    distinctIpAddressesCount90d: ").append(toIndentedString(distinctIpAddressesCount90d)).append("\n");
    sb.append("    distinctUserAgentsCount3d: ").append(toIndentedString(distinctUserAgentsCount3d)).append("\n");
    sb.append("    distinctUserAgentsCount7d: ").append(toIndentedString(distinctUserAgentsCount7d)).append("\n");
    sb.append("    distinctUserAgentsCount30d: ").append(toIndentedString(distinctUserAgentsCount30d)).append("\n");
    sb.append("    distinctUserAgentsCount90d: ").append(toIndentedString(distinctUserAgentsCount90d)).append("\n");
    sb.append("    addressChangeCount28d: ").append(toIndentedString(addressChangeCount28d)).append("\n");
    sb.append("    emailChangeCount28d: ").append(toIndentedString(emailChangeCount28d)).append("\n");
    sb.append("    phoneChangeCount28d: ").append(toIndentedString(phoneChangeCount28d)).append("\n");
    sb.append("    addressChangeCount90d: ").append(toIndentedString(addressChangeCount90d)).append("\n");
    sb.append("    emailChangeCount90d: ").append(toIndentedString(emailChangeCount90d)).append("\n");
    sb.append("    phoneChangeCount90d: ").append(toIndentedString(phoneChangeCount90d)).append("\n");
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

