package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=10;
        int x=n/2+1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=x ; j++) {
                if (j==1||j==x){
                    System.out.print("K ");
                }else {
                    System.out.print("  ");
                }
            }if (i<=n/2){
                x--;
            }else {
                x++;
            }
            System.out.println();
        }

    }
}
