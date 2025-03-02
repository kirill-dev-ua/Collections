package org.boot.collections;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    public void add(E element) {
        if (elements.length == size) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (elements.length == size) {
            increaseCapacity();
        }
       System.arraycopy(elements, index, elements,
               index + 1, size - index);
        size++;
        elements[index] = element;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void remove(int index) {
        checkIndex(index);
        int newMoved = size - index - 1;
        if (newMoved > 0) {
            System.arraycopy(elements, index + 1,
                    elements, index, newMoved);
        }
        elements[--size] = null;
    }

    public void remove(E o) {
        int index = indexOf(o);
        if(index != -1){
            remove(index);
        }
    }

    public void set(int index, E element) {
        checkIndex(index);
        elements[index] = element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    public boolean contains(E o){
        return indexOf(o) != -1;
    }

    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public int firstIndexOf(E o) {
        return indexOf(o);
    }

    public int lastIndexOf(E o){
        for (int i = size - 1; i >= 0; i--) {
            if(o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        Object[] actual = Arrays.copyOf(elements, size);
        return "MyArrayList { elements=" + Arrays.toString(actual) + '}';
    }

    private void increaseCapacity() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
