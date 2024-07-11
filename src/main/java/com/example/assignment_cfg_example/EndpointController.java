package com.example.assignment_cfg_example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EndpointController {

    @GetMapping("/getPenguin")
    public static ResponseEntity<String> getPenguin(){
        log.info("/getPenguin accessed");
        return ResponseEntity.ok("penguin");
    }
}
