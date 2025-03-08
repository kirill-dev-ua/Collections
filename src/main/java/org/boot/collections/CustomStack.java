package org.boot.collections;

public interface CustomStack<T> {

    void push(T element);

    T pop();

    T peek();

    boolean isEmpty();

    int size();
}