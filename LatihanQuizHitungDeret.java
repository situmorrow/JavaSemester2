
package qwerty;
import java.util.Scanner;

public class LatihanQuizHitungDeret {
    public static void main(String[] args){
        double jumlah=0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya (n) yang ingin anda jumlah bilangan");
        int n = input.nextInt();
        
        for(double i=1; i <=n; i++){
            double bentuk= 1/i;
            jumlah= jumlah+bentuk;
        }
        System.out.println(jumlah);
    }
    
}
