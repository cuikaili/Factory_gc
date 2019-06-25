package com.net.east.simpleFactory;

import com.net.east.ICourse;
import com.net.east.JavaICourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {
//        ICourse javaICourse=new JavaICourse();
//        javaICourse.record();

//        CourseFactory courseFactory=new CourseFactory();
//        ICourse iCourse=courseFactory.create("java");
//        iCourse.record();

//        CourseFactory courseFactory=new CourseFactory();
//        ICourse iCourse=courseFactory.create("com.net.east.JavaICourse");
//        iCourse.record();

          CourseFactory courseFactory=new CourseFactory();
          ICourse iCourse=courseFactory.create(JavaICourse.class);
          iCourse.record();






    }
}
