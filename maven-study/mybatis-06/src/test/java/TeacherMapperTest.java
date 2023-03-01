import com.xfp.dao.StudentMapper;
import com.xfp.dao.TeacherMapper;
import com.xfp.pojo.Student;
import com.xfp.pojo.Teacher;
import com.xfp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

public class TeacherMapperTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student s : student){
            System.out.println(s);
        }
        sqlSession.close();
    }
    @Test
    public void getStudentTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentTeacher = mapper.getStudentTeacher();
        for (Student s :studentTeacher){
            System.out.println(s);
        }
        sqlSession.close();
    }

    @Test
    public void getStudentTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentTeacher2 = mapper.getStudentTeacher2();
        for (Student s :studentTeacher2){
            System.out.println(s);
        }
        sqlSession.close();
    }
}
