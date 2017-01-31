package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int bol=0,alice=0;
        Scanner in = new Scanner(System.in);
//        System.out.println("line "+in.nextLine());
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        System.out.println(line1);
        System.out.println(line2);
        String firstLine [] = line1.split(" ");
        String secondLine [] = line2.split(" ");
        System.out.println("firstLine from array "+Arrays.toString(firstLine));
        System.out.println("secondLine from array "+Arrays.toString(secondLine));
        for (int run =0 ; run < firstLine.length;run ++){
            if(Integer.parseInt(firstLine[run]) > Integer.parseInt(secondLine[run])){
                alice+=1;
                System.out.println(firstLine[run]+" is greater than "+secondLine[run]);
            }else if (Integer.parseInt(firstLine[run]) < Integer.parseInt(secondLine[run])){
                bol+=1;
                System.out.println(firstLine[run]+" is lesser than "+secondLine[run]);
            }else{
                System.out.println(firstLine[run]+" is equals to "+secondLine[run]);
            }

        }
        System.out.println(alice+" "+bol);
       /* for ( String [] st: firstLine
             ) {
            System.out.println("print "+st);
        }*//*
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int bol=0,alice=0;
        if (a0 > b0){
            //System.out.println("Alice receives point");
            alice+=1;
        }else if(a0 < b0){
            //System.out.println("Bob receives point");
            bol+=1;
        }else{
            // System.out.println("so nobody receives a point!!");
        }
        if (a1 > b1){
            // System.out.println("Alice receives point");
            alice+=1;
        }else if(a1 < b1){
            //System.out.println("Bob receives point");
            bol+=1;
        }else{
            //System.out.println("so nobody receives a point!!");
        }

        if (a2 > b2){
            alice+=1;
            //System.out.println("Alice receives point");
        }else if(a2 < b2){
            //System.out.println("Bob receives point");
            bol+=1;
        }else{
            //System.out.println("so nobody receives a point!!");
        }
        System.out.println(alice+" "+bol);*/
        /*
        System.out.println(a0); // a1 a2+"--"+b0 b1 b2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2); */
    }
}
