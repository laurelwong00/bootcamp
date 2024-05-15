package StreamDemo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Customer {
  private int age;
  private String name;

  public Customer(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Customer))
      return false;
    Customer customer = (Customer) obj;
    return Objects.equals(this.name, customer.getName())
        && Objects.equals(this.age, customer.getAge());
  } 
  @Override
  public int hashCode() {
    return Objects.hash(this.age, this.name);
  }

  @Override
  public String toString() {
    return "Customer(" //
        + "age=" + this.age //
        + ", name=" + this.name //
        + ")";
  }

  public static void main(String[] args) {
    Queue<String> q = new PriorityQueue<>();
    List<String> l = new ArrayList<>();
    List<String> l2 = new LinkedList<>();

    List<String> l3 = new Vector<>();
    List<String> l4 = new Stack<>();

    Deque<String> dq = new ArrayDeque<>();

    Deque<String> dq2 = new LinkedList<>();

    Queue<String> q2 = new 

  }
}
