/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadafrisal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus Gc
 */
public class Testing {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukan Input :");
            int temp = Integer.parseInt(dataIn.readLine());
            for (int i = 1; i <= 10 ; i++) {
                int hasil = temp * i;
                System.out.printf("%d * %d = %d \n", temp, i, hasil);
            }
        } 
        catch (IOException e) {
            System.out.println(e);
        }

    }
}
