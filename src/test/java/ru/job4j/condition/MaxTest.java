package ru.job4j.condition;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right= 2;
        int result = Max.max(left, right);
        int expected= 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxFirstNumber (){
        int left = 7;
        int right = 5;
        int result = Max.max (left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxSecondNumber(){
        int left = 20;
        int right = 60;
        int result = Max.max (left,right );
        int expected = 60;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberAreEqual (){
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}