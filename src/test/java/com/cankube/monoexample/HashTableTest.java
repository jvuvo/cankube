package com.cankube.monoexample;

import com.cankube.monoexample.datastuctures.HashTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashTableTest {
    private HashTable objectUnderTest;

    @BeforeEach
    void setUp() {
        objectUnderTest = new HashTable();
    }

    @Test
    void testPutAndGet() {
        objectUnderTest.put("John", "421-1111");
        objectUnderTest.put("Kevin", "421-2131");
        objectUnderTest.put("Joe", "421-453");
        objectUnderTest.put("Robert", "421-123123");
        objectUnderTest.put("Vincent", "421-2132");

        Assertions.assertEquals("421-1111", objectUnderTest.get("John"));
        Assertions.assertEquals("421-2131", objectUnderTest.get("Kevin"));
        Assertions.assertEquals("421-453", objectUnderTest.get("Joe"));
        Assertions.assertEquals("421-123123", objectUnderTest.get("Robert"));
        Assertions.assertEquals("421-2132", objectUnderTest.get("Vincent"));
    }

    @Test
    void testCollision() {
        // these keys will collide
        objectUnderTest.put("John", "421-1111");
        objectUnderTest.put("Kevin", "421-2131");

        Assertions.assertEquals("421-1111", objectUnderTest.get("John"));
        Assertions.assertEquals("421-2131", objectUnderTest.get("Kevin"));
    }
}
