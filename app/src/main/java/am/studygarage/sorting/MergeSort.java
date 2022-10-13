package am.studygarage.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

    public <T> void sort(T[] s, Comparator<T> comparator) {
        int n = s.length;
        if (n < 2) {
            return;
        }

        // divide
        int mid = n / 2;
        T[] s1 = Arrays.copyOfRange(s, 0, mid);
        T[] s2 = Arrays.copyOfRange(s, mid, n);

        // conquer (with recursion)
        sort(s1, comparator);
        sort(s2, comparator);

        // merge
        merge(s1, s2, s, comparator);
    }

    /**
     * Merge contents of arrays {@code s1} and {@code s2} 2 into properly sized array s
     *
     * @param s1         first array
     * @param s2         second array
     * @param s          the resulting properly sized array
     * @param comparator - comparator
     */
    <T> void merge(T[] s1, T[] s2, T[] s, Comparator<T> comparator) {
        int i = 0;
        int j = 0;
        while (i + j < s.length) {
            if (j == s2.length || (i < s1.length && comparator.compare(s1[i], s2[j]) < 0)) {
                s[i + j] = s1[i++];
            } else {
                s[i + j] = s2[j++];
            }
        }
    }
}
