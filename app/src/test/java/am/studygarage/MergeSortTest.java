package am.studygarage;

import am.studygarage.sorting.MergeSort;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {

    @Test
    void givenArrayOfIntegersAssertSorted() {
        MergeSort mergeSort = new MergeSort();
        Integer[] arr = {1, 10, -10, 20, 50};
        List<Integer> sorted = Arrays.asList(arr);
        Collections.sort(sorted);
        mergeSort.sort(arr, Integer::compare);

        assertIterableEquals(sorted, Arrays.asList(arr));
    }
}
