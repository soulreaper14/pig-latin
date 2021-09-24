package com.github.soulrepear14.loop;

import java.util.Arrays;

/**
 * Use the 4 different loops to loop through the array.
 */
public class LoopExample03 {

  public static void main(String[] args) {
    Boolean[] lefty = {true, true, false, false};

    // 1. for loop
    for (int m = 0; m < lefty.length; m++) {
      System.out.println(lefty[m]);
    }

    // 2. while loop
    int k = 0;
    while (k < lefty.length) {
      System.out.println(lefty[k]);
      k++;
    }

    // 3. do-while
    int j = 0;
    do {
      System.out.println(lefty[j]);
      j++;
    } while (j < lefty.length);

    // 4. for-each
    for (boolean isLefty : lefty) {
      System.out.println(isLefty);
    }

    // 5. stream
    Arrays.stream(lefty).forEach(System.out::println);
  }
}
