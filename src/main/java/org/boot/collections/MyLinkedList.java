package org.boot.collections;

import java.util.Iterator;

public class MyLinkedList<T> implements CustomList<T> {

    public static class Node<T> {
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
        Node<T> newNode = new Node<>(newObject);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T newObject) {
        checkIndex(index);
        Node<T> newNode = new Node<>(newObject);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else if (index == size - 1) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node<T> prevNode = head;
            for(int i = 0; i < index - 1; i++){
                prevNode = prevNode.next;
            }
            newNode.next = prevNode.next;
            newNode.prev = prevNode;
            prevNode.next = newNode;
        }
        size++;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T set(int index, T newObject) {
        checkIndex(index);
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.data = newObject;
        return node.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T element) {
        Node<T> node = head;
        for (int i = 0; i < size - 1; i++) {
            node = node.next;
            if (element.equals(node.data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);

        if(index == 0){
            head = head.next;
        }else if(index == size - 1){
            tail = tail.prev;
        }else{
            Node<T> prevNode = head;
            for(int i = 0; i < index - 1; i++){
                prevNode = prevNode.next;
            }
            Node<T> nodeToRemove = prevNode.next;
            prevNode.next = nodeToRemove.next;
            nodeToRemove.next = nodeToRemove.prev;
        }
        size--;
    }

    @Override
    public boolean remove(T element) {
        Node<T> node = head;
        for (int i = 0; i < size - 1; i++) {
            if(element.equals(node.data)) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                return true;
            }
        }
        return false;
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
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < size - 1; i++) {
            if (o.equals(get(i))) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
