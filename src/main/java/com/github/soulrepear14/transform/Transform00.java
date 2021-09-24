package com.github.soulrepear14.transform;

/**
 * 1. split data into tokens based on " "
 * 2. loop through each token and print that token with the number 1
 * Your output should be like the following.
 *
 * i1
 * love1
 * to1
 * code1
 */
public class Transform00 {
  public static void main(String[] args) {
    String data = "i love to code";
    String[] tokens = data.split(" ");

    for(String token : tokens) {
      System.out.println(token.length() + "1");
    }
  }
}
