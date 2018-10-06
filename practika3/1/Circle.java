package com.company;
import static java.lang.Math.*;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
        color = "white";
        filled = true;
        radius = 1.0;
    }
    public Circle(double radius){
        color = "white";
        filled = true;
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*PI;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public String toString(){
        if (filled)
            return "Shape: filled circle. Radius: " + this.radius + ",color: "+this.color;
        else return "Shape: circle. Radius: " + this.radius + ",color: "+this.color;
    }
}