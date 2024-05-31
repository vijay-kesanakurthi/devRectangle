package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldCalculateAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.calculateArea());
    }

    @Test
    public void shouldCalculateAreaOfSquare() {
        Rectangle rectangle = new Rectangle(5, 5);
        assertEquals(25, rectangle.calculateArea());
    }

    @Test
    public void shouldCalculateAreaOfRectangleWithLengthZero() {
        Rectangle rectangle = new Rectangle(0, 5);
        assertEquals(0, rectangle.calculateArea());
    }

    @Test
    public void shouldCalculateAreaOfRectangleWithBreadthZero() {
        Rectangle rectangle = new Rectangle(5, 0);
        assertEquals(0, rectangle.calculateArea());
    }

}
