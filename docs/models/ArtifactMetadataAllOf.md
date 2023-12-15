

# ArtifactMetadataAllOf

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lastPushedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the artifact was last pushed |  |
| **lastPulledAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the artifact was last pulled |  [optional] |
| **lastScannedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the artifact was last scanned |  [optional] |
| **pushCount** | **Long** | The number of times the artifact was pushed |  |
| **pullCount** | **Long** | The number of times the artifact was pulled |  |
| **vulnMaxSeverity** | **String** | The maximum vulnerability severity of the artifact, if any |  [optional] |
| **vulnTotalScore** | **Float** | The total CVSS score of all vulnerabilities of the artifact |  [optional] |
| **vulnTotalCount** | **Long** | The total number of vulnerabilities of the artifact |  [optional] |
| **vulnFixableCount** | **Long** | The number of fixable vulnerabilities of the artifact |  [optional] |


