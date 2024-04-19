package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void testSortingWithFiveNumbers() {
        int[] data = new int[]{8, 6, 3, 7, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 6, 7, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void testSortingWithThreeNumbers() {
        int[] data = new int[]{4, 8, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 8};
        assertThat(result).containsExactly(expected);
    }
}