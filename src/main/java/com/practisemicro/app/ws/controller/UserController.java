package com.practisemicro.app.ws.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    //this read path variable in uri like: /users/this-is-test
    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId){
        return "get user with this id"+userId;
    }
    //this read query in uri like: /users?page=1&limit=10
    @GetMapping
    public String getUserWithQuery(@RequestParam(value = "page")int pageNumber,
                                   @RequestParam(value = "limit",defaultValue = "1")int limit){
        return "get user with this query"+pageNumber+""+"with this limitation"+limit;
    }

    @PostMapping
    public String createUser(){
        return "create user";
    }

    @PutMapping
    public String updateUser(){
        return "update user";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user";
    }

}
