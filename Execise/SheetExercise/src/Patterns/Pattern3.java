//n=5
//*
//**
//***
//****
//*****

package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(i + 1));
        }
    }
}
