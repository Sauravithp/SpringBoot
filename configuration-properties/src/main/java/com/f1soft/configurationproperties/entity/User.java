package com.f1soft.configurationproperties.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "user")
@Component
@Data

public class User {
    private String username;
    private int age;
    private String address;
}
