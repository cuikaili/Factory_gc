package com.net.east.factoryMethods;

import com.net.east.ICourse;
import com.net.east.JavaICourse;

public class JavaCourseFactory implements  ICourseFactory {
    @Override
    public ICourse crearte() {
       return  new JavaICourse();
    }
}
