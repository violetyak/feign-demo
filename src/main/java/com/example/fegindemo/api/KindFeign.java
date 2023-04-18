package com.example.fegindemo.api;

import cn.hutool.json.JSONArray;
import com.example.fegindemo.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ghc
 * @version 1.0
 * @description:
 * @date 2023/4/17 16:21
 */
@FeignClient(url = "http://192.168.229.129/prod-api/",name = "kind")
public interface KindFeign {

    @GetMapping(value = "center/detectType/optionDetectTypeList")
    @ResponseBody
    R<JSONArray> queryKindList();
}
