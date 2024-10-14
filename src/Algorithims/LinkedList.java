package Algorithims;

public class LinkedList {
  private Node head;
  private Node tail;

  public LinkedList(){
    head = null;
    tail = null;
  }
  public void append(int data){
    if(head == null){
      Node newhead = new Node(null, null, data);
      head = newhead;
    }
    else {
      Node notnew = head;
      while (notnew.getNext() != null) {
        notnew = notnew.getNext();
      }
      Node newthing = new Node(notnew, null, data);
      notnew.setnext(newthing);
      tail = newthing;
    }
  }
  public static String fullprint(LinkedList c){
    return toString(c.head);
  }
  public static String toString(Node c){
    String toString = "";
    while(c.getNext() != null){
      toString += (c.returncontent() + " ");
      c = c.getNext();
    }
    toString += (c.returncontent() + " ");

    return toString;
  }
  public Node Nodesearch(int x){
    if(head == null) return null;
    Node test = head;
    while(test != null && test.returncontent() != x) {
      test = test.getNext();
    }
    return test;
  }
  public Node Nodess(LinkedList list, int x){
    Node test = list.head;
    while(test != null && test.returncontent() != x ){
      test = test.getNext();
    }
    return test;

  }
  public void delete(Node a){
    if (a.prev() != null){
      a.prev().setnext(a.getNext());
    }
    else{
      head = a.getNext();
    }
    if(a.getNext()!=null){
      a.getNext().setPrevious(a.prev());
    }
  }
  public Node getHead(){return head;}
  public Node getTail(){return tail;}

  public class Node {
    private Node previous;
    private Node next;
    private int data;
    public Node(Node forprev, Node fornext, int fordata) { // sets a node
      previous = forprev;
      next = fornext;
      data = fordata;

    }
    public Node prev(){ // returns previous node
      return previous;
    }
    public Node getNext(){ // returns next node
      return next;
    }
    public void setnext(Node _next){
      next = _next;
    }
    public void setPrevious(Node _previous) { previous = _previous;}
    public int returncontent(){return data;}
    public String returnnode(){
      return("data "  + data);
    }
  }
}
