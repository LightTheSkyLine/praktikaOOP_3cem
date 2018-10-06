package com.company;

public class Square extends Rectangle{
    public Square(){
        color = "white";
        filled = true;
        width = 1.0;
        width = 1.0;
    }
    public Square(double side){
        color = "white";
        filled = true;
        width = side;
        width = side;
    }
    public Square(double side, String color,boolean filled ){
        this.color = color;
        this.filled = filled;
        width = side;
        width = side;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    public void setWidth(double side) {
        setSide(side);
    }
    public void setLength(double side) {
        setSide(side);
    }
    public String toString(){
        if (filled)
            return "Shape: filled square. Side: " + this.width  + ",color: "+this.color;
        else return "Shape: square. Side: " + this.width + ",color: "+this.color;
    }
}