package com.cankube.monoexample.datastuctures;

public class LinkedList {

    private Node head;

    public void addFront(String data){
        //Create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        // set new node to current head
        newNode.next = head;

        // set current head to new node
        this.head = newNode;
    }

    public String getFirst() {
        return this.head.data;
    }

    public String getLast() {
        if(head == null) {
            throw new IllegalStateException("Empty list");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // O(n)
        }
        // at tail
        return current.data;
    }

    public void addBack(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next !=null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void clear() {
        this.head = null;
    }

    public void delete(String value) {
        if(head == null) {
            return;
        }
        if (head.data.equals(value)) {
            head = head.next;
            return;
        }
        Node  current = head;
        while (current.next!=null) {
            if(current.next.data.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    private static class Node {
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
        }
    }
}
