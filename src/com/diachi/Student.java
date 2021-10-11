package com.diachi;

public class Student {
    private String name = "John";
    private String classes = "C02";
    Student(){
    }
    public String setName(String name){
       return this.name = name;
    }
    public String setClasses(String classes){
        return this.classes = classes;
    }
    String getName (){
        return this.name;
    }
    String getClasses (){
        return this.classes;
    }
}
