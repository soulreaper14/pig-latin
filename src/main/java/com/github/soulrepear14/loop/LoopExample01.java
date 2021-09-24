package com.github.soulrepear14.loop;

/**
 * Use the 4 different loops to loop through the array.
 */
public class LoopExample01 {

  public static void main(String[] args) {
    int[] ages = {32, 33, 34, 17};

    // 1. use a for loop
    for (int i = 0; i < ages.length; i++) {
      System.out.println(i);
    }

    // 2. use a for-each loop
    for (int age : ages) {
      System.out.println(age);
    }

    // 1. you reversed the position of the element and array
    // 2. you did not specify the type for the element
//    for (ages : age) {
//      System.out.println(age);
//    }

    // 3. use a while loop
    // a. you declare and initialize "e", but use "i"; where did "i" come from?
    // b. you refer to "age" when you really want "ages"
    // c. you print "e" which is the index, when you should print ages[e]
//    int e  = 0;
//    while (i < age.length) {
//      System.out.println(e);
//      e++;
//    }

    int e = 0;
    while (e < ages.length) {
      System.out.println(ages[e]);
    }
    // 4. use a do-while loop
  }
}
