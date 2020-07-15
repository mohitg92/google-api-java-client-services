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

package com.google.api.services.gmail.model;

/**
 * A single MIME message part.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagePart extends com.google.api.client.json.GenericJson {

  /**
   * The message part body for this part, which may be empty for container MIME message parts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MessagePartBody body;

  /**
   * The filename of the attachment. Only present if this message part represents an attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filename;

  /**
   * List of headers on this message part. For the top-level message part, representing the entire
   * message payload, it will contain the standard RFC 2822 email headers such as `To`, `From`, and
   * `Subject`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MessagePartHeader> headers;

  /**
   * The MIME type of the message part.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * The immutable ID of the message part.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partId;

  /**
   * The child MIME message parts of this part. This only applies to container MIME message parts,
   * for example `multipart`. For non- container MIME message part types, such as `text/plain`, this
   * field is empty. For more information, see RFC 1521.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MessagePart> parts;

  /**
   * The message part body for this part, which may be empty for container MIME message parts.
   * @return value or {@code null} for none
   */
  public MessagePartBody getBody() {
    return body;
  }

  /**
   * The message part body for this part, which may be empty for container MIME message parts.
   * @param body body or {@code null} for none
   */
  public MessagePart setBody(MessagePartBody body) {
    this.body = body;
    return this;
  }

  /**
   * The filename of the attachment. Only present if this message part represents an attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilename() {
    return filename;
  }

  /**
   * The filename of the attachment. Only present if this message part represents an attachment.
   * @param filename filename or {@code null} for none
   */
  public MessagePart setFilename(java.lang.String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * List of headers on this message part. For the top-level message part, representing the entire
   * message payload, it will contain the standard RFC 2822 email headers such as `To`, `From`, and
   * `Subject`.
   * @return value or {@code null} for none
   */
  public java.util.List<MessagePartHeader> getHeaders() {
    return headers;
  }

  /**
   * List of headers on this message part. For the top-level message part, representing the entire
   * message payload, it will contain the standard RFC 2822 email headers such as `To`, `From`, and
   * `Subject`.
   * @param headers headers or {@code null} for none
   */
  public MessagePart setHeaders(java.util.List<MessagePartHeader> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * The MIME type of the message part.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * The MIME type of the message part.
   * @param mimeType mimeType or {@code null} for none
   */
  public MessagePart setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The immutable ID of the message part.
   * @return value or {@code null} for none
   */
  public java.lang.String getPartId() {
    return partId;
  }

  /**
   * The immutable ID of the message part.
   * @param partId partId or {@code null} for none
   */
  public MessagePart setPartId(java.lang.String partId) {
    this.partId = partId;
    return this;
  }

  /**
   * The child MIME message parts of this part. This only applies to container MIME message parts,
   * for example `multipart`. For non- container MIME message part types, such as `text/plain`, this
   * field is empty. For more information, see RFC 1521.
   * @return value or {@code null} for none
   */
  public java.util.List<MessagePart> getParts() {
    return parts;
  }

  /**
   * The child MIME message parts of this part. This only applies to container MIME message parts,
   * for example `multipart`. For non- container MIME message part types, such as `text/plain`, this
   * field is empty. For more information, see RFC 1521.
   * @param parts parts or {@code null} for none
   */
  public MessagePart setParts(java.util.List<MessagePart> parts) {
    this.parts = parts;
    return this;
  }

  @Override
  public MessagePart set(String fieldName, Object value) {
    return (MessagePart) super.set(fieldName, value);
  }

  @Override
  public MessagePart clone() {
    return (MessagePart) super.clone();
  }

}
