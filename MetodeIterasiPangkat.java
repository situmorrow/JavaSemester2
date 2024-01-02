package qwerty;
import java.util.Scanner;

public class MetodeIterasiPangkat {
    public static void main( String[] args){
      int a,n;
      Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan utama: ");
        a = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        n = input.nextInt();
        int jumlah = 1;
        if(n==0) jumlah=1;
        else{
            for(int i=1; i<=n;i++){
                jumlah *= a; 
            }
        }
        System.out.println("Hasi dari "+a+" pangkat "+n+" adalah "+ jumlah);

    }
}
