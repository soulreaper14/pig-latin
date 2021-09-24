package com.github.soulrepear14.split;

public class SplitExample02 {

  public static void main(String[] args) {
    // tilde
    String data = "java~python~c-sharp~c++";
    // split this and print each token
    String[] tokens = data.split("~");

    for (String token : tokens) {
      System.out.println(token);
    }

    for (int i = 0; i < tokens.length; i++) {
      System.out.println(tokens[i]);
    }
  }
}
