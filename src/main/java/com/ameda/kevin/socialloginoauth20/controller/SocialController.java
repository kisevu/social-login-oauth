package com.ameda.kevin.socialloginoauth20.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/social")
public class SocialController {
    @GetMapping
    public ResponseEntity<?> dev(){
        return new ResponseEntity<>("Developer Ameda Kevin.",HttpStatus.OK);
    }
}
