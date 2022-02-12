package com.yash.microserviceuserregistration.dao;

import com.yash.microserviceuserregistration.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserModel, Integer> {
}
