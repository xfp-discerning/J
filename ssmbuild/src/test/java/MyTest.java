import com.xfp.pojo.Books;
import com.xfp.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookService impl = (BookService) context.getBean("bookServiceImpl");
        List<Books> books = impl.queryAllBooks();
        System.out.println(books);
    }
}
