package org.boot.collections;

public class MyLinkedList<T> implements CustomList<T>{

    public static class Node<T>{
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void add(T newObject) {

    }

    @Override
    public void add(int index, T newObject) {

    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void set(int index, T newObject) {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(T element) {

    }

    @Override
    public T getFirst() {
        return head.data;
    }

    @Override
    public T getLast() {
        return tail.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public int indexOf(T o) {
        return 0;
    }
}
