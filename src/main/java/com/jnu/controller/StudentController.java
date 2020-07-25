package com.jnu.controller;

import com.github.pagehelper.PageInfo;
import com.jnu.entity.StudentEntity;
import com.jnu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zy
 * @Description: student控制器  测试mybatis
 * @Date: 2020-2-4$
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 新增学生 这里没有对参数进行校验  127.0.0.1:8081/insertStudent?name=李艳&age=25&sex=1
     * @param name：姓名
     * @param age：年龄
     * @param sex：性别
     * @return：返回受影响的行数
     */
    @RequestMapping("/insertStudent")
    public int insertStudent(@RequestParam String name,@RequestParam Integer age,@RequestParam Boolean sex){
        return studentService.insertStudent(name,age,sex);
    }

    /**
     * 根据id获取学生信息 127.0.0.1:8081/getStudent?id=1
     * @param id：学生id
     * @return：返回学生信息
     */
    @RequestMapping("/getStudent")
    public StudentEntity getStudentById(@RequestParam Integer id){
        return studentService.getStudentById(id);
    }

    /**
     * 分页查询 获取学生信息  127.0.0.1:8081/student?page=1&pageSize=2
     * @param page: 当前页
     * @param pageSize: 每页记录数目
     * @return: 返回学生信息
     */

    @RequestMapping("/student")
    public PageInfo<StudentEntity> getStudentList(@RequestParam  int page,@RequestParam  int pageSize){
        return studentService.getStudentList(page,pageSize);
    }
}