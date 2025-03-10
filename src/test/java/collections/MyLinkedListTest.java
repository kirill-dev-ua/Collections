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
    void testAddByIndex() {
        list.add(1, "Java_test");
        assertEquals("Java_test", list.get(1));
    }

    @Test
    void testClear() {
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void testSetByIndex() {
        list.set(0, "Java_test");
        assertEquals("Java_test", list.get(0));
    }

    @Test
    void testIsEmpty() {
        MyLinkedList list = new MyLinkedList();
        assertTrue(list.isEmpty());
        list.add("Java_test");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        assertEquals(4, list.size());
        list.remove(0);
        list.remove(1);
        assertEquals(2, list.size());
        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    void testContains() {
        assertFalse(list.contains("Java_test"));
        assertTrue(list.contains("Python"));
    }

    @Test
    void testRemoveByIndex() {
        list.remove(1);
        assertEquals("JavaScript", list.get(1));
    }

    @Test
    void testRemoveByElement() {
        list.remove("C");
        assertEquals("C++", list.getLast());
    }


    @Test
    void testFirstElement() {
        assertEquals("Java", list.get(0));
    }

    @Test
    void testFirstElement2() {
        list.add(0, "Java_test");
        assertEquals("Java_test", list.get(0));
    }

    @Test
    void getLastElement() {
        assertEquals("C", list.getLast());
    }

    void getLastElement2() {
        list.add("C_test");
        assertEquals("C_test", list.getLast());
    }

    @Test
    void testSize() {
        assertEquals(5, list.size());
    }

    @Test
    void testSize2() {
        list.add("Java_test");
        assertEquals(6, list.size());
    }

    @Test
    void testSize3() {
        list.remove(1);
        assertEquals(4, list.size());
    }

    @Test
    void getElementByIndex() {
        assertEquals("Java", list.get(0));
        assertEquals(1, list2.get(0));
    }

    @Test
    void testIndexOf() {
        assertEquals(1, list.indexOf("Python"));
    }
}






