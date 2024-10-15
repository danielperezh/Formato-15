package com.daniel.curso.springboot.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.daniel.curso.springboot.springboot_web.Models.dto.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String destails(Model model){

        User user = new User("Daniel","Perez","prueba");
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("user", user);
        user.setEmail("Daniel@gmail.com");

        return "details";
    }


    @GetMapping("/url")
    public String list(ModelMap model){
        model.addAttribute("title", "Estado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel(){
        List<User> users = Arrays.asList(
            new User("pepa", "Perez"),
            new User("1", "2","prueba@gmail.com"),
            new User("2", "2","prueba@gmail.com"),
            new User("3", "2","prueba@gmail.com"),
            new User("4", "2","prueba@gmail.com"));
        return users;

    }
    

}
