package com.cankube.monoexample.datastuctures;

public class Queue {
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public String peek(){
        return head.data;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
    }

    public String remove() {
        String data = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return data;
    }

    private static class Node {
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
        }
    }
}
