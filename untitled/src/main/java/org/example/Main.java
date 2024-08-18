package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        student.updateName("youssef ");
        student.updateAge(23);
        student.throwException();
    }
}