package org.boot.collections;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> implements Map {
    private Node<K, V>[] table;
    private int size;
    private int threshold;
    private final float loadFactor;

    static class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;
        final int hash;

        Node(K key, V value, int hash, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        }
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            throw new IllegalArgumentException("Illegal load factor: " + loadFactor);
        }
        this.loadFactor = loadFactor;
        this.table = (Node<K, V>[]) new Node[initialCapacity];
        this.threshold = (int) (initialCapacity * loadFactor);
    }

    public MyHashMap() {
        this(16, 0.75f);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return Set.of();
    }

    @Override
    public Collection values() {
        return List.of();
    }

    @Override
    public Set<Entry> entrySet() {
        return Set.of();
    }

    @Override
    public boolean remove(Object key, Object value) {
        return Map.super.remove(key, value);
    }
}
