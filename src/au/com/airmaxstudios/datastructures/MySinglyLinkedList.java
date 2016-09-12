package au.com.airmaxstudios.datastructures;

/**
 * Created by dylanaird on 12/09/2016.
 */
public class MySinglyLinkedList {

    /*
    * @param listSize: This is the size of the list.
    * @param listHead: this is the head of the list
    * */
    private int listSize;
    private Node listHead;

    public MySinglyLinkedList(){
        this.listSize = 0;
        this.listHead = null;

    }

    public void addAfter(Node node,Node newNode){

        if(this.listHead == null){
            this.listHead = node;
        }else{

            Node curr = this.listHead;

            while(curr != node){
                curr = curr.getNextNode();
            }
            curr.setNextNode(newNode);
        }
        this.listSize++;
    }
    public void addBeginnning(Node node){

        if(this.listHead == null){
            this.listHead = node;
        }else{
            node.setNextNode(this.listHead);
            this.listHead = node;
        }
        this.listSize++;
    }
    public Boolean removeAfter(Node node){


        Node removeNode = node.getNextNode();
        node.setNextNode(node.getNextNode().getNextNode());
        removeNode = null;


        return true;
    }
    public Boolean removeBeginning(){

        Node removeNode = this.listHead;
        this.listHead = listHead.getNextNode();
        removeNode = null;
        return true;
    }
    public Boolean removeWithValue(int value){

        if(this.listSize == 0) {
            return false;
        }

        Node currentNode = this.listHead;
        Node previousNode;

        if(currentNode.getValue() == value){
            this.listHead = currentNode.getNextNode();
            this.listSize--;
            return true;
        }

        previousNode = currentNode;
        currentNode = currentNode.getNextNode();

        while(currentNode != null){

            if(currentNode.getValue() == value){
                previousNode.setNextNode(currentNode.getNextNode());
                currentNode = null;
                this.listSize--;
                return true;
            }

            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        return false;
    }



    protected class Node{
        int value;
        Node nextNode;

        protected Node(int i, Node n){
            this.value = i;
            this.nextNode = n;
        }

        protected void setValue(int i){
            this.value = i;
        }
        protected void setNextNode(Node n){
            this.nextNode = n;
        }

        protected int getValue(){
            return this.value;
        }
        protected Node getNextNode(){
            return this.nextNode;
        }


    }
}
