package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
     void getNumberOfList(){
        LinkedList list = new LinkedList();
        list.get(1);
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);


    }
    @Test
    void removeNumderOfList(){
        LinkedList list = new LinkedList();
        list.remove(1);
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void searchNumderInList()
    {LinkedList list = new LinkedList();
        list.search(5);
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }
}
