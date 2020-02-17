package com.cankube.monoexample;

import org.junit.jupiter.api.Test;

public class BigONotation {

    // O(2n)
    @Test
    void testO_2n() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            //...
        }
        for (int i = 0; i < array.length; i++) {
            //...
        }
    }

    // O(n*m)
    void testO_2() {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            //...
            for (int j = 0; j < array2.length; j++) {
                //...
            }
        }

    }

    // O(n^2)
    @Test
    void test3() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            //...
            for (int j = 0; i < array.length; j++) {
                if(array[i] < array[j]) {
                    // do it
                }
            }
        }

    }

    @Test
    void test4() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            //...
            for (int j = 0; i < array.length; j++) {
                for (int k = 0; i < 10000; k++) {
                    // Jump!
                }
            }
        }

    }
}
