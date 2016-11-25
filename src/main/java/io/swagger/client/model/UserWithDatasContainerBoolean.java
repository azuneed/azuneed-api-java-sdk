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
import io.swagger.client.model.UserFormBean;
import java.util.ArrayList;
import java.util.List;


/**
 * UserWithDatasContainerBoolean
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T16:18:43.286+01:00")
public class UserWithDatasContainerBoolean   {
  @SerializedName("userFormBean")
  private UserFormBean userFormBean = null;

  @SerializedName("data")
  private List<Boolean> data = new ArrayList<Boolean>();

  public UserWithDatasContainerBoolean userFormBean(UserFormBean userFormBean) {
    this.userFormBean = userFormBean;
    return this;
  }

   /**
   * Get userFormBean
   * @return userFormBean
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserFormBean getUserFormBean() {
    return userFormBean;
  }

  public void setUserFormBean(UserFormBean userFormBean) {
    this.userFormBean = userFormBean;
  }

  public UserWithDatasContainerBoolean data(List<Boolean> data) {
    this.data = data;
    return this;
  }

  public UserWithDatasContainerBoolean addDataItem(Boolean dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Boolean> getData() {
    return data;
  }

  public void setData(List<Boolean> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWithDatasContainerBoolean userWithDatasContainerBoolean = (UserWithDatasContainerBoolean) o;
    return Objects.equals(this.userFormBean, userWithDatasContainerBoolean.userFormBean) &&
        Objects.equals(this.data, userWithDatasContainerBoolean.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFormBean, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWithDatasContainerBoolean {\n");
    
    sb.append("    userFormBean: ").append(toIndentedString(userFormBean)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

