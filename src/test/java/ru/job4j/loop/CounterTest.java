package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0Finish10() {
        int start = 0;
        int finish = 10;
        int sum = Counter.sum(start, finish);
        int expected = 55;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8() {
        int start = 3;
        int finish = 8;
        int sum = Counter.sum(start, finish);
        int expected = 33;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1() {
        int start = 1;
        int finish = 1;
        int sum = Counter.sum(start, finish);
        int expected = 1;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart7Finish9() {
        int start = 7;
        int finish = 9;
        int sum = Counter.sum(start, finish);
        int expected = 24;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart11Finish11() {
        int start = 11;
        int finish = 11;
        int sum = Counter.sum(start, finish);
        int expected = 11;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart15Finish12() {
        int start = 15;
        int finish = 12;
        int sum = Counter.sum(start, finish);
        int expected = 0;
        assertThat(sum).isEqualTo(expected);
    }
}