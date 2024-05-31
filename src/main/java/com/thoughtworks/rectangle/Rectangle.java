package com.thoughtworks.rectangle;

public class Rectangle {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int calculateArea() {
        return this.length * this.breadth;
    }

}
