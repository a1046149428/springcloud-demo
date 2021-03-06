package fun.bryce.mybatistest;

import fun.bryce.mybatistest.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTestApplicationTests
{
    @Resource
    UserMapper userMapper;

    @Test
    public void contextLoads()
    {
        System.out.println(userMapper.queryUser());
    }

}
