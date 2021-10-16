package com.ruvve.mapper;

import com.ruvve.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user(nickname, email, password, salt) VALUES(#{nickname}, #{email}, #{password})")
    @Options(useGeneratedKeys = true, keyColumn = "user.userId")
    int saveUser(@Param("user") final User user);

    @Select("SELECT nickname, email, password FROM user WHERE email=#{email}")
    User getUser(@Param("email") final String email);

}
