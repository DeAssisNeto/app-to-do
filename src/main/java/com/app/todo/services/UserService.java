package com.app.todo.services;

import com.app.todo.dtos.UserRecordDto;
import com.app.todo.models.UserModel;
import com.app.todo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public UserModel save(UserRecordDto dto){
        return userRepository.save(new UserModel(dto));
    }
}
