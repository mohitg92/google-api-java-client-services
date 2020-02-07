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

package com.google.api.services.osconfig.v1beta.model;

/**
 * A software recipe is a set of instructions for installing and configuring a piece of software. It
 * consists of a set of artifacts that are downloaded, and a set of steps that install, configure,
 * and/or update the software.
 *
 * Recipes support installing and updating software from artifacts in the following formats: Zip
 * archive, Tar archive, Windows MSI, Debian package, and RPM package.
 *
 * Additionally, recipes support executing a script (either defined in a file or directly in this
 * api) in bash, sh, cmd, and powershell.
 *
 * Updating a software recipe
 *
 * If a recipe is assigned to an instance and there is a recipe with the same name but a lower
 * version already installed and the assigned state of the recipe is `INSTALLED_KEEP_UPDATED`, then
 * the recipe is updated to the new version.
 *
 * Script Working Directories
 *
 * Each script or execution step is run in its own temporary directory which is deleted after
 * completing the step.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SoftwareRecipe extends com.google.api.client.json.GenericJson {

  /**
   * Resources available to be used in the steps in the recipe.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SoftwareRecipeArtifact> artifacts;

  /**
   * Default is INSTALLED. The desired state the agent should maintain for this recipe.
   *
   * INSTALLED: The software recipe is installed on the instance but            won't be updated to
   * new versions. INSTALLED_KEEP_UPDATED: The software recipe is installed on the
   * instance. The recipe is updated to a higher                         version, if a higher
   * version of the recipe is                         assigned to this instance. REMOVE: Remove is
   * unsupported for software recipes and attempts to         create or update a recipe to the
   * REMOVE state is rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String desiredState;

  /**
   * Actions to be taken for installing this recipe. On failure it stops executing steps and does
   * not attempt another installation. Any steps taken (including partially completed steps) are not
   * rolled back.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SoftwareRecipeStep> installSteps;

  /**
   * Required. Unique identifier for the recipe. Only one recipe with a given name is installed on
   * an instance.
   *
   * Names are also used to identify resources which helps to determine whether guest policies have
   * conflicts. This means that requests to create multiple recipes with the same name and version
   * are rejected since they could potentially have conflicting assignments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Actions to be taken for updating this recipe. On failure it stops executing steps and  does not
   * attempt another update for this recipe. Any steps taken (including partially completed steps)
   * are not rolled back.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SoftwareRecipeStep> updateSteps;

  /**
   * The version of this software recipe. Version can be up to 4 period separated numbers (e.g.
   * 12.34.56.78).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Resources available to be used in the steps in the recipe.
   * @return value or {@code null} for none
   */
  public java.util.List<SoftwareRecipeArtifact> getArtifacts() {
    return artifacts;
  }

  /**
   * Resources available to be used in the steps in the recipe.
   * @param artifacts artifacts or {@code null} for none
   */
  public SoftwareRecipe setArtifacts(java.util.List<SoftwareRecipeArtifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  /**
   * Default is INSTALLED. The desired state the agent should maintain for this recipe.
   *
   * INSTALLED: The software recipe is installed on the instance but            won't be updated to
   * new versions. INSTALLED_KEEP_UPDATED: The software recipe is installed on the
   * instance. The recipe is updated to a higher                         version, if a higher
   * version of the recipe is                         assigned to this instance. REMOVE: Remove is
   * unsupported for software recipes and attempts to         create or update a recipe to the
   * REMOVE state is rejected.
   * @return value or {@code null} for none
   */
  public java.lang.String getDesiredState() {
    return desiredState;
  }

  /**
   * Default is INSTALLED. The desired state the agent should maintain for this recipe.
   *
   * INSTALLED: The software recipe is installed on the instance but            won't be updated to
   * new versions. INSTALLED_KEEP_UPDATED: The software recipe is installed on the
   * instance. The recipe is updated to a higher                         version, if a higher
   * version of the recipe is                         assigned to this instance. REMOVE: Remove is
   * unsupported for software recipes and attempts to         create or update a recipe to the
   * REMOVE state is rejected.
   * @param desiredState desiredState or {@code null} for none
   */
  public SoftwareRecipe setDesiredState(java.lang.String desiredState) {
    this.desiredState = desiredState;
    return this;
  }

  /**
   * Actions to be taken for installing this recipe. On failure it stops executing steps and does
   * not attempt another installation. Any steps taken (including partially completed steps) are not
   * rolled back.
   * @return value or {@code null} for none
   */
  public java.util.List<SoftwareRecipeStep> getInstallSteps() {
    return installSteps;
  }

  /**
   * Actions to be taken for installing this recipe. On failure it stops executing steps and does
   * not attempt another installation. Any steps taken (including partially completed steps) are not
   * rolled back.
   * @param installSteps installSteps or {@code null} for none
   */
  public SoftwareRecipe setInstallSteps(java.util.List<SoftwareRecipeStep> installSteps) {
    this.installSteps = installSteps;
    return this;
  }

  /**
   * Required. Unique identifier for the recipe. Only one recipe with a given name is installed on
   * an instance.
   *
   * Names are also used to identify resources which helps to determine whether guest policies have
   * conflicts. This means that requests to create multiple recipes with the same name and version
   * are rejected since they could potentially have conflicting assignments.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Unique identifier for the recipe. Only one recipe with a given name is installed on
   * an instance.
   *
   * Names are also used to identify resources which helps to determine whether guest policies have
   * conflicts. This means that requests to create multiple recipes with the same name and version
   * are rejected since they could potentially have conflicting assignments.
   * @param name name or {@code null} for none
   */
  public SoftwareRecipe setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Actions to be taken for updating this recipe. On failure it stops executing steps and  does not
   * attempt another update for this recipe. Any steps taken (including partially completed steps)
   * are not rolled back.
   * @return value or {@code null} for none
   */
  public java.util.List<SoftwareRecipeStep> getUpdateSteps() {
    return updateSteps;
  }

  /**
   * Actions to be taken for updating this recipe. On failure it stops executing steps and  does not
   * attempt another update for this recipe. Any steps taken (including partially completed steps)
   * are not rolled back.
   * @param updateSteps updateSteps or {@code null} for none
   */
  public SoftwareRecipe setUpdateSteps(java.util.List<SoftwareRecipeStep> updateSteps) {
    this.updateSteps = updateSteps;
    return this;
  }

  /**
   * The version of this software recipe. Version can be up to 4 period separated numbers (e.g.
   * 12.34.56.78).
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version of this software recipe. Version can be up to 4 period separated numbers (e.g.
   * 12.34.56.78).
   * @param version version or {@code null} for none
   */
  public SoftwareRecipe setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public SoftwareRecipe set(String fieldName, Object value) {
    return (SoftwareRecipe) super.set(fieldName, value);
  }

  @Override
  public SoftwareRecipe clone() {
    return (SoftwareRecipe) super.clone();
  }

}
