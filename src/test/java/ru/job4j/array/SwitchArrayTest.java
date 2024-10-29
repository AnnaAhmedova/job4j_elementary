package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to3() {
        int[] input = {4, 5, 6, 7, 8, 9};
        int source = 2;
        int destination = input.length - 3;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 5, 7, 6, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}
