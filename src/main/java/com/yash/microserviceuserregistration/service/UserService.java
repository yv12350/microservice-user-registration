package com.yash.microserviceuserregistration.service;

import com.yash.microserviceuserregistration.dao.UserDao;
import com.yash.microserviceuserregistration.model.UserModel;
import com.yash.microserviceuserregistration.dto.AddUserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public UserModel addUser(AddUserRequestDto addUserRequestDto) throws Exception {
        try {
            UserModel user = new UserModel();
            user.setFirstName(addUserRequestDto.getFirstName());
            user.setLastName(addUserRequestDto.getLastName());
            user.setUsername(addUserRequestDto.getUsername());
            return userDao.save(user);
        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }

    }

    public List<UserModel> listAllUser() throws Exception {
        try {
            return userDao.findAll();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
