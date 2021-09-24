package com.github.soulrepear14.loop;

import java.util.Arrays;

public class LoopExample04 {

  public static void main(String[] args) {
    String[] elements = {"hydrogen", "helium", "oxygen", "carbon"};

    // use the 4 types of loop, to loop over
    // do NOT use stream

    // 1. for loop
    for (int i = 0; i < elements.length; i++) {
      System.out.println(elements[i]);
    }

    // 2. while loop
    // ACHIEVMENT UNLOCKED! +1,000,000
   int d = 0;
    while (d < elements.length) {
      System.out.println(elements[d]);
      d++;
    }
    // 3. do-while loop
    int k = 0;
    do {
      System.out.println(elements[k]);
      k++;

    }
    while (k < elements.length);

    // 4. for-each
    for (String isElements : elements) {
    System.out.println(isElements);
    }

    Arrays.stream(elements).forEach(System.out :: println);
  }
}
