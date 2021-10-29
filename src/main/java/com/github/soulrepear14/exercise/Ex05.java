package com.github.soulrepear14.exercise;

public class Ex05 {
  public static void main(String[] args) {
    String[] animals = {"cat", "dog", "cow", "parrot", "monkey"};

    // use a for-each loop to loop through the list !
    // for each String in the list:
      //take the first character (store it in a variable),
      // put it in the back of the string
    for (String animal : animals) {
      String animalChar = Character.toString(animal.charAt(0));
      char animalchar = animal.charAt(0);

      System.out.println(animal.substring(1, animal.length())+animalChar);
      System.out.println(animal.substring(1, animal.length())+animalchar);
    }
  }
}
