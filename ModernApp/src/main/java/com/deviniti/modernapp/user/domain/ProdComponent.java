package com.deviniti.modernapp.user.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"prod"})
@Component
@Slf4j
class ProdComponent {

    ProdComponent() {
        log.info("Prod");
    }
}
