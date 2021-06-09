/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadafrisal;

import java.util.Scanner;

/**
 *
 * @author Asus Gc
 */
public class Paliandrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int panjang = A.length();
        String kataBalik = "";

        for (int z = panjang-1; z >= 0; z--) {

            kataBalik = kataBalik + A.charAt(z); 
        }

        if (A.equals(kataBalik)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
