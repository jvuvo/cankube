package com.cankube.monoexample.datastuctures;

public class HashTable {
    private static int INITIAL_SIZE = 16;

    private HashEntry[] data;

    public HashTable() {
        this.data = new HashEntry[INITIAL_SIZE];
    }

    public void put(String key, String value) {
        // Get index
        int index = getIndex(key);

        HashEntry entry = new HashEntry(key, value);

        if(data[index] == null) {
            data[index] = entry;
        } else { // Handle collision by adding to end of linked list
            HashEntry entries = data[index];
            while (entries.next !=null) {
                entries = entries.next;
            }
            // Add our new entry
            entries.next = entry;
        }
    }

    public String get(String key) {
        int index = getIndex(key);

        // Get the current list of entries
        HashEntry entries = data[index];

        if(entries!=null) {
            while (!entries.key.equals(key) && entries.next !=null) {
                entries = entries.next;
            }
            return entries.value;
        }
        return null;
    }

    private int getIndex(String key) {
        int hashCode = key.hashCode();
        int index = (hashCode & 0x7fffffff) % INITIAL_SIZE;

        // Hack Collision keys
        if(key.equals("Kevin") || key.equals("John")) {
            index = 4;
        }
        return index;
    }




    private static class HashEntry {
        String key;
        String value;
        HashEntry next;

        public HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
