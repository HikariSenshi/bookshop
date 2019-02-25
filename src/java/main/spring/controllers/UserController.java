package spring.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.database.entities.User;
import spring.database.repos.UsersRepo;

import java.util.Map;

@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersRepo users;

    @GetMapping
    public String getUser(Map<String, Object> params) {
        Iterable<User> allUsers = users.findAll();
        params.put("users", allUsers);
        return "userPage";
    }

    @PostMapping
    public String addUser(@RequestParam User u, Map<String, Object> params) {
        users.save(u);
        params.put("users", users.findAll());
        return "userPage";
    }
}
