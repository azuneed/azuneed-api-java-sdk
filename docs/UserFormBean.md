
# UserFormBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userCreate** | **String** |  |  [optional]
**dateCreate** | [**DateTime**](DateTime.md) |  |  [optional]
**userUpdate** | **String** |  |  [optional]
**dateUpdate** | [**DateTime**](DateTime.md) |  |  [optional]
**formMode** | [**FormModeEnum**](#FormModeEnum) |  |  [optional]
**internalCode** | **String** |  |  [optional]
**locale** | **String** |  |  [optional]
**id** | [**UserId**](UserId.md) |  |  [optional]
**companyDetail** | **String** |  |  [optional]
**userGender** | **String** |  | 
**userFirstName** | **String** |  | 
**userLastName** | **String** |  | 
**userEmail** | **String** |  |  [optional]
**userEmailTempKey** | **String** |  |  [optional]
**userSerial** | **String** |  |  [optional]
**userPwd** | **String** |  |  [optional]
**userLocale** | **String** |  |  [optional]
**userFunction** | **String** |  |  [optional]
**userBirthDay** | [**DateTime**](DateTime.md) |  |  [optional]
**idUserProfile** | [**UserProfileId**](UserProfileId.md) |  |  [optional]
**flagEmailAddressHasChanged** | **Boolean** |  |  [optional]
**userPhoto** | **String** |  |  [optional]
**userPhotoHasChanged** | **Boolean** |  |  [optional]
**userPhotoFileBeanId** | [**FileBeanId**](FileBeanId.md) |  |  [optional]
**userPayroll** | **Double** |  |  [optional]
**userWorkCategory** | **String** |  |  [optional]
**userWorkLevel** | **String** |  |  [optional]
**userEchelon** | **String** |  |  [optional]
**userTimeZone** | **String** |  |  [optional]
**userHiringDate** | [**DateTime**](DateTime.md) |  |  [optional]
**userDepartureDate** | [**DateTime**](DateTime.md) |  |  [optional]
**appRole** | **String** |  |  [optional]
**userDaysOffId** | [**DaysOffBeanId**](DaysOffBeanId.md) |  |  [optional]
**tco** | **Double** |  |  [optional]
**linkedUserRelation** | [**List&lt;LinkedUserRelationItem&gt;**](LinkedUserRelationItem.md) |  |  [optional]
**deletedLinkedUserRelation** | [**List&lt;LinkedUserRelationItem&gt;**](LinkedUserRelationItem.md) |  |  [optional]
**linkedManagerRelation** | [**List&lt;LinkedManagerRelationItem&gt;**](LinkedManagerRelationItem.md) |  |  [optional]
**deletedLinkedManagerRelation** | [**List&lt;LinkedManagerRelationItem&gt;**](LinkedManagerRelationItem.md) |  |  [optional]
**userWorkedHours** | [**List&lt;UserWorkedHoursItem&gt;**](UserWorkedHoursItem.md) |  |  [optional]
**userWorkContracts** | [**List&lt;UserWorkContractsItem&gt;**](UserWorkContractsItem.md) |  |  [optional]
**userLeaveVacationProfiles** | [**List&lt;UserLeaveVacationProfilesItem&gt;**](UserLeaveVacationProfilesItem.md) |  |  [optional]
**userMaritalStatus** | **String** |  |  [optional]
**userLinkConnection** | **String** |  |  [optional]
**userAddress** | [**List&lt;UserAddressItem&gt;**](UserAddressItem.md) |  |  [optional]
**userPhones** | [**List&lt;UserPhonesItem&gt;**](UserPhonesItem.md) |  |  [optional]
**userChildren** | [**List&lt;UserChildrenItem&gt;**](UserChildrenItem.md) |  |  [optional]
**userCompanyOrganizations** | [**List&lt;UserCompanyOrganizationItem&gt;**](UserCompanyOrganizationItem.md) |  |  [optional]
**userTokenDeviceConnections** | [**List&lt;UserTokenDeviceConnectionItem&gt;**](UserTokenDeviceConnectionItem.md) |  |  [optional]
**userWidgetsPref** | [**List&lt;UserWidgetsPrefItem&gt;**](UserWidgetsPrefItem.md) |  |  [optional]
**userWellBeingVotes** | [**List&lt;UserWellBeingVoteItem&gt;**](UserWellBeingVoteItem.md) |  |  [optional]
**hasAccessToAzuneedPortal** | **Boolean** |  |  [optional]
**userProducts** | [**List&lt;UserProductItem&gt;**](UserProductItem.md) |  |  [optional]
**anAdmin** | **Boolean** |  |  [optional]
**idCompany** | **String** |  |  [optional]


<a name="FormModeEnum"></a>
## Enum: FormModeEnum
Name | Value
---- | -----
EDIT_MODE | &quot;EDIT_MODE&quot;
CREATE_MODE | &quot;CREATE_MODE&quot;
DISPLAY_MODE | &quot;DISPLAY_MODE&quot;



