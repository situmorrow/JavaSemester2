
package qwerty;

import java.util.Scanner;


public class LatihanBintang {
    public static void main(String[] args){
        int bintang;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah baris");
        bintang = input.nextInt();
        for(int i=1; i<=bintang; i++){
            
            for(int k = 1; k<= i-1; k++){
                System.out.print("*");
            }
          System.out.println("*");  
        }
        for(int i=bintang-2; i>=1; i--){
            
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
          System.out.println("*");  
        }
    }
}
