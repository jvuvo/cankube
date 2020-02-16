package com.cankube.monoexample;

import com.cankube.monoexample.datastuctures.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    private LinkedList objectUnderTest;

    @BeforeEach
    void setUp() {
        objectUnderTest = new LinkedList();
    }

    @Test
    void addFront() {
        objectUnderTest.addFront("1");
        objectUnderTest.addFront("2");
        objectUnderTest.addFront("3");
        Assertions.assertEquals("3", objectUnderTest.getFirst());
        Assertions.assertEquals("1", objectUnderTest.getLast());
    }

    @Test
    void getFirst() {
        objectUnderTest.addFront("1");
        Assertions.assertEquals("1", objectUnderTest.getFirst());
    }

    @Test
    void getLast() {
        objectUnderTest.addFront("1");
        objectUnderTest.addFront("2");
        objectUnderTest.addFront("3");
        Assertions.assertEquals("1", objectUnderTest.getLast());
    }

    @Test
    void addBack() {
        objectUnderTest.addBack("1");
        objectUnderTest.addBack("2");
        objectUnderTest.addBack("3");
        Assertions.assertEquals("1", objectUnderTest.getFirst());
        Assertions.assertEquals("3", objectUnderTest.getLast());
    }
}
