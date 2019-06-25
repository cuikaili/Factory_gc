package com.net.east.simpleFactory;

import com.net.east.ICourse;
import com.net.east.JavaICourse;
import com.net.east.PythonICourse;
import org.omg.CORBA.StringHolder;

public class CourseFactory {

   /* public ICourse  create(String name){
         if("java".equals(name)){
              return  new JavaICourse();
         }else  if ("python".equals(name)){
             return  new PythonICourse();
         }else{
             return  null;
         }

    }*/

   /* public  ICourse create(String className) {
        try {
            if(!("".equals(className)||null==className)){
                return  (ICourse) Class.forName(className).newInstance();
            }

        }catch (Exception e){
           e.printStackTrace();
        }
        return null;
    }*/

    public  ICourse create(Class clazz){
       try {
           if(!("".equals(clazz)||null==clazz)){
               return  (ICourse) clazz.newInstance();
           }
       }catch (Exception e){
           e.printStackTrace();
       }

     return  null;
    }

}
