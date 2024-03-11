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
import com.plaid.client.model.BeaconAuditTrail;
import com.plaid.client.model.BeaconUserData;
import com.plaid.client.model.BeaconUserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A Beacon User represents an end user that has been scanned against the Beacon Network.
 */
@ApiModel(description = "A Beacon User represents an end user that has been scanned against the Beacon Network.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:45:40.635640Z[Etc/UTC]")
public class BeaconUserUpdateResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private java.sql.Timestamp createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BeaconUserStatus status;

  public static final String SERIALIZED_NAME_PROGRAM_ID = "program_id";
  @SerializedName(SERIALIZED_NAME_PROGRAM_ID)
  private String programId;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private BeaconUserData user;

  public static final String SERIALIZED_NAME_AUDIT_TRAIL = "audit_trail";
  @SerializedName(SERIALIZED_NAME_AUDIT_TRAIL)
  private BeaconAuditTrail auditTrail;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public BeaconUserUpdateResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated Beacon User.
   * @return id
  **/
  @ApiModelProperty(example = "becusr_42cF1MNo42r9Xj", required = true, value = "ID of the associated Beacon User.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BeaconUserUpdateResponse version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The &#x60;version&#x60; field begins with 1 and increments each time the user is updated.
   * @return version
  **/
  @ApiModelProperty(example = "1", required = true, value = "The `version` field begins with 1 and increments each time the user is updated.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public BeaconUserUpdateResponse createdAt(java.sql.Timestamp createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public BeaconUserUpdateResponse updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp. This field indicates the last time the resource was modified.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp. This field indicates the last time the resource was modified.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public BeaconUserUpdateResponse status(BeaconUserStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconUserStatus getStatus() {
    return status;
  }


  public void setStatus(BeaconUserStatus status) {
    this.status = status;
  }


  public BeaconUserUpdateResponse programId(String programId) {
    
    this.programId = programId;
    return this;
  }

   /**
   * ID of the associated Beacon Program.
   * @return programId
  **/
  @ApiModelProperty(example = "becprg_11111111111111", required = true, value = "ID of the associated Beacon Program.")

  public String getProgramId() {
    return programId;
  }


  public void setProgramId(String programId) {
    this.programId = programId;
  }


  public BeaconUserUpdateResponse clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the &#x60;/link/token/create&#x60; &#x60;client_user_id&#x60; to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;client_user_id&#x60;.
   * @return clientUserId
  **/
  @ApiModelProperty(example = "your-db-id-3b24110", required = true, value = "A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the `/link/token/create` `client_user_id` to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public BeaconUserUpdateResponse user(BeaconUserData user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconUserData getUser() {
    return user;
  }


  public void setUser(BeaconUserData user) {
    this.user = user;
  }


  public BeaconUserUpdateResponse auditTrail(BeaconAuditTrail auditTrail) {
    
    this.auditTrail = auditTrail;
    return this;
  }

   /**
   * Get auditTrail
   * @return auditTrail
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconAuditTrail getAuditTrail() {
    return auditTrail;
  }


  public void setAuditTrail(BeaconAuditTrail auditTrail) {
    this.auditTrail = auditTrail;
  }


  public BeaconUserUpdateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconUserUpdateResponse beaconUserUpdateResponse = (BeaconUserUpdateResponse) o;
    return Objects.equals(this.id, beaconUserUpdateResponse.id) &&
        Objects.equals(this.version, beaconUserUpdateResponse.version) &&
        Objects.equals(this.createdAt, beaconUserUpdateResponse.createdAt) &&
        Objects.equals(this.updatedAt, beaconUserUpdateResponse.updatedAt) &&
        Objects.equals(this.status, beaconUserUpdateResponse.status) &&
        Objects.equals(this.programId, beaconUserUpdateResponse.programId) &&
        Objects.equals(this.clientUserId, beaconUserUpdateResponse.clientUserId) &&
        Objects.equals(this.user, beaconUserUpdateResponse.user) &&
        Objects.equals(this.auditTrail, beaconUserUpdateResponse.auditTrail) &&
        Objects.equals(this.requestId, beaconUserUpdateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, createdAt, updatedAt, status, programId, clientUserId, user, auditTrail, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconUserUpdateResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    auditTrail: ").append(toIndentedString(auditTrail)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

