package com.company;

public class deletionPractice {
    public static void main(String[] args) {
        int arr[]={30,60,70,90,80,40,50};
        //declaring variable
        int delete=90;
        //Traversing array
        for(int i=0;i< arr.length;i++){
            if(delete==arr[i]){
                for (int j=i;j< arr.length-1;j++){
                    arr[j]=arr[j+1];

                }
                break;
            }
            for ( i=0;i< arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

}
