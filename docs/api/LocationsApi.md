# LocationsApi

All URIs are relative to *https://api.ionos.com/containerregistries*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**locationsGet**](LocationsApi.md#locationsget) | **GET** /locations | Get container registry locations |


<a name="locationsGet"></a>
# **locationsGet**
> LocationsResponse locationsGet()

Get container registry locations

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.LocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    LocationsApi apiInstance = new LocationsApi(defaultClient);
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<LocationsResponse> result = apiInstance.locationsGetWithHttpInfo(orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationsApi#locationsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters
This endpoint does not need any parameter.

### Return type

[**LocationsResponse**](../models/LocationsResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

