# VulnerabilitiesApi

All URIs are relative to *https://api.ionos.com/containerregistries*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**vulnerabilitiesFindByID**](VulnerabilitiesApi.md#vulnerabilitiesfindbyid) | **GET** /vulnerabilities/{vulnerabilityId} | Retrieve Vulnerability |


<a name="vulnerabilitiesFindByID"></a>
# **vulnerabilitiesFindByID**
> VulnerabilityRead vulnerabilitiesFindByID(vulnerabilityId)

Retrieve Vulnerability

Returns the Vulnerability by ID.

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.VulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    VulnerabilitiesApi apiInstance = new VulnerabilitiesApi(defaultClient);
    String vulnerabilityId = "CVE-2019-1234"; // String | The ID of the Vulnerability that should be retrieved.
    try {
      ApiResponse<VulnerabilityRead> result = apiInstance.vulnerabilitiesFindByIDWithHttpInfo(vulnerabilityId);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling VulnerabilitiesApi#vulnerabilitiesFindByID");
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

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **vulnerabilityId** | **String**| The ID of the Vulnerability that should be retrieved. |

### Return type

[**VulnerabilityRead**](../models/VulnerabilityRead.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

