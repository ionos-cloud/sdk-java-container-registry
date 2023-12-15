# ArtifactsApi

All URIs are relative to *https://api.ionos.com/containerregistries*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**registriesArtifactsGet**](ArtifactsApi.md#registriesartifactsget) | **GET** /registries/{registryId}/artifacts | Retrieve all Artifacts by Registry |
| [**registriesRepositoriesArtifactsFindByDigest**](ArtifactsApi.md#registriesrepositoriesartifactsfindbydigest) | **GET** /registries/{registryId}/repositories/{repositoryName}/artifacts/{digest} | Retrieve Artifact |
| [**registriesRepositoriesArtifactsGet**](ArtifactsApi.md#registriesrepositoriesartifactsget) | **GET** /registries/{registryId}/repositories/{repositoryName}/artifacts | Retrieve all Artifacts by Repository |
| [**registriesRepositoriesArtifactsVulnerabilitiesGet**](ArtifactsApi.md#registriesrepositoriesartifactsvulnerabilitiesget) | **GET** /registries/{registryId}/repositories/{repositoryName}/artifacts/{digest}/vulnerabilities | Retrieve all Vulnerabilities |


<a name="registriesArtifactsGet"></a>
# **registriesArtifactsGet**
> RegistryArtifactsReadList registriesArtifactsGet(registryId, offset, limit, filterVulnerabilityId, orderBy)

Retrieve all Artifacts by Registry

This endpoint enables retrieving all Artifacts using pagination and optional filters. 

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.ArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    ArtifactsApi apiInstance = new ArtifactsApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The ID (UUID) of the Registry.
    Integer offset = 0; // Integer | The first element (of the total list of elements) to include in the response. Use together with limit for pagination.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with offset for pagination.
    String filterVulnerabilityId = "filterVulnerabilityId_example"; // String | Filter resources by vulnerabilityId.
    String orderBy = "-pullCount"; // String | The field to order the results by. If not provided, the results will be ordered by the default field.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<RegistryArtifactsReadList> result = apiInstance.registriesArtifactsGetWithHttpInfo(registryId, offset, limit, filterVulnerabilityId, orderBy, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtifactsApi#registriesArtifactsGet");
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
| **filterVulnerabilityId** | **String**| Filter resources by vulnerabilityId. | [optional]
| **orderBy** | **String**| The field to order the results by. If not provided, the results will be ordered by the default field. | [optional] [default to -pullCount] [enum: -pullCount, -pushCount, -lastPush, -lastPull, -lastScan, -vulnTotalCount, -vulnFixableCount, pullCount, pushCount, lastPush, lastPull, lastScan, vulnTotalCount, vulnFixableCount]

### Return type

[**RegistryArtifactsReadList**](../models/RegistryArtifactsReadList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesRepositoriesArtifactsFindByDigest"></a>
# **registriesRepositoriesArtifactsFindByDigest**
> ArtifactRead registriesRepositoriesArtifactsFindByDigest(registryId, repositoryName, digest)

Retrieve Artifact

Returns the Artifact by Digest.

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.ArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    ArtifactsApi apiInstance = new ArtifactsApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The ID (UUID) of the Registry.
    String repositoryName = "my-service"; // String | The Name of the Repository.
    String digest = "sha256:12345678901234567890123456789012"; // String | The Digest of the Artifact that should be retrieved.
    try {
      ApiResponse<ArtifactRead> result = apiInstance.registriesRepositoriesArtifactsFindByDigestWithHttpInfo(registryId, repositoryName, digest);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtifactsApi#registriesRepositoriesArtifactsFindByDigest");
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
| **repositoryName** | **String**| The Name of the Repository. |
| **digest** | **String**| The Digest of the Artifact that should be retrieved. |

### Return type

[**ArtifactRead**](../models/ArtifactRead.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesRepositoriesArtifactsGet"></a>
# **registriesRepositoriesArtifactsGet**
> ArtifactReadList registriesRepositoriesArtifactsGet(registryId, repositoryName, offset, limit, orderBy)

Retrieve all Artifacts by Repository

This endpoint enables retrieving all Artifacts using pagination and optional filters. 

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.ArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    ArtifactsApi apiInstance = new ArtifactsApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The ID (UUID) of the Registry.
    String repositoryName = "my-service"; // String | The Name of the Repository.
    Integer offset = 0; // Integer | The first element (of the total list of elements) to include in the response. Use together with limit for pagination.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with offset for pagination.
    String orderBy = "-lastPush"; // String | The field to order the results by. If not provided, the results will be ordered by the default field.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<ArtifactReadList> result = apiInstance.registriesRepositoriesArtifactsGetWithHttpInfo(registryId, repositoryName, offset, limit, orderBy, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtifactsApi#registriesRepositoriesArtifactsGet");
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
| **repositoryName** | **String**| The Name of the Repository. |
| **offset** | **Integer**| The first element (of the total list of elements) to include in the response. Use together with limit for pagination. | [optional] [default to 0]
| **limit** | **Integer**| The maximum number of elements to return. Use together with offset for pagination. | [optional] [default to 100]
| **orderBy** | **String**| The field to order the results by. If not provided, the results will be ordered by the default field. | [optional] [default to -lastPush] [enum: -lastPush, -lastPull, -lastScan, -pullCount, -pushCount, -vulnMaxSeverity, -vulnTotalScore, -vulnTotalCount, -vulnFixableCount, lastPush, lastPull, lastScan, pullCount, pushCount, vulnMaxSeverity, vulnTotalScore, vulnTotalCount, vulnFixableCount]

### Return type

[**ArtifactReadList**](../models/ArtifactReadList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesRepositoriesArtifactsVulnerabilitiesGet"></a>
# **registriesRepositoriesArtifactsVulnerabilitiesGet**
> ArtifactVulnerabilityReadList registriesRepositoriesArtifactsVulnerabilitiesGet(registryId, repositoryName, digest, offset, limit, filterSeverity, filterFixable, orderBy)

Retrieve all Vulnerabilities

This endpoint enables retrieving all Vulnerabilities using pagination and optional filters. 

### Example
```java
// Import classes:
import com.ionoscloud.containerregistry.ApiClient;
import com.ionoscloud.containerregistry.ApiException;
import com.ionoscloud.containerregistry.ApiResponse;
import com.ionoscloud.containerregistry.Configuration;
import com.ionoscloud.containerregistry.auth.*;
import com.ionoscloud.containerregistry.model.*;
import com.ionoscloud.containerregistry.api.ArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure Api Key authorization: tokenAuth
    defaultClient.setApiKeyWithBearerPrefix("YOUR TOKEN");
    ArtifactsApi apiInstance = new ArtifactsApi(defaultClient);
    UUID registryId = new UUID(); // UUID | The ID (UUID) of the Registry.
    String repositoryName = "my-service"; // String | The Name of the Repository.
    String digest = "sha256:12345678901234567890123456789012"; // String | The Digest of the Artifact.
    Integer offset = 0; // Integer | The first element (of the total list of elements) to include in the response. Use together with limit for pagination.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with offset for pagination.
    String filterSeverity = "filterSeverity_example"; // String | Filter resources by vulnerability severity.
    Boolean filterFixable = true; // Boolean | Filter resources by fixable (i.e. remediation action is available)
    String orderBy = "-score"; // String | The field to order the results by. If not provided, the results will be ordered by the default field.
    String orderBy = "orderBy_example"; // String | Order by field
    Integer maxResults = "maxResults_example"; // Integer | Maximum number of results to return
    try {
      ApiResponse<ArtifactVulnerabilityReadList> result = apiInstance.registriesRepositoriesArtifactsVulnerabilitiesGetWithHttpInfo(registryId, repositoryName, digest, offset, limit, filterSeverity, filterFixable, orderBy, orderBy, maxResults, filters);
      System.out.println("Response: " + result.getData());
      System.out.println("Status Code: " + result.getStatusCode());
      System.out.println("Headers: " + result.getHeaders());
    } catch (ApiException e) {
      System.err.println("Exception when calling ArtifactsApi#registriesRepositoriesArtifactsVulnerabilitiesGet");
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
| **repositoryName** | **String**| The Name of the Repository. |
| **digest** | **String**| The Digest of the Artifact. |
| **offset** | **Integer**| The first element (of the total list of elements) to include in the response. Use together with limit for pagination. | [optional] [default to 0]
| **limit** | **Integer**| The maximum number of elements to return. Use together with offset for pagination. | [optional] [default to 100]
| **filterSeverity** | **String**| Filter resources by vulnerability severity. | [optional]
| **filterFixable** | **Boolean**| Filter resources by fixable (i.e. remediation action is available) | [optional]
| **orderBy** | **String**| The field to order the results by. If not provided, the results will be ordered by the default field. | [optional] [default to -score] [enum: -score, -severity, -publishedAt, -updatedAt, -fixable, score, severity, publishedAt, updatedAt, fixable]

### Return type

[**ArtifactVulnerabilityReadList**](../models/ArtifactVulnerabilityReadList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

