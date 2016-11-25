# DefaultApi

All URIs are relative to *https://localhost/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyNewPwd**](DefaultApi.md#applyNewPwd) | **GET** /pwdUtil/updatePwdProcess/applyNewPwd | 
[**applyNewPwdStateLess**](DefaultApi.md#applyNewPwdStateLess) | **GET** /pwdUtil/updatePwdProcess/applyNewPwd/stateLess | 
[**buildAzuneedPortalAccess**](DefaultApi.md#buildAzuneedPortalAccess) | **GET** /azuneedPortalUtil/buildAzuneedPortalAccess | 
[**buildAzuneedPortalProductQuoteAccess**](DefaultApi.md#buildAzuneedPortalProductQuoteAccess) | **GET** /azuneedPortalUtil/buildAzuneedPortalProductQuoteAccess | 
[**buildFilters**](DefaultApi.md#buildFilters) | **GET** /admin/hourprofiles/filters | 
[**buildFilters_0**](DefaultApi.md#buildFilters_0) | **GET** /admin/leavevacationprofiles/filters | 
[**buildFilters_1**](DefaultApi.md#buildFilters_1) | **GET** /admin/leavevacationrights/filters | 
[**buildFilters_2**](DefaultApi.md#buildFilters_2) | **GET** /admin/leavevacationtypes/filters | 
[**buildFilters_3**](DefaultApi.md#buildFilters_3) | **GET** /admin/userprofiles/filters | 
[**buildFilters_4**](DefaultApi.md#buildFilters_4) | **GET** /leaverequest/leaverequests/filters | 
[**buildFilters_5**](DefaultApi.md#buildFilters_5) | **GET** /payroll/filters | 
[**buildFilters_6**](DefaultApi.md#buildFilters_6) | **GET** /timesheetAnalysis/filters | 
[**buildFilters_7**](DefaultApi.md#buildFilters_7) | **GET** /timesheets/filters | 
[**buildFilters_8**](DefaultApi.md#buildFilters_8) | **GET** /wellbeing/filters | 
[**checkNewPwd1**](DefaultApi.md#checkNewPwd1) | **GET** /pwdUtil/updatePwdProcess/checkNewPwd1 | 
[**checkNewPwd2**](DefaultApi.md#checkNewPwd2) | **GET** /pwdUtil/updatePwdProcess/checkNewPwd2 | 
[**checkOldPwd**](DefaultApi.md#checkOldPwd) | **GET** /pwdUtil/updatePwdProcess/checkOldPwd | 
[**computeLeaveRequest**](DefaultApi.md#computeLeaveRequest) | **GET** /leaveRequestUtil/computeLeaveRequest | 
[**computeWellBeingVoteForDashBoard**](DefaultApi.md#computeWellBeingVoteForDashBoard) | **GET** /wellbeing/usersWellBeingVotes/dashboard | 
[**copy**](DefaultApi.md#copy) | **GET** /admin/company/{srcIdCompany}/copy | 
[**copy_0**](DefaultApi.md#copy_0) | **GET** /wellbeing/company/{srcIdCompany}/copy | 
[**createFreeTrial**](DefaultApi.md#createFreeTrial) | **GET** /companyUtil/createFreeTrial | 
[**createOrUpdate**](DefaultApi.md#createOrUpdate) | **POST** /admin/analyticaxe | 
[**createOrUpdate_0**](DefaultApi.md#createOrUpdate_0) | **POST** /admin/company | 
[**createOrUpdate_1**](DefaultApi.md#createOrUpdate_1) | **POST** /admin/connector | 
[**createOrUpdate_10**](DefaultApi.md#createOrUpdate_10) | **POST** /leaverequest/leaverequest | 
[**createOrUpdate_11**](DefaultApi.md#createOrUpdate_11) | **POST** /timesheet | 
[**createOrUpdate_12**](DefaultApi.md#createOrUpdate_12) | **POST** /wellbeing/createOrUpdate | 
[**createOrUpdate_2**](DefaultApi.md#createOrUpdate_2) | **POST** /admin/daysoff | 
[**createOrUpdate_3**](DefaultApi.md#createOrUpdate_3) | **POST** /admin/globalparam | 
[**createOrUpdate_4**](DefaultApi.md#createOrUpdate_4) | **POST** /admin/hourprofile | 
[**createOrUpdate_5**](DefaultApi.md#createOrUpdate_5) | **POST** /admin/leavevacationprofile | 
[**createOrUpdate_6**](DefaultApi.md#createOrUpdate_6) | **POST** /admin/leavevacationright | 
[**createOrUpdate_7**](DefaultApi.md#createOrUpdate_7) | **POST** /admin/leavevacationtype | 
[**createOrUpdate_8**](DefaultApi.md#createOrUpdate_8) | **POST** /admin/service | 
[**createOrUpdate_9**](DefaultApi.md#createOrUpdate_9) | **POST** /admin/userprofile | 
[**deleteAnalyticAxe**](DefaultApi.md#deleteAnalyticAxe) | **DELETE** /admin/analyticaxe/{analyticalAxeId} | 
[**deleteCompany**](DefaultApi.md#deleteCompany) | **DELETE** /admin/company/{idCompany} | 
[**deleteCompany_0**](DefaultApi.md#deleteCompany_0) | **DELETE** /admin/connector/{connectorId} | 
[**deleteDaysOff**](DefaultApi.md#deleteDaysOff) | **DELETE** /admin/daysoff/{daysOffId} | 
[**deleteHourProfile**](DefaultApi.md#deleteHourProfile) | **DELETE** /admin/hourprofile/{idHourProfile} | 
[**deleteLeaveRequest**](DefaultApi.md#deleteLeaveRequest) | **DELETE** /leaverequest/leaverequest/{leaveRequestBeanId} | 
[**deleteLeaveVacationProfile**](DefaultApi.md#deleteLeaveVacationProfile) | **DELETE** /admin/leavevacationprofile/{leaveVacationProfileBeanId} | 
[**deleteLeaveVacationType**](DefaultApi.md#deleteLeaveVacationType) | **DELETE** /admin/leavevacationright/{leaveVacationRightBeanId} | 
[**deleteLeaveVacationType_0**](DefaultApi.md#deleteLeaveVacationType_0) | **DELETE** /admin/leavevacationtype/{leaveVacationTypeBeanId} | 
[**deleteService**](DefaultApi.md#deleteService) | **DELETE** /admin/service/{idService} | 
[**deleteTimesheet**](DefaultApi.md#deleteTimesheet) | **DELETE** /timesheet/{timesheetId} | 
[**deleteUserProfile**](DefaultApi.md#deleteUserProfile) | **DELETE** /admin/userprofile/{idUserProfile} | 
[**deleteWellBeing**](DefaultApi.md#deleteWellBeing) | **DELETE** /wellbeing/{wellBeingId} | 
[**doAuthWithLoginAndPwd**](DefaultApi.md#doAuthWithLoginAndPwd) | **POST** /logon/auth | 
[**doAuthWithStayConnectedToken**](DefaultApi.md#doAuthWithStayConnectedToken) | **POST** /logon/auth/{stayConnectedToken} | 
[**doAuthWithTempToken**](DefaultApi.md#doAuthWithTempToken) | **GET** /logon/authWithTempToken | 
[**doLogout**](DefaultApi.md#doLogout) | **GET** /logon/logout | 
[**fetchList**](DefaultApi.md#fetchList) | **GET** /admin/analyticaxes | 
[**fetchList_0**](DefaultApi.md#fetchList_0) | **GET** /admin/billings | 
[**fetchList_1**](DefaultApi.md#fetchList_1) | **GET** /admin/companies | 
[**fetchList_10**](DefaultApi.md#fetchList_10) | **GET** /leaverequest/leaverequests | 
[**fetchList_11**](DefaultApi.md#fetchList_11) | **GET** /payroll/payrollLog | 
[**fetchList_12**](DefaultApi.md#fetchList_12) | **GET** /timesheetAnalysis | 
[**fetchList_13**](DefaultApi.md#fetchList_13) | **GET** /timesheets | 
[**fetchList_14**](DefaultApi.md#fetchList_14) | **GET** /wellbeing/list | 
[**fetchList_2**](DefaultApi.md#fetchList_2) | **GET** /admin/connectors | 
[**fetchList_3**](DefaultApi.md#fetchList_3) | **GET** /admin/daysoffs | 
[**fetchList_4**](DefaultApi.md#fetchList_4) | **GET** /admin/hourprofiles | 
[**fetchList_5**](DefaultApi.md#fetchList_5) | **GET** /admin/leavevacationprofiles | 
[**fetchList_6**](DefaultApi.md#fetchList_6) | **GET** /admin/leavevacationrights | 
[**fetchList_7**](DefaultApi.md#fetchList_7) | **GET** /admin/leavevacationtypes | 
[**fetchList_8**](DefaultApi.md#fetchList_8) | **GET** /admin/services | 
[**fetchList_9**](DefaultApi.md#fetchList_9) | **GET** /admin/userprofiles | 
[**getAConnector**](DefaultApi.md#getAConnector) | **GET** /connectorUtil/getAConnector | 
[**getAConnectorModel**](DefaultApi.md#getAConnectorModel) | **GET** /connectorUtil/getAConnectorModel | 
[**getALeaveVacationTypeModel**](DefaultApi.md#getALeaveVacationTypeModel) | **GET** /leaveVacationTypeUtil/getALeaveVacationTypeModel | 
[**getAModelDaysOff**](DefaultApi.md#getAModelDaysOff) | **GET** /daysOffUtil/getAModelDaysOff | 
[**getAUserProfileModel**](DefaultApi.md#getAUserProfileModel) | **GET** /userProfileUtil/getAUserProfileModel | 
[**getAnalyticAxeLinkedFamilies**](DefaultApi.md#getAnalyticAxeLinkedFamilies) | **GET** /admin/analyticaxes/linkedFamilies | 
[**getAnalyticAxeLinkedFamiliesForImputation**](DefaultApi.md#getAnalyticAxeLinkedFamiliesForImputation) | **GET** /admin/analyticaxes/linkedFamiliesForImputation | 
[**getAnalyticalAxeOptionList**](DefaultApi.md#getAnalyticalAxeOptionList) | **GET** /analyticAxeUtil/getAnalyticalAxeOptionList | 
[**getAppServerVersion**](DefaultApi.md#getAppServerVersion) | **GET** /about/version | 
[**getCalendarDaysOffModelOptionList**](DefaultApi.md#getCalendarDaysOffModelOptionList) | **GET** /daysOffUtil/getCalendarDaysOffModelOptionList | 
[**getCalendarDaysOffOptionList**](DefaultApi.md#getCalendarDaysOffOptionList) | **GET** /daysOffUtil/getCalendarDaysOffOptionList | 
[**getCompanyConnectorOptionList**](DefaultApi.md#getCompanyConnectorOptionList) | **GET** /companyUtil/getCompanyConnectorOptionList | 
[**getCompanyOptionList**](DefaultApi.md#getCompanyOptionList) | **GET** /companyUtil/getCompanyOptionList | 
[**getCompanyOrganizationsOptionList**](DefaultApi.md#getCompanyOrganizationsOptionList) | **GET** /companyUtil/getCompanyOrganizationsOptionList | 
[**getCompanySupportContacts**](DefaultApi.md#getCompanySupportContacts) | **GET** /companyUtil/getCompanySupportContacts | 
[**getConnectorsModel**](DefaultApi.md#getConnectorsModel) | **GET** /connectorUtil/getConnectorsModel | 
[**getData**](DefaultApi.md#getData) | **GET** /admin/analyticaxe/{analyticalAxeId} | 
[**getData_0**](DefaultApi.md#getData_0) | **GET** /admin/billing/{idCompany} | 
[**getData_1**](DefaultApi.md#getData_1) | **GET** /admin/company/{idCompany} | 
[**getData_10**](DefaultApi.md#getData_10) | **GET** /admin/userprofile/{idUserProfile} | 
[**getData_11**](DefaultApi.md#getData_11) | **GET** /leaverequest/leaverequest/{leaveRequestBeanId} | 
[**getData_12**](DefaultApi.md#getData_12) | **GET** /payroll/getPayrollLogItemDetail | 
[**getData_13**](DefaultApi.md#getData_13) | **GET** /timesheet/{timesheetId} | 
[**getData_2**](DefaultApi.md#getData_2) | **GET** /admin/connector/{idConnector} | 
[**getData_3**](DefaultApi.md#getData_3) | **GET** /admin/daysoff/{daysOffId} | 
[**getData_4**](DefaultApi.md#getData_4) | **GET** /admin/globalparam/{idCompany} | 
[**getData_5**](DefaultApi.md#getData_5) | **GET** /admin/hourprofile/{idHourProfile} | 
[**getData_6**](DefaultApi.md#getData_6) | **GET** /admin/leavevacationprofile/{leaveVacationProfileBeanId} | 
[**getData_7**](DefaultApi.md#getData_7) | **GET** /admin/leavevacationright/{leaveVacationRightBeanId} | 
[**getData_8**](DefaultApi.md#getData_8) | **GET** /admin/leavevacationtype/{leaveVacationTypeBeanId} | 
[**getData_9**](DefaultApi.md#getData_9) | **GET** /admin/service/{idService} | 
[**getDaysOffDaysDefItemForAGivenDate**](DefaultApi.md#getDaysOffDaysDefItemForAGivenDate) | **GET** /daysOffUtil/getDaysOffDaysDefItemForAGivenDate | 
[**getFileImportModel**](DefaultApi.md#getFileImportModel) | **GET** /import/{entityBean}/import/model | 
[**getHourProfileDayPartForAGivenDate**](DefaultApi.md#getHourProfileDayPartForAGivenDate) | **GET** /hourProfileUtil/getHourProfileDayPartForAGivenDate | 
[**getHourProfileOptionList**](DefaultApi.md#getHourProfileOptionList) | **GET** /hourProfileUtil/getHourProfileOptionList | 
[**getLeaveRequestForAGivenDay**](DefaultApi.md#getLeaveRequestForAGivenDay) | **GET** /leaveRequestUtil/getLeaveRequestForAGivenDay | 
[**getLeaveVacationProfileOptionList**](DefaultApi.md#getLeaveVacationProfileOptionList) | **GET** /leaveVacationProfileUtil/getLeaveVacationProfileOptionList | 
[**getLeaveVacationProfileTypeOptionList**](DefaultApi.md#getLeaveVacationProfileTypeOptionList) | **GET** /leaveVacationProfileUtil/getLeaveVacationProfileTypeOptionList | 
[**getLeaveVacationTypeModelOptionList**](DefaultApi.md#getLeaveVacationTypeModelOptionList) | **GET** /leaveVacationTypeUtil/getLeaveVacationTypeModelOptionList | 
[**getLeaveVacationTypeOptionList**](DefaultApi.md#getLeaveVacationTypeOptionList) | **GET** /leaveVacationTypeUtil/getLeaveVacationTypeOptionList | 
[**getListOfWidgets**](DefaultApi.md#getListOfWidgets) | **GET** /serviceUtil/getListOfWidgets | 
[**getPayrollItem**](DefaultApi.md#getPayrollItem) | **GET** /payroll/export/preview | 
[**getProductAndOptionList**](DefaultApi.md#getProductAndOptionList) | **GET** /productUtil/getProductAndOptionList | 
[**getProductAssociationForEachService**](DefaultApi.md#getProductAssociationForEachService) | **GET** /serviceUtil/getProductAssociationForEachService | 
[**getServiceListOfDefaultParam**](DefaultApi.md#getServiceListOfDefaultParam) | **GET** /serviceUtil/getServiceListOfDefaultParam | 
[**getServiceOptionList**](DefaultApi.md#getServiceOptionList) | **GET** /serviceUtil/getServiceOptionList | 
[**getServiceWidget**](DefaultApi.md#getServiceWidget) | **GET** /serviceUtil/getServiceWidget | 
[**getUserLeaveVacationTypeOptionList**](DefaultApi.md#getUserLeaveVacationTypeOptionList) | **GET** /userUtil/getUserLeaveVacationTypeOptionList | 
[**getUserOptionList**](DefaultApi.md#getUserOptionList) | **GET** /userUtil/getUserOptionList | 
[**getUserProfileModelOptionList**](DefaultApi.md#getUserProfileModelOptionList) | **GET** /userProfileUtil/getUserProfileModelOptionList | 
[**getUserProfileOptionList**](DefaultApi.md#getUserProfileOptionList) | **GET** /userProfileUtil/getUserProfileOptionList | 
[**getUserWidgetsPref**](DefaultApi.md#getUserWidgetsPref) | **GET** /userUtil/getUserWidgetsPref/{userId} | 
[**getUsersLeaveRequests**](DefaultApi.md#getUsersLeaveRequests) | **GET** /leaverequest/usersLeaveRequests | 
[**getUsersWellBeingVotes**](DefaultApi.md#getUsersWellBeingVotes) | **GET** /wellbeing/usersWellBeingVotes | 
[**getUsersWithPresenceInfos**](DefaultApi.md#getUsersWithPresenceInfos) | **GET** /userUtil | 
[**importData**](DefaultApi.md#importData) | **POST** /import/{entityBean}/import | 
[**initNewPwdProcess**](DefaultApi.md#initNewPwdProcess) | **GET** /pwdUtil/updatePwdProcess/init | 
[**isLastLevelWorkflow**](DefaultApi.md#isLastLevelWorkflow) | **GET** /workflowUtil/isLastLevelWorkflow | 
[**keepMeAlive**](DefaultApi.md#keepMeAlive) | **GET** /sessionUtil/keepMeAlive | 
[**killSession**](DefaultApi.md#killSession) | **GET** /sessionUtil/killSession | 
[**listAllActiveSession**](DefaultApi.md#listAllActiveSession) | **GET** /sessionUtil/listAllActiveSession | 
[**listOnExport**](DefaultApi.md#listOnExport) | **GET** /admin/analyticaxes/export/xls | 
[**listOnExport_0**](DefaultApi.md#listOnExport_0) | **GET** /admin/billings/export/xls | 
[**listOnExport_1**](DefaultApi.md#listOnExport_1) | **GET** /admin/companies/export/xls | 
[**listOnExport_10**](DefaultApi.md#listOnExport_10) | **GET** /leaverequest/leaverequests/export/xls | 
[**listOnExport_11**](DefaultApi.md#listOnExport_11) | **GET** /payroll/export/xls | 
[**listOnExport_12**](DefaultApi.md#listOnExport_12) | **GET** /timesheetAnalysis/export/xls | 
[**listOnExport_13**](DefaultApi.md#listOnExport_13) | **GET** /timesheets/export/xls | 
[**listOnExport_14**](DefaultApi.md#listOnExport_14) | **GET** /wellbeing/companies/export/xls | 
[**listOnExport_2**](DefaultApi.md#listOnExport_2) | **GET** /admin/connectors/export/xls | 
[**listOnExport_3**](DefaultApi.md#listOnExport_3) | **GET** /admin/daysoffs/export/xls | 
[**listOnExport_4**](DefaultApi.md#listOnExport_4) | **GET** /admin/hourprofiles/export/xls | 
[**listOnExport_5**](DefaultApi.md#listOnExport_5) | **GET** /admin/leavevacationprofiles/export/xls | 
[**listOnExport_6**](DefaultApi.md#listOnExport_6) | **GET** /admin/leavevacationrights/export/xls | 
[**listOnExport_7**](DefaultApi.md#listOnExport_7) | **GET** /admin/leavevacationtypes/export/xls | 
[**listOnExport_8**](DefaultApi.md#listOnExport_8) | **GET** /admin/services/export/xls | 
[**listOnExport_9**](DefaultApi.md#listOnExport_9) | **GET** /admin/userprofiles/export/xls | 
[**parseFile**](DefaultApi.md#parseFile) | **POST** /fileUtil/parseFile | 
[**payroll**](DefaultApi.md#payroll) | **GET** /payroll/export | 
[**playWorflow**](DefaultApi.md#playWorflow) | **GET** /leaverequest/leaverequest/{leaveRequestBeanId}/{wfAction} | 
[**retrieveFields**](DefaultApi.md#retrieveFields) | **GET** /import/{entityBean}/retrieveFields | 
[**rollbackPayroll**](DefaultApi.md#rollbackPayroll) | **GET** /payroll/payrollLog/{payrollLogId}/rollback | 
[**setUserAvgWellBeingVote**](DefaultApi.md#setUserAvgWellBeingVote) | **POST** /wellbeing/setUserAvgWellBeingVote | 
[**setUserWellBeingVotes**](DefaultApi.md#setUserWellBeingVotes) | **POST** /wellbeing/userWellBeingVote/{userId} | 
[**setUserWidgetsPref**](DefaultApi.md#setUserWidgetsPref) | **GET** /userUtil/setUserWidgetsPref/{userId} | 
[**updateCompany**](DefaultApi.md#updateCompany) | **PUT** /admin/analyticaxe | 
[**updateCompany_0**](DefaultApi.md#updateCompany_0) | **PUT** /admin/company | 
[**updateCompany_1**](DefaultApi.md#updateCompany_1) | **PUT** /admin/connector | 
[**updateCompany_2**](DefaultApi.md#updateCompany_2) | **PUT** /timesheet | 
[**updateDaysOff**](DefaultApi.md#updateDaysOff) | **PUT** /admin/daysoff | 
[**updateGlobalParam**](DefaultApi.md#updateGlobalParam) | **PUT** /admin/globalparam | 
[**updateLeaveVacationProfile**](DefaultApi.md#updateLeaveVacationProfile) | **PUT** /admin/leavevacationprofile | 
[**updateLeaveVacationProfile_0**](DefaultApi.md#updateLeaveVacationProfile_0) | **PUT** /leaverequest/leaverequest | 
[**updateLeaveVacationRight**](DefaultApi.md#updateLeaveVacationRight) | **PUT** /admin/leavevacationright | 
[**updateLeaveVacationType**](DefaultApi.md#updateLeaveVacationType) | **PUT** /admin/leavevacationtype | 
[**updateService**](DefaultApi.md#updateService) | **PUT** /admin/service | 
[**updateUserProfile**](DefaultApi.md#updateUserProfile) | **PUT** /admin/hourprofile | 
[**updateUserProfile_0**](DefaultApi.md#updateUserProfile_0) | **PUT** /admin/userprofile | 


<a name="applyNewPwd"></a>
# **applyNewPwd**
> ModelApiResponse applyNewPwd(userId, oldPwd, newPwd1, newPwd2)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
String oldPwd = "oldPwd_example"; // String | 
String newPwd1 = "newPwd1_example"; // String | 
String newPwd2 = "newPwd2_example"; // String | 
try {
    ModelApiResponse result = apiInstance.applyNewPwd(userId, oldPwd, newPwd1, newPwd2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#applyNewPwd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **oldPwd** | **String**|  | [optional]
 **newPwd1** | **String**|  | [optional]
 **newPwd2** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="applyNewPwdStateLess"></a>
# **applyNewPwdStateLess**
> ModelApiResponse applyNewPwdStateLess(locale, concernedEmail, tempPwdKey, newPwd1, newPwd2)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String locale = "locale_example"; // String | 
String concernedEmail = "concernedEmail_example"; // String | 
String tempPwdKey = "tempPwdKey_example"; // String | 
String newPwd1 = "newPwd1_example"; // String | 
String newPwd2 = "newPwd2_example"; // String | 
try {
    ModelApiResponse result = apiInstance.applyNewPwdStateLess(locale, concernedEmail, tempPwdKey, newPwd1, newPwd2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#applyNewPwdStateLess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**|  | [optional]
 **concernedEmail** | **String**|  | [optional]
 **tempPwdKey** | **String**|  | [optional]
 **newPwd1** | **String**|  | [optional]
 **newPwd2** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="buildAzuneedPortalAccess"></a>
# **buildAzuneedPortalAccess**
> ModelApiResponse buildAzuneedPortalAccess(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.buildAzuneedPortalAccess(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildAzuneedPortalAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="buildAzuneedPortalProductQuoteAccess"></a>
# **buildAzuneedPortalProductQuoteAccess**
> ModelApiResponse buildAzuneedPortalProductQuoteAccess(userId, productId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
String productId = "productId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.buildAzuneedPortalProductQuoteAccess(userId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildAzuneedPortalProductQuoteAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **productId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="buildFilters"></a>
# **buildFilters**
> ApiResponseMessage buildFilters(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters");
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

<a name="buildFilters_0"></a>
# **buildFilters_0**
> ApiResponseMessage buildFilters_0(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_0(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_0");
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

<a name="buildFilters_1"></a>
# **buildFilters_1**
> ApiResponseMessage buildFilters_1(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_1(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_1");
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

<a name="buildFilters_2"></a>
# **buildFilters_2**
> ApiResponseMessage buildFilters_2(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_2(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_2");
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

<a name="buildFilters_3"></a>
# **buildFilters_3**
> ApiResponseMessage buildFilters_3(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_3(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_3");
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

<a name="buildFilters_4"></a>
# **buildFilters_4**
> ApiResponseMessage buildFilters_4(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_4(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_4");
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

<a name="buildFilters_5"></a>
# **buildFilters_5**
> ApiResponseMessage buildFilters_5(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_5(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_5");
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

<a name="buildFilters_6"></a>
# **buildFilters_6**
> ApiResponseMessage buildFilters_6(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_6(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_6");
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

<a name="buildFilters_7"></a>
# **buildFilters_7**
> ApiResponseMessage buildFilters_7(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_7(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_7");
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

<a name="buildFilters_8"></a>
# **buildFilters_8**
> ApiResponseMessage buildFilters_8(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.buildFilters_8(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buildFilters_8");
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

<a name="checkNewPwd1"></a>
# **checkNewPwd1**
> ModelApiResponse checkNewPwd1(userId, newPwd1)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
String newPwd1 = "newPwd1_example"; // String | 
try {
    ModelApiResponse result = apiInstance.checkNewPwd1(userId, newPwd1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#checkNewPwd1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **newPwd1** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkNewPwd2"></a>
# **checkNewPwd2**
> ModelApiResponse checkNewPwd2(userId, newPwd1, newPwd2)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
String newPwd1 = "newPwd1_example"; // String | 
String newPwd2 = "newPwd2_example"; // String | 
try {
    ModelApiResponse result = apiInstance.checkNewPwd2(userId, newPwd1, newPwd2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#checkNewPwd2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **newPwd1** | **String**|  | [optional]
 **newPwd2** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkOldPwd"></a>
# **checkOldPwd**
> ModelApiResponse checkOldPwd(userId, oldPwd)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
String oldPwd = "oldPwd_example"; // String | 
try {
    ModelApiResponse result = apiInstance.checkOldPwd(userId, oldPwd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#checkOldPwd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **oldPwd** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computeLeaveRequest"></a>
# **computeLeaveRequest**
> ApiResponseMessage computeLeaveRequest(startDate, startDateAmPm, endDate, endDateAmPm, userId, leaveVacationTypeBeanId, leaveRequestBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String startDate = "startDate_example"; // String | 
String startDateAmPm = "startDateAmPm_example"; // String | 
String endDate = "endDate_example"; // String | 
String endDateAmPm = "endDateAmPm_example"; // String | 
String userId = "userId_example"; // String | 
String leaveVacationTypeBeanId = "leaveVacationTypeBeanId_example"; // String | 
String leaveRequestBeanId = "leaveRequestBeanId_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.computeLeaveRequest(startDate, startDateAmPm, endDate, endDateAmPm, userId, leaveVacationTypeBeanId, leaveRequestBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#computeLeaveRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**|  | [optional]
 **startDateAmPm** | **String**|  | [optional]
 **endDate** | **String**|  | [optional]
 **endDateAmPm** | **String**|  | [optional]
 **userId** | **String**|  | [optional]
 **leaveVacationTypeBeanId** | **String**|  | [optional]
 **leaveRequestBeanId** | **String**|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="computeWellBeingVoteForDashBoard"></a>
# **computeWellBeingVoteForDashBoard**
> ModelApiResponse computeWellBeingVoteForDashBoard(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.computeWellBeingVoteForDashBoard(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#computeWellBeingVoteForDashBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="copy"></a>
# **copy**
> ApiResponseMessage copy(srcIdCompany, destIdCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String srcIdCompany = "srcIdCompany_example"; // String | 
String destIdCompany = "destIdCompany_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.copy(srcIdCompany, destIdCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#copy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcIdCompany** | **String**|  |
 **destIdCompany** | **String**|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="copy_0"></a>
# **copy_0**
> ApiResponseMessage copy_0(srcIdCompany, destIdCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String srcIdCompany = "srcIdCompany_example"; // String | 
String destIdCompany = "destIdCompany_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.copy_0(srcIdCompany, destIdCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#copy_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcIdCompany** | **String**|  |
 **destIdCompany** | **String**|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFreeTrial"></a>
# **createFreeTrial**
> ModelApiResponse createFreeTrial(destIdCompany, companyName, referentGender, referentFirstName, referentLastName, referentEmailAddress, locale, companyType, companyBillingId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String destIdCompany = "destIdCompany_example"; // String | 
String companyName = "companyName_example"; // String | 
String referentGender = "referentGender_example"; // String | 
String referentFirstName = "referentFirstName_example"; // String | 
String referentLastName = "referentLastName_example"; // String | 
String referentEmailAddress = "referentEmailAddress_example"; // String | 
String locale = "locale_example"; // String | 
String companyType = "companyType_example"; // String | 
String companyBillingId = "companyBillingId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.createFreeTrial(destIdCompany, companyName, referentGender, referentFirstName, referentLastName, referentEmailAddress, locale, companyType, companyBillingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createFreeTrial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destIdCompany** | **String**|  | [optional]
 **companyName** | **String**|  | [optional]
 **referentGender** | **String**|  | [optional]
 **referentFirstName** | **String**|  | [optional]
 **referentLastName** | **String**|  | [optional]
 **referentEmailAddress** | **String**|  | [optional]
 **locale** | **String**|  | [optional]
 **companyType** | **String**|  | [optional]
 **companyBillingId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrUpdate"></a>
# **createOrUpdate**
> ApiResponseMessage createOrUpdate(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createOrUpdate_0"></a>
# **createOrUpdate_0**
> ApiResponseMessage createOrUpdate_0(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createOrUpdate_1"></a>
# **createOrUpdate_1**
> ApiResponseMessage createOrUpdate_1(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createOrUpdate_10"></a>
# **createOrUpdate_10**
> ApiResponseMessage createOrUpdate_10(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_10(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="createOrUpdate_11"></a>
# **createOrUpdate_11**
> ApiResponseMessage createOrUpdate_11(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_11(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createOrUpdate_12"></a>
# **createOrUpdate_12**
> ApiResponseMessage createOrUpdate_12(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_12(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createOrUpdate_2"></a>
# **createOrUpdate_2**
> ApiResponseMessage createOrUpdate_2(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="createOrUpdate_3"></a>
# **createOrUpdate_3**
> ApiResponseMessage createOrUpdate_3(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_3(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createOrUpdate_4"></a>
# **createOrUpdate_4**
> ApiResponseMessage createOrUpdate_4(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_4(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="createOrUpdate_5"></a>
# **createOrUpdate_5**
> ApiResponseMessage createOrUpdate_5(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_5(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="createOrUpdate_6"></a>
# **createOrUpdate_6**
> ApiResponseMessage createOrUpdate_6(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_6(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="createOrUpdate_7"></a>
# **createOrUpdate_7**
> ApiResponseMessage createOrUpdate_7(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_7(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="createOrUpdate_8"></a>
# **createOrUpdate_8**
> ApiResponseMessage createOrUpdate_8(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_8(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="createOrUpdate_9"></a>
# **createOrUpdate_9**
> ApiResponseMessage createOrUpdate_9(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.createOrUpdate_9(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createOrUpdate_9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="deleteAnalyticAxe"></a>
# **deleteAnalyticAxe**
> ModelApiResponse deleteAnalyticAxe(analyticalAxeId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String analyticalAxeId = "analyticalAxeId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteAnalyticAxe(analyticalAxeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteAnalyticAxe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticalAxeId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCompany"></a>
# **deleteCompany**
> ModelApiResponse deleteCompany(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteCompany(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCompany_0"></a>
# **deleteCompany_0**
> ModelApiResponse deleteCompany_0(connectorId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String connectorId = "connectorId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteCompany_0(connectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteCompany_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDaysOff"></a>
# **deleteDaysOff**
> ModelApiResponse deleteDaysOff(daysOffId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String daysOffId = "daysOffId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteDaysOff(daysOffId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteDaysOff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daysOffId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteHourProfile"></a>
# **deleteHourProfile**
> ModelApiResponse deleteHourProfile(idHourProfile)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idHourProfile = "idHourProfile_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteHourProfile(idHourProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteHourProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idHourProfile** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteLeaveRequest"></a>
# **deleteLeaveRequest**
> ModelApiResponse deleteLeaveRequest(leaveRequestBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveRequestBeanId = "leaveRequestBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteLeaveRequest(leaveRequestBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteLeaveRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveRequestBeanId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteLeaveVacationProfile"></a>
# **deleteLeaveVacationProfile**
> ModelApiResponse deleteLeaveVacationProfile(leaveVacationProfileBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveVacationProfileBeanId = "leaveVacationProfileBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteLeaveVacationProfile(leaveVacationProfileBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteLeaveVacationProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveVacationProfileBeanId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteLeaveVacationType"></a>
# **deleteLeaveVacationType**
> ModelApiResponse deleteLeaveVacationType(leaveVacationRightBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveVacationRightBeanId = "leaveVacationRightBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteLeaveVacationType(leaveVacationRightBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteLeaveVacationType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveVacationRightBeanId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteLeaveVacationType_0"></a>
# **deleteLeaveVacationType_0**
> ModelApiResponse deleteLeaveVacationType_0(leaveVacationTypeBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveVacationTypeBeanId = "leaveVacationTypeBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteLeaveVacationType_0(leaveVacationTypeBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteLeaveVacationType_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveVacationTypeBeanId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteService"></a>
# **deleteService**
> ModelApiResponse deleteService(idService)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idService = "idService_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteService(idService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idService** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteTimesheet"></a>
# **deleteTimesheet**
> ModelApiResponse deleteTimesheet(timesheetId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String timesheetId = "timesheetId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteTimesheet(timesheetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteTimesheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timesheetId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserProfile"></a>
# **deleteUserProfile**
> ModelApiResponse deleteUserProfile(idUserProfile)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idUserProfile = "idUserProfile_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteUserProfile(idUserProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUserProfile** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteWellBeing"></a>
# **deleteWellBeing**
> ModelApiResponse deleteWellBeing(wellBeingId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String wellBeingId = "wellBeingId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.deleteWellBeing(wellBeingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteWellBeing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wellBeingId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="doAuthWithLoginAndPwd"></a>
# **doAuthWithLoginAndPwd**
> ModelApiResponse doAuthWithLoginAndPwd(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UserBean body = new UserBean(); // UserBean | 
try {
    ModelApiResponse result = apiInstance.doAuthWithLoginAndPwd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#doAuthWithLoginAndPwd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserBean**](UserBean.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="doAuthWithStayConnectedToken"></a>
# **doAuthWithStayConnectedToken**
> ModelApiResponse doAuthWithStayConnectedToken(stayConnectedToken)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String stayConnectedToken = "stayConnectedToken_example"; // String | 
try {
    ModelApiResponse result = apiInstance.doAuthWithStayConnectedToken(stayConnectedToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#doAuthWithStayConnectedToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stayConnectedToken** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="doAuthWithTempToken"></a>
# **doAuthWithTempToken**
> ModelApiResponse doAuthWithTempToken(tempToken, userEmail)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String tempToken = "tempToken_example"; // String | 
String userEmail = "userEmail_example"; // String | 
try {
    ModelApiResponse result = apiInstance.doAuthWithTempToken(tempToken, userEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#doAuthWithTempToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tempToken** | **String**|  | [optional]
 **userEmail** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="doLogout"></a>
# **doLogout**
> ApiResponseMessage doLogout()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.doLogout();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#doLogout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList"></a>
# **fetchList**
> ModelApiResponse fetchList(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_0"></a>
# **fetchList_0**
> ModelApiResponse fetchList_0(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_0(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_1"></a>
# **fetchList_1**
> ModelApiResponse fetchList_1(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_1(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_10"></a>
# **fetchList_10**
> ModelApiResponse fetchList_10(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_10(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_11"></a>
# **fetchList_11**
> ModelApiResponse fetchList_11(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_11(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_12"></a>
# **fetchList_12**
> ModelApiResponse fetchList_12(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_12(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_13"></a>
# **fetchList_13**
> ModelApiResponse fetchList_13(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_13(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_14"></a>
# **fetchList_14**
> ModelApiResponse fetchList_14(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_14(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_14");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_2"></a>
# **fetchList_2**
> ModelApiResponse fetchList_2(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_2(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_3"></a>
# **fetchList_3**
> ModelApiResponse fetchList_3(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_3(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_4"></a>
# **fetchList_4**
> ModelApiResponse fetchList_4(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_4(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_5"></a>
# **fetchList_5**
> ModelApiResponse fetchList_5(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_5(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_6"></a>
# **fetchList_6**
> ModelApiResponse fetchList_6(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_6(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_7"></a>
# **fetchList_7**
> ModelApiResponse fetchList_7(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_7(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_8"></a>
# **fetchList_8**
> ModelApiResponse fetchList_8(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_8(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchList_9"></a>
# **fetchList_9**
> ModelApiResponse fetchList_9(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.fetchList_9(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fetchList_9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAConnector"></a>
# **getAConnector**
> ModelApiResponse getAConnector(connectorId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String connectorId = "connectorId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getAConnector(connectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAConnectorModel"></a>
# **getAConnectorModel**
> ModelApiResponse getAConnectorModel(connectorModelId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String connectorModelId = "connectorModelId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getAConnectorModel(connectorModelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAConnectorModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorModelId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getALeaveVacationTypeModel"></a>
# **getALeaveVacationTypeModel**
> ModelApiResponse getALeaveVacationTypeModel(leaveVacationTypeBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveVacationTypeBeanId = "leaveVacationTypeBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getALeaveVacationTypeModel(leaveVacationTypeBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getALeaveVacationTypeModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveVacationTypeBeanId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAModelDaysOff"></a>
# **getAModelDaysOff**
> ModelApiResponse getAModelDaysOff(daysOffBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String daysOffBeanId = "daysOffBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getAModelDaysOff(daysOffBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAModelDaysOff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daysOffBeanId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAUserProfileModel"></a>
# **getAUserProfileModel**
> ModelApiResponse getAUserProfileModel(userProfileBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userProfileBeanId = "userProfileBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getAUserProfileModel(userProfileBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAUserProfileModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userProfileBeanId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticAxeLinkedFamilies"></a>
# **getAnalyticAxeLinkedFamilies**
> ModelApiResponse getAnalyticAxeLinkedFamilies(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getAnalyticAxeLinkedFamilies(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAnalyticAxeLinkedFamilies");
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

<a name="getAnalyticAxeLinkedFamiliesForImputation"></a>
# **getAnalyticAxeLinkedFamiliesForImputation**
> ModelApiResponse getAnalyticAxeLinkedFamiliesForImputation(idCompany, userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
String userId = "userId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getAnalyticAxeLinkedFamiliesForImputation(idCompany, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAnalyticAxeLinkedFamiliesForImputation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **userId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalyticalAxeOptionList"></a>
# **getAnalyticalAxeOptionList**
> ModelApiResponse getAnalyticalAxeOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getAnalyticalAxeOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAnalyticalAxeOptionList");
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

<a name="getAppServerVersion"></a>
# **getAppServerVersion**
> ModelApiResponse getAppServerVersion()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ModelApiResponse result = apiInstance.getAppServerVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAppServerVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCalendarDaysOffModelOptionList"></a>
# **getCalendarDaysOffModelOptionList**
> ModelApiResponse getCalendarDaysOffModelOptionList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ModelApiResponse result = apiInstance.getCalendarDaysOffModelOptionList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCalendarDaysOffModelOptionList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCalendarDaysOffOptionList"></a>
# **getCalendarDaysOffOptionList**
> ModelApiResponse getCalendarDaysOffOptionList(idCompany, includeModel)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
Boolean includeModel = true; // Boolean | 
try {
    ModelApiResponse result = apiInstance.getCalendarDaysOffOptionList(idCompany, includeModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCalendarDaysOffOptionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **includeModel** | **Boolean**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompanyConnectorOptionList"></a>
# **getCompanyConnectorOptionList**
> ModelApiResponse getCompanyConnectorOptionList(idCompany, typeOf)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
String typeOf = "typeOf_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getCompanyConnectorOptionList(idCompany, typeOf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCompanyConnectorOptionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **typeOf** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompanyOptionList"></a>
# **getCompanyOptionList**
> ModelApiResponse getCompanyOptionList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ModelApiResponse result = apiInstance.getCompanyOptionList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCompanyOptionList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompanyOrganizationsOptionList"></a>
# **getCompanyOrganizationsOptionList**
> ModelApiResponse getCompanyOrganizationsOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getCompanyOrganizationsOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCompanyOrganizationsOptionList");
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

<a name="getCompanySupportContacts"></a>
# **getCompanySupportContacts**
> ModelApiResponse getCompanySupportContacts(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getCompanySupportContacts(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCompanySupportContacts");
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

<a name="getConnectorsModel"></a>
# **getConnectorsModel**
> ModelApiResponse getConnectorsModel(idCompany, typeOf, onlySystemModel)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
String typeOf = "typeOf_example"; // String | 
Boolean onlySystemModel = true; // Boolean | 
try {
    ModelApiResponse result = apiInstance.getConnectorsModel(idCompany, typeOf, onlySystemModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getConnectorsModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **typeOf** | **String**|  | [optional]
 **onlySystemModel** | **Boolean**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData"></a>
# **getData**
> ModelApiResponse getData(analyticalAxeId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String analyticalAxeId = "analyticalAxeId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData(analyticalAxeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticalAxeId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData_0"></a>
# **getData_0**
> ModelApiResponse getData_0(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_0(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData_1"></a>
# **getData_1**
> ModelApiResponse getData_1(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_1(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData_10"></a>
# **getData_10**
> ModelApiResponse getData_10(idUserProfile)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idUserProfile = "idUserProfile_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_10(idUserProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idUserProfile** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData_11"></a>
# **getData_11**
> ModelApiResponse getData_11(leaveRequestBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveRequestBeanId = "leaveRequestBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_11(leaveRequestBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveRequestBeanId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getData_12"></a>
# **getData_12**
> ModelApiResponse getData_12(payrollLogId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String payrollLogId = "payrollLogId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_12(payrollLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payrollLogId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData_13"></a>
# **getData_13**
> ModelApiResponse getData_13(timesheetId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String timesheetId = "timesheetId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_13(timesheetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timesheetId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData_2"></a>
# **getData_2**
> ModelApiResponse getData_2(idConnector)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idConnector = "idConnector_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_2(idConnector);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idConnector** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData_3"></a>
# **getData_3**
> ModelApiResponse getData_3(daysOffId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String daysOffId = "daysOffId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_3(daysOffId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daysOffId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getData_4"></a>
# **getData_4**
> ModelApiResponse getData_4(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_4(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getData_5"></a>
# **getData_5**
> ModelApiResponse getData_5(idHourProfile)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idHourProfile = "idHourProfile_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_5(idHourProfile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idHourProfile** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getData_6"></a>
# **getData_6**
> ModelApiResponse getData_6(leaveVacationProfileBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveVacationProfileBeanId = "leaveVacationProfileBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_6(leaveVacationProfileBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveVacationProfileBeanId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getData_7"></a>
# **getData_7**
> ModelApiResponse getData_7(leaveVacationRightBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveVacationRightBeanId = "leaveVacationRightBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_7(leaveVacationRightBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveVacationRightBeanId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getData_8"></a>
# **getData_8**
> ModelApiResponse getData_8(leaveVacationTypeBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveVacationTypeBeanId = "leaveVacationTypeBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_8(leaveVacationTypeBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveVacationTypeBeanId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getData_9"></a>
# **getData_9**
> ModelApiResponse getData_9(idService)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idService = "idService_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getData_9(idService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getData_9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idService** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDaysOffDaysDefItemForAGivenDate"></a>
# **getDaysOffDaysDefItemForAGivenDate**
> ModelApiResponse getDaysOffDaysDefItemForAGivenDate(userId, date)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
String date = "date_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getDaysOffDaysDefItemForAGivenDate(userId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDaysOffDaysDefItemForAGivenDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **date** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileImportModel"></a>
# **getFileImportModel**
> ModelApiResponse getFileImportModel(entityBean, idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String entityBean = "entityBean_example"; // String | 
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getFileImportModel(entityBean, idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getFileImportModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityBean** | **String**|  |
 **idCompany** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHourProfileDayPartForAGivenDate"></a>
# **getHourProfileDayPartForAGivenDate**
> HourProfilePerDayItem getHourProfileDayPartForAGivenDate(userId, date)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
String date = "date_example"; // String | 
try {
    HourProfilePerDayItem result = apiInstance.getHourProfileDayPartForAGivenDate(userId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHourProfileDayPartForAGivenDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **date** | **String**|  | [optional]

### Return type

[**HourProfilePerDayItem**](HourProfilePerDayItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHourProfileOptionList"></a>
# **getHourProfileOptionList**
> ModelApiResponse getHourProfileOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getHourProfileOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHourProfileOptionList");
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

<a name="getLeaveRequestForAGivenDay"></a>
# **getLeaveRequestForAGivenDay**
> ApiResponseMessage getLeaveRequestForAGivenDay(userId, date)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
String date = "date_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.getLeaveRequestForAGivenDay(userId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLeaveRequestForAGivenDay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **date** | **String**|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLeaveVacationProfileOptionList"></a>
# **getLeaveVacationProfileOptionList**
> ModelApiResponse getLeaveVacationProfileOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getLeaveVacationProfileOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLeaveVacationProfileOptionList");
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

<a name="getLeaveVacationProfileTypeOptionList"></a>
# **getLeaveVacationProfileTypeOptionList**
> ModelApiResponse getLeaveVacationProfileTypeOptionList(idCompany, leaveVacationProfileBeanId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
String leaveVacationProfileBeanId = "leaveVacationProfileBeanId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getLeaveVacationProfileTypeOptionList(idCompany, leaveVacationProfileBeanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLeaveVacationProfileTypeOptionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **leaveVacationProfileBeanId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLeaveVacationTypeModelOptionList"></a>
# **getLeaveVacationTypeModelOptionList**
> ModelApiResponse getLeaveVacationTypeModelOptionList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ModelApiResponse result = apiInstance.getLeaveVacationTypeModelOptionList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLeaveVacationTypeModelOptionList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLeaveVacationTypeOptionList"></a>
# **getLeaveVacationTypeOptionList**
> ModelApiResponse getLeaveVacationTypeOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getLeaveVacationTypeOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLeaveVacationTypeOptionList");
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

<a name="getListOfWidgets"></a>
# **getListOfWidgets**
> ModelApiResponse getListOfWidgets()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ModelApiResponse result = apiInstance.getListOfWidgets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getListOfWidgets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPayrollItem"></a>
# **getPayrollItem**
> ModelApiResponse getPayrollItem(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getPayrollItem(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPayrollItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductAndOptionList"></a>
# **getProductAndOptionList**
> ApiResponseMessage getProductAndOptionList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.getProductAndOptionList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProductAndOptionList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductAssociationForEachService"></a>
# **getProductAssociationForEachService**
> ModelApiResponse getProductAssociationForEachService()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ModelApiResponse result = apiInstance.getProductAssociationForEachService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProductAssociationForEachService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceListOfDefaultParam"></a>
# **getServiceListOfDefaultParam**
> ModelApiResponse getServiceListOfDefaultParam(idService)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idService = "idService_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getServiceListOfDefaultParam(idService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getServiceListOfDefaultParam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idService** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServiceOptionList"></a>
# **getServiceOptionList**
> ModelApiResponse getServiceOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getServiceOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getServiceOptionList");
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

<a name="getServiceWidget"></a>
# **getServiceWidget**
> ModelApiResponse getServiceWidget(serviceType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String serviceType = "serviceType_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getServiceWidget(serviceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getServiceWidget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceType** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserLeaveVacationTypeOptionList"></a>
# **getUserLeaveVacationTypeOptionList**
> ModelApiResponse getUserLeaveVacationTypeOptionList(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getUserLeaveVacationTypeOptionList(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserLeaveVacationTypeOptionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserOptionList"></a>
# **getUserOptionList**
> ModelApiResponse getUserOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getUserOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserOptionList");
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

<a name="getUserProfileModelOptionList"></a>
# **getUserProfileModelOptionList**
> ModelApiResponse getUserProfileModelOptionList()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ModelApiResponse result = apiInstance.getUserProfileModelOptionList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserProfileModelOptionList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserProfileOptionList"></a>
# **getUserProfileOptionList**
> ModelApiResponse getUserProfileOptionList(idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getUserProfileOptionList(idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserProfileOptionList");
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

<a name="getUserWidgetsPref"></a>
# **getUserWidgetsPref**
> ModelApiResponse getUserWidgetsPref(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getUserWidgetsPref(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserWidgetsPref");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersLeaveRequests"></a>
# **getUsersLeaveRequests**
> ModelApiResponse getUsersLeaveRequests(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getUsersLeaveRequests(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUsersLeaveRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersWellBeingVotes"></a>
# **getUsersWellBeingVotes**
> ModelApiResponse getUsersWellBeingVotes(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ModelApiResponse result = apiInstance.getUsersWellBeingVotes(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUsersWellBeingVotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersWithPresenceInfos"></a>
# **getUsersWithPresenceInfos**
> List&lt;UserWithDatasContainerBoolean&gt; getUsersWithPresenceInfos(date)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
DateTime date = new DateTime(); // DateTime | 
try {
    List<UserWithDatasContainerBoolean> result = apiInstance.getUsersWithPresenceInfos(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUsersWithPresenceInfos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **DateTime**|  | [optional]

### Return type

[**List&lt;UserWithDatasContainerBoolean&gt;**](UserWithDatasContainerBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importData"></a>
# **importData**
> ModelApiResponse importData(entityBean, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String entityBean = "entityBean_example"; // String | 
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.importData(entityBean, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#importData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityBean** | **String**|  |
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="initNewPwdProcess"></a>
# **initNewPwdProcess**
> ModelApiResponse initNewPwdProcess(email, locale)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String email = "email_example"; // String | 
String locale = "locale_example"; // String | 
try {
    ModelApiResponse result = apiInstance.initNewPwdProcess(email, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#initNewPwdProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  | [optional]
 **locale** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="isLastLevelWorkflow"></a>
# **isLastLevelWorkflow**
> ApiResponseMessage isLastLevelWorkflow(idCompany, idUser, idModule, currentLevel, idCondition)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String idCompany = "idCompany_example"; // String | 
String idUser = "idUser_example"; // String | 
String idModule = "idModule_example"; // String | 
Integer currentLevel = 56; // Integer | 
String idCondition = "idCondition_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.isLastLevelWorkflow(idCompany, idUser, idModule, currentLevel, idCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#isLastLevelWorkflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idCompany** | **String**|  | [optional]
 **idUser** | **String**|  | [optional]
 **idModule** | **String**|  | [optional]
 **currentLevel** | **Integer**|  | [optional]
 **idCondition** | **String**|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keepMeAlive"></a>
# **keepMeAlive**
> keepMeAlive()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.keepMeAlive();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#keepMeAlive");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="killSession"></a>
# **killSession**
> ModelApiResponse killSession(sessionId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String sessionId = "sessionId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.killSession(sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#killSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAllActiveSession"></a>
# **listAllActiveSession**
> ModelApiResponse listAllActiveSession()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ModelApiResponse result = apiInstance.listAllActiveSession();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listAllActiveSession");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport"></a>
# **listOnExport**
> ApiResponseMessage listOnExport()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.listOnExport();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport_0"></a>
# **listOnExport_0**
> ApiResponseMessage listOnExport_0()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.listOnExport_0();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_0");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport_1"></a>
# **listOnExport_1**
> ApiResponseMessage listOnExport_1()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.listOnExport_1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport_10"></a>
# **listOnExport_10**
> ApiResponseMessage listOnExport_10(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_10(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_10");
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

<a name="listOnExport_11"></a>
# **listOnExport_11**
> ApiResponseMessage listOnExport_11(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_11(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_11");
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

<a name="listOnExport_12"></a>
# **listOnExport_12**
> ApiResponseMessage listOnExport_12(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_12(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_12");
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

<a name="listOnExport_13"></a>
# **listOnExport_13**
> ApiResponseMessage listOnExport_13(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_13(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_13");
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

<a name="listOnExport_14"></a>
# **listOnExport_14**
> ApiResponseMessage listOnExport_14()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.listOnExport_14();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_14");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport_2"></a>
# **listOnExport_2**
> ApiResponseMessage listOnExport_2()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.listOnExport_2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport_3"></a>
# **listOnExport_3**
> ApiResponseMessage listOnExport_3()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.listOnExport_3();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_3");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport_4"></a>
# **listOnExport_4**
> ApiResponseMessage listOnExport_4(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_4(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_4");
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

<a name="listOnExport_5"></a>
# **listOnExport_5**
> ApiResponseMessage listOnExport_5(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_5(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_5");
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

<a name="listOnExport_6"></a>
# **listOnExport_6**
> ApiResponseMessage listOnExport_6(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_6(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_6");
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

<a name="listOnExport_7"></a>
# **listOnExport_7**
> ApiResponseMessage listOnExport_7(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_7(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_7");
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

<a name="listOnExport_8"></a>
# **listOnExport_8**
> ApiResponseMessage listOnExport_8()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ApiResponseMessage result = apiInstance.listOnExport_8();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_8");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOnExport_9"></a>
# **listOnExport_9**
> ApiResponseMessage listOnExport_9(filters)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
try {
    ApiResponseMessage result = apiInstance.listOnExport_9(filters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listOnExport_9");
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

<a name="parseFile"></a>
# **parseFile**
> ModelApiResponse parseFile(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.parseFile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#parseFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="payroll"></a>
# **payroll**
> ModelApiResponse payroll(filters, preview, closePayroll)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String filters = "filters_example"; // String | 
Boolean preview = true; // Boolean | 
Boolean closePayroll = true; // Boolean | 
try {
    ModelApiResponse result = apiInstance.payroll(filters, preview, closePayroll);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#payroll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filters** | **String**|  | [optional]
 **preview** | **Boolean**|  | [optional]
 **closePayroll** | **Boolean**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playWorflow"></a>
# **playWorflow**
> ModelApiResponse playWorflow(leaveRequestBeanId, wfAction, message)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String leaveRequestBeanId = "leaveRequestBeanId_example"; // String | 
String wfAction = "wfAction_example"; // String | 
String message = "message_example"; // String | 
try {
    ModelApiResponse result = apiInstance.playWorflow(leaveRequestBeanId, wfAction, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#playWorflow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leaveRequestBeanId** | **String**|  |
 **wfAction** | **String**|  | [enum: NO_ACTION, INIT, SUBMIT, VALIDATE, CANCEL, LEAVE_MESSAGE]
 **message** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="retrieveFields"></a>
# **retrieveFields**
> ModelApiResponse retrieveFields(entityBean, idCompany)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String entityBean = "entityBean_example"; // String | 
String idCompany = "idCompany_example"; // String | 
try {
    ModelApiResponse result = apiInstance.retrieveFields(entityBean, idCompany);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#retrieveFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityBean** | **String**|  |
 **idCompany** | **String**|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rollbackPayroll"></a>
# **rollbackPayroll**
> ModelApiResponse rollbackPayroll(payrollLogId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String payrollLogId = "payrollLogId_example"; // String | 
try {
    ModelApiResponse result = apiInstance.rollbackPayroll(payrollLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rollbackPayroll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payrollLogId** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setUserAvgWellBeingVote"></a>
# **setUserAvgWellBeingVote**
> ModelApiResponse setUserAvgWellBeingVote(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.setUserAvgWellBeingVote(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setUserAvgWellBeingVote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="setUserWellBeingVotes"></a>
# **setUserWellBeingVotes**
> ModelApiResponse setUserWellBeingVotes(userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.setUserWellBeingVotes(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setUserWellBeingVotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="setUserWidgetsPref"></a>
# **setUserWidgetsPref**
> ModelApiResponse setUserWidgetsPref(userId, userWidgetsPref)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userId = "userId_example"; // String | 
List<String> userWidgetsPref = Arrays.asList("userWidgetsPref_example"); // List<String> | 
try {
    ModelApiResponse result = apiInstance.setUserWidgetsPref(userId, userWidgetsPref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setUserWidgetsPref");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **userWidgetsPref** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompany"></a>
# **updateCompany**
> ModelApiResponse updateCompany(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.updateCompany(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateCompany_0"></a>
# **updateCompany_0**
> ModelApiResponse updateCompany_0(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.updateCompany_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCompany_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateCompany_1"></a>
# **updateCompany_1**
> ModelApiResponse updateCompany_1(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.updateCompany_1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCompany_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateCompany_2"></a>
# **updateCompany_2**
> ModelApiResponse updateCompany_2(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.updateCompany_2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCompany_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateDaysOff"></a>
# **updateDaysOff**
> ApiResponseMessage updateDaysOff(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.updateDaysOff(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateDaysOff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="updateGlobalParam"></a>
# **updateGlobalParam**
> ModelApiResponse updateGlobalParam(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.updateGlobalParam(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateGlobalParam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateLeaveVacationProfile"></a>
# **updateLeaveVacationProfile**
> ApiResponseMessage updateLeaveVacationProfile(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.updateLeaveVacationProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateLeaveVacationProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="updateLeaveVacationProfile_0"></a>
# **updateLeaveVacationProfile_0**
> ApiResponseMessage updateLeaveVacationProfile_0(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.updateLeaveVacationProfile_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateLeaveVacationProfile_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="updateLeaveVacationRight"></a>
# **updateLeaveVacationRight**
> ApiResponseMessage updateLeaveVacationRight(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.updateLeaveVacationRight(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateLeaveVacationRight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="updateLeaveVacationType"></a>
# **updateLeaveVacationType**
> ApiResponseMessage updateLeaveVacationType(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.updateLeaveVacationType(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateLeaveVacationType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="updateService"></a>
# **updateService**
> ModelApiResponse updateService(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ModelApiResponse result = apiInstance.updateService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="updateUserProfile"></a>
# **updateUserProfile**
> ApiResponseMessage updateUserProfile(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.updateUserProfile(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="updateUserProfile_0"></a>
# **updateUserProfile_0**
> ApiResponseMessage updateUserProfile_0(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    ApiResponseMessage result = apiInstance.updateUserProfile_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateUserProfile_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**ApiResponseMessage**](ApiResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

