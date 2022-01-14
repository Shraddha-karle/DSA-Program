package com.company;
import java.util.*;
import java.io.*;
import java.lang.*;
public class inserting_element_in_array {
    public static int[] insertX(int x,int n,int pos,int arr[]){
        int newarr[]=new int[n+1];
        for (int i=0;i<n+1;i++){
            if(i<pos-1)
                newarr[i]=arr[i];
            else if(i==pos-1)
                newarr[i]=x;
            else
                newarr[i]=arr[i-1];

            }
        return newarr;
        }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Actual array \n"+ Arrays.toString(arr));
        int x=50;
        int n=10;
        int pos=5;
        arr=insertX(x,n,pos,arr);
        System.out.println("New element "+x+" inserted at position "+pos+" NEW ARRAY IS \n"+Arrays.toString(arr));
    }
    }

