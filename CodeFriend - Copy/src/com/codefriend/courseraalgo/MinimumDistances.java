package com.codefriend.courseraalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinimumDistances {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        boolean flagFound=false;
       int min=0;
       
       
       if(flagFound){
    	   System.out.println(min);
       }else{
    	   System.out.println(-1);
       }
        
    }

}
