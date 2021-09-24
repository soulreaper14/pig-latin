package com.github.soulrepear14.split;

/**
 * What happens if there is a space at the end?
 */
public class SplitExample03 {

  public static void main(String[] args) {
    String data = "java python c-sharp c++ ";
    // split this and print each token
    String[] tokens = data.split(" ");
    System.out.println(tokens.length);

    for (String token: tokens) {
      System.out.println(token + ", " + token.length());
    }
  }
}
