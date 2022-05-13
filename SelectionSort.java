package com.company;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={34,12,67,90,47,65,32,87,44};
        int temp;
        for(int i=0;i< arr.length;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min =j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
