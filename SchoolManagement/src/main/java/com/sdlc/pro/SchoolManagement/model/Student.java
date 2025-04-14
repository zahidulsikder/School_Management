package com.sdlc.pro.SchoolManagement.model;


import java.util.List;

public record Student(String fName, String lName, List<Subject> subjects) {
}
