package com.XworkZ;

public class CourseDetails {
    public void details(Course course)
    {
        course.Note();
        course.number();
        course.page();
        course.test();
        course.type();
        if(course instanceof Java)
        {
            Java java =(Java)course;
            java.scope();
        }
    }

}
