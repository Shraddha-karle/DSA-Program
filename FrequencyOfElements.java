package com.company;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int arr[]={23,12,23,43,43,23,56,89,78,78};
        //array frequency will store frequencies of elements.
        int fr[]=new int[arr.length];
        int visited=-1;
        for (int i=0;i< arr.length;i++){
            int count=1;//variable for counting the double elements.
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    count ++;
                    //to avoid counting the same elements again and again
                    fr[j]=visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        for (int i=0;i<fr.length;i++){
            if(fr[i]!=visited){
                System.out.println(arr[i]+" "+fr[i]+" ");
            }
        }
    }
}
