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
import com.plaid.client.model.CreditDocumentMetadata;
import com.plaid.client.model.CreditPayStubDeductions;
import com.plaid.client.model.CreditPayStubEarnings;
import com.plaid.client.model.CreditPayStubEmployee;
import com.plaid.client.model.CreditPayStubEmployer;
import com.plaid.client.model.CreditPayStubNetPay;
import com.plaid.client.model.PayStubPayPeriodDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing an end user&#39;s pay stub.
 */
@ApiModel(description = "An object representing an end user's pay stub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-28T17:05:32.818783Z[Etc/UTC]")
public class CreditPayStub {
  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private CreditPayStubDeductions deductions;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "document_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_DOCUMENT_METADATA = "document_metadata";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_METADATA)
  private CreditDocumentMetadata documentMetadata;

  public static final String SERIALIZED_NAME_EARNINGS = "earnings";
  @SerializedName(SERIALIZED_NAME_EARNINGS)
  private CreditPayStubEarnings earnings;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private CreditPayStubEmployee employee;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private CreditPayStubEmployer employer;

  public static final String SERIALIZED_NAME_NET_PAY = "net_pay";
  @SerializedName(SERIALIZED_NAME_NET_PAY)
  private CreditPayStubNetPay netPay;

  public static final String SERIALIZED_NAME_PAY_PERIOD_DETAILS = "pay_period_details";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_DETAILS)
  private PayStubPayPeriodDetails payPeriodDetails;


  public CreditPayStub deductions(CreditPayStubDeductions deductions) {
    
    this.deductions = deductions;
    return this;
  }

   /**
   * Get deductions
   * @return deductions
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPayStubDeductions getDeductions() {
    return deductions;
  }


  public void setDeductions(CreditPayStubDeductions deductions) {
    this.deductions = deductions;
  }


  public CreditPayStub documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * An identifier of the document referenced by the document metadata.
   * @return documentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An identifier of the document referenced by the document metadata.")

  public String getDocumentId() {
    return documentId;
  }


  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public CreditPayStub documentMetadata(CreditDocumentMetadata documentMetadata) {
    
    this.documentMetadata = documentMetadata;
    return this;
  }

   /**
   * Get documentMetadata
   * @return documentMetadata
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditDocumentMetadata getDocumentMetadata() {
    return documentMetadata;
  }


  public void setDocumentMetadata(CreditDocumentMetadata documentMetadata) {
    this.documentMetadata = documentMetadata;
  }


  public CreditPayStub earnings(CreditPayStubEarnings earnings) {
    
    this.earnings = earnings;
    return this;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPayStubEarnings getEarnings() {
    return earnings;
  }


  public void setEarnings(CreditPayStubEarnings earnings) {
    this.earnings = earnings;
  }


  public CreditPayStub employee(CreditPayStubEmployee employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPayStubEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(CreditPayStubEmployee employee) {
    this.employee = employee;
  }


  public CreditPayStub employer(CreditPayStubEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPayStubEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(CreditPayStubEmployer employer) {
    this.employer = employer;
  }


  public CreditPayStub netPay(CreditPayStubNetPay netPay) {
    
    this.netPay = netPay;
    return this;
  }

   /**
   * Get netPay
   * @return netPay
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPayStubNetPay getNetPay() {
    return netPay;
  }


  public void setNetPay(CreditPayStubNetPay netPay) {
    this.netPay = netPay;
  }


  public CreditPayStub payPeriodDetails(PayStubPayPeriodDetails payPeriodDetails) {
    
    this.payPeriodDetails = payPeriodDetails;
    return this;
  }

   /**
   * Get payPeriodDetails
   * @return payPeriodDetails
  **/
  @ApiModelProperty(required = true, value = "")

  public PayStubPayPeriodDetails getPayPeriodDetails() {
    return payPeriodDetails;
  }


  public void setPayPeriodDetails(PayStubPayPeriodDetails payPeriodDetails) {
    this.payPeriodDetails = payPeriodDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayStub creditPayStub = (CreditPayStub) o;
    return Objects.equals(this.deductions, creditPayStub.deductions) &&
        Objects.equals(this.documentId, creditPayStub.documentId) &&
        Objects.equals(this.documentMetadata, creditPayStub.documentMetadata) &&
        Objects.equals(this.earnings, creditPayStub.earnings) &&
        Objects.equals(this.employee, creditPayStub.employee) &&
        Objects.equals(this.employer, creditPayStub.employer) &&
        Objects.equals(this.netPay, creditPayStub.netPay) &&
        Objects.equals(this.payPeriodDetails, creditPayStub.payPeriodDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductions, documentId, documentMetadata, earnings, employee, employer, netPay, payPeriodDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayStub {\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentMetadata: ").append(toIndentedString(documentMetadata)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    payPeriodDetails: ").append(toIndentedString(payPeriodDetails)).append("\n");
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

