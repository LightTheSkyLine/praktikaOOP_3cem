package com.company;

public class Main {

    public static void main(String[] args) {
        MovableCircle c1 = new MovableCircle(0,0,20,10,3);
        System.out.println(c1);
        c1.moveDown();
        c1.moveRight();
        System.out.println(c1);
    }
}