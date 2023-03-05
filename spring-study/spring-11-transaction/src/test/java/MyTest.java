import com.xfp.mapper.UserMapper;
import com.xfp.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void getUser(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        //getSqlSession()方法是SqlSessionDaoSupport自带的，用来获取SqlSession对象mapper的
        List<User> user = userMapperImpl.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
    }
}
