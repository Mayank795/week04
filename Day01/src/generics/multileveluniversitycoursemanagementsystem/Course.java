package com.generics.multileveluniversitycoursemanagementsystem;

class Course<T extends CourseType> {
    private T course;

    public Course(T course) {
        this.course = course;
    }

    public void conductEvaluation() {
        course.evaluate();
    }

    public T getCourse() {
        return course;
    }
}