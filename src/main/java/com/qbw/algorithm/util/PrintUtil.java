package com.qbw.algorithm.util;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author qiubw
 * @description
 * @since 2022/11/15 22:06
 */
@Component
public class PrintUtil {
    public void print2DArray(int[][] arrays) {
        for (int[] array : arrays) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void printMap(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            System.out.println("[" + entry.getKey() + ":" + entry.getValue() + "]");
        }
    }
}
