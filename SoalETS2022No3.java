/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwerty;

/**
 *
 * @author Personal
 */
public class SoalETS2022No3 {
    public static void main(String[] args){
        int hasil=0,i;
        for(i=1; i<20 ; i++){
            if(i % 3 == 0){
            System.out.print(i + " ");
            hasil = hasil+i;
            }
        }
        System.out.println(hasil);
    }
}
