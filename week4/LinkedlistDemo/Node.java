package week4.LinkedlistDemo;

public class Node {

  private String str;
  private Node next; // object reference

  public Node(String str) {
    this.str = str;
  }

  public Node(String str, Node next) {
    this.str = str;
    this.next = next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return this.next;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public String getStr() {
    return this.str;
  }

  @Override
  public String toString() {
    return this.str + this.next;
  }

  public static void main(String[] args) {
    // "hello", "abc", "def"
    Node head = new Node("hello", new Node(("abc"), new Node("def")));
    System.out.println("head : " + head);
    System.out.println(head.next);
    Node temp = head;
    boolean result = false;
    while (temp != null) {
      if ("def".equals(temp.getStr())) {
        result = true;
        break;
      }
      temp = temp.getNext();
    }
    System.out.println(temp.getStr());
    System.out.println(result);
    System.out.println("def.equals(temp.getStr()" + "def".equals(null));
    //System.out.println("def.equals(temp.getStr() 2 " + null.equals("def"));

  }
}
