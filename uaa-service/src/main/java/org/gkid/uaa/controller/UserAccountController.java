package org.gkid.uaa.controller;

import org.gkid.uaa.dto.AddUserDto;
import org.gkid.uaa.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountController {

    private final UserService userService;

    public UserAccountController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(name = "/users")
    public int saveUserAccount (@RequestBody AddUserDto dto){
        return userService.addUser(dto);
    }
}
