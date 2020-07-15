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

package com.google.api.services.run.v1alpha1.model;

/**
 * Lifecycle describes actions that the management system should take in response to container
 * lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container
 * blocks until the action is complete, unless the container process fails, in which case the
 * handler is aborted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Lifecycle extends com.google.api.client.json.GenericJson {

  /**
   * PostStart is called immediately after a container is created. If the handler fails, the
   * container is terminated and restarted according to its restart policy. Other management of the
   * container blocks until the hook completes. More info:
   * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
   * +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Handler postStart;

  /**
   * PreStop is called immediately before a container is terminated. The container is terminated
   * after the handler completes. The reason for termination is passed to the handler. Regardless of
   * the outcome of the handler, the container is eventually terminated. Other management of the
   * container blocks until the hook completes. More info:
   * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
   * +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Handler preStop;

  /**
   * PostStart is called immediately after a container is created. If the handler fails, the
   * container is terminated and restarted according to its restart policy. Other management of the
   * container blocks until the hook completes. More info:
   * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
   * +optional
   * @return value or {@code null} for none
   */
  public Handler getPostStart() {
    return postStart;
  }

  /**
   * PostStart is called immediately after a container is created. If the handler fails, the
   * container is terminated and restarted according to its restart policy. Other management of the
   * container blocks until the hook completes. More info:
   * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
   * +optional
   * @param postStart postStart or {@code null} for none
   */
  public Lifecycle setPostStart(Handler postStart) {
    this.postStart = postStart;
    return this;
  }

  /**
   * PreStop is called immediately before a container is terminated. The container is terminated
   * after the handler completes. The reason for termination is passed to the handler. Regardless of
   * the outcome of the handler, the container is eventually terminated. Other management of the
   * container blocks until the hook completes. More info:
   * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
   * +optional
   * @return value or {@code null} for none
   */
  public Handler getPreStop() {
    return preStop;
  }

  /**
   * PreStop is called immediately before a container is terminated. The container is terminated
   * after the handler completes. The reason for termination is passed to the handler. Regardless of
   * the outcome of the handler, the container is eventually terminated. Other management of the
   * container blocks until the hook completes. More info:
   * https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
   * +optional
   * @param preStop preStop or {@code null} for none
   */
  public Lifecycle setPreStop(Handler preStop) {
    this.preStop = preStop;
    return this;
  }

  @Override
  public Lifecycle set(String fieldName, Object value) {
    return (Lifecycle) super.set(fieldName, value);
  }

  @Override
  public Lifecycle clone() {
    return (Lifecycle) super.clone();
  }

}
