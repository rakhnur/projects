package com.company;

public class Circle extends Shape{
    private double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){} // default no argument constructor

    public Circle(double radius){ //parametrized constructor
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) //parametrized constructor with fields of superclass
    {
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    @Override
    public double getArea(){
        return Math.pow(getRadius(),2)*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Circle[Shape[" +
                "color='" + getColor() + '\'' +
                ", filled=" + getFilled() +
                ']' + ", radius = " + getRadius() + ']';
    }
}
