package com.example.assignment_cfg_example;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Config {

    @Value("${spring.application.setApiMessage}")
    private String message;

}
