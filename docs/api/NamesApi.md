# NamesApi

All URIs are relative to *https://api.ionos.com/containerregistries*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**namesCheckUsage**](NamesApi.md#namescheckusage) | **HEAD** /names/{name} | Get container registry name availability |


<a name="namesCheckUsage"></a>
# **namesCheckUsage**
> namesCheckUsage(name)

Get container registry name availability

Validate that the name is suitable to use for a new registry: - it uses only the characters \&quot;a-z\&quot;, \&quot;0-9\&quot;, or \&quot;-\&quot; - and starts with a letter and ends with a letter or number - and is between 3 to 63 characters in length - and is available

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.NamesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    NamesApi apiInstance = new NamesApi(defaultClient);
    String name = "name_example"; // String | The desired registry name
    try {
      apiInstance.namesCheckUsage(name);
    } catch (ApiException e) {
      System.err.println("Exception when calling NamesApi#namesCheckUsage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| The desired registry name |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

