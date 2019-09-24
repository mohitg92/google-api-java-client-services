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

package com.google.api.services.securitycenter.v1.model;

/**
 * Request message for grouping by findings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GroupFindingsRequest extends com.google.api.client.json.GenericJson {

  /**
   * When compare_duration is set, the GroupResult's "state_change" attribute is updated to indicate
   * whether the finding had its state changed, the finding's state remained unchanged, or if the
   * finding was added during the compare_duration period of time that precedes the read_time. This
   * is the time between (read_time - compare_duration) and read_time.
   *
   * The state_change value is derived based on the presence and state of the finding at the two
   * points in time. Intermediate state changes between the two times don't affect the result. For
   * example, the results aren't affected if the finding is made inactive and then active again.
   *
   * Possible "state_change" values when compare_duration is specified:
   *
   * * "CHANGED":   indicates that the finding was present at the start of
   * compare_duration, but changed its state at read_time. * "UNCHANGED": indicates that the finding
   * was present at the start of                  compare_duration and did not change state at
   * read_time. * "ADDED":     indicates that the finding was not present at the start
   * of compare_duration, but was present at read_time.
   *
   * If compare_duration is not specified, then the only possible state_change is "UNUSED",  which
   * will be the state_change set for all findings present at read_time.
   *
   * If this field is set then `state_change` must be a specified field in `group_by`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String compareDuration;

  /**
   * Expression that defines the filter to apply across findings. The expression is a list of one or
   * more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and
   * `OR` has higher precedence than `AND`.
   *
   * Restrictions have the form `  ` and may have a `-` character in front of them to indicate
   * negation. Examples include:
   *
   *  * name  * source_properties.a_property  * security_marks.marks.marka
   *
   * The supported operators are:
   *
   * * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring
   * matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes. * integer literals without quotes. * boolean literals `true` and
   * `false` without quotes.
   *
   * The following field and operator combinations are supported:
   *
   * * name: `=` * parent: `=`, `:` * resource_name: `=`, `:` * state: `=`, `:` * category: `=`, `:`
   * * external_uri: `=`, `:` * event_time: `=`, `>`, `<`, `>=`, `<=`
   *
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.   Examples:
   * "event_time = \"2019-06-10T16:07:18-07:00\""     "event_time = 1560208038000"
   *
   * * security_marks.marks: `=`, `:` * source_properties: `=`, `:`, `>`, `<`, `>=`, `<=`
   *
   * For example, `source_properties.size = 100` is a valid filter string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Expression that defines what assets fields to use for grouping (including `state_change`). The
   * string value should follow SQL syntax: comma separated list of fields. For example:
   * "parent,resource_name".
   *
   * The following fields are supported:
   *
   * * resource_name * category * state * parent
   *
   * The following fields are supported when compare_duration is set:
   *
   * * state_change
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String groupBy;

  /**
   * The maximum number of results to return in a single response. Default is 10, minimum is 1,
   * maximum is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * The value returned by the last `GroupFindingsResponse`; indicates that this is a continuation
   * of a prior `GroupFindings` call, and that the system should return the next page of data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Time used as a reference point when filtering findings. The filter is limited to findings
   * existing at the supplied time and their values are those at that specific time. Absence of this
   * field will default to the API's version of NOW.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * When compare_duration is set, the GroupResult's "state_change" attribute is updated to indicate
   * whether the finding had its state changed, the finding's state remained unchanged, or if the
   * finding was added during the compare_duration period of time that precedes the read_time. This
   * is the time between (read_time - compare_duration) and read_time.
   *
   * The state_change value is derived based on the presence and state of the finding at the two
   * points in time. Intermediate state changes between the two times don't affect the result. For
   * example, the results aren't affected if the finding is made inactive and then active again.
   *
   * Possible "state_change" values when compare_duration is specified:
   *
   * * "CHANGED":   indicates that the finding was present at the start of
   * compare_duration, but changed its state at read_time. * "UNCHANGED": indicates that the finding
   * was present at the start of                  compare_duration and did not change state at
   * read_time. * "ADDED":     indicates that the finding was not present at the start
   * of compare_duration, but was present at read_time.
   *
   * If compare_duration is not specified, then the only possible state_change is "UNUSED",  which
   * will be the state_change set for all findings present at read_time.
   *
   * If this field is set then `state_change` must be a specified field in `group_by`.
   * @return value or {@code null} for none
   */
  public String getCompareDuration() {
    return compareDuration;
  }

  /**
   * When compare_duration is set, the GroupResult's "state_change" attribute is updated to indicate
   * whether the finding had its state changed, the finding's state remained unchanged, or if the
   * finding was added during the compare_duration period of time that precedes the read_time. This
   * is the time between (read_time - compare_duration) and read_time.
   *
   * The state_change value is derived based on the presence and state of the finding at the two
   * points in time. Intermediate state changes between the two times don't affect the result. For
   * example, the results aren't affected if the finding is made inactive and then active again.
   *
   * Possible "state_change" values when compare_duration is specified:
   *
   * * "CHANGED":   indicates that the finding was present at the start of
   * compare_duration, but changed its state at read_time. * "UNCHANGED": indicates that the finding
   * was present at the start of                  compare_duration and did not change state at
   * read_time. * "ADDED":     indicates that the finding was not present at the start
   * of compare_duration, but was present at read_time.
   *
   * If compare_duration is not specified, then the only possible state_change is "UNUSED",  which
   * will be the state_change set for all findings present at read_time.
   *
   * If this field is set then `state_change` must be a specified field in `group_by`.
   * @param compareDuration compareDuration or {@code null} for none
   */
  public GroupFindingsRequest setCompareDuration(String compareDuration) {
    this.compareDuration = compareDuration;
    return this;
  }

  /**
   * Expression that defines the filter to apply across findings. The expression is a list of one or
   * more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and
   * `OR` has higher precedence than `AND`.
   *
   * Restrictions have the form `  ` and may have a `-` character in front of them to indicate
   * negation. Examples include:
   *
   *  * name  * source_properties.a_property  * security_marks.marks.marka
   *
   * The supported operators are:
   *
   * * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring
   * matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes. * integer literals without quotes. * boolean literals `true` and
   * `false` without quotes.
   *
   * The following field and operator combinations are supported:
   *
   * * name: `=` * parent: `=`, `:` * resource_name: `=`, `:` * state: `=`, `:` * category: `=`, `:`
   * * external_uri: `=`, `:` * event_time: `=`, `>`, `<`, `>=`, `<=`
   *
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.   Examples:
   * "event_time = \"2019-06-10T16:07:18-07:00\""     "event_time = 1560208038000"
   *
   * * security_marks.marks: `=`, `:` * source_properties: `=`, `:`, `>`, `<`, `>=`, `<=`
   *
   * For example, `source_properties.size = 100` is a valid filter string.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Expression that defines the filter to apply across findings. The expression is a list of one or
   * more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and
   * `OR` has higher precedence than `AND`.
   *
   * Restrictions have the form `  ` and may have a `-` character in front of them to indicate
   * negation. Examples include:
   *
   *  * name  * source_properties.a_property  * security_marks.marks.marka
   *
   * The supported operators are:
   *
   * * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring
   * matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes. * integer literals without quotes. * boolean literals `true` and
   * `false` without quotes.
   *
   * The following field and operator combinations are supported:
   *
   * * name: `=` * parent: `=`, `:` * resource_name: `=`, `:` * state: `=`, `:` * category: `=`, `:`
   * * external_uri: `=`, `:` * event_time: `=`, `>`, `<`, `>=`, `<=`
   *
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.   Examples:
   * "event_time = \"2019-06-10T16:07:18-07:00\""     "event_time = 1560208038000"
   *
   * * security_marks.marks: `=`, `:` * source_properties: `=`, `:`, `>`, `<`, `>=`, `<=`
   *
   * For example, `source_properties.size = 100` is a valid filter string.
   * @param filter filter or {@code null} for none
   */
  public GroupFindingsRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Expression that defines what assets fields to use for grouping (including `state_change`). The
   * string value should follow SQL syntax: comma separated list of fields. For example:
   * "parent,resource_name".
   *
   * The following fields are supported:
   *
   * * resource_name * category * state * parent
   *
   * The following fields are supported when compare_duration is set:
   *
   * * state_change
   * @return value or {@code null} for none
   */
  public java.lang.String getGroupBy() {
    return groupBy;
  }

  /**
   * Expression that defines what assets fields to use for grouping (including `state_change`). The
   * string value should follow SQL syntax: comma separated list of fields. For example:
   * "parent,resource_name".
   *
   * The following fields are supported:
   *
   * * resource_name * category * state * parent
   *
   * The following fields are supported when compare_duration is set:
   *
   * * state_change
   * @param groupBy groupBy or {@code null} for none
   */
  public GroupFindingsRequest setGroupBy(java.lang.String groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  /**
   * The maximum number of results to return in a single response. Default is 10, minimum is 1,
   * maximum is 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * The maximum number of results to return in a single response. Default is 10, minimum is 1,
   * maximum is 1000.
   * @param pageSize pageSize or {@code null} for none
   */
  public GroupFindingsRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The value returned by the last `GroupFindingsResponse`; indicates that this is a continuation
   * of a prior `GroupFindings` call, and that the system should return the next page of data.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * The value returned by the last `GroupFindingsResponse`; indicates that this is a continuation
   * of a prior `GroupFindings` call, and that the system should return the next page of data.
   * @param pageToken pageToken or {@code null} for none
   */
  public GroupFindingsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Time used as a reference point when filtering findings. The filter is limited to findings
   * existing at the supplied time and their values are those at that specific time. Absence of this
   * field will default to the API's version of NOW.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * Time used as a reference point when filtering findings. The filter is limited to findings
   * existing at the supplied time and their values are those at that specific time. Absence of this
   * field will default to the API's version of NOW.
   * @param readTime readTime or {@code null} for none
   */
  public GroupFindingsRequest setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  @Override
  public GroupFindingsRequest set(String fieldName, Object value) {
    return (GroupFindingsRequest) super.set(fieldName, value);
  }

  @Override
  public GroupFindingsRequest clone() {
    return (GroupFindingsRequest) super.clone();
  }

}
