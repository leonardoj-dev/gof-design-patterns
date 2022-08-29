package org.example.gof.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestController {

    @GetMapping
    public String read() {
        return "read";
    }

    @PostMapping
    public void create() {
        // void
    }
}
