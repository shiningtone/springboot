package com.shsxt.dao;

import com.shsxt.models.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * Created by administer on 2017/10/10.
 */
public interface UserDao {
    @Select("select * from t_user where id=#{id}")
    public User findById(@Param(value="id") Integer id);

    public List<User> findAll();

    public User findById(String Id);
}
