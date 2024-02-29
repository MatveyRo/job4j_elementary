package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13to50then5() {
        double expected = 5;
        Point a = new Point(1, 3);
        Point b = new Point(5, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus20to20then4() {
        double expected = 4;
        Point a = new Point(-2, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when023to001then2() {
        double expected = 2;
        Point c = new Point(0, 2, 3);
        Point d = new Point(0, 0, 1);
        double output = c.distance(d);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}