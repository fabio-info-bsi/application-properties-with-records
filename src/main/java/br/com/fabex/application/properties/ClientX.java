package br.com.fabex.application.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "integration.client-x")
public class ClientX {
    private String server;
    private Long connectionTimeoutRead;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Long getConnectionTimeoutRead() {
        return connectionTimeoutRead;
    }

    public void setConnectionTimeoutRead(Long connectionTimeoutRead) {
        this.connectionTimeoutRead = connectionTimeoutRead;
    }
}
