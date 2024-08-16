package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert392RblThen4Euro() {
        float input = 392;
        float expected = 4;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert178RblThen2Dollar() {
        float input1 = 178;
        float expected1 = 2;
        float output1 = Converter.rubleToDollar(input1);
        float value1 = 0.0001f;
        assertThat(output1).isEqualTo(expected1, withPrecision(value1));
    }
}