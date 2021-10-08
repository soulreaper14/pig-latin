package com.github.soulrepear14.exercise;

import java.util.Locale;

public class Ex01 {
  public static void main(String[] args) {
    String[] animals = {"cat", "dog", "cow", "parrot", "monkey"};

    // use a for-each loop to loop over each element
    // when you print the animal, print it in all UPPERCASE!
    for (String animal : animals) {
      System.out.println(animal.toUpperCase());
    }
  }
}
