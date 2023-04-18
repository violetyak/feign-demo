package com.example.fegindemo.runner;

import cn.hutool.json.JSONObject;
import com.example.fegindemo.api.LoginFeign;
import com.example.fegindemo.config.FeignConfig;
import com.example.fegindemo.config.properties.LimsLoginProperties;
import com.example.fegindemo.domain.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author ghc
 * @version 1.0
 * @description:
 * @date 2023/4/17 16:44
 */
@RequiredArgsConstructor
@Component
@Slf4j
public class FeignRemoteRunner implements ApplicationRunner {

    private final LimsLoginProperties limsLoginProperties;

    private final LoginFeign loginFeign;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        R<JSONObject> login = loginFeign.Login(limsLoginProperties);
        JSONObject data = login.getData();
        String token = data.get("token", String.class);
        log.info("lims login token:[{}]", token);
        FeignConfig.setTOKEN(token);
    }
}
