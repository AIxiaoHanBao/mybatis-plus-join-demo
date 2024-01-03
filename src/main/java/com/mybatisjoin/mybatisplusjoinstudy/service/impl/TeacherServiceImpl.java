package com.mybatisjoin.mybatisplusjoinstudy.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.query.MPJQueryWrapper;
import com.github.yulichang.toolkit.JoinWrappers;
import com.github.yulichang.wrapper.UpdateJoinWrapper;
import com.mybatisjoin.mybatisplusjoinstudy.service.TeacherService;
import com.mybatisjoin.mybatisplusjoinstudy.entity.Teacher;
import com.mybatisjoin.mybatisplusjoinstudy.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
* @author hj
* @description 针对表【teacher】的数据库操作Service实现
* @createDate 2024-01-03 17:44:14
*/
@Service
public class TeacherServiceImpl extends MPJBaseServiceImpl<TeacherMapper, Teacher>
    implements TeacherService {


    //获取老师下面的所有学生
    @Override
    public Page getTeacheruderStudent() {
        MPJQueryWrapper<Teacher> teacherMPJQueryWrapper =
                new MPJQueryWrapper<Teacher>()
                        //必须要写，否则会报错
                        .select("t.id,t.teacher_name,st.id stuId,st.user_name stuName")
                        .leftJoin("student st on st.teacher_id = t.id");
        Page page = this.selectJoinListPage(new Page(1, 10), HashMap.class, teacherMPJQueryWrapper);
        return page;
    }

    //联表修改通过学生找到老师然后修改老师名称
    @Override
    public boolean updataStudentToTeacher() {
        UpdateJoinWrapper<Teacher> update = JoinWrappers.update(Teacher.class)
                .set(Teacher::getTeacherName,"我修改了名称")
                .leftJoin("student s  on s.teacher_id = t.id")
                .eq(Teacher::getTeacherName,"芜湖1好")
                ;
        boolean b = this.updateJoin(null, update);

        return b;
    }


}




