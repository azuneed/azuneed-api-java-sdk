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
 * UserWidgetsPrefId
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T16:24:13.221+01:00")
public class UserWidgetsPrefId   {
  @SerializedName("stringOf")
  private String stringOf = null;

  @SerializedName("idUser")
  private String idUser = null;

  @SerializedName("idCompany")
  private String idCompany = null;

  @SerializedName("serviceType")
  private String serviceType = null;

  @SerializedName("idWidget")
  private String idWidget = null;

  public UserWidgetsPrefId stringOf(String stringOf) {
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

  public UserWidgetsPrefId idUser(String idUser) {
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

  public UserWidgetsPrefId idCompany(String idCompany) {
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

  public UserWidgetsPrefId serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public UserWidgetsPrefId idWidget(String idWidget) {
    this.idWidget = idWidget;
    return this;
  }

   /**
   * Get idWidget
   * @return idWidget
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdWidget() {
    return idWidget;
  }

  public void setIdWidget(String idWidget) {
    this.idWidget = idWidget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWidgetsPrefId userWidgetsPrefId = (UserWidgetsPrefId) o;
    return Objects.equals(this.stringOf, userWidgetsPrefId.stringOf) &&
        Objects.equals(this.idUser, userWidgetsPrefId.idUser) &&
        Objects.equals(this.idCompany, userWidgetsPrefId.idCompany) &&
        Objects.equals(this.serviceType, userWidgetsPrefId.serviceType) &&
        Objects.equals(this.idWidget, userWidgetsPrefId.idWidget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringOf, idUser, idCompany, serviceType, idWidget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWidgetsPrefId {\n");
    
    sb.append("    stringOf: ").append(toIndentedString(stringOf)).append("\n");
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    idCompany: ").append(toIndentedString(idCompany)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    idWidget: ").append(toIndentedString(idWidget)).append("\n");
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

