import com.xfp.mapper.UserMapper;
import com.xfp.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void select() {
//        String resources = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = build.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> user = mapper.getUser();
//        System.out.println(user);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapperImpl = context.getBean("userMapperImpl2", UserMapper.class);
        for (User user : userMapperImpl.getUser()) {
            System.out.println(user);
        }
    }
}
