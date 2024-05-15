package com.bootcamp.demomaven;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;

@Getter

public class Customer {
  private String name;
  private List<Order> orders;

  public Customer(String name) {
    name = this.name;
    orders = new LinkedList<>();
  }

  public void add(Order order) {
    orders.add(order);
  }

  public int orderCount() {
    return this.getOrders().size();
  }

  public boolean isVIP() {
    return this.orderCount() >= 10;
  }

  public static int orderCount(Customer customer) {
    return customer.orderCount();
  }
}
