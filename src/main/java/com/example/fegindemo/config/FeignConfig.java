package com.example.fegindemo.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * @author ghc
 * @version 1.0
 * @description:
 * @date 2023/4/17 16:12
 */
@Configuration
@Slf4j
public class FeignConfig implements RequestInterceptor {

    private static String TOKEN;

    private static String HEADER_KEY = "Authorization";


    @Override
    public void apply(RequestTemplate requestTemplate) {
        if (!"/login".equals(requestTemplate.url())) {
            requestTemplate.header(HEADER_KEY, "Bearer " + TOKEN);
        }
    }

    public static String getTOKEN() {
        return TOKEN;
    }

    public static void setTOKEN(String TOKEN) {
        FeignConfig.TOKEN = TOKEN;
    }
}
