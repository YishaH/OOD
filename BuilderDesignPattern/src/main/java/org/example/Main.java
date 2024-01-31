package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // create student
        Student student1 = new Student.Builder("9000", "123")
                .setStudentName("Mary").setEmail("123@gmail.com").build();
        System.out.println(student1.toString());

        // change student info
        Student student2 = student1.toBuilder().setStudentName("John").build();
        System.out.println(student2.toString());
    }
}