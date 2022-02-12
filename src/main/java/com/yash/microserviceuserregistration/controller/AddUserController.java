package com.yash.microserviceuserregistration.controller;


import com.yash.microserviceuserregistration.model.UserModel;
import com.yash.microserviceuserregistration.service.UserService;
import com.yash.microserviceuserregistration.dto.AddUserRequestDto;
import com.yash.microserviceuserregistration.dto.ListAllUserResponseDto;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/user")
public class AddUserController {
    @Autowired
    UserService userService;

    @PostMapping("add-user")
    public ResponseEntity addUser(@RequestBody AddUserRequestDto addUserRequestDto) {
        try {
            return new ResponseEntity(userService.addUser(addUserRequestDto), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("list-all-user")
    public ResponseEntity getAllUser() {
        try {
            return new ResponseEntity(userService.listAllUser(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("get-user/{Id}")
    public ResponseEntity getUserById(@PathVariable("Id") Integer id) throws Exception {
        if (userService.getUserById(id).size() > 0) {
            return new ResponseEntity(userService.getUserById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity("No Data Found", HttpStatus.BAD_REQUEST);

        }


    }
}
