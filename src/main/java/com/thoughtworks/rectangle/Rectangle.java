package com.thoughtworks.rectangle;

public class Rectangle{
    private final double length;
    private final double breadth;
    Rectangle(double length, double breadth){
        

        if(length<0 || breadth<0){
            throw new IllegalArgumentException();
        }
        this.length = length;
        this.breadth = breadth;

        
    }
    public double area(){
        return length*breadth;
     }

     public double perimeter(){
        return 2*(length+breadth);
     }
}