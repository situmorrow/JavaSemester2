/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwerty;

/**
 *
 * @author Personal
 */
public class SoalETS2022No1 {
    public static void main(String[] args){
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                for(int k=1; k<i+j; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
