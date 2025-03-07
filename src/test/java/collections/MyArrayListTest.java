package collections;

import org.boot.collections.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList myArrayList;

    @BeforeEach
    void setUp() {
        myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
    }

    @Test
    void testAddInteger(){
        assertTrue(myArrayList.contains(1));
        assertTrue(myArrayList.contains(2));
        assertTrue(myArrayList.contains(3));
        assertTrue(myArrayList.contains(4));
        assertEquals(4, myArrayList.size());
    }

    @Test
    void testRemoveInteger(){
        myArrayList.remove(1);
        assertEquals(3, myArrayList.size());
    }

    @Test
    void testAddIndexString(){
        MyArrayList newArrayList = new MyArrayList();
        newArrayList.add("Java");
        newArrayList.add("Python");
        newArrayList.add("C++");
        newArrayList.add(2, "Java");

        assertEquals(4, newArrayList.size());
        assertEquals("Java", newArrayList.get(0));
        assertEquals("Java", newArrayList.get(2));
        assertEquals("C++", newArrayList.get(3));
    }

    @Test
    void testClear(){
        myArrayList.clear();
        assertEquals(0, myArrayList.size());
    }

    @Test
    void testSet(){
        MyArrayList newArrayList = new MyArrayList();
        newArrayList.add("Java");
        newArrayList.add("Python");
        newArrayList.add("C++");

        newArrayList.set(2, "Java");
        assertEquals(4, newArrayList.size());
        assertEquals("Java", newArrayList.get(2));
    }
//
//    boolean isEmpty();
    @Test
    void testIsEmpty(){
        myArrayList.clear();
        assertTrue(myArrayList.isEmpty());
    }
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
