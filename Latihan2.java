/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadafrisal;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Asus Gc
 */
public class Latihan2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector<Integer> vec1 = new Vector<>();
        int input = 0;
        do {
            System.out.print("Masukan Input (0-9) : ");
            input = scan.nextInt();
            if (input >= 0 && input <= 9) {
                int i = 0;
                vec1.add(i, input);
                i++;
            }

        } while (input != -1);

        System.out.print("Angka Yang dicari : ");
        int angka = scan.nextInt();

        for (int i = 0; i < vec1.size(); i++) {
            if (angka == i) {
                System.out.printf("Angka Yang dicari %d berada di posisi %d ", angka, (i+1) );
            }
        }

//        for(Integer  angka:vec1 ) {
//            System.out.println(angka);
//        }
    }
}
