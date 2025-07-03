package com.xworkz.collection.runner;

import com.xworkz.collection.dto.StudentDTO;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class StudentRunner {

    public static void main(String[] args) {
        Collection<StudentDTO> student = new HashSet<>();
        student.add(new StudentDTO("Skanda", 21, "BE", "JNNCE", "Thirthahalli", "Karnatakka", "Pravith", "JAVA", "Shivamoga", 2025));
        student.add(new StudentDTO("Manoj", 22, "BTech", "NITK", "Udupi", "Karnataka", "Asha", "Python", "Udupi", 2024));
        student.add(new StudentDTO("Divya", 20, "BSc", "PES University", "Bengaluru", "Karnataka", "Kiran", "C++", "Bengaluru", 2026));
        student.add(new StudentDTO("Rahul", 23, "BE", "BMS College", "Mysuru", "Karnataka", "Swathi", "JavaScript", "Mysuru", 2023));
        student.add(new StudentDTO("Sneha", 21, "BCA", "Christ University", "Chikmagalur", "Karnataka", "Ramesh", "HTML/CSS", "Chikmagalur", 2025));
        student.add(new StudentDTO("Rohit", 22, "BE", "RVCE", "Hubli", "Karnataka", "Anitha", "Spring Boot", "Hubballi", 2024));
        student.add(new StudentDTO("Pooja", 20, "BTech", "MIT Manipal", "Dharwad", "Karnataka", "Suresh", "Data Science", "Dharwad", 2026));
        student.add(new StudentDTO("Harsha", 23, "MCA", "SJCE", "Hassan", "Karnataka", "Geetha", "React", "Hassan", 2023));
        student.add(new StudentDTO("Nisha", 21, "BE", "BIT", "Raichur", "Karnataka", "Lokesh", "Angular", "Raichur", 2025));
        student.add(new StudentDTO("Kiran", 22, "BCA", "New Horizon", "Bagalkot", "Karnataka", "Meena", "Node.js", "Bagalkot", 2024));

        Iterator<StudentDTO> students = student.iterator();

        System.out.println("Student Name: ");
        while (students.hasNext()) {
            StudentDTO studentDTO = students.next();
            System.out.println(studentDTO.getName());
            System.out.println(studentDTO.getAge());
            System.out.println(studentDTO.getCourse());
            System.out.println(studentDTO.getCollege());
            System.out.println(studentDTO.getCity());
            System.out.println(studentDTO.getState());
            System.out.println(studentDTO.getFriendName());
            System.out.println(studentDTO.getProgramming());
            System.out.println(studentDTO.getCollegeCity());
            System.out.println(studentDTO.getPassYear());
        }


    }
}
