# RepositoriesApi

All URIs are relative to *https://api.ionos.com/containerregistries*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**registriesRepositoriesDelete**](RepositoriesApi.md#registriesrepositoriesdelete) | **DELETE** /registries/{registryId}/repositories/{repositoryName} | Delete repository |
| [**registriesRepositoriesFindByName**](RepositoriesApi.md#registriesrepositoriesfindbyname) | **GET** /registries/{registryId}/repositories/{repositoryName} | Retrieve Repository |
| [**registriesRepositoriesGet**](RepositoriesApi.md#registriesrepositoriesget) | **GET** /registries/{registryId}/repositories | Retrieve all Repositories |


<a name="registriesRepositoriesDelete"></a>
# **registriesRepositoriesDelete**
> registriesRepositoriesDelete(registryId, repositoryName)

Delete repository

Delete all repository contents    The registry V2 API allows manifests and blobs to be deleted individually but it is not possible to remove an entire repository.   This operation is provided for convenience

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
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

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RepositoriesApi apiInstance = new RepositoriesApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    String repositoryName = "my-service"; // String | The name of the repository
    try {
      apiInstance.registriesRepositoriesDeleteWithHttpInfo(registryId, repositoryName);
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
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **registryId** |  [**UUID**](../models/.md)| The unique ID of the registry |
| **repositoryName** | **String**| The name of the repository |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="registriesRepositoriesFindByName"></a>
# **registriesRepositoriesFindByName**
> RepositoryRead registriesRepositoriesFindByName(registryId, repositoryName)

Retrieve Repository

Returns the Repository by Name.

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RepositoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RepositoriesApi apiInstance = new RepositoriesApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The ID (UUID) of the Registry.
    String repositoryName = "my-service"; // String | The Name of the Repository that should be retrieved.
    try {
      ApiResponse<RepositoryRead> result = apiInstance.registriesRepositoriesFindByNameWithHttpInfo(registryId, repositoryName);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling RepositoriesApi#registriesRepositoriesFindByName");
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
| **registryId** |  [**UUID**](../models/.md)| The ID (UUID) of the Registry. |
| **repositoryName** | **String**| The Name of the Repository that should be retrieved. |

### Return type

[**RepositoryRead**](../models/RepositoryRead.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesRepositoriesGet"></a>
# **registriesRepositoriesGet**
> RepositoryReadList registriesRepositoriesGet(registryId, offset, limit, filterName, filterVulnerabilitySeverity, orderBy)

Retrieve all Repositories

This endpoint enables retrieving all Repositories using pagination and optional filters. 

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RepositoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RepositoriesApi apiInstance = new RepositoriesApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The ID (UUID) of the Registry.
    Integer offset = 0; // Integer | The first element (of the total list of elements) to include in the response. Use together with limit for pagination.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with offset for pagination.
    String filterName = "filterName_example"; // String | Filter resources by name.
    String filterVulnerabilitySeverity = "filterVulnerabilitySeverity_example"; // String | Filter resources by vulnerability severity.
    String orderBy = "-lastPush"; // String | The field to order the results by. If not provided, the results will be ordered by the default field.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<RepositoryReadList> result = apiInstance.registriesRepositoriesGetWithHttpInfo(registryId, offset, limit, filterName, filterVulnerabilitySeverity, orderBy, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling RepositoriesApi#registriesRepositoriesGet");
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
| **registryId** |  [**UUID**](../models/.md)| The ID (UUID) of the Registry. |
| **offset** | **Integer**| The first element (of the total list of elements) to include in the response. Use together with limit for pagination. | [optional] [default to 0]
| **limit** | **Integer**| The maximum number of elements to return. Use together with offset for pagination. | [optional] [default to 100]
| **filterName** | **String**| Filter resources by name. | [optional]
| **filterVulnerabilitySeverity** | **String**| Filter resources by vulnerability severity. | [optional]
| **orderBy** | **String**| The field to order the results by. If not provided, the results will be ordered by the default field. | [optional] [default to -lastPush] [enum: -lastPush, -lastPull, -artifactCount, -pullCount, -pushCount, name, lastPush, lastPull, artifactCount, pullCount, pushCount]

### Return type

[**RepositoryReadList**](../models/RepositoryReadList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

