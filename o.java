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
public class o {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test = scan.nextLine();
        
        if (test.equalsIgnoreCase("/")) {
            System.out.println("Oke");
        } else {
            System.out.println("no");
        }
    }
}
