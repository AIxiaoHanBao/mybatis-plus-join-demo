package com.mybatisjoin.mybatisplusjoinstudy.mapper;

import com.github.yulichang.base.MPJBaseMapper;
import com.mybatisjoin.mybatisplusjoinstudy.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
* @author hj
* @description 针对表【student】的数据库操作Mapper
* @createDate 2024-01-03 17:44:14
* @Entity generator.entity.Student
*/
@Mapper

public interface StudentMapper extends MPJBaseMapper<Student> {

}




