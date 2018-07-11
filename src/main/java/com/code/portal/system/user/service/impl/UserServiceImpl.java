package com.code.portal.system.user.service.impl;

import com.code.portal.system.user.dao.UserRepository;
import com.code.portal.system.user.model.User;
import com.code.portal.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User doLogin(User user) {
        User reuser = null;
       List<User> users = userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
       if(users!=null && users.size()>0){
           reuser = users.get(0);
       }
       return reuser;
    }
}
