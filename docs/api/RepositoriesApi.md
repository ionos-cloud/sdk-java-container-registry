# RepositoriesApi

All URIs are relative to *https://api.ionos.com/containerregistries*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**registriesRepositoriesDelete**](RepositoriesApi.md#registriesrepositoriesdelete) | **DELETE** /registries/{registryId}/repositories/{name} | Delete repository |


<a name="registriesRepositoriesDelete"></a>
# **registriesRepositoriesDelete**
> registriesRepositoriesDelete(registryId, name)

Delete repository

Delete all repository contents    The registry V2 API allows manifests and blobs to be deleted individually but it is not possible to remove an entire repository.   This operation is provided for convenience

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RepositoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RepositoriesApi apiInstance = new RepositoriesApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    String name = "ubuntu"; // String | The name of the repository
    try {
      apiInstance.registriesRepositoriesDelete(registryId, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling RepositoriesApi#registriesRepositoriesDelete");
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
| **registryId** |  [**UUID**](.md)| The unique ID of the registry |
| **name** | **String**| The name of the repository |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

