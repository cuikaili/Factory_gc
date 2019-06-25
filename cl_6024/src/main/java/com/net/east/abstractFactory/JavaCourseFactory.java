package com.net.east.abstractFactory;

public class JavaCourseFactory implements  CourseFactory {
    public IVideo createVideo(){
        return  new JavaVideo();
    }
    public INode createNode(){
        return  new JavaNode();
    }
}
