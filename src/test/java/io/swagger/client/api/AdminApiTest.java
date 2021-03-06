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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ApiResponseMessage;
import io.swagger.client.model.FormDataMultiPart;
import io.swagger.client.model.UserFormBean;
import io.swagger.client.model.OptionListValueObject;
import io.swagger.client.model.ModelApiResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void buildFiltersTest() throws ApiException {
        String filters = null;
        // ApiResponseMessage response = api.buildFilters(filters);

        // TODO: test validations
    }
    
    /**
     * Create a user
     *
     * Return a message 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateTest() throws ApiException {
        FormDataMultiPart body = null;
        // List<String> response = api.createOrUpdate(body);

        // TODO: test validations
    }
    
    /**
     * Delete the given user
     *
     * Return a message
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String idUser = null;
        // String response = api.deleteUser(idUser);

        // TODO: test validations
    }
    
    /**
     * Fetch list of users
     *
     * Return a list of UserFormBean.class
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchListTest() throws ApiException {
        String filters = null;
        // List<UserFormBean> response = api.fetchList(filters);

        // TODO: test validations
    }
    
    /**
     * Retrieve a specific user with ID
     *
     * Return a message 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataTest() throws ApiException {
        String idUser = null;
        // UserFormBean response = api.getData(idUser);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListValueOptionListTest() throws ApiException {
        String idCompany = null;
        String typeListValue = null;
        String locale = null;
        // List<OptionListValueObject> response = api.getListValueOptionList(idCompany, typeListValue, locale);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDiagrammTest() throws ApiException {
        String idUser = null;
        // String response = api.getUserDiagramm(idUser);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersWithPresenceInfosTest() throws ApiException {
        String date = null;
        // ApiResponseMessage response = api.getUsersWithPresenceInfos(date);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getValueFromListValueTest() throws ApiException {
        String idCompany = null;
        String typeListValue = null;
        String idValue = null;
        String locale = null;
        // String response = api.getValueFromListValue(idCompany, typeListValue, idValue, locale);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowListValueOptionListTest() throws ApiException {
        String idCompany = null;
        // ModelApiResponse response = api.getWorkflowListValueOptionList(idCompany);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invalidateListValueCacheTest() throws ApiException {
        String idCompany = null;
        String typeListValue = null;
        // ModelApiResponse response = api.invalidateListValueCache(idCompany, typeListValue);

        // TODO: test validations
    }
    
    /**
     * Export the list of users
     *
     * Return an url to download
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOnExportTest() throws ApiException {
        String filters = null;
        // String response = api.listOnExport(filters);

        // TODO: test validations
    }
    
    /**
     * Update a user
     *
     * Return a message 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        FormDataMultiPart body = null;
        // List<String> response = api.updateUser(body);

        // TODO: test validations
    }
    
}
