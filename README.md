# application-properties-with-records

[![en](https://img.shields.io/badge/lang-en-red.svg)](README.md)
[![pt-br](https://img.shields.io/badge/lang-pt--br-green.svg)](README.pt-br.md)

This project have objective to implement example Class and Records codes about application properties deserialization of the Spring Boot 3 applications.

---

## Prerequisites

- [Java JDK 17](https://adoptium.net/)

---
## Examples

 Class / Record                                          | Description                                                                                           
------------------------------------------------|-------------------------------------------------------------------------------------------------------
 [`br.com.fabex.application.properties.ClientX`](src/main/java/br/com/fabex/application/properties/ClientX.java)| Implementation using `class`, writing getters and setters.                                      
 [`br.com.fabex.application.properties.ClientY`](src/main/java/br/com/fabex/application/properties/ClientY.java)| Implementation using `class` and annotation `@Data` of the lombok for generate getters and setters.                                              
 [`br.com.fabex.application.properties.ClientZ`](src/main/java/br/com/fabex/application/properties/ClientZ.java)| Implementation using record.                                       
 [`br.com.fabex.application.properties.Integration`](src/main/java/br/com/fabex/application/properties/Integration.java)| Implementation using `record` (with nested `record`).

