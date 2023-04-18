package com.example.fegindemo.domain;

import lombok.Data;

/**
 * @author ghc
 * @version 1.0
 * @description:
 * @date 2023/4/17 16:18
 */
@Data
public class R<T> {
    private String code;
    private String msg;
    private T data;
}
