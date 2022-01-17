package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={3,5,6,8,9,12,15,17,19,23};
        int search=6;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        while (li<=hi){
            if(a[mi]==search){
                System.out.println("Element at "+mi+"index position");
                break;
            }
            else if(a[mi]<search){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("Element not found");
    }

    }

}
