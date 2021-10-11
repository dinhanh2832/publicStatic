package com.diachi;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + " " + student.getClasses());
        student.setName("anh");
        System.out.println(student.getName() + " " + student.getClasses());
    }
}
