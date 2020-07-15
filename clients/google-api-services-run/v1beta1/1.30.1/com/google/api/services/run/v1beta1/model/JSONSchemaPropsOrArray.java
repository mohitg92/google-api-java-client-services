/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.run.v1beta1.model;

/**
 * JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of
 * JSONSchemaProps. Mainly here for serialization purposes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JSONSchemaPropsOrArray extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JSONSchemaProps> jsonSchemas;

  static {
    // hack to force ProGuard to consider JSONSchemaProps used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(JSONSchemaProps.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JSONSchemaProps schema;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<JSONSchemaProps> getJsonSchemas() {
    return jsonSchemas;
  }

  /**
   * @param jsonSchemas jsonSchemas or {@code null} for none
   */
  public JSONSchemaPropsOrArray setJsonSchemas(java.util.List<JSONSchemaProps> jsonSchemas) {
    this.jsonSchemas = jsonSchemas;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JSONSchemaProps getSchema() {
    return schema;
  }

  /**
   * @param schema schema or {@code null} for none
   */
  public JSONSchemaPropsOrArray setSchema(JSONSchemaProps schema) {
    this.schema = schema;
    return this;
  }

  @Override
  public JSONSchemaPropsOrArray set(String fieldName, Object value) {
    return (JSONSchemaPropsOrArray) super.set(fieldName, value);
  }

  @Override
  public JSONSchemaPropsOrArray clone() {
    return (JSONSchemaPropsOrArray) super.clone();
  }

}
