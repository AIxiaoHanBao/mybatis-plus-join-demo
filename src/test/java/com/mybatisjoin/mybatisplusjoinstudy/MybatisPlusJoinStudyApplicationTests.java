package com.mybatisjoin.mybatisplusjoinstudy;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisjoin.mybatisplusjoinstudy.service.impl.StudentServiceImpl;
import com.mybatisjoin.mybatisplusjoinstudy.service.impl.TeacherServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MybatisPlusJoinStudyApplicationTests {

    @Test
    void contextLoads() {
    }


    @Resource
    private TeacherServiceImpl teacherService;

    @Test
    //一对多老师查询学生
    void t1(){
        Page teacheruderStudent = teacherService.getTeacheruderStudent();
        System.out.println(teacheruderStudent.getRecords());
    }


    @Resource
    private StudentServiceImpl studentService;
    @Test
    //获取学生对应课程 对应老师
    void t2(){
        Page getStudentClassTeacherInfo = studentService.getStudentClassTeacherInfo();
        System.out.println(getStudentClassTeacherInfo.getRecords());
    }


    //联表修改
    @Test
    void t3(){
        boolean updataStudentToTeacher = teacherService.updataStudentToTeacher();
        System.out.println(updataStudentToTeacher);
    }

}
