package com.company;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        color = "white";
        filled = true;
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        color = "white";
        filled = true;
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2*(width + length);
    }
    public String toString(){
        if (filled)
            return "Shape: filled rectangle. Width: " + this.width + ", length: " + this.length + ",color: "+this.color;
        else return "Shape: rectangle. Width: " + this.width + ", length: " + this.length + ",color: "+this.color;
    }
}