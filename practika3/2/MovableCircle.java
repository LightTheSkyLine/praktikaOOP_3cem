package com.company;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString(){
        return "Circle of radius = " + radius +" has center:" + center.toString();
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveRight(){
        center.moveRight();
    }
    public void moveLeft(){
        center.moveLeft();
    }
}