# SalesApi

All URIs are relative to */api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewSale**](SalesApi.md#addNewSale) | **POST** sales | Add new sale.
[**deleteSale**](SalesApi.md#deleteSale) | **DELETE** sales/{id} | Delete a sale.

<a name="addNewSale"></a>
# **addNewSale**
> Sale addNewSale(body)

Add new sale.

Add a new sale to the system.

### Example
```java
// Import classes:
//import util.ApiException;
//import api.SalesApi;


SalesApi apiInstance = new SalesApi();
Sale body = new Sale(); // Sale | 
try {
    Sale result = apiInstance.addNewSale(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesApi#addNewSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Sale**](Sale.md)|  |

### Return type

[**Sale**](Sale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSale"></a>
# **deleteSale**
> Void deleteSale(id)

Delete a sale.

Delete the sale matching the given ID.

### Example
```java
// Import classes:
//import util.ApiException;
//import api.SalesApi;


SalesApi apiInstance = new SalesApi();
String id = "id_example"; // String | 
try {
    Void result = apiInstance.deleteSale(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SalesApi#deleteSale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

