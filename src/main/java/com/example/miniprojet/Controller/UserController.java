package com.example.miniprojet.Controller;

import com.example.miniprojet.Entity.Address;
import com.example.miniprojet.Entity.User;
import com.example.miniprojet.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //post
    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @PostMapping("users")
    public String addListOfUsers(@PathVariable List<User> users){
        return userService.addListOfUsers(users);
    }

    //get
    @GetMapping("user/{Id}")
    public Optional<User> getUser(@PathVariable Integer Id){
        return userService.getUser(Id);
    }
    @GetMapping("users")
    public List<User> getProducts(){
        return userService.getUsers();
    }
    @PutMapping("user/address/{id}")
    public String updateUserAddressByUserId(@RequestBody Address address, @PathVariable Integer Id){
        return userService.updateUserAddressByUserId(address,Id);
    }
    @DeleteMapping("user/{id}")
    public String deleteById(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }
}