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
import com.plaid.client.model.CraBankIncomeEmployer;
import com.plaid.client.model.CraBankIncomeHistoricalSummary;
import com.plaid.client.model.CraPredictionInterval;
import com.plaid.client.model.CreditBankIncomeCategory;
import com.plaid.client.model.CreditBankIncomePayFrequency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Detailed information for the income source.
 */
@ApiModel(description = "Detailed information for the income source.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class CraBankIncomeSource {
  public static final String SERIALIZED_NAME_INCOME_SOURCE_ID = "income_source_id";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCE_ID)
  private String incomeSourceId;

  public static final String SERIALIZED_NAME_INCOME_DESCRIPTION = "income_description";
  @SerializedName(SERIALIZED_NAME_INCOME_DESCRIPTION)
  private String incomeDescription;

  public static final String SERIALIZED_NAME_INCOME_CATEGORY = "income_category";
  @SerializedName(SERIALIZED_NAME_INCOME_CATEGORY)
  private CreditBankIncomeCategory incomeCategory;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private CreditBankIncomePayFrequency payFrequency;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Double totalAmount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_TRANSACTION_COUNT = "transaction_count";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_COUNT)
  private Integer transactionCount;

  public static final String SERIALIZED_NAME_NEXT_PAYMENT_DATE = "next_payment_date";
  @SerializedName(SERIALIZED_NAME_NEXT_PAYMENT_DATE)
  private LocalDate nextPaymentDate;

  public static final String SERIALIZED_NAME_HISTORICAL_AVERAGE_MONTHLY_GROSS_INCOME = "historical_average_monthly_gross_income";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_AVERAGE_MONTHLY_GROSS_INCOME)
  private Double historicalAverageMonthlyGrossIncome;

  public static final String SERIALIZED_NAME_HISTORICAL_AVERAGE_MONTHLY_INCOME = "historical_average_monthly_income";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_AVERAGE_MONTHLY_INCOME)
  private Double historicalAverageMonthlyIncome;

  public static final String SERIALIZED_NAME_FORECASTED_AVERAGE_MONTHLY_INCOME = "forecasted_average_monthly_income";
  @SerializedName(SERIALIZED_NAME_FORECASTED_AVERAGE_MONTHLY_INCOME)
  private Double forecastedAverageMonthlyIncome;

  public static final String SERIALIZED_NAME_FORECASTED_AVERAGE_MONTHLY_INCOME_PREDICTION_INTERVAL = "forecasted_average_monthly_income_prediction_interval";
  @SerializedName(SERIALIZED_NAME_FORECASTED_AVERAGE_MONTHLY_INCOME_PREDICTION_INTERVAL)
  private List<CraPredictionInterval> forecastedAverageMonthlyIncomePredictionInterval = new ArrayList<>();

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private CraBankIncomeEmployer employer;

  public static final String SERIALIZED_NAME_HISTORICAL_SUMMARY = "historical_summary";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SUMMARY)
  private List<CraBankIncomeHistoricalSummary> historicalSummary = null;


  public CraBankIncomeSource incomeSourceId(String incomeSourceId) {
    
    this.incomeSourceId = incomeSourceId;
    return this;
  }

   /**
   * A unique identifier for an income source.
   * @return incomeSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for an income source.")

  public String getIncomeSourceId() {
    return incomeSourceId;
  }


  public void setIncomeSourceId(String incomeSourceId) {
    this.incomeSourceId = incomeSourceId;
  }


  public CraBankIncomeSource incomeDescription(String incomeDescription) {
    
    this.incomeDescription = incomeDescription;
    return this;
  }

   /**
   * The most common name or original description for the underlying income transactions.
   * @return incomeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The most common name or original description for the underlying income transactions.")

  public String getIncomeDescription() {
    return incomeDescription;
  }


  public void setIncomeDescription(String incomeDescription) {
    this.incomeDescription = incomeDescription;
  }


  public CraBankIncomeSource incomeCategory(CreditBankIncomeCategory incomeCategory) {
    
    this.incomeCategory = incomeCategory;
    return this;
  }

   /**
   * Get incomeCategory
   * @return incomeCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditBankIncomeCategory getIncomeCategory() {
    return incomeCategory;
  }


  public void setIncomeCategory(CreditBankIncomeCategory incomeCategory) {
    this.incomeCategory = incomeCategory;
  }


  public CraBankIncomeSource startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Minimum of all dates within the specific income sources in the user&#39;s bank account for days requested by the client. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum of all dates within the specific income sources in the user's bank account for days requested by the client. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CraBankIncomeSource endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Maximum of all dates within the specific income sources in the user’s bank account for days requested by the client. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum of all dates within the specific income sources in the user’s bank account for days requested by the client. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CraBankIncomeSource payFrequency(CreditBankIncomePayFrequency payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditBankIncomePayFrequency getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(CreditBankIncomePayFrequency payFrequency) {
    this.payFrequency = payFrequency;
  }


  public CraBankIncomeSource totalAmount(Double totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount of earnings in the user’s bank account for the specific income source for days requested by the client.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of earnings in the user’s bank account for the specific income source for days requested by the client.")

  public Double getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public CraBankIncomeSource isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO 4217 currency code of the amount or balance.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO 4217 currency code of the amount or balance.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public CraBankIncomeSource unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the amount or balance. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-null. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unofficial currency code associated with the amount or balance. Always `null` if `iso_currency_code` is non-null. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public CraBankIncomeSource transactionCount(Integer transactionCount) {
    
    this.transactionCount = transactionCount;
    return this;
  }

   /**
   * Number of transactions for the income source within the start and end date.
   * @return transactionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of transactions for the income source within the start and end date.")

  public Integer getTransactionCount() {
    return transactionCount;
  }


  public void setTransactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
  }


  public CraBankIncomeSource nextPaymentDate(LocalDate nextPaymentDate) {
    
    this.nextPaymentDate = nextPaymentDate;
    return this;
  }

   /**
   * The expected date of the end user’s next paycheck for the income source. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return nextPaymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expected date of the end user’s next paycheck for the income source. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getNextPaymentDate() {
    return nextPaymentDate;
  }


  public void setNextPaymentDate(LocalDate nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
  }


  public CraBankIncomeSource historicalAverageMonthlyGrossIncome(Double historicalAverageMonthlyGrossIncome) {
    
    this.historicalAverageMonthlyGrossIncome = historicalAverageMonthlyGrossIncome;
    return this;
  }

   /**
   * An estimate of the average gross monthly income based on the historical net amount and income category for the income source(s).
   * @return historicalAverageMonthlyGrossIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An estimate of the average gross monthly income based on the historical net amount and income category for the income source(s).")

  public Double getHistoricalAverageMonthlyGrossIncome() {
    return historicalAverageMonthlyGrossIncome;
  }


  public void setHistoricalAverageMonthlyGrossIncome(Double historicalAverageMonthlyGrossIncome) {
    this.historicalAverageMonthlyGrossIncome = historicalAverageMonthlyGrossIncome;
  }


  public CraBankIncomeSource historicalAverageMonthlyIncome(Double historicalAverageMonthlyIncome) {
    
    this.historicalAverageMonthlyIncome = historicalAverageMonthlyIncome;
    return this;
  }

   /**
   * The average monthly net income amount estimated based on the historical data for the income source(s).
   * @return historicalAverageMonthlyIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average monthly net income amount estimated based on the historical data for the income source(s).")

  public Double getHistoricalAverageMonthlyIncome() {
    return historicalAverageMonthlyIncome;
  }


  public void setHistoricalAverageMonthlyIncome(Double historicalAverageMonthlyIncome) {
    this.historicalAverageMonthlyIncome = historicalAverageMonthlyIncome;
  }


  public CraBankIncomeSource forecastedAverageMonthlyIncome(Double forecastedAverageMonthlyIncome) {
    
    this.forecastedAverageMonthlyIncome = forecastedAverageMonthlyIncome;
    return this;
  }

   /**
   * The predicted average monthly net income amount for the income source(s).
   * @return forecastedAverageMonthlyIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The predicted average monthly net income amount for the income source(s).")

  public Double getForecastedAverageMonthlyIncome() {
    return forecastedAverageMonthlyIncome;
  }


  public void setForecastedAverageMonthlyIncome(Double forecastedAverageMonthlyIncome) {
    this.forecastedAverageMonthlyIncome = forecastedAverageMonthlyIncome;
  }


  public CraBankIncomeSource forecastedAverageMonthlyIncomePredictionInterval(List<CraPredictionInterval> forecastedAverageMonthlyIncomePredictionInterval) {
    
    this.forecastedAverageMonthlyIncomePredictionInterval = forecastedAverageMonthlyIncomePredictionInterval;
    return this;
  }

  public CraBankIncomeSource addForecastedAverageMonthlyIncomePredictionIntervalItem(CraPredictionInterval forecastedAverageMonthlyIncomePredictionIntervalItem) {
    this.forecastedAverageMonthlyIncomePredictionInterval.add(forecastedAverageMonthlyIncomePredictionIntervalItem);
    return this;
  }

   /**
   * The prediction interval(s) for the forecasted average monthly income.
   * @return forecastedAverageMonthlyIncomePredictionInterval
  **/
  @ApiModelProperty(required = true, value = "The prediction interval(s) for the forecasted average monthly income.")

  public List<CraPredictionInterval> getForecastedAverageMonthlyIncomePredictionInterval() {
    return forecastedAverageMonthlyIncomePredictionInterval;
  }


  public void setForecastedAverageMonthlyIncomePredictionInterval(List<CraPredictionInterval> forecastedAverageMonthlyIncomePredictionInterval) {
    this.forecastedAverageMonthlyIncomePredictionInterval = forecastedAverageMonthlyIncomePredictionInterval;
  }


  public CraBankIncomeSource employer(CraBankIncomeEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CraBankIncomeEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(CraBankIncomeEmployer employer) {
    this.employer = employer;
  }


  public CraBankIncomeSource historicalSummary(List<CraBankIncomeHistoricalSummary> historicalSummary) {
    
    this.historicalSummary = historicalSummary;
    return this;
  }

  public CraBankIncomeSource addHistoricalSummaryItem(CraBankIncomeHistoricalSummary historicalSummaryItem) {
    if (this.historicalSummary == null) {
      this.historicalSummary = new ArrayList<>();
    }
    this.historicalSummary.add(historicalSummaryItem);
    return this;
  }

   /**
   * Get historicalSummary
   * @return historicalSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CraBankIncomeHistoricalSummary> getHistoricalSummary() {
    return historicalSummary;
  }


  public void setHistoricalSummary(List<CraBankIncomeHistoricalSummary> historicalSummary) {
    this.historicalSummary = historicalSummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CraBankIncomeSource craBankIncomeSource = (CraBankIncomeSource) o;
    return Objects.equals(this.incomeSourceId, craBankIncomeSource.incomeSourceId) &&
        Objects.equals(this.incomeDescription, craBankIncomeSource.incomeDescription) &&
        Objects.equals(this.incomeCategory, craBankIncomeSource.incomeCategory) &&
        Objects.equals(this.startDate, craBankIncomeSource.startDate) &&
        Objects.equals(this.endDate, craBankIncomeSource.endDate) &&
        Objects.equals(this.payFrequency, craBankIncomeSource.payFrequency) &&
        Objects.equals(this.totalAmount, craBankIncomeSource.totalAmount) &&
        Objects.equals(this.isoCurrencyCode, craBankIncomeSource.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, craBankIncomeSource.unofficialCurrencyCode) &&
        Objects.equals(this.transactionCount, craBankIncomeSource.transactionCount) &&
        Objects.equals(this.nextPaymentDate, craBankIncomeSource.nextPaymentDate) &&
        Objects.equals(this.historicalAverageMonthlyGrossIncome, craBankIncomeSource.historicalAverageMonthlyGrossIncome) &&
        Objects.equals(this.historicalAverageMonthlyIncome, craBankIncomeSource.historicalAverageMonthlyIncome) &&
        Objects.equals(this.forecastedAverageMonthlyIncome, craBankIncomeSource.forecastedAverageMonthlyIncome) &&
        Objects.equals(this.forecastedAverageMonthlyIncomePredictionInterval, craBankIncomeSource.forecastedAverageMonthlyIncomePredictionInterval) &&
        Objects.equals(this.employer, craBankIncomeSource.employer) &&
        Objects.equals(this.historicalSummary, craBankIncomeSource.historicalSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeSourceId, incomeDescription, incomeCategory, startDate, endDate, payFrequency, totalAmount, isoCurrencyCode, unofficialCurrencyCode, transactionCount, nextPaymentDate, historicalAverageMonthlyGrossIncome, historicalAverageMonthlyIncome, forecastedAverageMonthlyIncome, forecastedAverageMonthlyIncomePredictionInterval, employer, historicalSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CraBankIncomeSource {\n");
    sb.append("    incomeSourceId: ").append(toIndentedString(incomeSourceId)).append("\n");
    sb.append("    incomeDescription: ").append(toIndentedString(incomeDescription)).append("\n");
    sb.append("    incomeCategory: ").append(toIndentedString(incomeCategory)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
    sb.append("    historicalAverageMonthlyGrossIncome: ").append(toIndentedString(historicalAverageMonthlyGrossIncome)).append("\n");
    sb.append("    historicalAverageMonthlyIncome: ").append(toIndentedString(historicalAverageMonthlyIncome)).append("\n");
    sb.append("    forecastedAverageMonthlyIncome: ").append(toIndentedString(forecastedAverageMonthlyIncome)).append("\n");
    sb.append("    forecastedAverageMonthlyIncomePredictionInterval: ").append(toIndentedString(forecastedAverageMonthlyIncomePredictionInterval)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    historicalSummary: ").append(toIndentedString(historicalSummary)).append("\n");
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

