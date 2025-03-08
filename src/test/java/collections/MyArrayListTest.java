package collections;

import org.boot.collections.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList myArrayList;
    MyArrayList newArrayList;

    @BeforeEach
    void setUp() {
        myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        newArrayList = new MyArrayList();
        newArrayList.add("Java");
        newArrayList.add("Python");
        newArrayList.add("C++");
    }

    @Test
    void testAddInteger() {
        assertTrue(myArrayList.contains(1));
        assertTrue(myArrayList.contains(2));
        assertTrue(myArrayList.contains(3));
        assertTrue(myArrayList.contains(4));
        assertEquals(4, myArrayList.size());
    }

    @Test
    void testRemoveInteger() {
        myArrayList.remove(1);
        assertEquals(3, myArrayList.size());
    }

    @Test
    void testAddIndexString() {
        newArrayList.add(2, "Java");

        assertEquals(4, newArrayList.size());
        assertEquals("Java", newArrayList.get(0));
        assertEquals("Java", newArrayList.get(2));
        assertEquals("C++", newArrayList.get(3));
    }

    @Test
    void testClear() {
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }

    @Test
    void testSet() {
        newArrayList.set(2, "Java");
        assertEquals(3, newArrayList.size());
        assertEquals("Java", newArrayList.get(2));
    }

    @Test
    void testIsEmpty() {
        myArrayList.clear();
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    void testContains() {
        assertTrue(newArrayList.contains("Java"));
    }

    @Test
    void testRemoveToIndex() {
        newArrayList.remove(1);

        System.out.println(newArrayList.toString());
        assertEquals(2, newArrayList.size());
    }

    @Test
    void testRemoveToElement() {
        newArrayList.remove("Java");

        System.out.println(newArrayList.toString());
        assertEquals(2, newArrayList.size());
    }

    //
//    T getFirst();
    @Test
    void testGetFirstElement() {
        assertEquals(1, myArrayList.get(0));
    }

    @Test
    void testGetFirstElement1() {
        assertEquals("Java", newArrayList.get(0));
    }

    @Test
    void testGetLastElement() {
        assertEquals(4, myArrayList.getLast());
    }

    @Test
    void testSize() {
        assertEquals(4, myArrayList.size());
    }

    @Test
    void testGetElementByIndex() {

        assertEquals("Java", newArrayList.get(0));
    }
    @Test
    void testIndexOf() {
        assertEquals(0, newArrayList.indexOf("Java"));
    }

    @Test
    void testIterator() {
        assertTrue(newArrayList.iterator().hasNext());
    }
}




