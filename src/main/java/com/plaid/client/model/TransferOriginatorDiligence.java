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
import com.plaid.client.model.TransferCreditUsageConfiguration;
import com.plaid.client.model.TransferDebitUsageConfiguration;
import com.plaid.client.model.TransferFundingAccount;
import com.plaid.client.model.TransferOriginatorAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The diligence information for the originator.
 */
@ApiModel(description = "The diligence information for the originator.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class TransferOriginatorDiligence {
  public static final String SERIALIZED_NAME_DBA = "dba";
  @SerializedName(SERIALIZED_NAME_DBA)
  private String dba;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_CREDIT_USAGE_CONFIGURATION = "credit_usage_configuration";
  @SerializedName(SERIALIZED_NAME_CREDIT_USAGE_CONFIGURATION)
  private TransferCreditUsageConfiguration creditUsageConfiguration;

  public static final String SERIALIZED_NAME_DEBIT_USAGE_CONFIGURATION = "debit_usage_configuration";
  @SerializedName(SERIALIZED_NAME_DEBIT_USAGE_CONFIGURATION)
  private TransferDebitUsageConfiguration debitUsageConfiguration;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private TransferOriginatorAddress address;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_NAICS_CODE = "naics_code";
  @SerializedName(SERIALIZED_NAME_NAICS_CODE)
  private String naicsCode;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT = "funding_account";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT)
  private TransferFundingAccount fundingAccount;


  public TransferOriginatorDiligence dba(String dba) {
    
    this.dba = dba;
    return this;
  }

   /**
   * The business name of the originator.
   * @return dba
  **/
  @ApiModelProperty(required = true, value = "The business name of the originator.")

  public String getDba() {
    return dba;
  }


  public void setDba(String dba) {
    this.dba = dba;
  }


  public TransferOriginatorDiligence taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * The tax ID of the originator.
   * @return taxId
  **/
  @ApiModelProperty(required = true, value = "The tax ID of the originator.")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public TransferOriginatorDiligence creditUsageConfiguration(TransferCreditUsageConfiguration creditUsageConfiguration) {
    
    this.creditUsageConfiguration = creditUsageConfiguration;
    return this;
  }

   /**
   * Get creditUsageConfiguration
   * @return creditUsageConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferCreditUsageConfiguration getCreditUsageConfiguration() {
    return creditUsageConfiguration;
  }


  public void setCreditUsageConfiguration(TransferCreditUsageConfiguration creditUsageConfiguration) {
    this.creditUsageConfiguration = creditUsageConfiguration;
  }


  public TransferOriginatorDiligence debitUsageConfiguration(TransferDebitUsageConfiguration debitUsageConfiguration) {
    
    this.debitUsageConfiguration = debitUsageConfiguration;
    return this;
  }

   /**
   * Get debitUsageConfiguration
   * @return debitUsageConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferDebitUsageConfiguration getDebitUsageConfiguration() {
    return debitUsageConfiguration;
  }


  public void setDebitUsageConfiguration(TransferDebitUsageConfiguration debitUsageConfiguration) {
    this.debitUsageConfiguration = debitUsageConfiguration;
  }


  public TransferOriginatorDiligence address(TransferOriginatorAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferOriginatorAddress getAddress() {
    return address;
  }


  public void setAddress(TransferOriginatorAddress address) {
    this.address = address;
  }


  public TransferOriginatorDiligence website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * The website of the originator.
   * @return website
  **/
  @ApiModelProperty(required = true, value = "The website of the originator.")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public TransferOriginatorDiligence naicsCode(String naicsCode) {
    
    this.naicsCode = naicsCode;
    return this;
  }

   /**
   * The NAICS code of the originator.
   * @return naicsCode
  **/
  @ApiModelProperty(required = true, value = "The NAICS code of the originator.")

  public String getNaicsCode() {
    return naicsCode;
  }


  public void setNaicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
  }


  public TransferOriginatorDiligence fundingAccount(TransferFundingAccount fundingAccount) {
    
    this.fundingAccount = fundingAccount;
    return this;
  }

   /**
   * Get fundingAccount
   * @return fundingAccount
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferFundingAccount getFundingAccount() {
    return fundingAccount;
  }


  public void setFundingAccount(TransferFundingAccount fundingAccount) {
    this.fundingAccount = fundingAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferOriginatorDiligence transferOriginatorDiligence = (TransferOriginatorDiligence) o;
    return Objects.equals(this.dba, transferOriginatorDiligence.dba) &&
        Objects.equals(this.taxId, transferOriginatorDiligence.taxId) &&
        Objects.equals(this.creditUsageConfiguration, transferOriginatorDiligence.creditUsageConfiguration) &&
        Objects.equals(this.debitUsageConfiguration, transferOriginatorDiligence.debitUsageConfiguration) &&
        Objects.equals(this.address, transferOriginatorDiligence.address) &&
        Objects.equals(this.website, transferOriginatorDiligence.website) &&
        Objects.equals(this.naicsCode, transferOriginatorDiligence.naicsCode) &&
        Objects.equals(this.fundingAccount, transferOriginatorDiligence.fundingAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dba, taxId, creditUsageConfiguration, debitUsageConfiguration, address, website, naicsCode, fundingAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferOriginatorDiligence {\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    creditUsageConfiguration: ").append(toIndentedString(creditUsageConfiguration)).append("\n");
    sb.append("    debitUsageConfiguration: ").append(toIndentedString(debitUsageConfiguration)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
    sb.append("    fundingAccount: ").append(toIndentedString(fundingAccount)).append("\n");
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

