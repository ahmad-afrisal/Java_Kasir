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
public class Kalkulator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("=======| Kalkulator Sederhana |=======");
        System.out.println("======================================");
        System.out.println("| \t[1] Penjumlahan (+)          |");
        System.out.println("| \t[2] Pengurangan (-)          |");
        System.out.println("| \t[3] Perkalian   (*)          |");
        System.out.println("| \t[4] Pembagian   (/)          |");
        System.out.println("| \t[5] Modulus     (%)          |");
        System.out.println("| \t[6] Pangkat     (^)          |");
        System.out.println("| \t[7] Faktorial   (!)          |");
        System.out.println("| \t[0] Keluar                   |");
        System.out.println("======================================");

        while (true) {
            System.out.print("Masukan Pilihan = ");
            int choice = scan.nextInt();
            if (choice == 0) {
                System.exit(0);
            } else if (choice >= 1 && choice <= 5) {
                System.out.print("Masukan Bilangan 1 : ");
                int bil1 = scan.nextInt();
                System.out.print("Masukan Bilangan 2 : ");
                int bil2 = scan.nextInt();
                int hasil;
                double hasilBagi;
                switch (choice) {
                    case 1:
                        hasil = bil1 + bil2;
                        System.out.println("Hasil Penjumlahan = " + hasil);
                        System.out.println("--------------------------------------");
                        break;
                    case 2:
                        hasil = bil1 - bil2;
                        System.out.println("Hasil Pengurangan = " + hasil);
                        System.out.println("--------------------------------------");
                        break;
                    case 3:
                        hasil = bil1 * bil2;
                        System.out.println("Hasil Perkalian = " + hasil);
                        System.out.println("--------------------------------------");
                        break;
                    case 4:
                        hasilBagi = (double) bil1 / (double) bil2;
                        if (hasilBagi % 1 == 0) {
                            hasil = (int) hasilBagi;
                            System.out.println("Hasil Pembagian = " + hasil);
                            System.out.println("--------------------------------------");
                        } else {
                            System.out.println("Hasil Pembagian = " + hasilBagi);
                            System.out.println("--------------------------------------");
                        }
                        break;
                    case 5:
                        hasil = bil1 % bil2;
                        System.out.println("Hasil Modulus = " + hasil);
                        System.out.println("--------------------------------------");
                        break;
                }

            }
        }
    }
}
