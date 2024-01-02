import java.util.Scanner;
public class SoalETS2023No3 {
    public static void main(String[] args){
        int a,b,jumlah,kurang,kali,bagi,sisa;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama:");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua:");
        b = input.nextInt();
        jumlah=a+b;
        kurang=a-b;
        kali=a*b;
        bagi=a/b;
        sisa=a%b;
        System.out.println( a + "+" + b + "=" + jumlah );
        System.out.println( a + "-" + b + "=" + kurang );
        System.out.println( a + "x" + b + "=" + kali );
        System.out.println( a + "/" + b + "=" + bagi );
        System.out.println( a + "mod" + b + "=" + sisa );
    }
}
