package com.Tadamia;

import java.util.Arrays;
import java.util.Comparator;

public class Rectangle {
    private int width;
    private int height;
    private static int maxWidth;
    private static int maxHeight;

    static {
        maxWidth = 45;
        maxHeight = 30;
    }

    public Rectangle() {
        this.width = 25;
        this.height = maxHeight;
    }

    public Rectangle(int height) {
        this.width = maxWidth;
        this.height = checkValue(height,maxHeight);
    }

    public Rectangle(int width, int height) {
        this.width = checkValue(width,maxWidth);
        this.height = checkValue(height,maxHeight);
    }

    public static void setMaxWidth(int maxWidth) {
        Rectangle.maxWidth = maxWidth;
    }

    public static void setMaxHeight(int maxHeight) {
        Rectangle.maxHeight = maxHeight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
        return width * height;
    }

    public static Rectangle getLargestRectangle(Rectangle[] recs){
        Arrays.sort(recs, Comparator.comparing(Rectangle::getArea));
        return recs[recs.length-1];
    }

    private int checkValue(int dimension,int maxValue){
        return maxValue < dimension ? maxValue : dimension;
    }

    @Override
    public String toString(){
        return "width - " +  this.width + "; height - " + this.height +"; Area - " + this.getArea();
    }
}
