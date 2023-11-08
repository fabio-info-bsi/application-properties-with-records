package br.com.fabex.application.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "integration.client-z")
public record ClientZ(String server, Long connectionTimeoutRead) {
}
