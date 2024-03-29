# RegistriesApi

All URIs are relative to *https://api.ionos.com/containerregistries*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**registriesDelete**](RegistriesApi.md#registriesdelete) | **DELETE** /registries/{registryId} | Delete registry |
| [**registriesFindById**](RegistriesApi.md#registriesfindbyid) | **GET** /registries/{registryId} | Get a registry |
| [**registriesGet**](RegistriesApi.md#registriesget) | **GET** /registries | List all container registries |
| [**registriesPatch**](RegistriesApi.md#registriespatch) | **PATCH** /registries/{registryId} | Update the properties of a registry |
| [**registriesPost**](RegistriesApi.md#registriespost) | **POST** /registries | Create container registry |
| [**registriesPut**](RegistriesApi.md#registriesput) | **PUT** /registries/{registryId} | Create or replace a container registry |


<a name="registriesDelete"></a>
# **registriesDelete**
> registriesDelete(registryId)

Delete registry

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RegistriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RegistriesApi apiInstance = new RegistriesApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    try {
      apiInstance.registriesDeleteWithHttpInfo(registryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistriesApi#registriesDelete");
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

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesFindById"></a>
# **registriesFindById**
> RegistryResponse registriesFindById(registryId)

Get a registry

Get all information for a specific container registry

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RegistriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RegistriesApi apiInstance = new RegistriesApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    try {
      ApiResponse<RegistryResponse> result = apiInstance.registriesFindByIdWithHttpInfo(registryId);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistriesApi#registriesFindById");
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

### Return type

[**RegistryResponse**](../models/RegistryResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesGet"></a>
# **registriesGet**
> RegistriesResponse registriesGet(filterName, limit, paginationToken)

List all container registries

List all managed container registries for your account

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RegistriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RegistriesApi apiInstance = new RegistriesApi(defaultClient);
    String filterName = "my-registry"; // String | The registry name to search for
    String limit = "100"; // String | The maximum number of elements to return (used together with pagination.token for pagination)
    String paginationToken = "eyJ2IjoibWV0YS5rOHMuaW8vdjEiLCJydiI6MTYzMjQ0OTk2ODAsInN0YXJ0IjoiM2RmYTc3YjctZGIwNS00MjMwLThmMjAtOGU3NjJlOTUxOTUzXHUwMDAwIn0"; // String | An opaque token used to iterate the set of results (used together with limit for pagination)
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<RegistriesResponse> result = apiInstance.registriesGetWithHttpInfo(filterName, limit, paginationToken, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistriesApi#registriesGet");
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
| **filterName** | **String**| The registry name to search for | [optional]
| **limit** | **String**| The maximum number of elements to return (used together with pagination.token for pagination) | [optional] [default to 100]
| **paginationToken** | **String**| An opaque token used to iterate the set of results (used together with limit for pagination) | [optional]

### Return type

[**RegistriesResponse**](../models/RegistriesResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesPatch"></a>
# **registriesPatch**
> RegistryResponse registriesPatch(registryId, patchRegistryInput)

Update the properties of a registry

Update the properties of a registry - \&quot;garbageCollectionSchedule\&quot; time and days of the week for runs

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RegistriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RegistriesApi apiInstance = new RegistriesApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    PatchRegistryInput patchRegistryInput = new PatchRegistryInput(); // PatchRegistryInput | 
    try {
      ApiResponse<RegistryResponse> result = apiInstance.registriesPatchWithHttpInfo(registryId, patchRegistryInput);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistriesApi#registriesPatch");
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
| **patchRegistryInput** |  [**PatchRegistryInput**](../models/PatchRegistryInput.md)|  |

### Return type

[**RegistryResponse**](../models/RegistryResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registriesPost"></a>
# **registriesPost**
> PostRegistryOutput registriesPost(postRegistryInput)

Create container registry

Create a registry to hold container images or OCI compliant artifacts - \&quot;name\&quot; must have passed validation - \&quot;location\&quot; must be one of the available location IDs - \&quot;garbageCollectionSchedule\&quot; time and days of the week for runs - \&quot;features\&quot;: \&quot;vulnerabilityScanning\&quot; default is enabled

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RegistriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RegistriesApi apiInstance = new RegistriesApi(defaultClient);
    PostRegistryInput postRegistryInput = new PostRegistryInput(); // PostRegistryInput | 
    try {
      ApiResponse<PostRegistryOutput> result = apiInstance.registriesPostWithHttpInfo(postRegistryInput);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistriesApi#registriesPost");
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
| **postRegistryInput** |  [**PostRegistryInput**](../models/PostRegistryInput.md)|  |

### Return type

[**PostRegistryOutput**](../models/PostRegistryOutput.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registriesPut"></a>
# **registriesPut**
> PutRegistryOutput registriesPut(registryId, putRegistryInput)

Create or replace a container registry

Create/replace a registry to hold container images or OCI compliant artifacts **On create** - \&quot;name\&quot; must have passed validation - \&quot;location\&quot; must be one of the available location IDs **On update** - \&quot;name\&quot; cannot be changed - \&quot;location\&quot; cannot be changed **On create or update** - \&quot;garbageCollectionSchedule\&quot;: time and days of the week for runs 

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.RegistriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    RegistriesApi apiInstance = new RegistriesApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    PutRegistryInput putRegistryInput = new PutRegistryInput(); // PutRegistryInput | 
    try {
      ApiResponse<PutRegistryOutput> result = apiInstance.registriesPutWithHttpInfo(registryId, putRegistryInput);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistriesApi#registriesPut");
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
| **putRegistryInput** |  [**PutRegistryInput**](../models/PutRegistryInput.md)|  |

### Return type

[**PutRegistryOutput**](../models/PutRegistryOutput.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

