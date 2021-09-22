package com.alexn.hibernate_student.controller;

import com.alexn.hibernate_student.entity.Student;
import com.alexn.hibernate_student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class MyController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String showAllStudents(Model model){

        List<Student> allStudents = studentService.getAllStudents();
        model.addAttribute("allStuds", allStudents);

        return "all-students";
    }

    @RequestMapping("/addNewStudent")
    public String addNewStudent(Model model){

        Student student=new Student();
        model.addAttribute("student",student);

        return "student-info";

    }

    @RequestMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student){

        studentService.saveStudent(student);

        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String  updateStudent(@RequestParam("studId") int id, Model model){

        Student student=studentService.getStudent(id);
        model.addAttribute("student",student);

        return "student-info";
    }

    @RequestMapping("/deleteStudent")
    public String deleteEmployee(@RequestParam("studId") int id){

        studentService.deleteStudent(id);

        return "redirect:/";
    }

}
