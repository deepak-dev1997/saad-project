package com.example.saadproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("meragoogle")
public class Controller {

    @Autowired
    Services services;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
     return services.addStudent(student);
    }

    @GetMapping("/get")
    public Student getStudent(@RequestParam("d") int roll_no){
        Student s=services.getStudent(roll_no);
        return s;
    }

    @DeleteMapping
    public String deleteStudent(@RequestParam("q") int roll_no){
        return services.deleteStudent(roll_no);
    }


}
