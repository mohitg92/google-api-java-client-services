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

package com.google.api.services.container.model;

/**
 * GetJSONWebKeysResponse is a valid JSON Web Key Set as specififed in rfc 7517
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetJSONWebKeysResponse extends com.google.api.client.json.GenericJson {

  /**
   * The public component of the keys used by the cluster to sign token requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Jwk> keys;

  /**
   * The public component of the keys used by the cluster to sign token requests.
   * @return value or {@code null} for none
   */
  public java.util.List<Jwk> getKeys() {
    return keys;
  }

  /**
   * The public component of the keys used by the cluster to sign token requests.
   * @param keys keys or {@code null} for none
   */
  public GetJSONWebKeysResponse setKeys(java.util.List<Jwk> keys) {
    this.keys = keys;
    return this;
  }

  @Override
  public GetJSONWebKeysResponse set(String fieldName, Object value) {
    return (GetJSONWebKeysResponse) super.set(fieldName, value);
  }

  @Override
  public GetJSONWebKeysResponse clone() {
    return (GetJSONWebKeysResponse) super.clone();
  }

}