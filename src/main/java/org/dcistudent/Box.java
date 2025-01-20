package org.dcistudent;

import java.util.List;

/**
 * Exercise 1:
 * - Write a box class that is like the one we have here in class that has a getter and setter method
 * - However this box should only take types that is the child of List, and that list should be a list of Strings
 */
public class Box<T extends List<String>> {
  private T list;

  public void set(T t) {
    this.list = t;
  }

  public T get() {
    return this.list;
  }
}
