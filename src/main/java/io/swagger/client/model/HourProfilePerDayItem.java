/**
 * 
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.HourProfileDayPartItem;
import io.swagger.client.model.HourProfilePerDayId;
import java.util.ArrayList;
import java.util.List;


/**
 * HourProfilePerDayItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T16:24:13.221+01:00")
public class HourProfilePerDayItem   {
  @SerializedName("id")
  private HourProfilePerDayId id = null;

  @SerializedName("dayNumber")
  private String dayNumber = null;

  @SerializedName("isDayWorked")
  private Boolean isDayWorked = false;

  @SerializedName("workedInHour")
  private String workedInHour = null;

  @SerializedName("workedInDay")
  private Double workedInDay = null;

  @SerializedName("hourProfileDayParts")
  private List<HourProfileDayPartItem> hourProfileDayParts = new ArrayList<HourProfileDayPartItem>();

  public HourProfilePerDayItem id(HourProfilePerDayId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public HourProfilePerDayId getId() {
    return id;
  }

  public void setId(HourProfilePerDayId id) {
    this.id = id;
  }

  public HourProfilePerDayItem dayNumber(String dayNumber) {
    this.dayNumber = dayNumber;
    return this;
  }

   /**
   * Get dayNumber
   * @return dayNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDayNumber() {
    return dayNumber;
  }

  public void setDayNumber(String dayNumber) {
    this.dayNumber = dayNumber;
  }

  public HourProfilePerDayItem isDayWorked(Boolean isDayWorked) {
    this.isDayWorked = isDayWorked;
    return this;
  }

   /**
   * Get isDayWorked
   * @return isDayWorked
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsDayWorked() {
    return isDayWorked;
  }

  public void setIsDayWorked(Boolean isDayWorked) {
    this.isDayWorked = isDayWorked;
  }

  public HourProfilePerDayItem workedInHour(String workedInHour) {
    this.workedInHour = workedInHour;
    return this;
  }

   /**
   * Get workedInHour
   * @return workedInHour
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWorkedInHour() {
    return workedInHour;
  }

  public void setWorkedInHour(String workedInHour) {
    this.workedInHour = workedInHour;
  }

  public HourProfilePerDayItem workedInDay(Double workedInDay) {
    this.workedInDay = workedInDay;
    return this;
  }

   /**
   * Get workedInDay
   * minimum: 0.0
   * @return workedInDay
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getWorkedInDay() {
    return workedInDay;
  }

  public void setWorkedInDay(Double workedInDay) {
    this.workedInDay = workedInDay;
  }

  public HourProfilePerDayItem hourProfileDayParts(List<HourProfileDayPartItem> hourProfileDayParts) {
    this.hourProfileDayParts = hourProfileDayParts;
    return this;
  }

  public HourProfilePerDayItem addHourProfileDayPartsItem(HourProfileDayPartItem hourProfileDayPartsItem) {
    this.hourProfileDayParts.add(hourProfileDayPartsItem);
    return this;
  }

   /**
   * Get hourProfileDayParts
   * @return hourProfileDayParts
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<HourProfileDayPartItem> getHourProfileDayParts() {
    return hourProfileDayParts;
  }

  public void setHourProfileDayParts(List<HourProfileDayPartItem> hourProfileDayParts) {
    this.hourProfileDayParts = hourProfileDayParts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourProfilePerDayItem hourProfilePerDayItem = (HourProfilePerDayItem) o;
    return Objects.equals(this.id, hourProfilePerDayItem.id) &&
        Objects.equals(this.dayNumber, hourProfilePerDayItem.dayNumber) &&
        Objects.equals(this.isDayWorked, hourProfilePerDayItem.isDayWorked) &&
        Objects.equals(this.workedInHour, hourProfilePerDayItem.workedInHour) &&
        Objects.equals(this.workedInDay, hourProfilePerDayItem.workedInDay) &&
        Objects.equals(this.hourProfileDayParts, hourProfilePerDayItem.hourProfileDayParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dayNumber, isDayWorked, workedInHour, workedInDay, hourProfileDayParts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourProfilePerDayItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dayNumber: ").append(toIndentedString(dayNumber)).append("\n");
    sb.append("    isDayWorked: ").append(toIndentedString(isDayWorked)).append("\n");
    sb.append("    workedInHour: ").append(toIndentedString(workedInHour)).append("\n");
    sb.append("    workedInDay: ").append(toIndentedString(workedInDay)).append("\n");
    sb.append("    hourProfileDayParts: ").append(toIndentedString(hourProfileDayParts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

