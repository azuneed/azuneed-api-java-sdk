# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        String filters = "filters_example"; // String | 
        try {
            ApiResponseMessage result = apiInstance.buildFilters(filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#buildFilters");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**buildFilters**](docs/AdminApi.md#buildFilters) | **GET** /admin/users/filters | 
*AdminApi* | [**createOrUpdate**](docs/AdminApi.md#createOrUpdate) | **POST** /admin/user | Create a user
*AdminApi* | [**deleteUser**](docs/AdminApi.md#deleteUser) | **DELETE** /admin/user/{idUser} | Delete the given user
*AdminApi* | [**fetchList**](docs/AdminApi.md#fetchList) | **GET** /admin/users | Fetch list of users
*AdminApi* | [**getData**](docs/AdminApi.md#getData) | **GET** /admin/user/{idUser} | Retrieve a specific user with ID
*AdminApi* | [**getListValueOptionList**](docs/AdminApi.md#getListValueOptionList) | **GET** /lvaUtil/getListValueOptionList | 
*AdminApi* | [**getUserDiagramm**](docs/AdminApi.md#getUserDiagramm) | **GET** /admin/user/diagramm/{idUser} | 
*AdminApi* | [**getUsersWithPresenceInfos**](docs/AdminApi.md#getUsersWithPresenceInfos) | **GET** /admin/users/withPresenceInfos | 
*AdminApi* | [**getValueFromListValue**](docs/AdminApi.md#getValueFromListValue) | **GET** /lvaUtil/getValueFromListValue | 
*AdminApi* | [**getWorkflowListValueOptionList**](docs/AdminApi.md#getWorkflowListValueOptionList) | **GET** /lvaUtil/getWorkflowListValueOptionList | 
*AdminApi* | [**invalidateListValueCache**](docs/AdminApi.md#invalidateListValueCache) | **GET** /lvaUtil/admin/invalidateListValueCache | 
*AdminApi* | [**listOnExport**](docs/AdminApi.md#listOnExport) | **GET** /admin/users/export/xls | Export the list of users
*AdminApi* | [**updateUser**](docs/AdminApi.md#updateUser) | **PUT** /admin/user | Update a user
*DefaultApi* | [**applyNewPwd**](docs/DefaultApi.md#applyNewPwd) | **GET** /pwdUtil/updatePwdProcess/applyNewPwd | 
*DefaultApi* | [**applyNewPwdStateLess**](docs/DefaultApi.md#applyNewPwdStateLess) | **GET** /pwdUtil/updatePwdProcess/applyNewPwd/stateLess | 
*DefaultApi* | [**buildAzuneedPortalAccess**](docs/DefaultApi.md#buildAzuneedPortalAccess) | **GET** /azuneedPortalUtil/buildAzuneedPortalAccess | 
*DefaultApi* | [**buildAzuneedPortalProductQuoteAccess**](docs/DefaultApi.md#buildAzuneedPortalProductQuoteAccess) | **GET** /azuneedPortalUtil/buildAzuneedPortalProductQuoteAccess | 
*DefaultApi* | [**buildFilters**](docs/DefaultApi.md#buildFilters) | **GET** /admin/hourprofiles/filters | 
*DefaultApi* | [**buildFilters_0**](docs/DefaultApi.md#buildFilters_0) | **GET** /admin/leavevacationprofiles/filters | 
*DefaultApi* | [**buildFilters_1**](docs/DefaultApi.md#buildFilters_1) | **GET** /admin/leavevacationrights/filters | 
*DefaultApi* | [**buildFilters_2**](docs/DefaultApi.md#buildFilters_2) | **GET** /admin/leavevacationtypes/filters | 
*DefaultApi* | [**buildFilters_3**](docs/DefaultApi.md#buildFilters_3) | **GET** /admin/userprofiles/filters | 
*DefaultApi* | [**buildFilters_4**](docs/DefaultApi.md#buildFilters_4) | **GET** /leaverequest/leaverequests/filters | 
*DefaultApi* | [**buildFilters_5**](docs/DefaultApi.md#buildFilters_5) | **GET** /payroll/filters | 
*DefaultApi* | [**buildFilters_6**](docs/DefaultApi.md#buildFilters_6) | **GET** /timesheetAnalysis/filters | 
*DefaultApi* | [**buildFilters_7**](docs/DefaultApi.md#buildFilters_7) | **GET** /timesheets/filters | 
*DefaultApi* | [**buildFilters_8**](docs/DefaultApi.md#buildFilters_8) | **GET** /wellbeing/filters | 
*DefaultApi* | [**checkNewPwd1**](docs/DefaultApi.md#checkNewPwd1) | **GET** /pwdUtil/updatePwdProcess/checkNewPwd1 | 
*DefaultApi* | [**checkNewPwd2**](docs/DefaultApi.md#checkNewPwd2) | **GET** /pwdUtil/updatePwdProcess/checkNewPwd2 | 
*DefaultApi* | [**checkOldPwd**](docs/DefaultApi.md#checkOldPwd) | **GET** /pwdUtil/updatePwdProcess/checkOldPwd | 
*DefaultApi* | [**computeLeaveRequest**](docs/DefaultApi.md#computeLeaveRequest) | **GET** /leaveRequestUtil/computeLeaveRequest | 
*DefaultApi* | [**computeWellBeingVoteForDashBoard**](docs/DefaultApi.md#computeWellBeingVoteForDashBoard) | **GET** /wellbeing/usersWellBeingVotes/dashboard | 
*DefaultApi* | [**copy**](docs/DefaultApi.md#copy) | **GET** /admin/company/{srcIdCompany}/copy | 
*DefaultApi* | [**copy_0**](docs/DefaultApi.md#copy_0) | **GET** /wellbeing/company/{srcIdCompany}/copy | 
*DefaultApi* | [**createFreeTrial**](docs/DefaultApi.md#createFreeTrial) | **GET** /companyUtil/createFreeTrial | 
*DefaultApi* | [**createOrUpdate**](docs/DefaultApi.md#createOrUpdate) | **POST** /admin/analyticaxe | 
*DefaultApi* | [**createOrUpdate_0**](docs/DefaultApi.md#createOrUpdate_0) | **POST** /admin/company | 
*DefaultApi* | [**createOrUpdate_1**](docs/DefaultApi.md#createOrUpdate_1) | **POST** /admin/connector | 
*DefaultApi* | [**createOrUpdate_10**](docs/DefaultApi.md#createOrUpdate_10) | **POST** /leaverequest/leaverequest | 
*DefaultApi* | [**createOrUpdate_11**](docs/DefaultApi.md#createOrUpdate_11) | **POST** /timesheet | 
*DefaultApi* | [**createOrUpdate_12**](docs/DefaultApi.md#createOrUpdate_12) | **POST** /wellbeing/createOrUpdate | 
*DefaultApi* | [**createOrUpdate_2**](docs/DefaultApi.md#createOrUpdate_2) | **POST** /admin/daysoff | 
*DefaultApi* | [**createOrUpdate_3**](docs/DefaultApi.md#createOrUpdate_3) | **POST** /admin/globalparam | 
*DefaultApi* | [**createOrUpdate_4**](docs/DefaultApi.md#createOrUpdate_4) | **POST** /admin/hourprofile | 
*DefaultApi* | [**createOrUpdate_5**](docs/DefaultApi.md#createOrUpdate_5) | **POST** /admin/leavevacationprofile | 
*DefaultApi* | [**createOrUpdate_6**](docs/DefaultApi.md#createOrUpdate_6) | **POST** /admin/leavevacationright | 
*DefaultApi* | [**createOrUpdate_7**](docs/DefaultApi.md#createOrUpdate_7) | **POST** /admin/leavevacationtype | 
*DefaultApi* | [**createOrUpdate_8**](docs/DefaultApi.md#createOrUpdate_8) | **POST** /admin/service | 
*DefaultApi* | [**createOrUpdate_9**](docs/DefaultApi.md#createOrUpdate_9) | **POST** /admin/userprofile | 
*DefaultApi* | [**deleteAnalyticAxe**](docs/DefaultApi.md#deleteAnalyticAxe) | **DELETE** /admin/analyticaxe/{analyticalAxeId} | 
*DefaultApi* | [**deleteCompany**](docs/DefaultApi.md#deleteCompany) | **DELETE** /admin/company/{idCompany} | 
*DefaultApi* | [**deleteCompany_0**](docs/DefaultApi.md#deleteCompany_0) | **DELETE** /admin/connector/{connectorId} | 
*DefaultApi* | [**deleteDaysOff**](docs/DefaultApi.md#deleteDaysOff) | **DELETE** /admin/daysoff/{daysOffId} | 
*DefaultApi* | [**deleteHourProfile**](docs/DefaultApi.md#deleteHourProfile) | **DELETE** /admin/hourprofile/{idHourProfile} | 
*DefaultApi* | [**deleteLeaveRequest**](docs/DefaultApi.md#deleteLeaveRequest) | **DELETE** /leaverequest/leaverequest/{leaveRequestBeanId} | 
*DefaultApi* | [**deleteLeaveVacationProfile**](docs/DefaultApi.md#deleteLeaveVacationProfile) | **DELETE** /admin/leavevacationprofile/{leaveVacationProfileBeanId} | 
*DefaultApi* | [**deleteLeaveVacationType**](docs/DefaultApi.md#deleteLeaveVacationType) | **DELETE** /admin/leavevacationright/{leaveVacationRightBeanId} | 
*DefaultApi* | [**deleteLeaveVacationType_0**](docs/DefaultApi.md#deleteLeaveVacationType_0) | **DELETE** /admin/leavevacationtype/{leaveVacationTypeBeanId} | 
*DefaultApi* | [**deleteService**](docs/DefaultApi.md#deleteService) | **DELETE** /admin/service/{idService} | 
*DefaultApi* | [**deleteTimesheet**](docs/DefaultApi.md#deleteTimesheet) | **DELETE** /timesheet/{timesheetId} | 
*DefaultApi* | [**deleteUserProfile**](docs/DefaultApi.md#deleteUserProfile) | **DELETE** /admin/userprofile/{idUserProfile} | 
*DefaultApi* | [**deleteWellBeing**](docs/DefaultApi.md#deleteWellBeing) | **DELETE** /wellbeing/{wellBeingId} | 
*DefaultApi* | [**doAuthWithLoginAndPwd**](docs/DefaultApi.md#doAuthWithLoginAndPwd) | **POST** /logon/auth | 
*DefaultApi* | [**doAuthWithStayConnectedToken**](docs/DefaultApi.md#doAuthWithStayConnectedToken) | **POST** /logon/auth/{stayConnectedToken} | 
*DefaultApi* | [**doAuthWithTempToken**](docs/DefaultApi.md#doAuthWithTempToken) | **GET** /logon/authWithTempToken | 
*DefaultApi* | [**doLogout**](docs/DefaultApi.md#doLogout) | **GET** /logon/logout | 
*DefaultApi* | [**fetchList**](docs/DefaultApi.md#fetchList) | **GET** /admin/analyticaxes | 
*DefaultApi* | [**fetchList_0**](docs/DefaultApi.md#fetchList_0) | **GET** /admin/billings | 
*DefaultApi* | [**fetchList_1**](docs/DefaultApi.md#fetchList_1) | **GET** /admin/companies | 
*DefaultApi* | [**fetchList_10**](docs/DefaultApi.md#fetchList_10) | **GET** /leaverequest/leaverequests | 
*DefaultApi* | [**fetchList_11**](docs/DefaultApi.md#fetchList_11) | **GET** /payroll/payrollLog | 
*DefaultApi* | [**fetchList_12**](docs/DefaultApi.md#fetchList_12) | **GET** /timesheetAnalysis | 
*DefaultApi* | [**fetchList_13**](docs/DefaultApi.md#fetchList_13) | **GET** /timesheets | 
*DefaultApi* | [**fetchList_14**](docs/DefaultApi.md#fetchList_14) | **GET** /wellbeing/list | 
*DefaultApi* | [**fetchList_2**](docs/DefaultApi.md#fetchList_2) | **GET** /admin/connectors | 
*DefaultApi* | [**fetchList_3**](docs/DefaultApi.md#fetchList_3) | **GET** /admin/daysoffs | 
*DefaultApi* | [**fetchList_4**](docs/DefaultApi.md#fetchList_4) | **GET** /admin/hourprofiles | 
*DefaultApi* | [**fetchList_5**](docs/DefaultApi.md#fetchList_5) | **GET** /admin/leavevacationprofiles | 
*DefaultApi* | [**fetchList_6**](docs/DefaultApi.md#fetchList_6) | **GET** /admin/leavevacationrights | 
*DefaultApi* | [**fetchList_7**](docs/DefaultApi.md#fetchList_7) | **GET** /admin/leavevacationtypes | 
*DefaultApi* | [**fetchList_8**](docs/DefaultApi.md#fetchList_8) | **GET** /admin/services | 
*DefaultApi* | [**fetchList_9**](docs/DefaultApi.md#fetchList_9) | **GET** /admin/userprofiles | 
*DefaultApi* | [**getAConnector**](docs/DefaultApi.md#getAConnector) | **GET** /connectorUtil/getAConnector | 
*DefaultApi* | [**getAConnectorModel**](docs/DefaultApi.md#getAConnectorModel) | **GET** /connectorUtil/getAConnectorModel | 
*DefaultApi* | [**getALeaveVacationTypeModel**](docs/DefaultApi.md#getALeaveVacationTypeModel) | **GET** /leaveVacationTypeUtil/getALeaveVacationTypeModel | 
*DefaultApi* | [**getAModelDaysOff**](docs/DefaultApi.md#getAModelDaysOff) | **GET** /daysOffUtil/getAModelDaysOff | 
*DefaultApi* | [**getAUserProfileModel**](docs/DefaultApi.md#getAUserProfileModel) | **GET** /userProfileUtil/getAUserProfileModel | 
*DefaultApi* | [**getAnalyticAxeLinkedFamilies**](docs/DefaultApi.md#getAnalyticAxeLinkedFamilies) | **GET** /admin/analyticaxes/linkedFamilies | 
*DefaultApi* | [**getAnalyticAxeLinkedFamiliesForImputation**](docs/DefaultApi.md#getAnalyticAxeLinkedFamiliesForImputation) | **GET** /admin/analyticaxes/linkedFamiliesForImputation | 
*DefaultApi* | [**getAnalyticalAxeOptionList**](docs/DefaultApi.md#getAnalyticalAxeOptionList) | **GET** /analyticAxeUtil/getAnalyticalAxeOptionList | 
*DefaultApi* | [**getAppServerVersion**](docs/DefaultApi.md#getAppServerVersion) | **GET** /about/version | 
*DefaultApi* | [**getCalendarDaysOffModelOptionList**](docs/DefaultApi.md#getCalendarDaysOffModelOptionList) | **GET** /daysOffUtil/getCalendarDaysOffModelOptionList | 
*DefaultApi* | [**getCalendarDaysOffOptionList**](docs/DefaultApi.md#getCalendarDaysOffOptionList) | **GET** /daysOffUtil/getCalendarDaysOffOptionList | 
*DefaultApi* | [**getCompanyConnectorOptionList**](docs/DefaultApi.md#getCompanyConnectorOptionList) | **GET** /companyUtil/getCompanyConnectorOptionList | 
*DefaultApi* | [**getCompanyOptionList**](docs/DefaultApi.md#getCompanyOptionList) | **GET** /companyUtil/getCompanyOptionList | 
*DefaultApi* | [**getCompanyOrganizationsOptionList**](docs/DefaultApi.md#getCompanyOrganizationsOptionList) | **GET** /companyUtil/getCompanyOrganizationsOptionList | 
*DefaultApi* | [**getCompanySupportContacts**](docs/DefaultApi.md#getCompanySupportContacts) | **GET** /companyUtil/getCompanySupportContacts | 
*DefaultApi* | [**getConnectorsModel**](docs/DefaultApi.md#getConnectorsModel) | **GET** /connectorUtil/getConnectorsModel | 
*DefaultApi* | [**getData**](docs/DefaultApi.md#getData) | **GET** /admin/analyticaxe/{analyticalAxeId} | 
*DefaultApi* | [**getData_0**](docs/DefaultApi.md#getData_0) | **GET** /admin/billing/{idCompany} | 
*DefaultApi* | [**getData_1**](docs/DefaultApi.md#getData_1) | **GET** /admin/company/{idCompany} | 
*DefaultApi* | [**getData_10**](docs/DefaultApi.md#getData_10) | **GET** /admin/userprofile/{idUserProfile} | 
*DefaultApi* | [**getData_11**](docs/DefaultApi.md#getData_11) | **GET** /leaverequest/leaverequest/{leaveRequestBeanId} | 
*DefaultApi* | [**getData_12**](docs/DefaultApi.md#getData_12) | **GET** /payroll/getPayrollLogItemDetail | 
*DefaultApi* | [**getData_13**](docs/DefaultApi.md#getData_13) | **GET** /timesheet/{timesheetId} | 
*DefaultApi* | [**getData_2**](docs/DefaultApi.md#getData_2) | **GET** /admin/connector/{idConnector} | 
*DefaultApi* | [**getData_3**](docs/DefaultApi.md#getData_3) | **GET** /admin/daysoff/{daysOffId} | 
*DefaultApi* | [**getData_4**](docs/DefaultApi.md#getData_4) | **GET** /admin/globalparam/{idCompany} | 
*DefaultApi* | [**getData_5**](docs/DefaultApi.md#getData_5) | **GET** /admin/hourprofile/{idHourProfile} | 
*DefaultApi* | [**getData_6**](docs/DefaultApi.md#getData_6) | **GET** /admin/leavevacationprofile/{leaveVacationProfileBeanId} | 
*DefaultApi* | [**getData_7**](docs/DefaultApi.md#getData_7) | **GET** /admin/leavevacationright/{leaveVacationRightBeanId} | 
*DefaultApi* | [**getData_8**](docs/DefaultApi.md#getData_8) | **GET** /admin/leavevacationtype/{leaveVacationTypeBeanId} | 
*DefaultApi* | [**getData_9**](docs/DefaultApi.md#getData_9) | **GET** /admin/service/{idService} | 
*DefaultApi* | [**getDaysOffDaysDefItemForAGivenDate**](docs/DefaultApi.md#getDaysOffDaysDefItemForAGivenDate) | **GET** /daysOffUtil/getDaysOffDaysDefItemForAGivenDate | 
*DefaultApi* | [**getFileImportModel**](docs/DefaultApi.md#getFileImportModel) | **GET** /import/{entityBean}/import/model | 
*DefaultApi* | [**getHourProfileDayPartForAGivenDate**](docs/DefaultApi.md#getHourProfileDayPartForAGivenDate) | **GET** /hourProfileUtil/getHourProfileDayPartForAGivenDate | 
*DefaultApi* | [**getHourProfileOptionList**](docs/DefaultApi.md#getHourProfileOptionList) | **GET** /hourProfileUtil/getHourProfileOptionList | 
*DefaultApi* | [**getLeaveRequestForAGivenDay**](docs/DefaultApi.md#getLeaveRequestForAGivenDay) | **GET** /leaveRequestUtil/getLeaveRequestForAGivenDay | 
*DefaultApi* | [**getLeaveVacationProfileOptionList**](docs/DefaultApi.md#getLeaveVacationProfileOptionList) | **GET** /leaveVacationProfileUtil/getLeaveVacationProfileOptionList | 
*DefaultApi* | [**getLeaveVacationProfileTypeOptionList**](docs/DefaultApi.md#getLeaveVacationProfileTypeOptionList) | **GET** /leaveVacationProfileUtil/getLeaveVacationProfileTypeOptionList | 
*DefaultApi* | [**getLeaveVacationTypeModelOptionList**](docs/DefaultApi.md#getLeaveVacationTypeModelOptionList) | **GET** /leaveVacationTypeUtil/getLeaveVacationTypeModelOptionList | 
*DefaultApi* | [**getLeaveVacationTypeOptionList**](docs/DefaultApi.md#getLeaveVacationTypeOptionList) | **GET** /leaveVacationTypeUtil/getLeaveVacationTypeOptionList | 
*DefaultApi* | [**getListOfWidgets**](docs/DefaultApi.md#getListOfWidgets) | **GET** /serviceUtil/getListOfWidgets | 
*DefaultApi* | [**getPayrollItem**](docs/DefaultApi.md#getPayrollItem) | **GET** /payroll/export/preview | 
*DefaultApi* | [**getProductAndOptionList**](docs/DefaultApi.md#getProductAndOptionList) | **GET** /productUtil/getProductAndOptionList | 
*DefaultApi* | [**getProductAssociationForEachService**](docs/DefaultApi.md#getProductAssociationForEachService) | **GET** /serviceUtil/getProductAssociationForEachService | 
*DefaultApi* | [**getServiceListOfDefaultParam**](docs/DefaultApi.md#getServiceListOfDefaultParam) | **GET** /serviceUtil/getServiceListOfDefaultParam | 
*DefaultApi* | [**getServiceOptionList**](docs/DefaultApi.md#getServiceOptionList) | **GET** /serviceUtil/getServiceOptionList | 
*DefaultApi* | [**getServiceWidget**](docs/DefaultApi.md#getServiceWidget) | **GET** /serviceUtil/getServiceWidget | 
*DefaultApi* | [**getUserLeaveVacationTypeOptionList**](docs/DefaultApi.md#getUserLeaveVacationTypeOptionList) | **GET** /userUtil/getUserLeaveVacationTypeOptionList | 
*DefaultApi* | [**getUserOptionList**](docs/DefaultApi.md#getUserOptionList) | **GET** /userUtil/getUserOptionList | 
*DefaultApi* | [**getUserProfileModelOptionList**](docs/DefaultApi.md#getUserProfileModelOptionList) | **GET** /userProfileUtil/getUserProfileModelOptionList | 
*DefaultApi* | [**getUserProfileOptionList**](docs/DefaultApi.md#getUserProfileOptionList) | **GET** /userProfileUtil/getUserProfileOptionList | 
*DefaultApi* | [**getUserWidgetsPref**](docs/DefaultApi.md#getUserWidgetsPref) | **GET** /userUtil/getUserWidgetsPref/{userId} | 
*DefaultApi* | [**getUsersLeaveRequests**](docs/DefaultApi.md#getUsersLeaveRequests) | **GET** /leaverequest/usersLeaveRequests | 
*DefaultApi* | [**getUsersWellBeingVotes**](docs/DefaultApi.md#getUsersWellBeingVotes) | **GET** /wellbeing/usersWellBeingVotes | 
*DefaultApi* | [**getUsersWithPresenceInfos**](docs/DefaultApi.md#getUsersWithPresenceInfos) | **GET** /userUtil | 
*DefaultApi* | [**importData**](docs/DefaultApi.md#importData) | **POST** /import/{entityBean}/import | 
*DefaultApi* | [**initNewPwdProcess**](docs/DefaultApi.md#initNewPwdProcess) | **GET** /pwdUtil/updatePwdProcess/init | 
*DefaultApi* | [**isLastLevelWorkflow**](docs/DefaultApi.md#isLastLevelWorkflow) | **GET** /workflowUtil/isLastLevelWorkflow | 
*DefaultApi* | [**keepMeAlive**](docs/DefaultApi.md#keepMeAlive) | **GET** /sessionUtil/keepMeAlive | 
*DefaultApi* | [**killSession**](docs/DefaultApi.md#killSession) | **GET** /sessionUtil/killSession | 
*DefaultApi* | [**listAllActiveSession**](docs/DefaultApi.md#listAllActiveSession) | **GET** /sessionUtil/listAllActiveSession | 
*DefaultApi* | [**listOnExport**](docs/DefaultApi.md#listOnExport) | **GET** /admin/analyticaxes/export/xls | 
*DefaultApi* | [**listOnExport_0**](docs/DefaultApi.md#listOnExport_0) | **GET** /admin/billings/export/xls | 
*DefaultApi* | [**listOnExport_1**](docs/DefaultApi.md#listOnExport_1) | **GET** /admin/companies/export/xls | 
*DefaultApi* | [**listOnExport_10**](docs/DefaultApi.md#listOnExport_10) | **GET** /leaverequest/leaverequests/export/xls | 
*DefaultApi* | [**listOnExport_11**](docs/DefaultApi.md#listOnExport_11) | **GET** /payroll/export/xls | 
*DefaultApi* | [**listOnExport_12**](docs/DefaultApi.md#listOnExport_12) | **GET** /timesheetAnalysis/export/xls | 
*DefaultApi* | [**listOnExport_13**](docs/DefaultApi.md#listOnExport_13) | **GET** /timesheets/export/xls | 
*DefaultApi* | [**listOnExport_14**](docs/DefaultApi.md#listOnExport_14) | **GET** /wellbeing/companies/export/xls | 
*DefaultApi* | [**listOnExport_2**](docs/DefaultApi.md#listOnExport_2) | **GET** /admin/connectors/export/xls | 
*DefaultApi* | [**listOnExport_3**](docs/DefaultApi.md#listOnExport_3) | **GET** /admin/daysoffs/export/xls | 
*DefaultApi* | [**listOnExport_4**](docs/DefaultApi.md#listOnExport_4) | **GET** /admin/hourprofiles/export/xls | 
*DefaultApi* | [**listOnExport_5**](docs/DefaultApi.md#listOnExport_5) | **GET** /admin/leavevacationprofiles/export/xls | 
*DefaultApi* | [**listOnExport_6**](docs/DefaultApi.md#listOnExport_6) | **GET** /admin/leavevacationrights/export/xls | 
*DefaultApi* | [**listOnExport_7**](docs/DefaultApi.md#listOnExport_7) | **GET** /admin/leavevacationtypes/export/xls | 
*DefaultApi* | [**listOnExport_8**](docs/DefaultApi.md#listOnExport_8) | **GET** /admin/services/export/xls | 
*DefaultApi* | [**listOnExport_9**](docs/DefaultApi.md#listOnExport_9) | **GET** /admin/userprofiles/export/xls | 
*DefaultApi* | [**parseFile**](docs/DefaultApi.md#parseFile) | **POST** /fileUtil/parseFile | 
*DefaultApi* | [**payroll**](docs/DefaultApi.md#payroll) | **GET** /payroll/export | 
*DefaultApi* | [**playWorflow**](docs/DefaultApi.md#playWorflow) | **GET** /leaverequest/leaverequest/{leaveRequestBeanId}/{wfAction} | 
*DefaultApi* | [**retrieveFields**](docs/DefaultApi.md#retrieveFields) | **GET** /import/{entityBean}/retrieveFields | 
*DefaultApi* | [**rollbackPayroll**](docs/DefaultApi.md#rollbackPayroll) | **GET** /payroll/payrollLog/{payrollLogId}/rollback | 
*DefaultApi* | [**setUserAvgWellBeingVote**](docs/DefaultApi.md#setUserAvgWellBeingVote) | **POST** /wellbeing/setUserAvgWellBeingVote | 
*DefaultApi* | [**setUserWellBeingVotes**](docs/DefaultApi.md#setUserWellBeingVotes) | **POST** /wellbeing/userWellBeingVote/{userId} | 
*DefaultApi* | [**setUserWidgetsPref**](docs/DefaultApi.md#setUserWidgetsPref) | **GET** /userUtil/setUserWidgetsPref/{userId} | 
*DefaultApi* | [**updateCompany**](docs/DefaultApi.md#updateCompany) | **PUT** /admin/analyticaxe | 
*DefaultApi* | [**updateCompany_0**](docs/DefaultApi.md#updateCompany_0) | **PUT** /admin/company | 
*DefaultApi* | [**updateCompany_1**](docs/DefaultApi.md#updateCompany_1) | **PUT** /admin/connector | 
*DefaultApi* | [**updateCompany_2**](docs/DefaultApi.md#updateCompany_2) | **PUT** /timesheet | 
*DefaultApi* | [**updateDaysOff**](docs/DefaultApi.md#updateDaysOff) | **PUT** /admin/daysoff | 
*DefaultApi* | [**updateGlobalParam**](docs/DefaultApi.md#updateGlobalParam) | **PUT** /admin/globalparam | 
*DefaultApi* | [**updateLeaveVacationProfile**](docs/DefaultApi.md#updateLeaveVacationProfile) | **PUT** /admin/leavevacationprofile | 
*DefaultApi* | [**updateLeaveVacationProfile_0**](docs/DefaultApi.md#updateLeaveVacationProfile_0) | **PUT** /leaverequest/leaverequest | 
*DefaultApi* | [**updateLeaveVacationRight**](docs/DefaultApi.md#updateLeaveVacationRight) | **PUT** /admin/leavevacationright | 
*DefaultApi* | [**updateLeaveVacationType**](docs/DefaultApi.md#updateLeaveVacationType) | **PUT** /admin/leavevacationtype | 
*DefaultApi* | [**updateService**](docs/DefaultApi.md#updateService) | **PUT** /admin/service | 
*DefaultApi* | [**updateUserProfile**](docs/DefaultApi.md#updateUserProfile) | **PUT** /admin/hourprofile | 
*DefaultApi* | [**updateUserProfile_0**](docs/DefaultApi.md#updateUserProfile_0) | **PUT** /admin/userprofile | 


## Documentation for Models

 - [ApiResponseMessage](docs/ApiResponseMessage.md)
 - [BodyPart](docs/BodyPart.md)
 - [ContentDisposition](docs/ContentDisposition.md)
 - [DaysOffBeanId](docs/DaysOffBeanId.md)
 - [FileBean](docs/FileBean.md)
 - [FileBeanId](docs/FileBeanId.md)
 - [FormDataBodyPart](docs/FormDataBodyPart.md)
 - [FormDataContentDisposition](docs/FormDataContentDisposition.md)
 - [FormDataMultiPart](docs/FormDataMultiPart.md)
 - [GlobalControler](docs/GlobalControler.md)
 - [HourProfileDayPartId](docs/HourProfileDayPartId.md)
 - [HourProfileDayPartItem](docs/HourProfileDayPartItem.md)
 - [HourProfileId](docs/HourProfileId.md)
 - [HourProfilePerDayId](docs/HourProfilePerDayId.md)
 - [HourProfilePerDayItem](docs/HourProfilePerDayItem.md)
 - [LeaveVacationProfileBeanId](docs/LeaveVacationProfileBeanId.md)
 - [LinkedManagerRelation](docs/LinkedManagerRelation.md)
 - [LinkedManagerRelationId](docs/LinkedManagerRelationId.md)
 - [LinkedManagerRelationItem](docs/LinkedManagerRelationItem.md)
 - [LinkedUserRelation](docs/LinkedUserRelation.md)
 - [LinkedUserRelationId](docs/LinkedUserRelationId.md)
 - [LinkedUserRelationItem](docs/LinkedUserRelationItem.md)
 - [MediaType](docs/MediaType.md)
 - [MessageBodyWorkers](docs/MessageBodyWorkers.md)
 - [ModelApiResponse](docs/ModelApiResponse.md)
 - [MultiPart](docs/MultiPart.md)
 - [OptionListValueObject](docs/OptionListValueObject.md)
 - [ParameterizedHeader](docs/ParameterizedHeader.md)
 - [Providers](docs/Providers.md)
 - [UserAddress](docs/UserAddress.md)
 - [UserAddressId](docs/UserAddressId.md)
 - [UserAddressItem](docs/UserAddressItem.md)
 - [UserBean](docs/UserBean.md)
 - [UserChildren](docs/UserChildren.md)
 - [UserChildrenId](docs/UserChildrenId.md)
 - [UserChildrenItem](docs/UserChildrenItem.md)
 - [UserCompanyOrganization](docs/UserCompanyOrganization.md)
 - [UserCompanyOrganizationId](docs/UserCompanyOrganizationId.md)
 - [UserCompanyOrganizationItem](docs/UserCompanyOrganizationItem.md)
 - [UserFormBean](docs/UserFormBean.md)
 - [UserId](docs/UserId.md)
 - [UserLeaveVacationProfiles](docs/UserLeaveVacationProfiles.md)
 - [UserLeaveVacationProfilesId](docs/UserLeaveVacationProfilesId.md)
 - [UserLeaveVacationProfilesItem](docs/UserLeaveVacationProfilesItem.md)
 - [UserPhones](docs/UserPhones.md)
 - [UserPhonesId](docs/UserPhonesId.md)
 - [UserPhonesItem](docs/UserPhonesItem.md)
 - [UserProduct](docs/UserProduct.md)
 - [UserProductId](docs/UserProductId.md)
 - [UserProductItem](docs/UserProductItem.md)
 - [UserProfileId](docs/UserProfileId.md)
 - [UserTokenDeviceConnection](docs/UserTokenDeviceConnection.md)
 - [UserTokenDeviceConnectionId](docs/UserTokenDeviceConnectionId.md)
 - [UserTokenDeviceConnectionItem](docs/UserTokenDeviceConnectionItem.md)
 - [UserWellBeingVote](docs/UserWellBeingVote.md)
 - [UserWellBeingVoteId](docs/UserWellBeingVoteId.md)
 - [UserWellBeingVoteItem](docs/UserWellBeingVoteItem.md)
 - [UserWidgetsPref](docs/UserWidgetsPref.md)
 - [UserWidgetsPrefId](docs/UserWidgetsPrefId.md)
 - [UserWidgetsPrefItem](docs/UserWidgetsPrefItem.md)
 - [UserWithDatasContainerBoolean](docs/UserWithDatasContainerBoolean.md)
 - [UserWorkContracts](docs/UserWorkContracts.md)
 - [UserWorkContractsId](docs/UserWorkContractsId.md)
 - [UserWorkContractsItem](docs/UserWorkContractsItem.md)
 - [UserWorkedHours](docs/UserWorkedHours.md)
 - [UserWorkedHoursId](docs/UserWorkedHoursId.md)
 - [UserWorkedHoursItem](docs/UserWorkedHoursItem.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



