package com.zwk.driftbottle.impl.controller;

import com.zwk.driftbottle.interfaces.controller.OceanController;
import com.zwk.driftbottle.interfaces.service.OceanService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwk
 * @date 2021/12/16
 **/
@RestController
@RequestMapping("driftBottle")
public class DefaultOceanController implements OceanController {

    private final OceanService oceanService;

    public DefaultOceanController(final OceanService oceanService) {
        this.oceanService = oceanService;
    }

    @Override
    @GetMapping
    public HttpEntity<String> get(){
        return new HttpEntity<>(this.oceanService.get());
    }

    @Override
    @PostMapping
    public HttpEntity<?> post(String message) {
        this.oceanService.post(message);
        return new HttpEntity<>("ok");
    }
}
