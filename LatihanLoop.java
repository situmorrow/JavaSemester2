
package qwerty;

import java.util.Scanner;


public class LatihanLoop {
    public static void main(String[] args){
        int angka;
        double jumlahkuadrat =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan range bilangan");
        angka = input.nextInt();
        
        //untuk kuadrat ganjil
        for(int i=1; i<= angka; i++){
            if(i % 2 != 0 ){
                System.out.println("Bilangan ganjil adalah " + i);
                jumlahkuadrat = i*i+ jumlahkuadrat;
            }
                
        }
        System.out.println("Jumlah kuadrat bilangan ganjil tersebut adalah " + jumlahkuadrat);
    }
}
