import com.xfp.dao.UserMapper;
import com.xfp.pojo.User;
import com.xfp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void queryUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User users = mapper.queryUserById(2);
        System.out.println(users);
        System.out.println("=====================================");
        User users2 = mapper.queryUserById(2);
        System.out.println(users2);
        sqlSession.close();
    }
}
