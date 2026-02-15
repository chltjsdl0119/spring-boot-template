package com.example.template.global.config;

import com.example.template.global.security.jwt.JwtProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(
        JwtProperties.class
)
public class JwtPropertiesConfig {
}
