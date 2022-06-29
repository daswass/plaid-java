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
import java.net.URI;

/**
 * Search terms for editing an entity watchlist screening
 */
@ApiModel(description = "Search terms for editing an entity watchlist screening")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T22:27:17.580916Z[Etc/UTC]")
public class UpdateEntityScreeningRequestSearchTerms {
  public static final String SERIALIZED_NAME_ENTITY_WATCHLIST_PROGRAM_ID = "entity_watchlist_program_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_WATCHLIST_PROGRAM_ID)
  private String entityWatchlistProgramId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "document_number";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;


  public UpdateEntityScreeningRequestSearchTerms entityWatchlistProgramId(String entityWatchlistProgramId) {
    
    this.entityWatchlistProgramId = entityWatchlistProgramId;
    return this;
  }

   /**
   * ID of the associated entity program.
   * @return entityWatchlistProgramId
  **/
  @ApiModelProperty(example = "entprg_2eRPsDnL66rZ7H", required = true, value = "ID of the associated entity program.")

  public String getEntityWatchlistProgramId() {
    return entityWatchlistProgramId;
  }


  public void setEntityWatchlistProgramId(String entityWatchlistProgramId) {
    this.entityWatchlistProgramId = entityWatchlistProgramId;
  }


  public UpdateEntityScreeningRequestSearchTerms legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Get legalName
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public UpdateEntityScreeningRequestSearchTerms documentNumber(String documentNumber) {
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Get documentNumber
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDocumentNumber() {
    return documentNumber;
  }


  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public UpdateEntityScreeningRequestSearchTerms emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public UpdateEntityScreeningRequestSearchTerms country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public UpdateEntityScreeningRequestSearchTerms phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public UpdateEntityScreeningRequestSearchTerms url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public UpdateEntityScreeningRequestSearchTerms clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public UpdateEntityScreeningRequestSearchTerms secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEntityScreeningRequestSearchTerms updateEntityScreeningRequestSearchTerms = (UpdateEntityScreeningRequestSearchTerms) o;
    return Objects.equals(this.entityWatchlistProgramId, updateEntityScreeningRequestSearchTerms.entityWatchlistProgramId) &&
        Objects.equals(this.legalName, updateEntityScreeningRequestSearchTerms.legalName) &&
        Objects.equals(this.documentNumber, updateEntityScreeningRequestSearchTerms.documentNumber) &&
        Objects.equals(this.emailAddress, updateEntityScreeningRequestSearchTerms.emailAddress) &&
        Objects.equals(this.country, updateEntityScreeningRequestSearchTerms.country) &&
        Objects.equals(this.phoneNumber, updateEntityScreeningRequestSearchTerms.phoneNumber) &&
        Objects.equals(this.url, updateEntityScreeningRequestSearchTerms.url) &&
        Objects.equals(this.clientId, updateEntityScreeningRequestSearchTerms.clientId) &&
        Objects.equals(this.secret, updateEntityScreeningRequestSearchTerms.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityWatchlistProgramId, legalName, documentNumber, emailAddress, country, phoneNumber, url, clientId, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEntityScreeningRequestSearchTerms {\n");
    sb.append("    entityWatchlistProgramId: ").append(toIndentedString(entityWatchlistProgramId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

