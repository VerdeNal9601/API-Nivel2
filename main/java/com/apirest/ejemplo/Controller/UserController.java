package com.apirest.ejemplo.Controller;


import com.apirest.ejemplo.Model.User;
import com.apirest.ejemplo.Service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserServiceI userServiceI;

    @Autowired
    public UserController(UserServiceI userServiceI) {
        this.userServiceI = userServiceI;
    }
    @GetMapping
    public HashMap<Integer, User> all() {
        return userServiceI.all();
    }
    @GetMapping("/{idUser}")
    public User findById (@PathVariable("idUser") Integer id) {
        return userServiceI.findById(id);
    }
    @PostMapping
    public User create (@RequestBody User user){
        return userServiceI.create(user);
    }
    @PutMapping("/{idUser}")
    public User update (@PathVariable("idUser") Integer id,@RequestBody User user){
        return userServiceI.update(id,user);
    }
    @DeleteMapping("/{idUser}")
    public void delete (@PathVariable("idUser")Integer id){
        userServiceI.deleteById(id);
    }


















}