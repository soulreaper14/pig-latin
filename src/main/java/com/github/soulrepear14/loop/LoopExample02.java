package com.github.soulrepear14.loop;

/**
 * Use the 4 different loops to loop through the array.
 */
public class LoopExample02 {

  public static void main(String[] args) {
    double[] weights = {155.5, 117.2, 192.3, 225.5};

    // for each loop
    for (double weight : weights) {
      System.out.println(weight);

    }

    // do loop
    int i = 0;
    do {
      System.out.println(weights[i]);
      i++;
    } while (i < weights.length);

    // while loop
    int o = 0;
    while (o < weights.length) {
      System.out.println(weights[o]);
      o++;
    }
    for (int c = 0; c < weights.length; c++) {
      System.out.println(weights[c]);
    }

    for (int keshav = 0; keshav < weights.length; keshav++) {
      System.out.println(weights[keshav]);
    }
  }
}
