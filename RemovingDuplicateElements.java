package com.company;

public class RemovingDuplicateElements {
    public static void main(String[] args) {
        int j=0;
        //creating array
        int a[]={1,2,2,3,4,4,5,6,7,8,8,8,9};
        //creating another temperary array
        int temp[]=new int[a.length];
        //traversing
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        for (int i=0;i< temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
