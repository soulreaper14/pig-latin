package com.github.soulrepear14.transform;

public class Transform01 {
  public static void main(String[] args) {
    String data = "i love to code";
    String[] tokens = data.split(" ");

    for(String token : tokens) {
      // only print the token if its length is greater than 1
      if (token.length() > 1) {
        System.out.println(token);
      }
    }
  }
}
