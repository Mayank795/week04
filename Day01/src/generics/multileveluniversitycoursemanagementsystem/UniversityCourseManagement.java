package com.generics.multileveluniversitycoursemanagementsystem;
import java.util.*;
public class UniversityCourseManagement {
    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Mathematics"));
        courses.add(new AssignmentCourse("History"));
        courses.add(new ResearchCourse("Physics"));

        University.manageCourses(courses);

        Course<ExamCourse> mathCourse = new Course<>(new ExamCourse("Advanced Calculus"));
        mathCourse.conductEvaluation();
    }
}