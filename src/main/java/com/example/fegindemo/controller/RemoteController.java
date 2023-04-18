package com.example.fegindemo.controller;

import cn.hutool.json.JSONArray;
import com.example.fegindemo.api.KindFeign;
import com.example.fegindemo.domain.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ghc
 * @version 1.0
 * @description:
 * @date 2023/4/17 16:17
 */
@RestController
@RequestMapping("/remote")
@RequiredArgsConstructor
@Slf4j
public class RemoteController {

    private final KindFeign kindFeign;

    @GetMapping("/kind")
    public R<Void> getKindList() {
        R<JSONArray> jsonObjectR = kindFeign.queryKindList();
        log.info("kind result:[{}]", jsonObjectR);
        return null;
    }
}
