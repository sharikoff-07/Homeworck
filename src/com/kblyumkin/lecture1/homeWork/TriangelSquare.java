package com.kblyumkin.lecture1.homeWork;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        int a = (int) Math.sqrt(Math.pow((x2 - x1), 2) - Math.pow((y2 - y1), 2));
        int b = (int) Math.sqrt(Math.pow((x3 - x1), 2) - Math.pow((y3 - y1),2));
        int c = (int) Math.sqrt(Math.pow((x3 - x2),2) - Math.pow((y3 - y2),2));
        int length = 0;
        float square = 0;

       length = a + b + c;

        square = (float) (0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)));

        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
