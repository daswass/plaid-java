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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.SignalWarning;
import com.plaid.client.model.TransferAuthorizationRiskLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This object includes the scores and risk level. This response is offered as an add-on to /transfer/authorization/create. To request access to these fields please contact your Plaid account manager.
 */
@ApiModel(description = "This object includes the scores and risk level. This response is offered as an add-on to /transfer/authorization/create. To request access to these fields please contact your Plaid account manager.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class TransferAuthorizationPaymentRisk {
  public static final String SERIALIZED_NAME_BANK_INITIATED_RETURN_SCORE = "bank_initiated_return_score";
  @SerializedName(SERIALIZED_NAME_BANK_INITIATED_RETURN_SCORE)
  private Integer bankInitiatedReturnScore;

  public static final String SERIALIZED_NAME_CUSTOMER_INITIATED_RETURN_SCORE = "customer_initiated_return_score";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_INITIATED_RETURN_SCORE)
  private Integer customerInitiatedReturnScore;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private TransferAuthorizationRiskLevel riskLevel;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<SignalWarning> warnings = new ArrayList<>();


  public TransferAuthorizationPaymentRisk bankInitiatedReturnScore(Integer bankInitiatedReturnScore) {
    
    this.bankInitiatedReturnScore = bankInitiatedReturnScore;
    return this;
  }

   /**
   * A score from 1-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.  The score evaluates the transaction return risk because an account is overdrawn or because an ineligible account is used and covers return codes: \&quot;R01\&quot;, \&quot;R02\&quot;, \&quot;R03\&quot;, \&quot;R04\&quot;, \&quot;R06\&quot;, \&quot;R08\&quot;,  \&quot;R09\&quot;, \&quot;R13\&quot;, \&quot;R16\&quot;, \&quot;R17\&quot;, \&quot;R20\&quot;, \&quot;R23\&quot;. These returns have a turnaround time of 2 banking days.
   * minimum: 1
   * maximum: 99
   * @return bankInitiatedReturnScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A score from 1-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.  The score evaluates the transaction return risk because an account is overdrawn or because an ineligible account is used and covers return codes: \"R01\", \"R02\", \"R03\", \"R04\", \"R06\", \"R08\",  \"R09\", \"R13\", \"R16\", \"R17\", \"R20\", \"R23\". These returns have a turnaround time of 2 banking days.")

  public Integer getBankInitiatedReturnScore() {
    return bankInitiatedReturnScore;
  }


  public void setBankInitiatedReturnScore(Integer bankInitiatedReturnScore) {
    this.bankInitiatedReturnScore = bankInitiatedReturnScore;
  }


  public TransferAuthorizationPaymentRisk customerInitiatedReturnScore(Integer customerInitiatedReturnScore) {
    
    this.customerInitiatedReturnScore = customerInitiatedReturnScore;
    return this;
  }

   /**
   * A score from 1-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.  The score evaluates the transaction return risk of an unauthorized debit and covers return codes: \&quot;R05\&quot;, \&quot;R07\&quot;, \&quot;R10\&quot;, \&quot;R11\&quot;, \&quot;R29\&quot;. These returns typically have a return time frame of up to 60 calendar days. During this period, the customer of financial institutions can dispute a transaction as unauthorized.
   * minimum: 1
   * maximum: 99
   * @return customerInitiatedReturnScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A score from 1-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.  The score evaluates the transaction return risk of an unauthorized debit and covers return codes: \"R05\", \"R07\", \"R10\", \"R11\", \"R29\". These returns typically have a return time frame of up to 60 calendar days. During this period, the customer of financial institutions can dispute a transaction as unauthorized.")

  public Integer getCustomerInitiatedReturnScore() {
    return customerInitiatedReturnScore;
  }


  public void setCustomerInitiatedReturnScore(Integer customerInitiatedReturnScore) {
    this.customerInitiatedReturnScore = customerInitiatedReturnScore;
  }


  public TransferAuthorizationPaymentRisk riskLevel(TransferAuthorizationRiskLevel riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * Get riskLevel
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationRiskLevel getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(TransferAuthorizationRiskLevel riskLevel) {
    this.riskLevel = riskLevel;
  }


  public TransferAuthorizationPaymentRisk warnings(List<SignalWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public TransferAuthorizationPaymentRisk addWarningsItem(SignalWarning warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * If bank information was not available to be used in the Signal model, this array contains warnings describing why bank data is missing. If you want to receive an API error instead of Signal scores in the case of missing bank data, file a support ticket or contact your Plaid account manager.
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "If bank information was not available to be used in the Signal model, this array contains warnings describing why bank data is missing. If you want to receive an API error instead of Signal scores in the case of missing bank data, file a support ticket or contact your Plaid account manager.")

  public List<SignalWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<SignalWarning> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferAuthorizationPaymentRisk transferAuthorizationPaymentRisk = (TransferAuthorizationPaymentRisk) o;
    return Objects.equals(this.bankInitiatedReturnScore, transferAuthorizationPaymentRisk.bankInitiatedReturnScore) &&
        Objects.equals(this.customerInitiatedReturnScore, transferAuthorizationPaymentRisk.customerInitiatedReturnScore) &&
        Objects.equals(this.riskLevel, transferAuthorizationPaymentRisk.riskLevel) &&
        Objects.equals(this.warnings, transferAuthorizationPaymentRisk.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankInitiatedReturnScore, customerInitiatedReturnScore, riskLevel, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAuthorizationPaymentRisk {\n");
    sb.append("    bankInitiatedReturnScore: ").append(toIndentedString(bankInitiatedReturnScore)).append("\n");
    sb.append("    customerInitiatedReturnScore: ").append(toIndentedString(customerInitiatedReturnScore)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

