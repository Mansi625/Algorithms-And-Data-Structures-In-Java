package au.com.airmaxstudios.datastructures;

/**
 * Created by dylanaird on 12/09/2016.
 */
public class MyQueue {

    private int queueSize;

    public MyQueue(){
        this.queueSize = 0;
    }

    public void enqueue(Object obj){

        this.queueSize++;
    }

    public Object dequeue(){

        this.queueSize--;

        return null;
    }

}
