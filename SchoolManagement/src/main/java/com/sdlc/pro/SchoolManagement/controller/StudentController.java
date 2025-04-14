package com.sdlc.pro.SchoolManagement.controller;

import com.sdlc.pro.SchoolManagement.model.Student;
import com.sdlc.pro.SchoolManagement.model.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/studentForm")
    public String showForm(Model model) {
        Student student = new Student("", "", List.of(new Subject("", "")));
        model.addAttribute("student", student);
        return "student-form";
    }

    @PostMapping("/submitStudent")
    public String submitForm(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "student-result";
    }
}
