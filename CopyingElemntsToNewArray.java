package com.company;

public class CopyingElemntsToNewArray {

    public static void main(String[] args) {
	int a[]={21,2,5,76,35,98,88};
	int b[]=new int[a.length];
	b=a;
        System.out.print("Contents of a is \n");
	for (int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
        System.out.println();
        System.out.print("Contents of b is \n");
	for (int i=0;i<b.length;i++){
        System.out.print(b[i]+" ");
    }
    }
}
