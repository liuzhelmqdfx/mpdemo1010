package com.atguigu.modemo1010;

import com.atguigu.modemo1010.entity.User;
import com.atguigu.modemo1010.mapper.UserMapper;
import com.baomidou.mybatisplus.annotation.TableField;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Mpdemo1010ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    // 查询所有数据
    @Test
    public void findAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    // 添加用户
    @Test
    public void addUser(){
        User user = new User();
        user.setName("张三丰222master");
        user.setAge(100);
        user.setEmail("fghjk6789@qq.com");

        int insert = userMapper.insert(user);
        System.out.println("insert = " + insert);
    }

    //修改用户
    @Test
    public void updateUser(){
        User user = new User();
        user.setId(1301860421208113154L);
        user.setAge(123);

        int row = userMapper.updateById(user);
        System.out.println("row = " + row);
    }

    //测试乐观锁
    @Test
    public void testOptimisticLocker(){
        //根据ID查询
        User user = userMapper.selectById(1301860421208113154L);
        //进行修改
        user.setAge(133);
        userMapper.updateById(user);
    }




}
