package com.mybatisjoin.mybatisplusjoinstudy.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.query.MPJQueryWrapper;
import com.github.yulichang.toolkit.JoinWrappers;
import com.github.yulichang.wrapper.UpdateJoinWrapper;
import com.mybatisjoin.mybatisplusjoinstudy.entity.Student;
import com.mybatisjoin.mybatisplusjoinstudy.entity.Teacher;
import com.mybatisjoin.mybatisplusjoinstudy.service.StudentService;
import com.mybatisjoin.mybatisplusjoinstudy.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
* @author hj
* @description 针对表【student】的数据库操作Service实现
* @createDate 2024-01-03 17:44:14
*/
@Service
public class StudentServiceImpl extends MPJBaseServiceImpl<StudentMapper, Student>
    implements StudentService{

    //从学生查询学生的课程从课程查询对应的老师
    @Override
    public Page getStudentClassTeacherInfo() {
        MPJQueryWrapper<Student> studentMPJQueryWrapper = new MPJQueryWrapper<Student>()
                .select("t.id,t.user_name,t.teacher_id,te.teacher_name,cs.class_name")
                .leftJoin("class_student cs on cs.teacher_id = t.teacher_id")
                .leftJoin("teacher te on te.id = cs.teacher_id")
                ;
        Page page = this.selectJoinListPage(new Page(1, 10), HashMap.class,studentMPJQueryWrapper);

        return page;
    }




}




