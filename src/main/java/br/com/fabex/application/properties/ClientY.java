package br.com.fabex.application.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "integration.client-y")
public class ClientY {
    private String server;
    private Long connectionTimeoutRead;
}
