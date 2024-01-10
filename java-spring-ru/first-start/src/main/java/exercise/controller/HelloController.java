package exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/about")
    public String index() {
        return "Welcome to Hexlet!";
    }
}
