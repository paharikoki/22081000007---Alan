/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author USER
 */
public class person {
    double height, weight,result;
    String name;
    int age;
    
    void calculateBMI(){
        result = weight / (height * height);
        
        System.out.println("Name :" + name);
        System.out.println("Your Age : " + age);
        System.out.println("Your Body Mass Index (BMI) is : " + result);
        //Check kamu termasuk masuk pada
        
    }
}
