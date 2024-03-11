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
import com.plaid.client.model.NumbersACHNullable;
import com.plaid.client.model.NumbersBACSNullable;
import com.plaid.client.model.NumbersEFTNullable;
import com.plaid.client.model.NumbersInternationalNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object containing identifying numbers used for making electronic transfers to and from the &#x60;account&#x60;. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of the account. An account may have more than one number type. If a particular identifying number type is not used by the &#x60;account&#x60; for which auth data has been requested, a null value will be returned.
 */
@ApiModel(description = "An object containing identifying numbers used for making electronic transfers to and from the `account`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of the account. An account may have more than one number type. If a particular identifying number type is not used by the `account` for which auth data has been requested, a null value will be returned.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class ProcessorNumber {
  public static final String SERIALIZED_NAME_ACH = "ach";
  @SerializedName(SERIALIZED_NAME_ACH)
  private NumbersACHNullable ach;

  public static final String SERIALIZED_NAME_EFT = "eft";
  @SerializedName(SERIALIZED_NAME_EFT)
  private NumbersEFTNullable eft;

  public static final String SERIALIZED_NAME_INTERNATIONAL = "international";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL)
  private NumbersInternationalNullable international;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private NumbersBACSNullable bacs;


  public ProcessorNumber ach(NumbersACHNullable ach) {
    
    this.ach = ach;
    return this;
  }

   /**
   * Get ach
   * @return ach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersACHNullable getAch() {
    return ach;
  }


  public void setAch(NumbersACHNullable ach) {
    this.ach = ach;
  }


  public ProcessorNumber eft(NumbersEFTNullable eft) {
    
    this.eft = eft;
    return this;
  }

   /**
   * Get eft
   * @return eft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersEFTNullable getEft() {
    return eft;
  }


  public void setEft(NumbersEFTNullable eft) {
    this.eft = eft;
  }


  public ProcessorNumber international(NumbersInternationalNullable international) {
    
    this.international = international;
    return this;
  }

   /**
   * Get international
   * @return international
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersInternationalNullable getInternational() {
    return international;
  }


  public void setInternational(NumbersInternationalNullable international) {
    this.international = international;
  }


  public ProcessorNumber bacs(NumbersBACSNullable bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersBACSNullable getBacs() {
    return bacs;
  }


  public void setBacs(NumbersBACSNullable bacs) {
    this.bacs = bacs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorNumber processorNumber = (ProcessorNumber) o;
    return Objects.equals(this.ach, processorNumber.ach) &&
        Objects.equals(this.eft, processorNumber.eft) &&
        Objects.equals(this.international, processorNumber.international) &&
        Objects.equals(this.bacs, processorNumber.bacs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ach, eft, international, bacs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorNumber {\n");
    sb.append("    ach: ").append(toIndentedString(ach)).append("\n");
    sb.append("    eft: ").append(toIndentedString(eft)).append("\n");
    sb.append("    international: ").append(toIndentedString(international)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
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

