package com.company;

public class Main2 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j==1||j==n||i==n/2+1){
                    System.out.print("H ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }
}
