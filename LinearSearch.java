package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={2,9,1,4,6,8,4};
        int search=6;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("The searched element is at "+i +" indexed position.");
            }
        }
    }
}
