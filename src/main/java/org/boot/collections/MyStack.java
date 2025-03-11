package org.boot.collections;

import java.util.AbstractList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;

public class MyStack<E> extends AbstractList<E> implements List<E>, CustomStack<E> {

    public static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node<E> top;
    private  int size;


    @Override
    public E get(int index) {
        checkIndex(index);
        Node<E> node = top;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node.data;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

//    @Override
//    public E getFirst() {
//
//    }
//
//    @Override
//    public E getLast() {
//
//    }

//    @Override
//    public E removeFirst() {
//
//    }
//
//    @Override
//    public E removeLast() {
//
//    }
//
//    @Override
//    public List<E> reversed() {
//
//    }

    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

//    @Override
//    public <T> T[] toArray(IntFunction<T[]> generator) {
//
//    }

    @Override
    public void sort(Comparator<? super E> c) {

    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
