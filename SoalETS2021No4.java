
package qwerty;
import java.util.Scanner;

public class SoalETS2021No4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bilangan, sum=0;
        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();
        
        while(bilangan > 0){
            sum += bilangan % 10;
            bilangan /= 10 ;
        }
        System.out.println(sum);
    }
}
