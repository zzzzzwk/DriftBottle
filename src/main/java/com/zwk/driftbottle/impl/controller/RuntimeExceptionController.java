package com.zwk.driftbottle.impl.controller;

import com.zwk.driftbottle.interfaces.controller.ExceptionController;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zwk
 * @date 2021/12/17
 **/
@RestControllerAdvice
public class RuntimeExceptionController implements ExceptionController {

    @ExceptionHandler
    @Override
    public HttpEntity<Object> exception(Exception e) {
        if (e instanceof RuntimeException){
            return new HttpEntity<>(e.getMessage());
        }
        e.printStackTrace();
        return new HttpEntity<>("error");
    }
}
