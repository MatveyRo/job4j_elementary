package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a = 1, b = 1, c = 1, x = 1;
        int a2 = 0, b2 = 1, c2 = 1, x2 = 1;
        int a3 = 1, b3 = 1, c3 = 0, x3 = 1;
        int a4 = 1, b4 = 1, c4 = 1, x4 = 0;
        int expected = 3;
        int expected2 = 2;
        int expected3 = 2;
        int expected4 = 1;
        int result = X2.calc(a, b, c, x);
        int result2 = X2.calc(a2, b2, c2, x2);
        int result3 = X2.calc(a3, b3, c3, x3);
        int result4 = X2.calc(a4, b4, c4, x4);
        assertThat(result).isEqualTo(expected);
        assertThat(result2).isEqualTo(expected2);
        assertThat(result3).isEqualTo(expected3);
        assertThat(result4).isEqualTo(expected4);
    }
}