package com.github.soulrepear14.exercise;

public class Ex08 {

  public static void main(String[] args) {
    String[] animals = {"cat", "dog", "cow", "parrot", "monkey"};

    // use a for each loop to loop through each animal
    // take the second letter, add "ay" to it and add it to the front of the animal name.

    for (String animal : animals) {
      System.out.println(animal.charAt(1) + "ay" + animal);
    }
  }
}
