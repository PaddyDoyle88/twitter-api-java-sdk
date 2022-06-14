/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * Get2TweetsCountsAllResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Get2TweetsCountsAllResponseMeta {
  public static final String SERIALIZED_NAME_NEWEST_ID = "newest_id";
  @SerializedName(SERIALIZED_NAME_NEWEST_ID)
  private String newestId;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "next_token";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_OLDEST_ID = "oldest_id";
  @SerializedName(SERIALIZED_NAME_OLDEST_ID)
  private String oldestId;

  public static final String SERIALIZED_NAME_TOTAL_TWEET_COUNT = "total_tweet_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_TWEET_COUNT)
  private Integer totalTweetCount;

  public Get2TweetsCountsAllResponseMeta() { 
  }

  public Get2TweetsCountsAllResponseMeta newestId(String newestId) {
    
    this.newestId = newestId;
    return this;
  }

   /**
   * The newest id in this response.
   * @return newestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The newest id in this response.")

  public String getNewestId() {
    return newestId;
  }


  public void setNewestId(String newestId) {
    this.newestId = newestId;
  }


  public Get2TweetsCountsAllResponseMeta nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * The next token.
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The next token.")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public Get2TweetsCountsAllResponseMeta oldestId(String oldestId) {
    
    this.oldestId = oldestId;
    return this;
  }

   /**
   * The oldest id in this response.
   * @return oldestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The oldest id in this response.")

  public String getOldestId() {
    return oldestId;
  }


  public void setOldestId(String oldestId) {
    this.oldestId = oldestId;
  }


  public Get2TweetsCountsAllResponseMeta totalTweetCount(Integer totalTweetCount) {
    
    this.totalTweetCount = totalTweetCount;
    return this;
  }

   /**
   * The sum of results returned in this response.
   * @return totalTweetCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sum of results returned in this response.")

  public Integer getTotalTweetCount() {
    return totalTweetCount;
  }


  public void setTotalTweetCount(Integer totalTweetCount) {
    this.totalTweetCount = totalTweetCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Get2TweetsCountsAllResponseMeta get2TweetsCountsAllResponseMeta = (Get2TweetsCountsAllResponseMeta) o;
    return Objects.equals(this.newestId, get2TweetsCountsAllResponseMeta.newestId) &&
        Objects.equals(this.nextToken, get2TweetsCountsAllResponseMeta.nextToken) &&
        Objects.equals(this.oldestId, get2TweetsCountsAllResponseMeta.oldestId) &&
        Objects.equals(this.totalTweetCount, get2TweetsCountsAllResponseMeta.totalTweetCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newestId, nextToken, oldestId, totalTweetCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get2TweetsCountsAllResponseMeta {\n");
    sb.append("    newestId: ").append(toIndentedString(newestId)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    oldestId: ").append(toIndentedString(oldestId)).append("\n");
    sb.append("    totalTweetCount: ").append(toIndentedString(totalTweetCount)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("newest_id");
    openapiFields.add("next_token");
    openapiFields.add("oldest_id");
    openapiFields.add("total_tweet_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Get2TweetsCountsAllResponseMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (Get2TweetsCountsAllResponseMeta.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in Get2TweetsCountsAllResponseMeta is not found in the empty JSON string", Get2TweetsCountsAllResponseMeta.openapiRequiredFields.toString()));
     //   }
     // }

      if (jsonObj.get("newest_id") != null && !jsonObj.get("newest_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newest_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newest_id").toString()));
      }
      if (jsonObj.get("next_token") != null && !jsonObj.get("next_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_token").toString()));
      }
      if (jsonObj.get("oldest_id") != null && !jsonObj.get("oldest_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldest_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldest_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Get2TweetsCountsAllResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Get2TweetsCountsAllResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Get2TweetsCountsAllResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Get2TweetsCountsAllResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<Get2TweetsCountsAllResponseMeta>() {
           @Override
           public void write(JsonWriter out, Get2TweetsCountsAllResponseMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Get2TweetsCountsAllResponseMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Get2TweetsCountsAllResponseMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Get2TweetsCountsAllResponseMeta
  * @throws IOException if the JSON string is invalid with respect to Get2TweetsCountsAllResponseMeta
  */
  public static Get2TweetsCountsAllResponseMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Get2TweetsCountsAllResponseMeta.class);
  }

 /**
  * Convert an instance of Get2TweetsCountsAllResponseMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

