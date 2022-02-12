package com.yash.microserviceuserregistration.controller;


import com.yash.microserviceuserregistration.model.UserModel;
import com.yash.microserviceuserregistration.service.UserService;
import com.yash.microserviceuserregistration.dto.AddUserRequestDto;
import com.yash.microserviceuserregistration.dto.ListAllUserResponseDto;
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
    public ResponseEntity<UserModel> addUser(@RequestBody AddUserRequestDto addUserRequestDto) {
        try {
            return new ResponseEntity(userService.addUser(addUserRequestDto), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("list-all-user")
    public ResponseEntity<ListAllUserResponseDto> getAllUser() {
        try {
            return new ResponseEntity(userService.listAllUser(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
