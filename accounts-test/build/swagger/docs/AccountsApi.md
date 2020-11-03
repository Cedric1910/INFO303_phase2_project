# AccountsApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** accounts | Add a new customer account.
[**getAccounts**](AccountsApi.md#getAccounts) | **GET** accounts | Get customer accounts.

<a name="createAccount"></a>
# **createAccount**
> Account createAccount(body)

Add a new customer account.

Add a new customer account.

### Example
```java
// Import classes:
//import util.ApiException;
//import api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
Account body = new Account(); // Account | 
try {
    Account result = apiInstance.createAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Account**](Account.md)|  |

### Return type

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> List&lt;Account&gt; getAccounts()

Get customer accounts.

Get the complete details for all accounts.

### Example
```java
// Import classes:
//import util.ApiException;
//import api.AccountsApi;


AccountsApi apiInstance = new AccountsApi();
try {
    List<Account> result = apiInstance.getAccounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Account&gt;**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

