package com.yupi.yuapiclientsdk;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties("yuapi.client")
@ComponentScan
public class YuApiClientConfig {
    private String accessKey;
    private String secretKey;
}
