package com.wishalpha.Sign.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class IndexController {

    @GetMapping("/greet")
    public ResponseEntity<Map<String,Object>> index(){

        Map<String,Object> map = new HashMap<>();
        map.put("data","Yes go it");
        return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
    }

}
