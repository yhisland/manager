package com.manager.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.ext.route.ControllerBind;
import com.manager.model.Student;

@ControllerBind(controllerKey = "student")
public class StudentController extends Controller {
    public void index() {
        List<Student> list = Student.dao.find("select * from student");
        setAttr("studentList", list);
        render("/index.html");
    }

    public void add() {
        render("/add.html");
    }

    public void delete() {
        // 获取表单域名为studentID的值
        // Student.dao.deleteById(getPara("studentID"));
        // 获取url请求中第一个值
        Student.dao.deleteById(getParaToInt());
        forwardAction("/student");
    }

    public void update() {
        Student student = getModel(Student.class);
        student.update();
        forwardAction("/student");
    }

    public void get() {
        Student student = Student.dao.findById(getParaToInt());
        setAttr("student", student);
        render("/index2.html");
    }

    public void save() {
        Student student = getModel(Student.class);
        student.set("studentid", "mysequence.nextval").save();
        forwardAction("/student");
    }

}