import com.xfp.dao.UserDaoImpl;
import com.xfp.service.UserService;
import com.xfp.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        //用户实际调用业务层
//        UserService userService = new UserServiceImpl();
//        userService.getUser();
//=========================================================================
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
//        或者
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoImpl());
//        userService.getUser();
//==========================================================================
        //配置好IoC容器后，即可使用下列方式获取spring生成的对象bean
        //建议使用ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl)context.getBean("serviceImpl");
        userService.getUser();
    }
}
