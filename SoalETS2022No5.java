
package qwerty;
import java.util.Scanner;

public class SoalETS2022No5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, i, x=1, y=-1;//x adalah bilangan awal 
        double sum = 0;
        System.out.print("Masukkan nilai n: ");
        n = input.nextInt();
        
        for(i=1; i<=n; i++){
            x=x*y;
        }
        for(int j=1; j<=n; j++){
            sum += x*(1/i);
        }
        System.out.println("Hasil= "+ sum);
    }
}
