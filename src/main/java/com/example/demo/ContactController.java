package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") // Allows the frontend to talk to the backend
public class ContactController {

    @PostMapping("/submit-form")
    public String handleForm(@RequestBody ContactForm form) {
        System.out.println("--- New Contact Form Submission ---");
        System.out.println("Name: " + form.getName());
        System.out.println("Email: " + form.getEmail());
        System.out.println("Message: " + form.getMessage());

        return "Success! Data received on the backend.";
    }
}