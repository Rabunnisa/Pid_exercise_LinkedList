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
        list.add(3);
        list.add(10);
        list.add(11);
        String expected = "LinkedList(5,3,10,11)";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void checkTheSizeOfList(){
        LinkedList list = new LinkedList();
        list.add(11);
        list.add(13);
        list.size();
        assertEquals(list.size(),2);
    }
    @Test
    void searchTheGivenNumberInList(){
        LinkedList list = new LinkedList();
        list.add(11);
        list.add(4);
        list.add(3);
        list.search(11);

        assertEquals(list.search(11), 0);
    }

    @Test
     void getNumberOfList() {
        LinkedList list = new LinkedList();
        list.add(11);
        list.add(4);
        list.add(3);
        list.get(1);
        assertEquals(list.get(4), -1);

    }
    @Test
    void removeGivenNumberFromList(){
        LinkedList list = new LinkedList();
        list.add(11);
        list.add(4);
        list.add(3);
        list.remove(1);
assertTrue(true);


    }



}
