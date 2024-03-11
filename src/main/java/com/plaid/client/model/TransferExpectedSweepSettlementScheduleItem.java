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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Defines an expected sweep date and amount.
 */
@ApiModel(description = "Defines an expected sweep date and amount.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class TransferExpectedSweepSettlementScheduleItem {
  public static final String SERIALIZED_NAME_SWEEP_SETTLEMENT_DATE = "sweep_settlement_date";
  @SerializedName(SERIALIZED_NAME_SWEEP_SETTLEMENT_DATE)
  private LocalDate sweepSettlementDate;

  public static final String SERIALIZED_NAME_SWEPT_SETTLED_AMOUNT = "swept_settled_amount";
  @SerializedName(SERIALIZED_NAME_SWEPT_SETTLED_AMOUNT)
  private String sweptSettledAmount;


  public TransferExpectedSweepSettlementScheduleItem sweepSettlementDate(LocalDate sweepSettlementDate) {
    
    this.sweepSettlementDate = sweepSettlementDate;
    return this;
  }

   /**
   * The settlement date of a sweep for this transfer.
   * @return sweepSettlementDate
  **/
  @ApiModelProperty(required = true, value = "The settlement date of a sweep for this transfer.")

  public LocalDate getSweepSettlementDate() {
    return sweepSettlementDate;
  }


  public void setSweepSettlementDate(LocalDate sweepSettlementDate) {
    this.sweepSettlementDate = sweepSettlementDate;
  }


  public TransferExpectedSweepSettlementScheduleItem sweptSettledAmount(String sweptSettledAmount) {
    
    this.sweptSettledAmount = sweptSettledAmount;
    return this;
  }

   /**
   * The accumulated amount that has been swept by &#x60;sweep_settlement_date&#x60;.
   * @return sweptSettledAmount
  **/
  @ApiModelProperty(required = true, value = "The accumulated amount that has been swept by `sweep_settlement_date`.")

  public String getSweptSettledAmount() {
    return sweptSettledAmount;
  }


  public void setSweptSettledAmount(String sweptSettledAmount) {
    this.sweptSettledAmount = sweptSettledAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferExpectedSweepSettlementScheduleItem transferExpectedSweepSettlementScheduleItem = (TransferExpectedSweepSettlementScheduleItem) o;
    return Objects.equals(this.sweepSettlementDate, transferExpectedSweepSettlementScheduleItem.sweepSettlementDate) &&
        Objects.equals(this.sweptSettledAmount, transferExpectedSweepSettlementScheduleItem.sweptSettledAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sweepSettlementDate, sweptSettledAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferExpectedSweepSettlementScheduleItem {\n");
    sb.append("    sweepSettlementDate: ").append(toIndentedString(sweepSettlementDate)).append("\n");
    sb.append("    sweptSettledAmount: ").append(toIndentedString(sweptSettledAmount)).append("\n");
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

