package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface UserMapper {

    void insert(@Param("user") User user);

    List<User> userlist();

    User getUserByName(String username);

    User getById(Integer id);

    void updateById(@Param("user") User user);
}
