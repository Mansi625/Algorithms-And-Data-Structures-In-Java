package au.com.airmaxstudios.datastructures;


/**
 * Created by dylanaird on 12/09/2016.
 */
public class MyStack<T> implements Stack {

    private int total;

    protected  Node first;


    private class Node {
        private T ele;
        private Node next;
    }

    public MyStack(){}

    @Override
    public MyStack push(Object ele) {
        Node current = first;
        first = new Node();
        first.ele = (T) ele;
        first.next = current;
        total++;
        return this;
    }

    public T pop()
    {
        if (first == null) new java.util.NoSuchElementException();
        T ele = first.ele;
        first = first.next;
        total--;
        return ele;
    }

    public Boolean empty(){
        return total == 0;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.ele).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }


}
