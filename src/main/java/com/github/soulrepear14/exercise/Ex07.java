package com.github.soulrepear14.exercise;

public class Ex07 {
  public static void main(String[] args) {
    String[] animals = {"cat", "dog", "cow", "parrot", "monkey"};

    // use a for each loop to loop through every animal in the list of animals
    // for each animal, take the first letter and print that with "ay" at the end.
    for (String animal : animals) {
      System.out.println(animal.charAt(0) + "ay");
      System.out.println(animal.substring(0,1)+"ay");
    }
  }
}
