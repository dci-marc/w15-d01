package org.dcistudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    List<String> stringList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

    Main.printElements(intList);
    Main.printElements(stringList);

    Main.addElement(intList, 6);
    Main.addElement(stringList, "f");

    Main.printList(intList);
  }

  public static <T> void printElements(List<? extends T> list) {
    for (T element : list) {
      System.out.println(element);
    }
  }

  public static <T> void addElement(List<? super T> list, T element) {
    list.add(element);
  }

  /**
   * Exercise 2:
   * Write a method printList(List<?>) that accepts a list of any type and prints each element in the following syntax “Item: ” + item Test this method by passing List<String> and List<Integer> to it
   */
  public static void printList(List<?> list) {
    for (Object element : list) {
      System.out.println("Item: " + element);
    }
  }
}