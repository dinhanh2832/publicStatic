package com.accessmodifier;

public class Circle {
    private double radius;
    private String color = "red";
    Circle(){
        this.radius = 1;
    }
    Circle(double newRadius){
        this.radius = newRadius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
