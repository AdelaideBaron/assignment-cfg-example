package com.example.assignment_cfg_example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EndpointController {

    @Autowired
    private Config config;

    @GetMapping("/getPenguin")
    public ResponseEntity<String> getPenguin(@RequestParam String name, @RequestHeader(value = "membership-id") String membershipId){
        log.info("/getPenguin accessed");
        log.debug("name supplied: " + name);
        log.info("Membership calling: " + membershipId);

        Penguin penguin = new Penguin(name, "Black & White");
        String message = config.getMessage();

        return ResponseEntity.ok(penguin.toString() + " MESSAGE: " + message);
    }
//    http://localhost:8080/getPenguin?name=percy + headers

}
