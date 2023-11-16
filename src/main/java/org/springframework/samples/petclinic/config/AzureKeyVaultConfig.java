package com.tuempresa.tuaplicacion.config;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AzureKeyVaultConfig {

    @Bean
    public SecretClient secretClient() {
        String kvUri = "https://final20232.vault.azure.net";

        return new SecretClientBuilder()
                .vaultUrl(kvUri)
                .credential(new DefaultAzureCredentialBuilder().build())
                .buildClient();
    }
}
