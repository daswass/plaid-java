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
import com.plaid.client.model.EmployeeIncomeSummaryFieldString;
import com.plaid.client.model.EmployerIncomeSummaryFieldString;
import com.plaid.client.model.PayFrequency;
import com.plaid.client.model.ProjectedIncomeSummaryFieldNumber;
import com.plaid.client.model.TransactionData;
import com.plaid.client.model.YTDGrossIncomeSummaryFieldNumber;
import com.plaid.client.model.YTDNetIncomeSummaryFieldNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The verified fields from a paystub verification. All fields are provided as reported on the paystub.
 */
@ApiModel(description = "The verified fields from a paystub verification. All fields are provided as reported on the paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class IncomeSummary {
  public static final String SERIALIZED_NAME_EMPLOYER_NAME = "employer_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_NAME)
  private EmployerIncomeSummaryFieldString employerName = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "employee_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  private EmployeeIncomeSummaryFieldString employeeName = null;

  public static final String SERIALIZED_NAME_YTD_GROSS_INCOME = "ytd_gross_income";
  @SerializedName(SERIALIZED_NAME_YTD_GROSS_INCOME)
  private YTDGrossIncomeSummaryFieldNumber ytdGrossIncome = null;

  public static final String SERIALIZED_NAME_YTD_NET_INCOME = "ytd_net_income";
  @SerializedName(SERIALIZED_NAME_YTD_NET_INCOME)
  private YTDNetIncomeSummaryFieldNumber ytdNetIncome = null;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private PayFrequency payFrequency;

  public static final String SERIALIZED_NAME_PROJECTED_WAGE = "projected_wage";
  @SerializedName(SERIALIZED_NAME_PROJECTED_WAGE)
  private ProjectedIncomeSummaryFieldNumber projectedWage = null;

  public static final String SERIALIZED_NAME_VERIFIED_TRANSACTION = "verified_transaction";
  @SerializedName(SERIALIZED_NAME_VERIFIED_TRANSACTION)
  private TransactionData verifiedTransaction;


  public IncomeSummary employerName(EmployerIncomeSummaryFieldString employerName) {
    
    this.employerName = employerName;
    return this;
  }

   /**
   * Get employerName
   * @return employerName
  **/
  @ApiModelProperty(required = true, value = "")

  public EmployerIncomeSummaryFieldString getEmployerName() {
    return employerName;
  }


  public void setEmployerName(EmployerIncomeSummaryFieldString employerName) {
    this.employerName = employerName;
  }


  public IncomeSummary employeeName(EmployeeIncomeSummaryFieldString employeeName) {
    
    this.employeeName = employeeName;
    return this;
  }

   /**
   * Get employeeName
   * @return employeeName
  **/
  @ApiModelProperty(required = true, value = "")

  public EmployeeIncomeSummaryFieldString getEmployeeName() {
    return employeeName;
  }


  public void setEmployeeName(EmployeeIncomeSummaryFieldString employeeName) {
    this.employeeName = employeeName;
  }


  public IncomeSummary ytdGrossIncome(YTDGrossIncomeSummaryFieldNumber ytdGrossIncome) {
    
    this.ytdGrossIncome = ytdGrossIncome;
    return this;
  }

   /**
   * Get ytdGrossIncome
   * @return ytdGrossIncome
  **/
  @ApiModelProperty(required = true, value = "")

  public YTDGrossIncomeSummaryFieldNumber getYtdGrossIncome() {
    return ytdGrossIncome;
  }


  public void setYtdGrossIncome(YTDGrossIncomeSummaryFieldNumber ytdGrossIncome) {
    this.ytdGrossIncome = ytdGrossIncome;
  }


  public IncomeSummary ytdNetIncome(YTDNetIncomeSummaryFieldNumber ytdNetIncome) {
    
    this.ytdNetIncome = ytdNetIncome;
    return this;
  }

   /**
   * Get ytdNetIncome
   * @return ytdNetIncome
  **/
  @ApiModelProperty(required = true, value = "")

  public YTDNetIncomeSummaryFieldNumber getYtdNetIncome() {
    return ytdNetIncome;
  }


  public void setYtdNetIncome(YTDNetIncomeSummaryFieldNumber ytdNetIncome) {
    this.ytdNetIncome = ytdNetIncome;
  }


  public IncomeSummary payFrequency(PayFrequency payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PayFrequency getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(PayFrequency payFrequency) {
    this.payFrequency = payFrequency;
  }


  public IncomeSummary projectedWage(ProjectedIncomeSummaryFieldNumber projectedWage) {
    
    this.projectedWage = projectedWage;
    return this;
  }

   /**
   * Get projectedWage
   * @return projectedWage
  **/
  @ApiModelProperty(required = true, value = "")

  public ProjectedIncomeSummaryFieldNumber getProjectedWage() {
    return projectedWage;
  }


  public void setProjectedWage(ProjectedIncomeSummaryFieldNumber projectedWage) {
    this.projectedWage = projectedWage;
  }


  public IncomeSummary verifiedTransaction(TransactionData verifiedTransaction) {
    
    this.verifiedTransaction = verifiedTransaction;
    return this;
  }

   /**
   * Get verifiedTransaction
   * @return verifiedTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransactionData getVerifiedTransaction() {
    return verifiedTransaction;
  }


  public void setVerifiedTransaction(TransactionData verifiedTransaction) {
    this.verifiedTransaction = verifiedTransaction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeSummary incomeSummary = (IncomeSummary) o;
    return Objects.equals(this.employerName, incomeSummary.employerName) &&
        Objects.equals(this.employeeName, incomeSummary.employeeName) &&
        Objects.equals(this.ytdGrossIncome, incomeSummary.ytdGrossIncome) &&
        Objects.equals(this.ytdNetIncome, incomeSummary.ytdNetIncome) &&
        Objects.equals(this.payFrequency, incomeSummary.payFrequency) &&
        Objects.equals(this.projectedWage, incomeSummary.projectedWage) &&
        Objects.equals(this.verifiedTransaction, incomeSummary.verifiedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerName, employeeName, ytdGrossIncome, ytdNetIncome, payFrequency, projectedWage, verifiedTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeSummary {\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    ytdGrossIncome: ").append(toIndentedString(ytdGrossIncome)).append("\n");
    sb.append("    ytdNetIncome: ").append(toIndentedString(ytdNetIncome)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    projectedWage: ").append(toIndentedString(projectedWage)).append("\n");
    sb.append("    verifiedTransaction: ").append(toIndentedString(verifiedTransaction)).append("\n");
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

