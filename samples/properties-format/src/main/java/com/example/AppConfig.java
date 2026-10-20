package com.example;

import org.springframework.beans.factory.annotation.Value;

public class AppConfig {
    @Value("${app.name}")
    private String appName;

    @Value("${app.feature.enabled}")
    private boolean featureEnabled;

    @Value("${app.environment:development}")
    private String environment;
}