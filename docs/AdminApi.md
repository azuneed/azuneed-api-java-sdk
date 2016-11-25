# AdminApi

All URIs are relative to *https://localhost/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buildFilters**](AdminApi.md#buildFilters) | **GET** /admin/users/filters | 
[**createOrUpdate**](AdminApi.md#createOrUpdate) | **POST** /admin/user | Create a user
[**deleteUser**](AdminApi.md#deleteUser) | **DELETE** /admin/user/{idUser} | Delete the given user
[**fetchList**](AdminApi.md#fetchList) | **GET** /admin/users | Fetch list of users
[**getData**](AdminApi.md#getData) | **GET** /admin/user/{idUser} | Retrieve a specific user with ID
[**getListValueOptionList**](AdminApi.md#getListValueOptionList) | **GET** /lvaUtil/getListValueOptionList | 
[**getUserDiagramm**](AdminApi.md#getUserDiagramm) | **GET** /admin/user/diagramm/{idUser} | 
[**getUsersWithPresenceInfos**](AdminApi.md#getUsersWithPresenceInfos) | **GET** /admin/users/withPresenceInfos | 
[**getValueFromListValue**](AdminApi.md#getValueFromListValue) | **GET** /lvaUtil/getValueFromListValue | 
[**getWorkflowListValueOptionList**](AdminApi.md#getWorkflowListValueOptionList) | **GET** /lvaUtil/getWorkflowListValueOptionList | 
[**invalidateListValueCache**](AdminApi.md#invalidateListValueCache) | **GET** /lvaUtil/admin/invalidateListValueCache | 
[**listOnExport**](AdminApi.md#listOnExport) | **GET** /admin/users/export/xls | Export the list of users
[**updateUser**](AdminApi.md#updateUser) | **PUT** /admin/user | Update a user


<a name="buildFilters"></a>
# **buildFilters**
> ApiResponseMessage buildFilters(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#buildFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrUpdate"></a>
# **createOrUpdate**
> List&lt;String&gt; createOrUpdate(body)

Create a user

Return a message 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    List<String> result = apiInstance.createOrUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#createOrUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="deleteUser"></a>
# **deleteUser**
> String deleteUser(idUser)

Delete the given user

Return a message

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String idUser = "idUser_example"; // String | 
try {
    String result = apiInstance.deleteUser(idUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUser** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fetchList"></a>
# **fetchList**
> List&lt;UserFormBean&gt; fetchList(filters)

Fetch list of users

Return a list of UserFormBean.class

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String filters = "filters_example"; // String | 
try {
    List<UserFormBean> result = apiInstance.fetchList(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#fetchList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**List&lt;UserFormBean&gt;**](UserFormBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData"></a>
# **getData**
> UserFormBean getData(idUser)

Retrieve a specific user with ID

Return a message 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String idUser = "idUser_example"; // String | 
try {
    UserFormBean result = apiInstance.getData(idUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUser** | **String**|  |

### Return type

[**UserFormBean**](UserFormBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListValueOptionList"></a>
# **getListValueOptionList**
> List&lt;OptionListValueObject&gt; getListValueOptionList(idCompany, typeListValue, locale)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String idCompany = "idCompany_example"; // String | 
String typeListValue = "typeListValue_example"; // String | 
String locale = "locale_example"; // String | 
try {
    List<OptionListValueObject> result = apiInstance.getListValueOptionList(idCompany, typeListValue, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getListValueOptionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **typeListValue** | **String**|  | [optional]
 **locale** | **String**|  | [optional]

### Return type

[**List&lt;OptionListValueObject&gt;**](OptionListValueObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserDiagramm"></a>
# **getUserDiagramm**
> String getUserDiagramm(idUser)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String idUser = "idUser_example"; // String | 
try {
    String result = apiInstance.getUserDiagramm(idUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getUserDiagramm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUser** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersWithPresenceInfos"></a>
# **getUsersWithPresenceInfos**
> ApiResponseMessage getUsersWithPresenceInfos(date)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String date = "date_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.getUsersWithPresenceInfos(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getUsersWithPresenceInfos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getValueFromListValue"></a>
# **getValueFromListValue**
> String getValueFromListValue(idCompany, typeListValue, idValue, locale)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String idCompany = "idCompany_example"; // String | 
String typeListValue = "typeListValue_example"; // String | 
String idValue = "idValue_example"; // String | 
String locale = "locale_example"; // String | 
try {
    String result = apiInstance.getValueFromListValue(idCompany, typeListValue, idValue, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getValueFromListValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **typeListValue** | **String**|  | [optional]
 **idValue** | **String**|  | [optional]
 **locale** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkflowListValueOptionList"></a>
# **getWorkflowListValueOptionList**
> ModelApiResponse getWorkflowListValueOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getWorkflowListValueOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getWorkflowListValueOptionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invalidateListValueCache"></a>
# **invalidateListValueCache**
> ModelApiResponse invalidateListValueCache(idCompany, typeListValue)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String idCompany = "idCompany_example"; // String | 
String typeListValue = "typeListValue_example"; // String | 
try {
    ModelApiResponse result = apiInstance.invalidateListValueCache(idCompany, typeListValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#invalidateListValueCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **typeListValue** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport"></a>
# **listOnExport**
> String listOnExport(filters)

Export the list of users

Return an url to download

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String filters = "filters_example"; // String | 
try {
    String result = apiInstance.listOnExport(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#listOnExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> List&lt;String&gt; updateUser(body)

Update a user

Return a message 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    List<String> result = apiInstance.updateUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

