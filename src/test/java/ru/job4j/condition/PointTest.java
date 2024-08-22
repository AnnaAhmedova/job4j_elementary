package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class PointTest {

    @Test
    void when24to56Then3dot6() {
        double expected = 3.6;
        int x1 = 2;
        int y1 = 4;
        int x2 = 5;
        int y2 = 6;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13to24Then1dot4() {
        double expected = 1.4;
        int x1 = 1;
        int y1 = 3;
        int x2 = 2;
        int y2 = 4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }

    @Test
    void whenMin10toMin3Min1Then2dot2() {
        double expected = 2.2;
        int x1 = -1;
        int y1 = 0;
        int x2 = -3;
        int y2 = -1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.1));
    }
}

