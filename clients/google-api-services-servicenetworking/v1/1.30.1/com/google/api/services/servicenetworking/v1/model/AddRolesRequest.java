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

package com.google.api.services.servicenetworking.v1.model;

/**
 * Request for AddRoles to allow Service Producers to add roles in the shared VPC host project for
 * them to use.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AddRolesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The network that the consumer is using to connect with services. Must be in the form
   * of projects/{project}/global/networks/{network} {project} is a project number, as in '12345'
   * {network} is a network name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerNetwork;

  /**
   * Required. List of policy bindings to add to shared VPC host project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PolicyBinding> policyBinding;

  /**
   * Required. The network that the consumer is using to connect with services. Must be in the form
   * of projects/{project}/global/networks/{network} {project} is a project number, as in '12345'
   * {network} is a network name.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerNetwork() {
    return consumerNetwork;
  }

  /**
   * Required. The network that the consumer is using to connect with services. Must be in the form
   * of projects/{project}/global/networks/{network} {project} is a project number, as in '12345'
   * {network} is a network name.
   * @param consumerNetwork consumerNetwork or {@code null} for none
   */
  public AddRolesRequest setConsumerNetwork(java.lang.String consumerNetwork) {
    this.consumerNetwork = consumerNetwork;
    return this;
  }

  /**
   * Required. List of policy bindings to add to shared VPC host project.
   * @return value or {@code null} for none
   */
  public java.util.List<PolicyBinding> getPolicyBinding() {
    return policyBinding;
  }

  /**
   * Required. List of policy bindings to add to shared VPC host project.
   * @param policyBinding policyBinding or {@code null} for none
   */
  public AddRolesRequest setPolicyBinding(java.util.List<PolicyBinding> policyBinding) {
    this.policyBinding = policyBinding;
    return this;
  }

  @Override
  public AddRolesRequest set(String fieldName, Object value) {
    return (AddRolesRequest) super.set(fieldName, value);
  }

  @Override
  public AddRolesRequest clone() {
    return (AddRolesRequest) super.clone();
  }

}
