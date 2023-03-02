import com.xfp.config.config;
import com.xfp.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void User(){
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
