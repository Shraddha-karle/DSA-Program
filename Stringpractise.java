package com.company;
import java.util.*;
public class Stringpractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        System.out.println("String before reversing ");
        for (int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.println("String after reversing ");
        for (int i=s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i)+" ");
        }
    }
}