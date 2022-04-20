package com.company;

public class Node {
    private Node text;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
