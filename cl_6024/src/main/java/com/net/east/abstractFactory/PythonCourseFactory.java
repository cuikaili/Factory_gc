package com.net.east.abstractFactory;

public class PythonCourseFactory implements  CourseFactory {
    public INode createNode(){
        return  new PythonNode();
    }
    public IVideo createVideo(){
        return  new PythonVideo();
    }
}
