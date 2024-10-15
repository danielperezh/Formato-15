package com.daniel.curso.springboot.springboot_web.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.curso.springboot.springboot_web.Models.dto.User;
import com.daniel.curso.springboot.springboot_web.Models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Daniel","Perez","xxxxxx");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring Boot");
        return userDto;
    }

    

}
