package com.deviniti.modernapp.user.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"dev"})
@Component
@Slf4j
class DevComponent {

    DevComponent() {
        log.info("Dev");
    }
}
