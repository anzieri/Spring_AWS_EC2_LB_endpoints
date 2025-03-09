package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/home")
    public String getHello() throws IOException {
        URL url = new URL("http://checkip.amazonaws.com/");
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(url.openStream()));
        String ip = br.readLine();
        return "Hello Amara, the response is from IP: " + ip + " at time: " + LocalDateTime.now();
    }

    @GetMapping("/chill")
    public ResponseEntity<String> getMine(){
        try{
            return ResponseEntity.ok("Hiiiii");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }


}
