/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.131.3
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
import com.plaid.client.model.InvestmentAccountSubtype;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A filter to apply to &#x60;investment&#x60;-type accounts (or &#x60;brokerage&#x60;-type accounts for API versions 2018-05-22 and earlier).
 */
@ApiModel(description = "A filter to apply to `investment`-type accounts (or `brokerage`-type accounts for API versions 2018-05-22 and earlier).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T22:27:17.580916Z[Etc/UTC]")
public class LinkTokenCreateInvestmentFilter {
  public static final String SERIALIZED_NAME_ACCOUNT_SUBTYPES = "account_subtypes";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUBTYPES)
  private List<InvestmentAccountSubtype> accountSubtypes = null;


  public LinkTokenCreateInvestmentFilter accountSubtypes(List<InvestmentAccountSubtype> accountSubtypes) {
    
    this.accountSubtypes = accountSubtypes;
    return this;
  }

  public LinkTokenCreateInvestmentFilter addAccountSubtypesItem(InvestmentAccountSubtype accountSubtypesItem) {
    if (this.accountSubtypes == null) {
      this.accountSubtypes = new ArrayList<>();
    }
    this.accountSubtypes.add(accountSubtypesItem);
    return this;
  }

   /**
   * An array of account subtypes to display in Link. If not specified, all account subtypes will be shown. For a full list of valid types and subtypes, see the [Account schema](https://plaid.com/docs/api/accounts#account-type-schema). 
   * @return accountSubtypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of account subtypes to display in Link. If not specified, all account subtypes will be shown. For a full list of valid types and subtypes, see the [Account schema](https://plaid.com/docs/api/accounts#account-type-schema). ")

  public List<InvestmentAccountSubtype> getAccountSubtypes() {
    return accountSubtypes;
  }


  public void setAccountSubtypes(List<InvestmentAccountSubtype> accountSubtypes) {
    this.accountSubtypes = accountSubtypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateInvestmentFilter linkTokenCreateInvestmentFilter = (LinkTokenCreateInvestmentFilter) o;
    return Objects.equals(this.accountSubtypes, linkTokenCreateInvestmentFilter.accountSubtypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSubtypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateInvestmentFilter {\n");
    sb.append("    accountSubtypes: ").append(toIndentedString(accountSubtypes)).append("\n");
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

