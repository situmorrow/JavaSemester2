import java.util.Scanner;
public class MetodaRekursifPangkat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        //bilangan utama
        System.out.print("Masukkan bilangan utama: ");
        a= input.nextInt();
        //bilangan pangkat
        System.out.print("Masukkan pangkat: ");
        b= input.nextInt();
        System.out.println(a+ " pangkat "+b+" adalah "+ pangkat(a,b));
        
    }
    public static int pangkat(int angka1,int angka2){
        if(angka2 ==0) return 1;
        else return angka1*pangkat(angka1,angka2-1);
    }
}
