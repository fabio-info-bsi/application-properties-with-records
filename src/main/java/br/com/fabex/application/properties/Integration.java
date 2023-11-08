package br.com.fabex.application.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "integration")
public record Integration(Client clientX, Client clientY, Client clientZ) {
    public record Client(String server, Long connectionTimeoutRead) {
    }
}
