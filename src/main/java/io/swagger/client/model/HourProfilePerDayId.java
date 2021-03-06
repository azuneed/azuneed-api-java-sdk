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


/**
 * HourProfilePerDayId
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T16:24:13.221+01:00")
public class HourProfilePerDayId   {
  @SerializedName("stringOf")
  private String stringOf = null;

  @SerializedName("idCompany")
  private String idCompany = null;

  @SerializedName("idHourProfile")
  private String idHourProfile = null;

  @SerializedName("idHourProfileDayDef")
  private String idHourProfileDayDef = null;

  @SerializedName("idUser")
  private String idUser = null;

  public HourProfilePerDayId stringOf(String stringOf) {
    this.stringOf = stringOf;
    return this;
  }

   /**
   * Get stringOf
   * @return stringOf
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStringOf() {
    return stringOf;
  }

  public void setStringOf(String stringOf) {
    this.stringOf = stringOf;
  }

  public HourProfilePerDayId idCompany(String idCompany) {
    this.idCompany = idCompany;
    return this;
  }

   /**
   * Get idCompany
   * @return idCompany
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdCompany() {
    return idCompany;
  }

  public void setIdCompany(String idCompany) {
    this.idCompany = idCompany;
  }

  public HourProfilePerDayId idHourProfile(String idHourProfile) {
    this.idHourProfile = idHourProfile;
    return this;
  }

   /**
   * Get idHourProfile
   * @return idHourProfile
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdHourProfile() {
    return idHourProfile;
  }

  public void setIdHourProfile(String idHourProfile) {
    this.idHourProfile = idHourProfile;
  }

  public HourProfilePerDayId idHourProfileDayDef(String idHourProfileDayDef) {
    this.idHourProfileDayDef = idHourProfileDayDef;
    return this;
  }

   /**
   * Get idHourProfileDayDef
   * @return idHourProfileDayDef
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdHourProfileDayDef() {
    return idHourProfileDayDef;
  }

  public void setIdHourProfileDayDef(String idHourProfileDayDef) {
    this.idHourProfileDayDef = idHourProfileDayDef;
  }

  public HourProfilePerDayId idUser(String idUser) {
    this.idUser = idUser;
    return this;
  }

   /**
   * Get idUser
   * @return idUser
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdUser() {
    return idUser;
  }

  public void setIdUser(String idUser) {
    this.idUser = idUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourProfilePerDayId hourProfilePerDayId = (HourProfilePerDayId) o;
    return Objects.equals(this.stringOf, hourProfilePerDayId.stringOf) &&
        Objects.equals(this.idCompany, hourProfilePerDayId.idCompany) &&
        Objects.equals(this.idHourProfile, hourProfilePerDayId.idHourProfile) &&
        Objects.equals(this.idHourProfileDayDef, hourProfilePerDayId.idHourProfileDayDef) &&
        Objects.equals(this.idUser, hourProfilePerDayId.idUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringOf, idCompany, idHourProfile, idHourProfileDayDef, idUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourProfilePerDayId {\n");
    
    sb.append("    stringOf: ").append(toIndentedString(stringOf)).append("\n");
    sb.append("    idCompany: ").append(toIndentedString(idCompany)).append("\n");
    sb.append("    idHourProfile: ").append(toIndentedString(idHourProfile)).append("\n");
    sb.append("    idHourProfileDayDef: ").append(toIndentedString(idHourProfileDayDef)).append("\n");
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
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

