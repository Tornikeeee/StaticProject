package com.Tadamia;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(27);
        Rectangle rectangle3 = new Rectangle(40, 29);
        Rectangle[] recs = new Rectangle[]{rectangle1, rectangle2, rectangle3};

        System.out.println("before sorting");
        printArray(recs);

        Rectangle largest = Rectangle.getLargestRectangle(recs);

        System.out.println("after sorting");
        printArray(recs);

        System.out.println("Area of largest Rectangle - " + largest.getArea());
    }

    public static <T> void printArray(T[] recs) {
        for (T rec : recs) {
            System.out.println(rec.toString());
        }
    }
}
