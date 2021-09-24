package com.github.soulrepear14.loop;

/**
 * Use the 4 different loops to loop through the array.
 */
public class LoopExample00 {

  public static void main(String[] args) {
    String[] names = {"mercury", "venus", "earth", "mars", "jupiter"};

    // for-each
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println("------------");

    // for loop
    for (int i = 0; i < names.length; i++ ) {
      System.out.println(names[i]);
    }

    System.out.println("------------");

    // while loop
    int i = 0;
    while(i < names.length) {
      System.out.println(names[i]);
      i++;
    }

    System.out.println("------------");

    // do-while loop
    int e = 0;
    do {
      System.out.println(e);
      e++;
    } while (e < names.length);
  }
}
