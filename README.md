[![Gitter](https://img.shields.io/gitter/room/ionos-cloud/sdk-general)](https://gitter.im/ionos-cloud/sdk-general)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.ionoscloud/ionos-cloud-sdk/badge.svg?style=plastic)](https://mvnrepository.com/artifact/com.ionoscloud/ionos-cloud-sdk)

## Overview

The IONOS Container Registry SDK for Java provides you with access to the Container Registry API. Container Registry service enables IONOS clients to manage docker and OCI compliant registries for use by their manage Kubernetes clusters. Use a Container Registry to ensure you have a privately accessed registry to efficiently support image pulls.

> ⚠️ **Note:** Container registry is currently in the **Early Access (EA)** phase. We recommend keeping usage and testing to non-production critical applications. Please contact your sales representative or support for more information.

## Getting Started

### Instalation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ionoscloud.containerregistry</groupId>
  <artifactId>ionos-cloud-sdk-container-registry</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ionoscloud.containerregistry:ionos-cloud-sdk-container-registry:1.0.0"
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ionos-cloud-sdk-container-registry-1.0.0.jar`
* `target/lib/*.jar`


### Usage

```java
// Import classes:
import com.ionoscloud.ApiClient;
import com.ionoscloud.ApiException;
import com.ionoscloud.Configuration;
import com.ionoscloud.auth.*;
import com.ionoscloud.model.*;
import com.ionoscloud.api.RegistriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure HTTP basic authorization: Basic Authentication
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("Basic Authentication");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    RegistriesApi apiInstance = new RegistriesApi(defaultClient);
    Integer offset = 0; // Integer | the first element (of the total list of elements) to include in the response (use together with <code>limit</code> for pagination)
    Integer limit = 100; // Integer | the maximum number of elements to return (use together with <code>offset</code> for pagination)
    try {
      Registries result = apiInstance.registriesGet(offset, limit);
      System.out.println(result);
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

## Feature Reference

The IONOS Container Registry SDK for JAVA aims to offer access to all resources in the IONOS Container Registry API and also offers some additional features that make the integration easier:
 - authentication for API calls
 - handling of asynchronous requests

## FAQ

 - How can I open a bug/feature request?
	Bugs & feature requests can be open on the repository issues: https://github.com/ionos-cloud/sdk-java-container-registry/issues/new/choose

 - Can I contribute to the Java SDK?
    Pur SDKs are automatically generated using OpenAPI Generator and don’t support manual changes. If you need changes please open an issue and we’ll try to take care of it.
