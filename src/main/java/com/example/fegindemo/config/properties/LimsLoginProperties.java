package com.example.fegindemo.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ghc
 * @version 1.0
 * @description:
 * @date 2023/4/17 16:40
 */
@Component
@Data
@ConfigurationProperties(prefix = "lims")
public class LimsLoginProperties {
    private String username;
    private String password;
}
