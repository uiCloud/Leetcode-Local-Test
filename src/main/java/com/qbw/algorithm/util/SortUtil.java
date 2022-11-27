package com.qbw.algorithm.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author qiubw
 * @description
 * @since 2022/11/15 22:08
 */
@Component
public class SortUtil {
    public void ascSort(int[][] arrays) {
        Arrays.sort(arrays, (o1, o2) -> o2[1] - o1[1]);
    }
}
