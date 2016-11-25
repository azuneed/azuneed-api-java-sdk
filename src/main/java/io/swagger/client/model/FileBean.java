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
import io.swagger.client.model.GlobalControler;
import org.joda.time.DateTime;


/**
 * FileBean
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T16:18:43.286+01:00")
public class FileBean   {
  @SerializedName("userCreate")
  private String userCreate = null;

  @SerializedName("dateCreate")
  private DateTime dateCreate = null;

  @SerializedName("userUpdate")
  private String userUpdate = null;

  @SerializedName("dateUpdate")
  private DateTime dateUpdate = null;

  @SerializedName("internalCode")
  private String internalCode = null;

  @SerializedName("id")
  private Object id = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("filePath")
  private String filePath = null;

  @SerializedName("fileMimeType")
  private String fileMimeType = null;

  @SerializedName("idFile")
  private String idFile = null;

  @SerializedName("idCompany")
  private String idCompany = null;

  @SerializedName("idUser")
  private String idUser = null;

  @SerializedName("controllerInstance")
  private GlobalControler controllerInstance = null;

  public FileBean userCreate(String userCreate) {
    this.userCreate = userCreate;
    return this;
  }

   /**
   * Get userCreate
   * @return userCreate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserCreate() {
    return userCreate;
  }

  public void setUserCreate(String userCreate) {
    this.userCreate = userCreate;
  }

  public FileBean dateCreate(DateTime dateCreate) {
    this.dateCreate = dateCreate;
    return this;
  }

   /**
   * Get dateCreate
   * @return dateCreate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDateCreate() {
    return dateCreate;
  }

  public void setDateCreate(DateTime dateCreate) {
    this.dateCreate = dateCreate;
  }

  public FileBean userUpdate(String userUpdate) {
    this.userUpdate = userUpdate;
    return this;
  }

   /**
   * Get userUpdate
   * @return userUpdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserUpdate() {
    return userUpdate;
  }

  public void setUserUpdate(String userUpdate) {
    this.userUpdate = userUpdate;
  }

  public FileBean dateUpdate(DateTime dateUpdate) {
    this.dateUpdate = dateUpdate;
    return this;
  }

   /**
   * Get dateUpdate
   * @return dateUpdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDateUpdate() {
    return dateUpdate;
  }

  public void setDateUpdate(DateTime dateUpdate) {
    this.dateUpdate = dateUpdate;
  }

  public FileBean internalCode(String internalCode) {
    this.internalCode = internalCode;
    return this;
  }

   /**
   * Get internalCode
   * @return internalCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInternalCode() {
    return internalCode;
  }

  public void setInternalCode(String internalCode) {
    this.internalCode = internalCode;
  }

  public FileBean id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public FileBean fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FileBean filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Get filePath
   * @return filePath
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public FileBean fileMimeType(String fileMimeType) {
    this.fileMimeType = fileMimeType;
    return this;
  }

   /**
   * Get fileMimeType
   * @return fileMimeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFileMimeType() {
    return fileMimeType;
  }

  public void setFileMimeType(String fileMimeType) {
    this.fileMimeType = fileMimeType;
  }

  public FileBean idFile(String idFile) {
    this.idFile = idFile;
    return this;
  }

   /**
   * Get idFile
   * @return idFile
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdFile() {
    return idFile;
  }

  public void setIdFile(String idFile) {
    this.idFile = idFile;
  }

  public FileBean idCompany(String idCompany) {
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

  public FileBean idUser(String idUser) {
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

  public FileBean controllerInstance(GlobalControler controllerInstance) {
    this.controllerInstance = controllerInstance;
    return this;
  }

   /**
   * Get controllerInstance
   * @return controllerInstance
  **/
  @ApiModelProperty(example = "null", value = "")
  public GlobalControler getControllerInstance() {
    return controllerInstance;
  }

  public void setControllerInstance(GlobalControler controllerInstance) {
    this.controllerInstance = controllerInstance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileBean fileBean = (FileBean) o;
    return Objects.equals(this.userCreate, fileBean.userCreate) &&
        Objects.equals(this.dateCreate, fileBean.dateCreate) &&
        Objects.equals(this.userUpdate, fileBean.userUpdate) &&
        Objects.equals(this.dateUpdate, fileBean.dateUpdate) &&
        Objects.equals(this.internalCode, fileBean.internalCode) &&
        Objects.equals(this.id, fileBean.id) &&
        Objects.equals(this.fileName, fileBean.fileName) &&
        Objects.equals(this.filePath, fileBean.filePath) &&
        Objects.equals(this.fileMimeType, fileBean.fileMimeType) &&
        Objects.equals(this.idFile, fileBean.idFile) &&
        Objects.equals(this.idCompany, fileBean.idCompany) &&
        Objects.equals(this.idUser, fileBean.idUser) &&
        Objects.equals(this.controllerInstance, fileBean.controllerInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userCreate, dateCreate, userUpdate, dateUpdate, internalCode, id, fileName, filePath, fileMimeType, idFile, idCompany, idUser, controllerInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileBean {\n");
    
    sb.append("    userCreate: ").append(toIndentedString(userCreate)).append("\n");
    sb.append("    dateCreate: ").append(toIndentedString(dateCreate)).append("\n");
    sb.append("    userUpdate: ").append(toIndentedString(userUpdate)).append("\n");
    sb.append("    dateUpdate: ").append(toIndentedString(dateUpdate)).append("\n");
    sb.append("    internalCode: ").append(toIndentedString(internalCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    fileMimeType: ").append(toIndentedString(fileMimeType)).append("\n");
    sb.append("    idFile: ").append(toIndentedString(idFile)).append("\n");
    sb.append("    idCompany: ").append(toIndentedString(idCompany)).append("\n");
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    controllerInstance: ").append(toIndentedString(controllerInstance)).append("\n");
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

