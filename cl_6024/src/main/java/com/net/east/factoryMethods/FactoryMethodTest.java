package com.net.east.factoryMethods;

import com.net.east.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory iCourseFactory=new JavaCourseFactory();
        ICourse iCourse=iCourseFactory.crearte();
        iCourse.record();

        iCourseFactory=new PythonCourseFactory();
         iCourse=iCourseFactory.crearte();
        iCourse.record();
    }
}
