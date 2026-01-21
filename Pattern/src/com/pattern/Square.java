package com.pattern;
// print *
public class Square {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        
        System.out.println("filled square: ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(" *");
            }
            System.out.println();    
        }

        System.out.println("hollow square: ");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print(" x");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
