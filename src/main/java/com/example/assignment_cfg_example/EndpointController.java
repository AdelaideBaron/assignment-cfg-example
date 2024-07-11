package com.example.assignment_cfg_example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EndpointController {

    @GetMapping("/getPenguin")
    public static ResponseEntity<String> getPenguin(@RequestParam String name, @RequestHeader(value = "membership-id") String membershipId){
        log.info("/getPenguin accessed");
        log.debug("name supplied: " + name);
        log.info("Membership calling: " + membershipId);

        Penguin penguin = new Penguin(name, "Black & White");


        return ResponseEntity.ok(penguin.toString());
    }
//    http://localhost:8080/getPenguin?name=percy + headers

//    Penguin(name=percy, colour=Black & White)
    // key: value

    // might want a response more like the following
//{
//    "name": "penguin",
//    "colour": xyz
//}



}
