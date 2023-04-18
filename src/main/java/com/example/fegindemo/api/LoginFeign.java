package com.example.fegindemo.api;

import cn.hutool.json.JSONObject;
import com.example.fegindemo.config.properties.LimsLoginProperties;
import com.example.fegindemo.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ghc
 * @version 1.0
 * @description:
 * @date 2023/4/17 16:37
 */
@FeignClient(url = "http://192.168.229.129/prod-api/", name = "login")
public interface LoginFeign {
    @PostMapping(value = "login")
    @ResponseBody
    R<JSONObject> Login(LimsLoginProperties limsLoginProperties);
}
