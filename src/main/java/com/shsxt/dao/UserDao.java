package com.shsxt.dao;

import com.shsxt.models.User;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by administer on 2017/10/10.
 */
@Repository
public class UserDao {

    public User findById(Integer id)
    {
        User user =new User();
        user.setId(1);
        user.setAge(18);
        user.setGender("女");
        user.setName("忘程");
        user.setPassword("1234");
        user.setUpdateDate(new Date());
        return user;
    }

}
