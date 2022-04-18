package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;

    public MyList(int size, E[] element) {
        this.size = size;
        this.data = element;
    }

    public MyList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
     }

     public MyList(int size) {
        data = (E[]) new Object[size];
     }

     public void ensureCapacity() {
        if (size > data.length) {
            data = Arrays.copyOf(data, size * 2);
        }
     }

     public void add(E element) {
        size += 1;
        ensureCapacity();
        data[size - 1] = element;
     }

     public boolean remove (int index) {
        if (index >= 0 && index <= size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
     }

     public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return true;
            }
        }
        return false;
     }

     public  int indexOf (E o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
     }

     public boolean add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapacity();
            for (int i = size -2; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = e;
            return true;
        }
        return false;
     }

     public E get(int index) {
        if (index >= 0 && index <= size) {
            return data[index];
        }
        return null;
     }

     public int size() {
        return size;
     }

     public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
     }

     public MyList clone() {
        MyList<E> beta = new MyList<>(data.length);
        for (E x : data) {
            beta.add(x);
        }
        return beta;
     }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
