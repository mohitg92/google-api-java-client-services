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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * PredictionResult represents the recommendation prediction results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult extends com.google.api.client.json.GenericJson {

  /**
   * ID of the recommended catalog item
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Additional item metadata / annotations.
   *
   * Possible values:
   *
   * * `catalogItem`: JSON representation of the catalogItem. Will be set if   `returnCatalogItem`
   * is set to true in `PredictRequest.params`. * `score`: Prediction score in double value. Will be
   * set if   `returnItemScore` is set to true in `PredictRequest.params`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> itemMetadata;

  /**
   * ID of the recommended catalog item
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * ID of the recommended catalog item
   * @param id id or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Additional item metadata / annotations.
   *
   * Possible values:
   *
   * * `catalogItem`: JSON representation of the catalogItem. Will be set if   `returnCatalogItem`
   * is set to true in `PredictRequest.params`. * `score`: Prediction score in double value. Will be
   * set if   `returnItemScore` is set to true in `PredictRequest.params`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getItemMetadata() {
    return itemMetadata;
  }

  /**
   * Additional item metadata / annotations.
   *
   * Possible values:
   *
   * * `catalogItem`: JSON representation of the catalogItem. Will be set if   `returnCatalogItem`
   * is set to true in `PredictRequest.params`. * `score`: Prediction score in double value. Will be
   * set if   `returnItemScore` is set to true in `PredictRequest.params`.
   * @param itemMetadata itemMetadata or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult setItemMetadata(java.util.Map<String, java.lang.Object> itemMetadata) {
    this.itemMetadata = itemMetadata;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult clone() {
    return (GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult) super.clone();
  }

}
