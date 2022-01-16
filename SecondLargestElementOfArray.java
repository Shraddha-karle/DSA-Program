package com.company;

import java.util.Arrays;

public class SecondLargestElementOfArray {
    //creating method
    static void secondlargest(int arr[],int arr_size){
        int i, first, second;
        //array should have atleast 2 elements
        if(arr_size<2) {
            System.out.println("Invalid Array");
            return;
        }
        //sort the array
        Arrays.sort(arr);
        //traverse array from secondlast element as the last element is greates of the sorted array
        for (i = arr_size - 2; i >= 0; i--) {
            //if element is not equal to largest element print the sencod largest element
            if(arr[i]!=arr[arr_size-1]){
                System.out.printf("The second largest " +
                        "element is %d\n", arr[i]);
                return;
            }
        }
        System.out.printf("There is no second " +
                "largest element\n");
    }

    public static void main(String[] args) {
        int arr[]={43,87};
        int n=arr.length;
        secondlargest(arr, n);
    }
}
