import com.xfp.dao.UserDaoImpl;
import com.xfp.service.UserService;
import com.xfp.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
//        //用户实际调用业务层
//        UserService userService = new UserServiceImpl();
//        userService.getUser();

//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
//        或者
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();

    }
}
