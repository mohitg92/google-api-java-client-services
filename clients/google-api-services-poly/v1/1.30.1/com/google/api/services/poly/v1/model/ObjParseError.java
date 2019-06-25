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

package com.google.api.services.poly.v1.model;

/**
 * Details of an error resulting from parsing an OBJ file
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Poly API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ObjParseError extends com.google.api.client.json.GenericJson {

  /**
   * The type of problem found (required).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * The ending character index at which the problem was found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer endIndex;

  /**
   * The file path in which the problem was found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filePath;

  /**
   * The text of the line. Note that this may be truncated if the line was very long. This may not
   * include the error if it occurs after line truncation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String line;

  /**
   * Line number at which the problem was found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer lineNumber;

  /**
   * The starting character index at which the problem was found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startIndex;

  /**
   * The type of problem found (required).
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * The type of problem found (required).
   * @param code code or {@code null} for none
   */
  public ObjParseError setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * The ending character index at which the problem was found.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEndIndex() {
    return endIndex;
  }

  /**
   * The ending character index at which the problem was found.
   * @param endIndex endIndex or {@code null} for none
   */
  public ObjParseError setEndIndex(java.lang.Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * The file path in which the problem was found.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilePath() {
    return filePath;
  }

  /**
   * The file path in which the problem was found.
   * @param filePath filePath or {@code null} for none
   */
  public ObjParseError setFilePath(java.lang.String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * The text of the line. Note that this may be truncated if the line was very long. This may not
   * include the error if it occurs after line truncation.
   * @return value or {@code null} for none
   */
  public java.lang.String getLine() {
    return line;
  }

  /**
   * The text of the line. Note that this may be truncated if the line was very long. This may not
   * include the error if it occurs after line truncation.
   * @param line line or {@code null} for none
   */
  public ObjParseError setLine(java.lang.String line) {
    this.line = line;
    return this;
  }

  /**
   * Line number at which the problem was found.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLineNumber() {
    return lineNumber;
  }

  /**
   * Line number at which the problem was found.
   * @param lineNumber lineNumber or {@code null} for none
   */
  public ObjParseError setLineNumber(java.lang.Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * The starting character index at which the problem was found.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartIndex() {
    return startIndex;
  }

  /**
   * The starting character index at which the problem was found.
   * @param startIndex startIndex or {@code null} for none
   */
  public ObjParseError setStartIndex(java.lang.Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  @Override
  public ObjParseError set(String fieldName, Object value) {
    return (ObjParseError) super.set(fieldName, value);
  }

  @Override
  public ObjParseError clone() {
    return (ObjParseError) super.clone();
  }

}