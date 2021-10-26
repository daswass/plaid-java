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
import com.plaid.client.model.NumbersACH;
import com.plaid.client.model.NumbersBACS;
import com.plaid.client.model.NumbersEFT;
import com.plaid.client.model.NumbersInternational;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing identifying numbers used for making electronic transfers to and from the &#x60;accounts&#x60;. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of the account. An account may have more than one number type. If a particular identifying number type is not used by any &#x60;accounts&#x60; for which data has been requested, the array for that type will be empty.
 */
@ApiModel(description = "An object containing identifying numbers used for making electronic transfers to and from the `accounts`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of the account. An account may have more than one number type. If a particular identifying number type is not used by any `accounts` for which data has been requested, the array for that type will be empty.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class AuthGetNumbers {
  public static final String SERIALIZED_NAME_ACH = "ach";
  @SerializedName(SERIALIZED_NAME_ACH)
  private List<NumbersACH> ach = new ArrayList<>();

  public static final String SERIALIZED_NAME_EFT = "eft";
  @SerializedName(SERIALIZED_NAME_EFT)
  private List<NumbersEFT> eft = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTERNATIONAL = "international";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL)
  private List<NumbersInternational> international = new ArrayList<>();

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private List<NumbersBACS> bacs = new ArrayList<>();


  public AuthGetNumbers ach(List<NumbersACH> ach) {
    
    this.ach = ach;
    return this;
  }

  public AuthGetNumbers addAchItem(NumbersACH achItem) {
    this.ach.add(achItem);
    return this;
  }

   /**
   * An array of ACH numbers identifying accounts.
   * @return ach
  **/
  @ApiModelProperty(required = true, value = "An array of ACH numbers identifying accounts.")

  public List<NumbersACH> getAch() {
    return ach;
  }


  public void setAch(List<NumbersACH> ach) {
    this.ach = ach;
  }


  public AuthGetNumbers eft(List<NumbersEFT> eft) {
    
    this.eft = eft;
    return this;
  }

  public AuthGetNumbers addEftItem(NumbersEFT eftItem) {
    this.eft.add(eftItem);
    return this;
  }

   /**
   * An array of EFT numbers identifying accounts.
   * @return eft
  **/
  @ApiModelProperty(required = true, value = "An array of EFT numbers identifying accounts.")

  public List<NumbersEFT> getEft() {
    return eft;
  }


  public void setEft(List<NumbersEFT> eft) {
    this.eft = eft;
  }


  public AuthGetNumbers international(List<NumbersInternational> international) {
    
    this.international = international;
    return this;
  }

  public AuthGetNumbers addInternationalItem(NumbersInternational internationalItem) {
    this.international.add(internationalItem);
    return this;
  }

   /**
   * An array of IBAN numbers identifying accounts.
   * @return international
  **/
  @ApiModelProperty(required = true, value = "An array of IBAN numbers identifying accounts.")

  public List<NumbersInternational> getInternational() {
    return international;
  }


  public void setInternational(List<NumbersInternational> international) {
    this.international = international;
  }


  public AuthGetNumbers bacs(List<NumbersBACS> bacs) {
    
    this.bacs = bacs;
    return this;
  }

  public AuthGetNumbers addBacsItem(NumbersBACS bacsItem) {
    this.bacs.add(bacsItem);
    return this;
  }

   /**
   * An array of BACS numbers identifying accounts.
   * @return bacs
  **/
  @ApiModelProperty(required = true, value = "An array of BACS numbers identifying accounts.")

  public List<NumbersBACS> getBacs() {
    return bacs;
  }


  public void setBacs(List<NumbersBACS> bacs) {
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
    AuthGetNumbers authGetNumbers = (AuthGetNumbers) o;
    return Objects.equals(this.ach, authGetNumbers.ach) &&
        Objects.equals(this.eft, authGetNumbers.eft) &&
        Objects.equals(this.international, authGetNumbers.international) &&
        Objects.equals(this.bacs, authGetNumbers.bacs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ach, eft, international, bacs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthGetNumbers {\n");
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

