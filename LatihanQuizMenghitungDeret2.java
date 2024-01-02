
package qwerty;
import java.util.Scanner;

public class LatihanQuizMenghitungDeret2 {
   public static void main(String[] args){
       double jumlah =0;
       
       Scanner input = new Scanner(System.in);
       System.out.println("Masukkan berapa bilangan (n) yang akan dijumlah");
       double n = input.nextDouble();
       
       for(double i=1; i<=n; i++){
           double bentuk = 1/(i*(i+2));
           jumlah = jumlah + bentuk;
       }
       System.out.println(jumlah);
       
   }
}
