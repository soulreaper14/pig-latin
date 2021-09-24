package com.github.soulrepear14.split;

public class SplitExample00 {

  public static void main(String[] args) {
    String data = "java,python,c-sharp,c++";
    // split this and print each token
    String[] tokens = data.split(",");

    for (String token: tokens) {
      System.out.println(token);
    }
  }
}
