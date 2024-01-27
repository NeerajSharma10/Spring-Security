package com.njcoder.A.project.to.understand.spring.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @GetMapping("/hello")
    public ResponseEntity<String> sendMessageHello() {
        return new ResponseEntity<>("hello message is hello world", HttpStatus.OK);
    }

    @GetMapping("/sayhi")
    public ResponseEntity<String> sendMessageHi() {
        return new ResponseEntity<>("Hi Message to world", HttpStatus.OK);
    }

}
