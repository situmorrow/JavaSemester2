
package qwerty;
import java.util.Scanner;

public class SoalETS2022No5Cara2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, i;
        double sum =0;
        
        System.out.print("Masukkan nilai n: ");
        n = input.nextInt();
        
        for(i=1; i<=n; i++){
            sum += (Math.pow(-1,i+1))*(i/i);
        }
        System.out.println("Hasilnya= "+ sum);
    }
}
