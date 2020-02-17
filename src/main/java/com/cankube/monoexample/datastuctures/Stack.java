package com.cankube.monoexample.datastuctures;


import java.util.EmptyStackException;

public class Stack {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public String peek(){
        return head.data;
    }

    public String pop() {
        if(head == null) throw new EmptyStackException();
        String data = head.data;
        head = head.next;
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
