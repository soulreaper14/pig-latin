package com.github.soulrepear14.exercise;

public class Ex04 {
  public static void main(String[] args) {
    String[] animals = {"cat", "dog", "cow", "parrot", "monkey"};

    // use a for-each loop and loop over each element
    // when you print the element, print all letters except for the first one
    for (String animal : animals) {
      System.out.println(animal.substring(1,animal.length()));
    }
  }

}
