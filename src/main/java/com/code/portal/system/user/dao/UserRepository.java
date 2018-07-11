package com.code.portal.system.user.dao;

import com.code.portal.system.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    public List findByUsernameAndPassword(String username,String passoword);
}
