package collections;

import org.boot.collections.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyLinkedListTest {

    MyLinkedList list;
    MyLinkedList list2;

    @BeforeEach
    public void setup() {
        list = new MyLinkedList();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        list.add("C");

        list2 = new MyLinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
    }

    @Test
    void testAdd() {
        assertEquals("Java", list.get(0));
        assertEquals(2, list2.get(1));
    }

    @Test
    void testAddByIndex(){
        list.add(1,"Java_test");
        assertEquals("Java_test", list.get(1));
    }

//    void clear();
//
//    T set(int index, T newObject);
//
//    boolean isEmpty();
//
//    boolean contains(T element);
//
//    void remove(int index);
//
//    boolean remove(T element);
//
//    T getFirst();
//
//    T getLast();
//
//    int size();
//
//    T get(int index);
//
//    int indexOf(T o);
//
//    Iterator<T> iterator();
}
