package se.sdaproject;
/**
 * @elem it is a first field used for data
 * @next reference to the next node
 * */

class Node {

    int elem;
    Node next;
    Node(int num) {
        this.elem = num;
        this.next = null;
    }

    public Object getData() {
        return elem;
    }


    public void setData(Object dataValue) {
        elem = (int) dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }
}


public class LinkedList {

    private static int counter;
    public Node first;

/**
 *Method to add elements int he linlkedList
    */
    public void add(int num) {
        // int num is available!

        // step 1: is the linked list still empty?
        if (first == null) {
            // in this case, the linked list is empty
            Node node = new Node(num); // node.next == null
            first = node;
        } else {

            Node current = first;
            while (current.next != null) { // current is not the last node!
                current = current.next;
            }

            Node node = new Node(num);


            current.next = node;
        }
        incrementCounter();
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    /**
     *
     * @size is used to find the number of variables added to the list
     */
    public int size() {
        return getCounter();
    }

    /**
     *
     * @search method to find the element in the list with value
     */
    public int search(int element)
    {

        if (first == null) {
            return -1;
        }

        int index = 0;
        Node temp = first;

        // While loop is used to search the entire Linked
        // List starting from the tail
        while (temp != null) {

            // Returns the index of that particular element,
            // if found.
            if (temp.elem == element) {
                return index;
            }

            // Gradually increases index while
            // traversing through the Linked List
            index++;
            temp = temp.next;
        }

        // Returns -1 if the element is not found
        return -1;
    }


    /**
     *Get method to get the particular element at particular index
     */
    public Object get(int index)

    {
        // index must be 1 or higher
        if (index < 0)
            return null;
        Node Current = null;
        if (first != null) //Checking the list is not empty
        {
            Current = first.next;
            for (int i = 0; i < index; i++) {
                if (Current.next == null)
                    return null;

                Current = Current.next;
            }
            return Current.getData();
        }
        return Current;}


    /**
     *
     Remove method is used to remove the element at particular index
     */
     public boolean remove(int index) {

         // if the index is out of range, exit
         if (index < 1 || index > size())
             return false;

         Node Current = first;
         if (first != null) {
             for (int i = 0; i < index; i++) {
                 if (Current.getNext() == null)
                     return false;

                 Current = Current.getNext();
             }
             Current.setNext(Current.getNext().getNext());

             // decrement the number of elements variable
             decrementCounter();
             return true;

         }
         return false;
     }


    // useful for testing!
    public String toString() {
        // goal is to return a string like this:
        // "LinkedList(5,2,10)"

        StringBuilder builder = new StringBuilder();

        // call methods on "builder" to add strings

        builder.append("LinkedList(");
        // append strings for each integer in the list

        if (first == null) {
            // what to do here?
            // string to be returned: "LinkedList()"
            // nothing left to do!
        } else {
            // here, we know that first != null
            // go through the chain of nodes, starting with
            // "first"

            Node current = first;            
            // treat first element specially:
            builder.append("" + current.elem);

            while (current.next != null) {
                current = current.next;
                builder.append("," + current.elem);
            }
            // current.next == null
            // we have already appended the last num!
        }

        // append ")"
        builder.append(")");
        return builder.toString();
    }
}