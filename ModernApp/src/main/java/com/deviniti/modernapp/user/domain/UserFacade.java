package com.deviniti.modernapp.user.domain;

import com.deviniti.modernapp.user.UserApi;
import org.springframework.stereotype.Component;

@Component
class UserFacade implements UserApi {

    @Override
    public String getUserById(Long id) {
        return "" + id;
    }
}
