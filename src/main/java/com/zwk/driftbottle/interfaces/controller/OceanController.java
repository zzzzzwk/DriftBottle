package com.zwk.driftbottle.interfaces.controller;

import org.springframework.http.HttpEntity;

/**
 * @author zwk
 * @date 2021/12/16
 **/
public interface OceanController {
    HttpEntity<String> get();
    HttpEntity<?> post(String message);
}
