package com.yash.microserviceuserregistration.dao;

import com.yash.microserviceuserregistration.model.UserModel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<UserModel, Integer> {
    @Transactional
    public List<UserModel> findByUserId(Integer userId);
}
