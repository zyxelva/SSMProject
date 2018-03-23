package com.zyx.test.java;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.mapper.SysUser;
import com.zyx.test.java.service.IUserService;

public class UserServiceTest extends SpringTestCase {

    @Autowired
    private IUserService userService;

    @Test
    public void selectUserByIdTest(){
        SysUser user = userService.selectByPrimaryKey(1);
        System.out.println(user.getUsername() + "+++++++++++++++++++++++++++:" + user.getPassword());
    }
}
