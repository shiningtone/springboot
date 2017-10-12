package com.shsxt.service;

import com.shsxt.dao.UserDao;
import com.shsxt.models.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by administer on 2017/10/10.
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public User findById(Integer id)
    {
        User user=userDao.findById(id);
        return  user;
    }
    public List<User> findAll()
    {
        List users=userDao.findAll();
        return users;
    }
}
