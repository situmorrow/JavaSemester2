
package qwerty;
import java.util.Scanner;

public class LatihanQuizPilihanLuasdanVolume {
    public static void main(String[] args){
        int pilihan;
        int p,l,t;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Mengitung Luas Persegi Panjang");
        System.out.println("2.Mengitung Luas Persegi");
        System.out.println("3.Mengitung Volume Balok");
        System.out.println("4.Mengitung Volume Kubus");
        
        System.out.println("Pilih Menu");
        pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1:
                System.out.println("Masukkan Panjang");
                p = input.nextInt();
                System.out.println("Masukkan Lebar");
                l = input.nextInt();
                System.out.println("Luasnya adalah " + p*l);
                break;
                
            case 2:
                System.out.println("Masukkan Panjang Sisi");
                p = input.nextInt();
                System.out.println("Luasnya adalah " + p*p);
                break;
                
            case 3:
                System.out.println("Masukkan Panjang");
                p = input.nextInt();
                System.out.println("Masukkan Lebar");
                l = input.nextInt();
                System.out.println("Masukkan Tinggi");
                t = input.nextInt();
                System.out.println("Volumenya adalah " + p*l*t);
                break;
                
            case 4:
                System.out.println("Masukkan Panjang");
                p = input.nextInt();
                System.out.println("Volumenya adalah " + p*p*p);
                break;
            
            default:
                System.out.println("Tidak terdapat dimenu");
        }
    }
}
