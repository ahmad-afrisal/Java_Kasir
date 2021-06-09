/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadafrisal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Asus Gc
 */
public class Latihan1 {

    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int input;
        
        Vector<Integer> vec1 = new Vector<>();
        
        do {
            System.out.print("Masukan Input (0-9) :");
            input = Integer.parseInt(scan.readLine());
            if (input >= 0 && input <= 9) {
                int i = 0;
                vec1.add(i, input);
                i++;
            } 

        } while (input != -1);

        Collections.sort(vec1);
        
        
        int c = vec1.get(0);
        int b = 0, modus = 0, besar = 0;
        for (int i = 0; i < vec1.size(); i++) {
            if (vec1.get(i) == c) {
                if (b > besar) {
                    besar = b;
                    modus = c;
                }
            } else {
                c = vec1.get(i);
                b = 1;
            }
        }

        System.out.println("=======|Output|========");
        System.out.println("Data Setelah Di urutkan = " + vec1);
        System.out.println("Data Terkecil = " + vec1.firstElement());
        System.out.println("Data Terbesar = " + vec1.lastElement());
        System.out.println("Angka Yang Paling Sering Muncul = " + modus);
    }

}
