package se.sdaproject;

/**
 * @elem it is a first field used for data
 * @next reference to the next node
 */

class Node {

    int elem;
    Node next;

    Node(int num) {
        this.elem = num;
        this.next = null;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }
}

/**
 * Main class is implemented here
 */
public class LinkedList {

    int counter;
    public Node first;

    /**
     * Method to add elements int he linlkedList
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
        counter++;
    }


    /**
     * @size is used to find the number of variables added to the list
     */
    public int size() {
        return counter;
    }

    /**
     * @search method to find the element in the list with value
     */

    public int search(int element) {

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
        return -1;
    }


    /**
     * Get method to get the particular element at particular index
     */
    public int get(int index) {
        if (first == null)
            throw new IndexOutOfBoundsException();
        Node current = first;
        Node next = current.next;
        for (int k = 0; k < index; k++) {
            if (next == null) {
                return -1;
            }

            current = next;
            next = next.next;


        }

        return current.elem;
    }


    private void decrementCounter() {
        counter--;
    }


    /**
     * Remove method is used to remove the element at particular index
     *
     * @return
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
        public String toString () {
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
