package com.cankube.monoexample.datastuctures;

public class DynamicArray<String> {

    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public void set(int index, String value) {
        this.insert(index, value);
    }

    public String get(int index) {
        return (String) data[index];
    }

    public void insert(int index, String value) {
        //Check size
        if (size == initialCapacity) {
            this.resize();
        }
        //Copy up
        for (int j = size; j > index; j--) {
            data[j] = data[j - 1];
        }
        // Insert
        data[index] = value;
        size++;
    }

    public void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }

    public void delete(int index) {
        //Copy down
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(String value) {
        for(int i=0; i <size;i++) {
            if(data[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
}
