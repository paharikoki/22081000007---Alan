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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        person person = new person();
        System.out.println("Input your name : ");
        person.name = sc.nextLine();
        System.out.println("Input your age : ");
        person.age = sc.nextInt();
        System.out.print("Input weight in kilogram: ");
        person.weight = sc.nextDouble();
        System.out.print("Input height in meter: ");
        person.height = sc.nextDouble();
        person.calculateBMI();

    }
    
}
