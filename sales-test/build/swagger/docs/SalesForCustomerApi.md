# SalesForCustomerApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomerSales**](SalesForCustomerApi.md#getCustomerSales) | **GET** sales/customer/{id} | Get sales for customer.
[**getCustomerSummary**](SalesForCustomerApi.md#getCustomerSummary) | **GET** sales/customer/{id}/summary | Get sale summary for customer.

<a name="getCustomerSales"></a>
# **getCustomerSales**
> List&lt;Sale&gt; getCustomerSales(id)

Get sales for customer.

Get all sales for the customer matching the given ID.

### Example
```java
// Import classes:
//import util.ApiException;
//import api.SalesForCustomerApi;


SalesForCustomerApi apiInstance = new SalesForCustomerApi();
String id = "id_example"; // String | 
try {
    List<Sale> result = apiInstance.getCustomerSales(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesForCustomerApi#getCustomerSales");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**List&lt;Sale&gt;**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerSummary"></a>
# **getCustomerSummary**
> Summary getCustomerSummary(id)

Get sale summary for customer.

Get a summary of sales for the customer matching the given ID.

### Example
```java
// Import classes:
//import util.ApiException;
//import api.SalesForCustomerApi;


SalesForCustomerApi apiInstance = new SalesForCustomerApi();
String id = "id_example"; // String | 
try {
    Summary result = apiInstance.getCustomerSummary(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesForCustomerApi#getCustomerSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Summary**](Summary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

