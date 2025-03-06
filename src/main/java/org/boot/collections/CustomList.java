package org.boot.collections;

public interface CustomList<T> {
    void add(T newObject);

    void add(int index, T newObject);

    void clear();

    T set(int index, T newObject);

    boolean isEmpty();

    boolean contains(T element);

    T remove(int index);

    void remove(T element);

    T getFirst();

    T getLast();

    int size();

    T get(int index);

    int indexOf(T o);
}
