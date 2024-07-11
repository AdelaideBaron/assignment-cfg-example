package com.example.assignment_cfg_example;

import com.example.assignment_cfg_example.model.Otter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EndpointController {

    @Autowired
    private OtterRepository otterRepository;

    @GetMapping("/getOtter")
    public ResponseEntity<String> getOtter(){
        String name = otterRepository.findAll().getFirst().getName();
//        Otter otter = otterRepository.findAll().getFirst();
        return ResponseEntity.ok(name);
    }
}
