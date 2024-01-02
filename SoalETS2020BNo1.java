
package qwerty;
import java.util.Scanner;

public class SoalETS2020BNo1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bilangan, angkadasar;
        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();
        
        while(bilangan > 0){
            angkadasar = bilangan % 10;
            System.out.print(angkadasar + " ");
            bilangan /= 10;
        }
    }
}
