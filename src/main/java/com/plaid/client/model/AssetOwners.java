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
import com.plaid.client.model.AssetOwner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class AssetOwners {
  public static final String SERIALIZED_NAME_A_S_S_E_T_O_W_N_E_R = "ASSET_OWNER";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_O_W_N_E_R)
  private List<AssetOwner> ASSET_OWNER = new ArrayList<>();


  public AssetOwners ASSET_OWNER(List<AssetOwner> ASSET_OWNER) {
    
    this.ASSET_OWNER = ASSET_OWNER;
    return this;
  }

  public AssetOwners addASSETOWNERItem(AssetOwner ASSET_OWNERItem) {
    this.ASSET_OWNER.add(ASSET_OWNERItem);
    return this;
  }

   /**
   * Multiple Occurances of Account Owners Full Name up to 4.
   * @return ASSET_OWNER
  **/
  @ApiModelProperty(required = true, value = "Multiple Occurances of Account Owners Full Name up to 4.")

  public List<AssetOwner> getASSETOWNER() {
    return ASSET_OWNER;
  }


  public void setASSETOWNER(List<AssetOwner> ASSET_OWNER) {
    this.ASSET_OWNER = ASSET_OWNER;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetOwners assetOwners = (AssetOwners) o;
    return Objects.equals(this.ASSET_OWNER, assetOwners.ASSET_OWNER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSET_OWNER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetOwners {\n");
    sb.append("    ASSET_OWNER: ").append(toIndentedString(ASSET_OWNER)).append("\n");
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

