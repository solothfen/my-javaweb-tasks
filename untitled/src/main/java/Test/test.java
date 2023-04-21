package Test;

import com.itheima.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import Utils.MyBatisUtils;
import java.util.List;
import java.io.IOException;
import java.io.Reader;

public class test {

    @Test
    public void find1(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Student student = new Student();
        student= sqlSession.selectOne("1",2);
        System.out.println(student);
        sqlSession.close();
    }
    @Test
    public void find2(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        List<Student> list = sqlSession.selectList("2");
        for (Student student:list){
            System.out.println(student);
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void change(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Student student = new Student();
        student.setId(4);
        student.setName("高级Web技术");
        student.setHourse(40);
        student.setSid(1);
        int update = sqlSession.update("com.itheima.pojo.Student.zyk",student);
        if(update>0){
            System.out.println("修改成功");
        }
        else
            System.out.println("修改失败");
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void insert(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Student user = new Student();
        user.setName("大数据储存");
        user.setHourse(32);
        user.setSid(1);
        int add = sqlSession.insert("3",user);
        if(add>0){
            System.out.print(user.getName());
            System.out.println("已插入成功") ;
            System.out.println(user);
        }
        else{
            System.out.println("插入失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void findall(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        List<Student> list = sqlSession.selectList("4");
        for (Student student:list){
            System.out.println(student.toString());
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void delete(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        Student student = new Student();
        sqlSession.commit();
        sqlSession.close();
    }
}
