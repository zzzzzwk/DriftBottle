package com.zwk.driftbottle.interfaces.controller;

import org.springframework.http.HttpEntity;

/**
 * @author zwk
 * @date 2021/12/17
 * @description TODO
 **/
public interface ExceptionController {
    HttpEntity<Object> exception(Exception e);
}
