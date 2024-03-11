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
import com.plaid.client.model.WatchlistScreeningDocumentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An official document, usually issued by a governing body or institution, with an associated identifier.
 */
@ApiModel(description = "An official document, usually issued by a governing body or institution, with an associated identifier.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class WatchlistScreeningDocument {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private WatchlistScreeningDocumentType type;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;


  public WatchlistScreeningDocument type(WatchlistScreeningDocumentType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public WatchlistScreeningDocumentType getType() {
    return type;
  }


  public void setType(WatchlistScreeningDocumentType type) {
    this.type = type;
  }


  public WatchlistScreeningDocument number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The numeric or alphanumeric identifier associated with this document.
   * @return number
  **/
  @ApiModelProperty(example = "C31195855", required = true, value = "The numeric or alphanumeric identifier associated with this document.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningDocument watchlistScreeningDocument = (WatchlistScreeningDocument) o;
    return Objects.equals(this.type, watchlistScreeningDocument.type) &&
        Objects.equals(this.number, watchlistScreeningDocument.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningDocument {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

