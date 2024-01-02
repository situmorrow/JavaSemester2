
package qwerty;
import java.util.Scanner;

public class Habisdibagi2dan3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan 1 bilangan");
        int n = input.nextInt();
        
        if(n % 2 == 0 && n%3 == 0){
            System.out.println(n + "Habis dibagi 2 dan 3");
        }
        else if(n % 2 == 0 && n%3 !=0){
            System.out.println(n + "Habis dibagi 2 dan tidak habis dibagi 3");
        }
        else if(n % 2 != 0 && n%3 == 0){
            System.out.println(n + "Tidak habis dibagi 2 dan habis dibagi 3");
        }
        else{
            System.out.println(n + "Tidak habis dibagi 2 dan 3");
        }
        
    }
}
