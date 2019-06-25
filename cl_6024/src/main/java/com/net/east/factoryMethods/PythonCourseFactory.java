package com.net.east.factoryMethods;

import com.net.east.ICourse;
import com.net.east.PythonICourse;

public class PythonCourseFactory implements  ICourseFactory {
    @Override
    public ICourse crearte() {
        return new PythonICourse();
    }
}
