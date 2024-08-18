package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Before("execution(public void org.example.Student.updateName(String))")
    public void loggingAdviceBeforeUpdateName(JoinPoint joinPoint) {
        System.out.println("the @before : Student name before update: " + ((Student) joinPoint.getTarget()).getName());
    }

    @After("execution(public void org.example.Student.updateName(String))")
    public void loggingAdviceAfterUpdateName(JoinPoint joinPoint) {
        System.out.println("the @after Student name after update: " + ((Student) joinPoint.getTarget()).getName());
    }

    @Before("execution(public void org.example.Student.updateAge(int))")
    public void loggingAdviceBeforeUpdateAge(JoinPoint joinPoint) {
        System.out.println("the @before Student age before update: " + ((Student) joinPoint.getTarget()).getAge());
    }

    @After("execution(public void org.example.Student.updateAge(int))")
    public void loggingAdviceAfterUpdateAge(JoinPoint joinPoint) {
        System.out.println("the @after Student age after update: " + ((Student) joinPoint.getTarget()).getAge());
    }

    @AfterThrowing(pointcut = "execution(public void org.example.Student.throwException())", throwing = "ex")
    public void loggingAdviceAfterThrowing(Exception ex) {
        System.out.println("after throwing the exception Exception thrown in method: " + ex.getMessage());
    }
}
