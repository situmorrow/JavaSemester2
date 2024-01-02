package qwerty;
import java.util.Scanner;
public class PraktikumSoal1 {
    public static void main(String[] args){
        int banyakpanggilan;
        int c,d,e,f,w,x,y,z; //x adalah hasil dari pengurangan banyak panggilan
        int a =200000;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah panggilan");
        banyakpanggilan = input.nextInt();
        
        if(banyakpanggilan<= 100){
            System.out.println("Biaya yang harus dibayar adalah Rp 200000");
        }
        else if(banyakpanggilan <= 150 && banyakpanggilan > 100){
            x=banyakpanggilan-100;
            y=x*600+a;
            System.out.println("biaya yang harus dibayar Rp " + y);
        }
        else if(banyakpanggilan <= 200){
            c=banyakpanggilan-150;
            z= a+50*600+c*500;
            System.out.println("Biaya yang harus dibayar Rp " + z); 
        }
        else {
            d=banyakpanggilan-200;
            f=a+50*600+50*500+d*400;
            System.out.println("biaya yang harus dibayar Rp" + f);
        }
    }
}
