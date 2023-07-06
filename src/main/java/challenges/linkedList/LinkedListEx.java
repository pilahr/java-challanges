package challenges.linkedList;

import java.util.NoSuchElementException;

public class LinkedListEx {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);


        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }
    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        // [10 -> 20 -> 30]
        // first -> 20
        // [20 -> 30]
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        // if linked list has single item
        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        // take the first away
        first.next = null;
        //update the first
        first = second;
        size--;
    }

    public void removeLast() {
        // [10 -> 20 -> 30]
        // want last -> 20
        // previous -> 20
        // point last to -> 20

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;

        while (current != null) {
            array[index] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        // [10 -> 20 -> 30]
        // previous current next
        // next = c.next
        // c.next = p

        if (isEmpty()) return;

        var previous = first;
        var current = first.next;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null; // last never reference any other node
        first = previous;

    }

    // find the Kth node from the end
    // of a linked list in one pass

    // [10 -> 20 -> 30 -> 40 -> 50]
    //   *           *
    // pointer* create 2 pointer until the second pointer target the target node
    //                *           *
    // K = 1 (50)
    // K = 2 (40)
    // K = 3 (30) (distance = 2)

    public int getKthFromTheEnd(int k) {

        if (isEmpty())
            throw new IllegalStateException();
        var a = first;
        var b = first;
        for (int i = 0; i < k -1; i++) { // move b ,,, k -1 node apart
            b = b.next;
            if ( b == null)
                throw new IllegalArgumentException();
        }
        while ( b!= last) {
            a = a.next;
            b = b.next;
        }
        return a.value;

    }

    public static void main(String[] args) {
        LinkedListEx list = new LinkedListEx();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        System.out.println(list.getKthFromTheEnd(1)); //60
        System.out.println(list.getKthFromTheEnd(2)); //50

//        System.out.println("size " + list.size());
//
//        list.removeLast();
//        list.removeFirst();
//        System.out.println("size " + list.size());

//        System.out.println(list.indexOf(10));
//        System.out.println(list.indexOf(40));
//        System.out.println(list.contains(40));
//        System.out.println(list.contains(10));

//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));

//        LinkedList list = new LinkedList();
//        list.addFirst(10);
//        list.addLast(20);
//
//        list.reverse();
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println("size " + list.size());

    }
}
