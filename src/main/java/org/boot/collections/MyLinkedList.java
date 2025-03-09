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
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T newObject) {
        checkIndex(index);

        Node<T> newNode = new Node<>(newObject);
        if(size == 0){
            head = tail = newNode;
        } else if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (index == size) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node<T> current  = getNode(index);
            Node<T> prevNode = current.prev;

            newNode.prev = prevNode;
            newNode.next = current;
            prevNode.next = newNode;
            current.prev = newNode;
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
        Node<T> node = getNode(index);
        node.data = newObject;
        return node.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if ((element == null && current.data == null)
                    || (element != null && element.equals(current.data))) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);

        if(size == 1){
          head = tail = null;
        } else if(index == 0){
            head = head.next;
            head.prev = null;
        }else if(index == size - 1){
            tail = tail.prev;
            tail.next = null;
        }else{
            Node<T> toRemove = getNode(index);
            Node<T> prevNode = toRemove.prev;
            Node<T> nextNode = toRemove.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
        size--;
    }

    @Override
    public boolean remove(T element) {
        Node<T> current = head;
        while (current != null) {
            if (element.equals(current.data)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
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
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if ((o == null && current.data == null)
                    || (o != null && o.equals(current.data))) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private Node<T> getNode(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
