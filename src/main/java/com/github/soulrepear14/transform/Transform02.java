package com.github.soulrepear14.transform;

/**
 * Modify this code to print the token only if it has 3 or more characters/letter.
 */
public class Transform02 {
  public static void main(String[] args) {
    String data = "i love to code";
    String[] tokens = data.split(" ");

    for(String token : tokens) {
      if (token.length() > 3) {
        System.out.println(token);
      }
    }
  }
}
