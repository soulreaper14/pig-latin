package com.github.soulrepear14.string;

public class LearnString02 {

  public static void main(String[] args) {
    String firstName = "keshav";
    String lastName = "rawat";

    // print the first letter of firstName
    // print the first letter of lastName
    char f = firstName.charAt(0);
    char l = lastName.charAt(0);

    System.out.println(f + " ||||| " + l);

    // you try to get the first letter of firstName and lastName
    // using .substring()
    String result1 = firstName.substring(0, 1);
    String result2 = lastName.substring(0, 1);

    System.out.println(result1 + " - " + result2);
  }
}
