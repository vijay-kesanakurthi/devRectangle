package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
public class RectangleTest {

    @Test
    public void shouldCalculateAreaOfRectangleWhenLengthAndBreadthAre4and5 () {
        Rectangle rectangle = new Rectangle(4, 5);
        assertThat( 20,is(equalTo(rectangle.calculateArea())));
    }

    @Test
    public void shouldCalculateAreaOfSquareWhenLengthAndBreadthAreEqual() {
        Rectangle rectangle = new Rectangle(5, 5);
        assertThat(25, is(equalTo(rectangle.calculateArea())));
    }

    @Test
    public void shouldCalculateAreaOfRectangleWhenLengthZero() {
        Rectangle rectangle = new Rectangle(0, 5);
        assertThat(0, is(equalTo(rectangle.calculateArea())));
    }

    @Test
    public void shouldCalculateAreaOfRectangleWhenBreadthZero() {
        Rectangle rectangle = new Rectangle(5, 0);
        assertThat(0, is(equalTo(rectangle.calculateArea())));
    }

}
