package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "result";
    }
}

