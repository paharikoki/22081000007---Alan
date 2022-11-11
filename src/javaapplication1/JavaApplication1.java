/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int umur;
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        person person = new person();
        System.out.println("Silakan input nama anda : ");
        nama = sc.nextLine();
        System.out.println("Silakan input nama anda : ");
        umur = sc.nextInt();
        System.out.print("Input weight in kilogram: ");
        person.weight = sc.nextDouble();
        System.out.print("Input height in kilogram: ");
        person.height = sc.nextDouble();
        System.out.println("Namamu adalah :" + nama);
        System.out.println("umurmu : " + umur);
        person.calculateBMI();

    }
    
}
