package au.com.airmaxstudios.datastructures;

/**
 * Created by dylanaird on 12/09/2016.
 */
public class MyDoublyLinkedList {


    private int listSize;
    private Node listHead;
    private Node listTail;

    public MyDoublyLinkedList(){
        this.listSize = 0;
        this.listHead = null;
        this.listTail = null;
    }






    protected class Node {
        private int nodeValue;
        private Node previousNode;
        private Node nextNode;

        protected Node(Node next, Node previous, int value){
            this.nodeValue = value;
            this.nextNode = next;
            this.previousNode = previous;
        }


    }
}
