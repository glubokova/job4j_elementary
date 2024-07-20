package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    private void assertDistance(int x1, int y1, int x2, int y2, double expected) {
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to20then2() {
        assertDistance(0, 0, 2, 0, 2);
    }

    @Test
    void when10To13Then3() {
        assertDistance(1, 0, 1, 3, 3);
    }

    @Test
    void when00to02then2() {
        assertDistance(0, 0, 0, 2, 2);
    }
}