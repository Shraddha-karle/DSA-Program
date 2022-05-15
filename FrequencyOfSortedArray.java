package com.company;

import java.util.Arrays;

public class FrequencyOfSortedArray {
    public static void main(String[] args) {
        int arr[]={12,43,67,44,89,44,12,89,56,34,12,67,43,43,89,89};
        Arrays.sort(arr);

        int freq=1;
        int n=arr.length;
        for (int i=1;i< n;i++){
            if(arr[i]==arr[i-1])
                freq++;
            else{
                System.out.println("Frequency of "+arr[i-1]+" is "+freq);
                freq=1;
            }
        }
        System.out.println("Frequency of "+arr[n-1]+" is "+freq);
    }
}
