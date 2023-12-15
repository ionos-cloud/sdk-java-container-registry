# TokensApi

All URIs are relative to *https://api.ionos.com/containerregistries*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**registriesTokensDelete**](TokensApi.md#registriestokensdelete) | **DELETE** /registries/{registryId}/tokens/{tokenId} | Delete token |
| [**registriesTokensFindById**](TokensApi.md#registriestokensfindbyid) | **GET** /registries/{registryId}/tokens/{tokenId} | Get token information |
| [**registriesTokensGet**](TokensApi.md#registriestokensget) | **GET** /registries/{registryId}/tokens | List all tokens for the container registry |
| [**registriesTokensPatch**](TokensApi.md#registriestokenspatch) | **PATCH** /registries/{registryId}/tokens/{tokenId} | Update token |
| [**registriesTokensPost**](TokensApi.md#registriestokenspost) | **POST** /registries/{registryId}/tokens | Create token |
| [**registriesTokensPut**](TokensApi.md#registriestokensput) | **PUT** /registries/{registryId}/tokens/{tokenId} | Create or replace token |


<a name="registriesTokensDelete"></a>
# **registriesTokensDelete**
> registriesTokensDelete(registryId, tokenId)

Delete token

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    TokensApi apiInstance = new TokensApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    UUID tokenId = new UUID(); // UUID | The unique ID of the token
    try {
      apiInstance.registriesTokensDeleteWithHttpInfo(registryId, tokenId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#registriesTokensDelete");
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
| **tokenId** |  [**UUID**](../models/.md)| The unique ID of the token |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesTokensFindById"></a>
# **registriesTokensFindById**
> TokenResponse registriesTokensFindById(registryId, tokenId)

Get token information

Gets all information for a specific token used to access a container registry

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    TokensApi apiInstance = new TokensApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    UUID tokenId = new UUID(); // UUID | The unique ID of the token
    try {
      ApiResponse<TokenResponse> result = apiInstance.registriesTokensFindByIdWithHttpInfo(registryId, tokenId);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#registriesTokensFindById");
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
| **tokenId** |  [**UUID**](../models/.md)| The unique ID of the token |

### Return type

[**TokenResponse**](../models/TokenResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesTokensGet"></a>
# **registriesTokensGet**
> TokensResponse registriesTokensGet(registryId, offset, limit)

List all tokens for the container registry

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    TokensApi apiInstance = new TokensApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    String offset = "0"; // String | The first element (from the complete list of the elements) to include in the response (used together with limit for pagination)
    String limit = "100"; // String | The maximum number of elements to return (used together with offset for pagination)
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<TokensResponse> result = apiInstance.registriesTokensGetWithHttpInfo(registryId, offset, limit, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#registriesTokensGet");
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
| **offset** | **String**| The first element (from the complete list of the elements) to include in the response (used together with limit for pagination) | [optional] [default to 0]
| **limit** | **String**| The maximum number of elements to return (used together with offset for pagination) | [optional] [default to 100]

### Return type

[**TokensResponse**](../models/TokensResponse.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesTokensPatch"></a>
# **registriesTokensPatch**
> TokenResponse registriesTokensPatch(registryId, tokenId, patchTokenInput)

Update token

Update token properties, for example: - change status to &#39;enabled&#39; or &#39;disabled&#39; - change expiry date

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    TokensApi apiInstance = new TokensApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    UUID tokenId = new UUID(); // UUID | The unique ID of the token
    PatchTokenInput patchTokenInput = new PatchTokenInput(); // PatchTokenInput | 
    try {
      ApiResponse<TokenResponse> result = apiInstance.registriesTokensPatchWithHttpInfo(registryId, tokenId, patchTokenInput);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#registriesTokensPatch");
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
| **tokenId** |  [**UUID**](../models/.md)| The unique ID of the token |
| **patchTokenInput** |  [**PatchTokenInput**](../models/PatchTokenInput.md)|  |

### Return type

[**TokenResponse**](../models/TokenResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registriesTokensPost"></a>
# **registriesTokensPost**
> PostTokenOutput registriesTokensPost(registryId, postTokenInput)

Create token

Create a token - password is only available once in the POST response

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    TokensApi apiInstance = new TokensApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    PostTokenInput postTokenInput = new PostTokenInput(); // PostTokenInput | 
    try {
      ApiResponse<PostTokenOutput> result = apiInstance.registriesTokensPostWithHttpInfo(registryId, postTokenInput);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#registriesTokensPost");
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
| **postTokenInput** |  [**PostTokenInput**](../models/PostTokenInput.md)|  |

### Return type

[**PostTokenOutput**](../models/PostTokenOutput.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registriesTokensPut"></a>
# **registriesTokensPut**
> PutTokenOutput registriesTokensPut(registryId, tokenId, putTokenInput)

Create or replace token

Create/replace a token - password is only available once in the create response - \&quot;name\&quot; cannot be changed

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.TokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");

    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    TokensApi apiInstance = new TokensApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The unique ID of the registry
    String tokenId = "tokenId_example"; // String | The unique ID of the token
    PutTokenInput putTokenInput = new PutTokenInput(); // PutTokenInput | 
    try {
      ApiResponse<PutTokenOutput> result = apiInstance.registriesTokensPutWithHttpInfo(registryId, tokenId, putTokenInput);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokensApi#registriesTokensPut");
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
| **tokenId** | **String**| The unique ID of the token |
| **putTokenInput** |  [**PutTokenInput**](../models/PutTokenInput.md)|  |

### Return type

[**PutTokenOutput**](../models/PutTokenOutput.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

