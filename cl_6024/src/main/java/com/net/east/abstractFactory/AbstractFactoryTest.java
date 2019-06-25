package com.net.east.abstractFactory;

import com.net.east.JavaICourse;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory factory=new JavaCourseFactory();
        INode javaICourse=factory.createNode();
        javaICourse.edit();

        factory.createVideo().record();

        PythonCourseFactory pythonCourseFactory=new PythonCourseFactory();
        pythonCourseFactory.createNode().edit();
        pythonCourseFactory.createVideo().record();
    }
}
