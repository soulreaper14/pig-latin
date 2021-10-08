package com.github.soulrepear14.exercise;

public class Ex02 {
  public static void main(String[] args) {
    String[] animals = {"cat", "dog", "cow", "parrot", "monkey"};

    // use a for-each loop to loop over each element
    // when you print the animal, print only the first letter
    for (String animal : animals) {
      System.out.println(animal.charAt(0));
    } 
  }
}
