package com.mybatisjoin.mybatisplusjoinstudy.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.base.MPJBaseService;
import com.mybatisjoin.mybatisplusjoinstudy.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author hj
* @description 针对表【student】的数据库操作Service
* @createDate 2024-01-03 17:44:14
*/
public interface StudentService extends MPJBaseService<Student> {

    Page getStudentClassTeacherInfo();


}
