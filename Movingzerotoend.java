package com.company;

public class Movingzerotoend {
    public static void main(String[] args) {
        //declaring array
        int a[]={4,0,0,1,0,0,0,7,0,0,0};
        int count=0;
        //traversing array
        for (int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[count++]=a[i];
            }
        }
        while (count<a.length) {
            a[count++] = 0;
            }
        for (int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }

    }
}
