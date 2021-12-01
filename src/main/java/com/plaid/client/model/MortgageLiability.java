/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.2
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
import com.plaid.client.model.MortgageInterestRate;
import com.plaid.client.model.MortgagePropertyAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Contains details about a mortgage account.
 */
@ApiModel(description = "Contains details about a mortgage account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-01T18:55:04.982Z[GMT]")
public class MortgageLiability {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_CURRENT_LATE_FEE = "current_late_fee";
  @SerializedName(SERIALIZED_NAME_CURRENT_LATE_FEE)
  private Double currentLateFee;

  public static final String SERIALIZED_NAME_ESCROW_BALANCE = "escrow_balance";
  @SerializedName(SERIALIZED_NAME_ESCROW_BALANCE)
  private Double escrowBalance;

  public static final String SERIALIZED_NAME_HAS_PMI = "has_pmi";
  @SerializedName(SERIALIZED_NAME_HAS_PMI)
  private Boolean hasPmi;

  public static final String SERIALIZED_NAME_HAS_PREPAYMENT_PENALTY = "has_prepayment_penalty";
  @SerializedName(SERIALIZED_NAME_HAS_PREPAYMENT_PENALTY)
  private Boolean hasPrepaymentPenalty;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private MortgageInterestRate interestRate;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_AMOUNT = "last_payment_amount";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_AMOUNT)
  private Double lastPaymentAmount;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_DATE = "last_payment_date";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_DATE)
  private LocalDate lastPaymentDate;

  public static final String SERIALIZED_NAME_LOAN_TYPE_DESCRIPTION = "loan_type_description";
  @SerializedName(SERIALIZED_NAME_LOAN_TYPE_DESCRIPTION)
  private String loanTypeDescription;

  public static final String SERIALIZED_NAME_LOAN_TERM = "loan_term";
  @SerializedName(SERIALIZED_NAME_LOAN_TERM)
  private String loanTerm;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturity_date";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private LocalDate maturityDate;

  public static final String SERIALIZED_NAME_NEXT_MONTHLY_PAYMENT = "next_monthly_payment";
  @SerializedName(SERIALIZED_NAME_NEXT_MONTHLY_PAYMENT)
  private Double nextMonthlyPayment;

  public static final String SERIALIZED_NAME_NEXT_PAYMENT_DUE_DATE = "next_payment_due_date";
  @SerializedName(SERIALIZED_NAME_NEXT_PAYMENT_DUE_DATE)
  private LocalDate nextPaymentDueDate;

  public static final String SERIALIZED_NAME_ORIGINATION_DATE = "origination_date";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_DATE)
  private LocalDate originationDate;

  public static final String SERIALIZED_NAME_ORIGINATION_PRINCIPAL_AMOUNT = "origination_principal_amount";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_PRINCIPAL_AMOUNT)
  private Double originationPrincipalAmount;

  public static final String SERIALIZED_NAME_PAST_DUE_AMOUNT = "past_due_amount";
  @SerializedName(SERIALIZED_NAME_PAST_DUE_AMOUNT)
  private Double pastDueAmount;

  public static final String SERIALIZED_NAME_PROPERTY_ADDRESS = "property_address";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ADDRESS)
  private MortgagePropertyAddress propertyAddress;

  public static final String SERIALIZED_NAME_YTD_INTEREST_PAID = "ytd_interest_paid";
  @SerializedName(SERIALIZED_NAME_YTD_INTEREST_PAID)
  private Double ytdInterestPaid;

  public static final String SERIALIZED_NAME_YTD_PRINCIPAL_PAID = "ytd_principal_paid";
  @SerializedName(SERIALIZED_NAME_YTD_PRINCIPAL_PAID)
  private Double ytdPrincipalPaid;


  public MortgageLiability accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that this liability belongs to.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account that this liability belongs to.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public MortgageLiability accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The account number of the loan.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The account number of the loan.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public MortgageLiability currentLateFee(Double currentLateFee) {
    
    this.currentLateFee = currentLateFee;
    return this;
  }

   /**
   * The current outstanding amount charged for late payment.
   * @return currentLateFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The current outstanding amount charged for late payment.")

  public Double getCurrentLateFee() {
    return currentLateFee;
  }


  public void setCurrentLateFee(Double currentLateFee) {
    this.currentLateFee = currentLateFee;
  }


  public MortgageLiability escrowBalance(Double escrowBalance) {
    
    this.escrowBalance = escrowBalance;
    return this;
  }

   /**
   * Total amount held in escrow to pay taxes and insurance on behalf of the borrower.
   * @return escrowBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Total amount held in escrow to pay taxes and insurance on behalf of the borrower.")

  public Double getEscrowBalance() {
    return escrowBalance;
  }


  public void setEscrowBalance(Double escrowBalance) {
    this.escrowBalance = escrowBalance;
  }


  public MortgageLiability hasPmi(Boolean hasPmi) {
    
    this.hasPmi = hasPmi;
    return this;
  }

   /**
   * Indicates whether the borrower has private mortgage insurance in effect.
   * @return hasPmi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates whether the borrower has private mortgage insurance in effect.")

  public Boolean getHasPmi() {
    return hasPmi;
  }


  public void setHasPmi(Boolean hasPmi) {
    this.hasPmi = hasPmi;
  }


  public MortgageLiability hasPrepaymentPenalty(Boolean hasPrepaymentPenalty) {
    
    this.hasPrepaymentPenalty = hasPrepaymentPenalty;
    return this;
  }

   /**
   * Indicates whether the borrower will pay a penalty for early payoff of mortgage.
   * @return hasPrepaymentPenalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates whether the borrower will pay a penalty for early payoff of mortgage.")

  public Boolean getHasPrepaymentPenalty() {
    return hasPrepaymentPenalty;
  }


  public void setHasPrepaymentPenalty(Boolean hasPrepaymentPenalty) {
    this.hasPrepaymentPenalty = hasPrepaymentPenalty;
  }


  public MortgageLiability interestRate(MortgageInterestRate interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @ApiModelProperty(required = true, value = "")

  public MortgageInterestRate getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(MortgageInterestRate interestRate) {
    this.interestRate = interestRate;
  }


  public MortgageLiability lastPaymentAmount(Double lastPaymentAmount) {
    
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

   /**
   * The amount of the last payment.
   * @return lastPaymentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The amount of the last payment.")

  public Double getLastPaymentAmount() {
    return lastPaymentAmount;
  }


  public void setLastPaymentAmount(Double lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }


  public MortgageLiability lastPaymentDate(LocalDate lastPaymentDate) {
    
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * The date of the last payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return lastPaymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date of the last payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getLastPaymentDate() {
    return lastPaymentDate;
  }


  public void setLastPaymentDate(LocalDate lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }


  public MortgageLiability loanTypeDescription(String loanTypeDescription) {
    
    this.loanTypeDescription = loanTypeDescription;
    return this;
  }

   /**
   * Description of the type of loan, for example &#x60;conventional&#x60;, &#x60;fixed&#x60;, or &#x60;variable&#x60;. This field is provided directly from the loan servicer and does not have an enumerated set of possible values.
   * @return loanTypeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Description of the type of loan, for example `conventional`, `fixed`, or `variable`. This field is provided directly from the loan servicer and does not have an enumerated set of possible values.")

  public String getLoanTypeDescription() {
    return loanTypeDescription;
  }


  public void setLoanTypeDescription(String loanTypeDescription) {
    this.loanTypeDescription = loanTypeDescription;
  }


  public MortgageLiability loanTerm(String loanTerm) {
    
    this.loanTerm = loanTerm;
    return this;
  }

   /**
   * Full duration of mortgage as at origination (e.g. &#x60;10 year&#x60;).
   * @return loanTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Full duration of mortgage as at origination (e.g. `10 year`).")

  public String getLoanTerm() {
    return loanTerm;
  }


  public void setLoanTerm(String loanTerm) {
    this.loanTerm = loanTerm;
  }


  public MortgageLiability maturityDate(LocalDate maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Original date on which mortgage is due in full. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Original date on which mortgage is due in full. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }


  public MortgageLiability nextMonthlyPayment(Double nextMonthlyPayment) {
    
    this.nextMonthlyPayment = nextMonthlyPayment;
    return this;
  }

   /**
   * The amount of the next payment.
   * @return nextMonthlyPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The amount of the next payment.")

  public Double getNextMonthlyPayment() {
    return nextMonthlyPayment;
  }


  public void setNextMonthlyPayment(Double nextMonthlyPayment) {
    this.nextMonthlyPayment = nextMonthlyPayment;
  }


  public MortgageLiability nextPaymentDueDate(LocalDate nextPaymentDueDate) {
    
    this.nextPaymentDueDate = nextPaymentDueDate;
    return this;
  }

   /**
   * The due date for the next payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return nextPaymentDueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The due date for the next payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getNextPaymentDueDate() {
    return nextPaymentDueDate;
  }


  public void setNextPaymentDueDate(LocalDate nextPaymentDueDate) {
    this.nextPaymentDueDate = nextPaymentDueDate;
  }


  public MortgageLiability originationDate(LocalDate originationDate) {
    
    this.originationDate = originationDate;
    return this;
  }

   /**
   * The date on which the loan was initially lent. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return originationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date on which the loan was initially lent. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getOriginationDate() {
    return originationDate;
  }


  public void setOriginationDate(LocalDate originationDate) {
    this.originationDate = originationDate;
  }


  public MortgageLiability originationPrincipalAmount(Double originationPrincipalAmount) {
    
    this.originationPrincipalAmount = originationPrincipalAmount;
    return this;
  }

   /**
   * The original principal balance of the mortgage.
   * @return originationPrincipalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The original principal balance of the mortgage.")

  public Double getOriginationPrincipalAmount() {
    return originationPrincipalAmount;
  }


  public void setOriginationPrincipalAmount(Double originationPrincipalAmount) {
    this.originationPrincipalAmount = originationPrincipalAmount;
  }


  public MortgageLiability pastDueAmount(Double pastDueAmount) {
    
    this.pastDueAmount = pastDueAmount;
    return this;
  }

   /**
   * Amount of loan (principal + interest) past due for payment.
   * @return pastDueAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Amount of loan (principal + interest) past due for payment.")

  public Double getPastDueAmount() {
    return pastDueAmount;
  }


  public void setPastDueAmount(Double pastDueAmount) {
    this.pastDueAmount = pastDueAmount;
  }


  public MortgageLiability propertyAddress(MortgagePropertyAddress propertyAddress) {
    
    this.propertyAddress = propertyAddress;
    return this;
  }

   /**
   * Get propertyAddress
   * @return propertyAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public MortgagePropertyAddress getPropertyAddress() {
    return propertyAddress;
  }


  public void setPropertyAddress(MortgagePropertyAddress propertyAddress) {
    this.propertyAddress = propertyAddress;
  }


  public MortgageLiability ytdInterestPaid(Double ytdInterestPaid) {
    
    this.ytdInterestPaid = ytdInterestPaid;
    return this;
  }

   /**
   * The year to date (YTD) interest paid.
   * @return ytdInterestPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The year to date (YTD) interest paid.")

  public Double getYtdInterestPaid() {
    return ytdInterestPaid;
  }


  public void setYtdInterestPaid(Double ytdInterestPaid) {
    this.ytdInterestPaid = ytdInterestPaid;
  }


  public MortgageLiability ytdPrincipalPaid(Double ytdPrincipalPaid) {
    
    this.ytdPrincipalPaid = ytdPrincipalPaid;
    return this;
  }

   /**
   * The YTD principal paid.
   * @return ytdPrincipalPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The YTD principal paid.")

  public Double getYtdPrincipalPaid() {
    return ytdPrincipalPaid;
  }


  public void setYtdPrincipalPaid(Double ytdPrincipalPaid) {
    this.ytdPrincipalPaid = ytdPrincipalPaid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MortgageLiability mortgageLiability = (MortgageLiability) o;
    return Objects.equals(this.accountId, mortgageLiability.accountId) &&
        Objects.equals(this.accountNumber, mortgageLiability.accountNumber) &&
        Objects.equals(this.currentLateFee, mortgageLiability.currentLateFee) &&
        Objects.equals(this.escrowBalance, mortgageLiability.escrowBalance) &&
        Objects.equals(this.hasPmi, mortgageLiability.hasPmi) &&
        Objects.equals(this.hasPrepaymentPenalty, mortgageLiability.hasPrepaymentPenalty) &&
        Objects.equals(this.interestRate, mortgageLiability.interestRate) &&
        Objects.equals(this.lastPaymentAmount, mortgageLiability.lastPaymentAmount) &&
        Objects.equals(this.lastPaymentDate, mortgageLiability.lastPaymentDate) &&
        Objects.equals(this.loanTypeDescription, mortgageLiability.loanTypeDescription) &&
        Objects.equals(this.loanTerm, mortgageLiability.loanTerm) &&
        Objects.equals(this.maturityDate, mortgageLiability.maturityDate) &&
        Objects.equals(this.nextMonthlyPayment, mortgageLiability.nextMonthlyPayment) &&
        Objects.equals(this.nextPaymentDueDate, mortgageLiability.nextPaymentDueDate) &&
        Objects.equals(this.originationDate, mortgageLiability.originationDate) &&
        Objects.equals(this.originationPrincipalAmount, mortgageLiability.originationPrincipalAmount) &&
        Objects.equals(this.pastDueAmount, mortgageLiability.pastDueAmount) &&
        Objects.equals(this.propertyAddress, mortgageLiability.propertyAddress) &&
        Objects.equals(this.ytdInterestPaid, mortgageLiability.ytdInterestPaid) &&
        Objects.equals(this.ytdPrincipalPaid, mortgageLiability.ytdPrincipalPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountNumber, currentLateFee, escrowBalance, hasPmi, hasPrepaymentPenalty, interestRate, lastPaymentAmount, lastPaymentDate, loanTypeDescription, loanTerm, maturityDate, nextMonthlyPayment, nextPaymentDueDate, originationDate, originationPrincipalAmount, pastDueAmount, propertyAddress, ytdInterestPaid, ytdPrincipalPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MortgageLiability {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    currentLateFee: ").append(toIndentedString(currentLateFee)).append("\n");
    sb.append("    escrowBalance: ").append(toIndentedString(escrowBalance)).append("\n");
    sb.append("    hasPmi: ").append(toIndentedString(hasPmi)).append("\n");
    sb.append("    hasPrepaymentPenalty: ").append(toIndentedString(hasPrepaymentPenalty)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    loanTypeDescription: ").append(toIndentedString(loanTypeDescription)).append("\n");
    sb.append("    loanTerm: ").append(toIndentedString(loanTerm)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    nextMonthlyPayment: ").append(toIndentedString(nextMonthlyPayment)).append("\n");
    sb.append("    nextPaymentDueDate: ").append(toIndentedString(nextPaymentDueDate)).append("\n");
    sb.append("    originationDate: ").append(toIndentedString(originationDate)).append("\n");
    sb.append("    originationPrincipalAmount: ").append(toIndentedString(originationPrincipalAmount)).append("\n");
    sb.append("    pastDueAmount: ").append(toIndentedString(pastDueAmount)).append("\n");
    sb.append("    propertyAddress: ").append(toIndentedString(propertyAddress)).append("\n");
    sb.append("    ytdInterestPaid: ").append(toIndentedString(ytdInterestPaid)).append("\n");
    sb.append("    ytdPrincipalPaid: ").append(toIndentedString(ytdPrincipalPaid)).append("\n");
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

