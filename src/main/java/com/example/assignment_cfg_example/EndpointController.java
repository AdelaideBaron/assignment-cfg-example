package com.example.assignment_cfg_example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EndpointController {

    @GetMapping("/getPenguin")
    public static ResponseEntity<String> getPenguin(@RequestParam String name){
        log.info("/getPenguin accessed");
        log.debug("name supplied: " + name);
        return ResponseEntity.ok("penguin called: " + name);
    }
//    http://localhost:8080/getPenguin?name=percy



}
