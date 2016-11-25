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
import io.swagger.client.model.UserId;


/**
 * LinkedManagerRelationItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T16:18:43.286+01:00")
public class LinkedManagerRelationItem   {
  @SerializedName("id")
  private UserId id = null;

  @SerializedName("linkedIdManager")
  private UserId linkedIdManager = null;

  @SerializedName("linkedManagerName")
  private String linkedManagerName = null;

  @SerializedName("linkedManagerPhoto")
  private String linkedManagerPhoto = null;

  @SerializedName("linkedManagerRelation")
  private String linkedManagerRelation = null;

  public LinkedManagerRelationItem id(UserId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserId getId() {
    return id;
  }

  public void setId(UserId id) {
    this.id = id;
  }

  public LinkedManagerRelationItem linkedIdManager(UserId linkedIdManager) {
    this.linkedIdManager = linkedIdManager;
    return this;
  }

   /**
   * Get linkedIdManager
   * @return linkedIdManager
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UserId getLinkedIdManager() {
    return linkedIdManager;
  }

  public void setLinkedIdManager(UserId linkedIdManager) {
    this.linkedIdManager = linkedIdManager;
  }

  public LinkedManagerRelationItem linkedManagerName(String linkedManagerName) {
    this.linkedManagerName = linkedManagerName;
    return this;
  }

   /**
   * Get linkedManagerName
   * @return linkedManagerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLinkedManagerName() {
    return linkedManagerName;
  }

  public void setLinkedManagerName(String linkedManagerName) {
    this.linkedManagerName = linkedManagerName;
  }

  public LinkedManagerRelationItem linkedManagerPhoto(String linkedManagerPhoto) {
    this.linkedManagerPhoto = linkedManagerPhoto;
    return this;
  }

   /**
   * Get linkedManagerPhoto
   * @return linkedManagerPhoto
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLinkedManagerPhoto() {
    return linkedManagerPhoto;
  }

  public void setLinkedManagerPhoto(String linkedManagerPhoto) {
    this.linkedManagerPhoto = linkedManagerPhoto;
  }

  public LinkedManagerRelationItem linkedManagerRelation(String linkedManagerRelation) {
    this.linkedManagerRelation = linkedManagerRelation;
    return this;
  }

   /**
   * Get linkedManagerRelation
   * @return linkedManagerRelation
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLinkedManagerRelation() {
    return linkedManagerRelation;
  }

  public void setLinkedManagerRelation(String linkedManagerRelation) {
    this.linkedManagerRelation = linkedManagerRelation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedManagerRelationItem linkedManagerRelationItem = (LinkedManagerRelationItem) o;
    return Objects.equals(this.id, linkedManagerRelationItem.id) &&
        Objects.equals(this.linkedIdManager, linkedManagerRelationItem.linkedIdManager) &&
        Objects.equals(this.linkedManagerName, linkedManagerRelationItem.linkedManagerName) &&
        Objects.equals(this.linkedManagerPhoto, linkedManagerRelationItem.linkedManagerPhoto) &&
        Objects.equals(this.linkedManagerRelation, linkedManagerRelationItem.linkedManagerRelation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedIdManager, linkedManagerName, linkedManagerPhoto, linkedManagerRelation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedManagerRelationItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedIdManager: ").append(toIndentedString(linkedIdManager)).append("\n");
    sb.append("    linkedManagerName: ").append(toIndentedString(linkedManagerName)).append("\n");
    sb.append("    linkedManagerPhoto: ").append(toIndentedString(linkedManagerPhoto)).append("\n");
    sb.append("    linkedManagerRelation: ").append(toIndentedString(linkedManagerRelation)).append("\n");
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

