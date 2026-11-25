package com.devconnect.DevConnet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {
    //URL GET /health
    @GetMapping("/health")
    public String getHealth(){
        return "SpringBoot application is running healthy.";
    }

    // GET /api/v1/status
    @GetMapping("api/v1/status")
    public Map<String, Object> getStatus(){
        Map<String, Object> map = new HashMap<>();
        map.put("status" , "OK");
        map.put("Service" , "DevConnect");
        map.put("version" , "1.0.0");
        map.put("timestamp" , LocalDateTime.now().toString());

        return map;


    }

    //JACKSON - converts the java objects into HTTP compatible formats



}
