package com.company;

import java.util.Arrays;

public class SmallestElement {
   public static int Smallest(int a[]){
    Arrays.sort(a);
    return a[0];
   }

    public static void main(String[] args) {
        int a[]={2567,114,13,56,437,90,54};
        System.out.println("Smallest no is "+Smallest(a));
    }
}
