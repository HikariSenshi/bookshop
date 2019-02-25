package spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping
public class IndexController {

    @GetMapping
    public String getUser(Map<String, Object> params) {

        return "index";
    }
}
