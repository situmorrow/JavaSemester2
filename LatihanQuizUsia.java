
package qwerty;
import java.util.Scanner;

public class LatihanQuizUsia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan usia");
        int usia = input.nextInt();
        
        if(usia >0 && usia<=13){
            System.out.println("Anak-Anak");
        }
        else if(usia>13 && usia<=20){
            System.out.println("Remaja");
        }
        else if(usia>20 && usia<=55){
            System.out.println("Dewasa");
        }
        else{
            System.out.println("Manula");
        }
    }
}
