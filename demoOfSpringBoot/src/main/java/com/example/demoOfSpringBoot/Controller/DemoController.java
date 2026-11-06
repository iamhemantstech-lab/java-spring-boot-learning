package com.example.demoOfSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Marks this class as a REST API controller.
// The returned data (String, Object, List, etc.) is written
// directly into the HTTP response body, usually as JSON for objects.
public class DemoController {
    @GetMapping("/greet")
    // Maps HTTP GET requests to "/greet" to this method.
    // Example: GET http://localhost:8080/greet
    public String sayGreet(){
        // public: accessible method
        // String: the return type of this method
        // sayGreet(): method name; no parameters are required
        return "Hi, Hemant. Hope you are doing well !!!";
        // Returns a String to Spring Boot, which sends it
        // as the HTTP response body to the client.
        // Spring invokes this method automatically when
        // a matching GET request arrives.
    }
}
