package com.github.soulrepear14.exercise;

public class Ex03 {
  public static void main(String[] args) {
    String[] animals = {"cat", "dog", "cow", "parrot", "monkey"};

    // use a for-each loop to loop over each element
    // when you print the animal, print the first 3 letters
    for (String animal : animals) {
      System.out.println(animal.substring(0, 3));
    }
  }
}
