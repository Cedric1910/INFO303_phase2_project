# AccountApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccount**](AccountApi.md#deleteAccount) | **DELETE** accounts/account/{id} | Delete a customer account.
[**updateCustomer**](AccountApi.md#updateCustomer) | **PUT** accounts/account/{id} | Update a customer account.

<a name="deleteAccount"></a>
# **deleteAccount**
> Void deleteAccount(id)

Delete a customer account.

Delete an existing customer account.

### Example
```java
// Import classes:
//import util.ApiException;
//import api.AccountApi;


AccountApi apiInstance = new AccountApi();
String id = "id_example"; // String | The customer's account ID.
try {
    Void result = apiInstance.deleteAccount(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#deleteAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The customer&#x27;s account ID. |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> Account updateCustomer(body, id)

Update a customer account.

Replace an existing customer account with a new version.

### Example
```java
// Import classes:
//import util.ApiException;
//import api.AccountApi;


AccountApi apiInstance = new AccountApi();
Account body = new Account(); // Account | 
String id = "id_example"; // String | The customer's account ID.
try {
    Account result = apiInstance.updateCustomer(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Account**](Account.md)|  |
 **id** | **String**| The customer&#x27;s account ID. |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

