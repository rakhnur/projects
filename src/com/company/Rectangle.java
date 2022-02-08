package com.company;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(){}

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled){
        this.length = length;
        this.width = width;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }
    @Override
    public String toString() {
        return "Rectangle[Shape[" +
                "color='" + getColor() + '\'' +
                ", filled=" + getFilled() +
                ']' + ", width = " + getWidth() + ", length = " + getLength()+ ']';
    }
}
