package com.jnu.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnu.mapper.StudentMapper;
import com.jnu.entity.StudentEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: zy
 * @Description: student业务逻辑
 * @Date: 2020-2-4
 */
@Slf4j
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 新增学生
     * @param name：姓名
     * @param age：年龄
     * @param sex：性别
     * @return：返回受影响的行数
     */
    @Transactional
    public int insertStudent(String name,Integer age,Boolean sex){
        int ret = studentMapper.insertStudent(name,age,sex);
        int i = 1/age;
        log.info("#####新增学生###########",ret);
        return ret;
    }


    /**
     * 根据id获取学生信息
     * @param id：学生id
     * @return：返回学生信息
     */
    public StudentEntity  getStudentById(Integer id){
        log.info("#####获取学生信息###########",id);
        return studentMapper.getStudentById(id);
    }


    /**
     * 分页查询 获取学生信息
     * @param page: 当前页
     * @param pageSize: 每页记录数目
     * @return: 返回学生信息
     */
    public  PageInfo<StudentEntity>  getStudentList(int page,int pageSize){
        //mysql查询 limit
        //pageHelper 帮我们生成分页语句     底层实现原理：利用AOP、改写sql语句
        PageHelper.startPage(page,pageSize);
        List<StudentEntity> listStudent = studentMapper.getStudentList();
        //返回给客户端展示
        PageInfo<StudentEntity> pageInfoStudent = new PageInfo<StudentEntity>(listStudent);
        return pageInfoStudent;
    }
}
