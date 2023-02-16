package com.example.saadproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    @Autowired
    Repositories repositories;

    public String addStudent(Student student){
        return repositories.addStudent(student);
    }

    public Student getStudent(int roll_no){
        return repositories.getStudent(roll_no);
    }

    public String deleteStudent(int roll_no){
        return repositories.deleteStudent(roll_no);
    }
}
