package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void maxWhen2numbers() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maxWhen3numbers() {
        int first = 20;
        int second = 100;
        int third = 70;
        int result = new Max().max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maxWhen4numbers() {
        int first = 10;
        int second = 20;
        int third = 70;
        int fourth = 40;
        int result = new Max().max(first, second, third, fourth);
        int expected = 70;
        assertThat(result).isEqualTo(expected);
    }
}