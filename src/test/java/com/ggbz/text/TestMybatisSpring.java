package com.ggbz.text;

import com.ggbz.dao.CourseDAO;
import com.ggbz.dao.SCDAO;
import com.ggbz.dao.StudentDAO;
import com.ggbz.dao.UserDAO;
import com.ggbz.pojo.Course;
import com.ggbz.pojo.SC;
import com.ggbz.pojo.Student;
import com.ggbz.pojo.User;
import com.ggbz.service.CourseService;
import com.ggbz.service.SCService;
import com.ggbz.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMybatisSpring {

    /*
    * 用于测试：Spring与Mybatis的整合
    * */
    @Test
    public void textUserDAO(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
        User user = new User();
        user.setRole(1);
        user.setHm("admin1");
        user.setPwd("111111");


        userDAO.save(user);

    }


    @Test
    public void textStudent(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        StudentDAO sDAO = (StudentDAO) ctx.getBean("studentDAO");
        StudentService studentService  = (StudentService) ctx.getBean("studentService");
        List<Student> c002 = studentService.QueryFlunkByCno("C002");
        for (Student student : c002) {
            System.out.println(student);
        }
        /*List<Student> studentList = studentService.QueryStudentsByDept("软件工程");
        for (Student student : studentList) {
            System.out.println(student);
        }*/
        /*Student student1 = sDAO.QueryStudentById("201801001");
        student1.setAge(18);
        student1.setSex("男");
        student1.setSname("吴亦凡");


        StudentService studentSerivce = (StudentService) ctx.getBean("studentService");
        studentSerivce.UpdateStudentById(student1);*/

        /*S s = sDAO.QueryStudentById("");
        System.out.println(s.getSex());*/
        /*List<S> s = sDAO.QueryAllStudent();
        for (S s1 : s) {
            System.out.println(s1);
        }*/
        /*sDAO.DeleteStudentById("15156");*/


    }

    @Test
    public void textCDAO(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        CourseService courseService = (CourseService) ctx.getBean("courseService");
        CourseDAO courseDAO = (CourseDAO) ctx.getBean("courseDAO");
        Course courses = courseDAO.QueryCourseByCno("C001");
        System.out.println(courses);


       /* List<C> cs = cdao.QueryAllCourse();
        for (C c : cs) {
            System.out.println(c);
        }*/
       /* C c001 = cdao.QueryCourseById("15155");
        if(c001==null){
            System.out.println("没查到");
        }*/
     /*   Course c = new Course();
        c.setCno("C004");
        c.setCredit(1);
        c.setTeacher("ssss");
        c.setCname("4444");
        cdao.AddCourse(c);*/
    }

    @Test
    public void textSCDAO(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        SCService scService = (SCService) ctx.getBean("scService");
        /*SC c001 = scService.QueryGradeBySnoAndCno("201801001", "C001");
        c001.setGrade(100);
        scService.UpdateGrade(c001);*/

       /* SC c002 = scService.QueryFlunkByCno("C002");
        System.out.println(c002);*/
        List<SC> scs = scService.QuerySCBySno("201801001");
        for (SC sc : scs) {
            System.out.println(sc);
        }

    }
}
