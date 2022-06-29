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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specifies options for initializing Link for [update mode](https://plaid.com/docs/link/update-mode).
 */
@ApiModel(description = "Specifies options for initializing Link for [update mode](https://plaid.com/docs/link/update-mode).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T22:27:17.580916Z[Etc/UTC]")
public class LinkTokenCreateRequestUpdate {
  public static final String SERIALIZED_NAME_ACCOUNT_SELECTION_ENABLED = "account_selection_enabled";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SELECTION_ENABLED)
  private Boolean accountSelectionEnabled = false;


  public LinkTokenCreateRequestUpdate accountSelectionEnabled(Boolean accountSelectionEnabled) {
    
    this.accountSelectionEnabled = accountSelectionEnabled;
    return this;
  }

   /**
   * If &#x60;true&#x60;, enables [update mode with Account Select](https://plaid.com/docs/link/update-mode/#using-update-mode-to-request-new-accounts).
   * @return accountSelectionEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, enables [update mode with Account Select](https://plaid.com/docs/link/update-mode/#using-update-mode-to-request-new-accounts).")

  public Boolean getAccountSelectionEnabled() {
    return accountSelectionEnabled;
  }


  public void setAccountSelectionEnabled(Boolean accountSelectionEnabled) {
    this.accountSelectionEnabled = accountSelectionEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestUpdate linkTokenCreateRequestUpdate = (LinkTokenCreateRequestUpdate) o;
    return Objects.equals(this.accountSelectionEnabled, linkTokenCreateRequestUpdate.accountSelectionEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSelectionEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestUpdate {\n");
    sb.append("    accountSelectionEnabled: ").append(toIndentedString(accountSelectionEnabled)).append("\n");
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

