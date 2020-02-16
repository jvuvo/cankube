package com.cankube.monoexample;

import com.cankube.monoexample.datastuctures.DynamicArray;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DynamicArrayTest {

    private DynamicArray array;

    @BeforeEach
    void setUp() {
        array = new DynamicArray(2);
    }

    @Test
    void testSetGet() {
        array.set(0, "a");
        Assertions.assertThat("a").isEqualTo(array.get(0));
    }

    @Test
    void testInsert() {
        array.insert(0, "a");
        array.insert(1, "b");
        array.insert(2, "c");
        Assertions.assertThat("a").isEqualTo(array.get(0));
        Assertions.assertThat("b").isEqualTo(array.get(1));
        Assertions.assertThat("c").isEqualTo(array.get(2));
    }
}
