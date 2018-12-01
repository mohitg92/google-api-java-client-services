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

package com.google.api.services.speech.v1.model;

/**
 * Word-specific information for recognized words.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WordInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time offset relative to the beginning of the audio, and corresponding to the end
   * of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the
   * top hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. Time offset relative to the beginning of the audio, and corresponding to the start
   * of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the
   * top hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. The word corresponding to this set of information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String word;

  /**
   * Output only. Time offset relative to the beginning of the audio, and corresponding to the end
   * of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the
   * top hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. Time offset relative to the beginning of the audio, and corresponding to the end
   * of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the
   * top hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * @param endTime endTime or {@code null} for none
   */
  public WordInfo setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. Time offset relative to the beginning of the audio, and corresponding to the start
   * of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the
   * top hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. Time offset relative to the beginning of the audio, and corresponding to the start
   * of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the
   * top hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * @param startTime startTime or {@code null} for none
   */
  public WordInfo setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. The word corresponding to this set of information.
   * @return value or {@code null} for none
   */
  public java.lang.String getWord() {
    return word;
  }

  /**
   * Output only. The word corresponding to this set of information.
   * @param word word or {@code null} for none
   */
  public WordInfo setWord(java.lang.String word) {
    this.word = word;
    return this;
  }

  @Override
  public WordInfo set(String fieldName, Object value) {
    return (WordInfo) super.set(fieldName, value);
  }

  @Override
  public WordInfo clone() {
    return (WordInfo) super.clone();
  }

}
