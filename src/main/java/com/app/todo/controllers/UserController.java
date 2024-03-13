package com.app.todo.controllers;

import com.app.todo.dtos.UserRecordDto;
import com.app.todo.services.UserService;
import com.app.todo.utils.ApiGlobalResponseDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<ApiGlobalResponseDto>saveUser(@RequestBody @Valid UserRecordDto dto){
        var newUser = userService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiGlobalResponseDto(newUser));
    }

}
