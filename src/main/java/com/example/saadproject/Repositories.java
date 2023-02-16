package com.example.saadproject;


import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class Repositories {

    HashMap<Integer,Student> stdntdb=new HashMap<>();

    public String addStudent(Student student){
        int roll= student.getRoll_no();
        stdntdb.put(roll,student);
        return "Student added Successfully";
    }

    public Student getStudent(int roll_no){
        if(stdntdb.containsKey(roll_no)) return stdntdb.get(roll_no);
        return null;
    }

    public String deleteStudent(int roll_no){
        if(stdntdb.containsKey(roll_no)){
            stdntdb.remove(roll_no);
            return "Student deleted successfully";
        }
        return "student not found";
    }

}
