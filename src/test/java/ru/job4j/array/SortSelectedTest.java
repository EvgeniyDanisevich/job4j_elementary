package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5Elements() {
        int[] input = new int[] {10, 8, 6, 4, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 6, 8, 10};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Elements() {
        int[] input = new int[] {5, 7, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {3, 5, 7};
        assertThat(result, is(expect));
    }
}