package com.example.Atelie_da_ju.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class Controller {
    @GetMapping
    public void getAll() {

    }
}
