/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.121.0
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
import com.plaid.client.model.CreditFilter;
import com.plaid.client.model.DepositoryFilter;
import com.plaid.client.model.InvestmentFilter;
import com.plaid.client.model.LoanFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * By default, Link will provide limited account filtering: it will only display Institutions that are compatible with all products supplied in the &#x60;products&#x60; parameter of &#x60;/link/token/create&#x60;, and, if &#x60;auth&#x60; is specified in the &#x60;products&#x60; array, will also filter out accounts other than &#x60;checking&#x60; and &#x60;savings&#x60; accounts on the Account Select pane. You can further limit the accounts shown in Link by using &#x60;account_filters&#x60; to specify the account subtypes to be shown in Link. Only the specified subtypes will be shown. This filtering applies to both the Account Select view (if enabled) and the Institution Select view. Institutions that do not support the selected subtypes will be omitted from Link. To indicate that all subtypes should be shown, use the value &#x60;\&quot;all\&quot;&#x60;. If the &#x60;account_filters&#x60; filter is used, any account type for which a filter is not specified will be entirely omitted from Link. For a full list of valid types and subtypes, see the [Account schema](https://plaid.com/docs/api/accounts#account-type-schema).  For institutions using OAuth, the filter will not affect the list of accounts shown by the bank in the OAuth window. 
 */
@ApiModel(description = "By default, Link will provide limited account filtering: it will only display Institutions that are compatible with all products supplied in the `products` parameter of `/link/token/create`, and, if `auth` is specified in the `products` array, will also filter out accounts other than `checking` and `savings` accounts on the Account Select pane. You can further limit the accounts shown in Link by using `account_filters` to specify the account subtypes to be shown in Link. Only the specified subtypes will be shown. This filtering applies to both the Account Select view (if enabled) and the Institution Select view. Institutions that do not support the selected subtypes will be omitted from Link. To indicate that all subtypes should be shown, use the value `\"all\"`. If the `account_filters` filter is used, any account type for which a filter is not specified will be entirely omitted from Link. For a full list of valid types and subtypes, see the [Account schema](https://plaid.com/docs/api/accounts#account-type-schema).  For institutions using OAuth, the filter will not affect the list of accounts shown by the bank in the OAuth window. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class LinkTokenAccountFilters {
  public static final String SERIALIZED_NAME_DEPOSITORY = "depository";
  @SerializedName(SERIALIZED_NAME_DEPOSITORY)
  private DepositoryFilter depository;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private CreditFilter credit;

  public static final String SERIALIZED_NAME_LOAN = "loan";
  @SerializedName(SERIALIZED_NAME_LOAN)
  private LoanFilter loan;

  public static final String SERIALIZED_NAME_INVESTMENT = "investment";
  @SerializedName(SERIALIZED_NAME_INVESTMENT)
  private InvestmentFilter investment;


  public LinkTokenAccountFilters depository(DepositoryFilter depository) {
    
    this.depository = depository;
    return this;
  }

   /**
   * Get depository
   * @return depository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DepositoryFilter getDepository() {
    return depository;
  }


  public void setDepository(DepositoryFilter depository) {
    this.depository = depository;
  }


  public LinkTokenAccountFilters credit(CreditFilter credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditFilter getCredit() {
    return credit;
  }


  public void setCredit(CreditFilter credit) {
    this.credit = credit;
  }


  public LinkTokenAccountFilters loan(LoanFilter loan) {
    
    this.loan = loan;
    return this;
  }

   /**
   * Get loan
   * @return loan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoanFilter getLoan() {
    return loan;
  }


  public void setLoan(LoanFilter loan) {
    this.loan = loan;
  }


  public LinkTokenAccountFilters investment(InvestmentFilter investment) {
    
    this.investment = investment;
    return this;
  }

   /**
   * Get investment
   * @return investment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvestmentFilter getInvestment() {
    return investment;
  }


  public void setInvestment(InvestmentFilter investment) {
    this.investment = investment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenAccountFilters linkTokenAccountFilters = (LinkTokenAccountFilters) o;
    return Objects.equals(this.depository, linkTokenAccountFilters.depository) &&
        Objects.equals(this.credit, linkTokenAccountFilters.credit) &&
        Objects.equals(this.loan, linkTokenAccountFilters.loan) &&
        Objects.equals(this.investment, linkTokenAccountFilters.investment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depository, credit, loan, investment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenAccountFilters {\n");
    sb.append("    depository: ").append(toIndentedString(depository)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    loan: ").append(toIndentedString(loan)).append("\n");
    sb.append("    investment: ").append(toIndentedString(investment)).append("\n");
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

