package org.boot.collections;

import java.util.Iterator;

public interface CustomList<T> {
    void add(T newObject);

    void add(int index, T newObject);

    void clear();

    T set(int index, T newObject);

    boolean isEmpty();

    boolean contains(T element);

    void remove(int index);

    boolean remove(T element);

    T getFirst();

    T getLast();

    int size();

    T get(int index);

    int indexOf(T o);

    Iterator<T> iterator();
}
