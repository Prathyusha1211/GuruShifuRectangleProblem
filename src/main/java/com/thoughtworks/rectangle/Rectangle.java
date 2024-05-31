package com.thoughtworks.rectangle;

public class Rectangle{
    int area(int length, int breadth)
    {
        if(length<0 || breadth<0){
            throw new IllegalArgumentException();
        }
        return length*breadth;
    }
}