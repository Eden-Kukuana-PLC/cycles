package org.cycles.app.controllers;


import org.cycles.models.entities.User;
import org.cycles.models.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicController {

    private final UserService userService;

    public PublicController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> index() {
        return this.userService.getAllUsers();
    }
}
