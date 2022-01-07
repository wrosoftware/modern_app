package com.deviniti.modernapp.application;

import com.deviniti.modernapp.common.annotation.ApiRestController;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiRestController("/application")
class ApplicationController {

    @Value("${application.version}")
    private String version;

    @GetMapping("/version")
    public String version(){
        return this.version;
    }
}
