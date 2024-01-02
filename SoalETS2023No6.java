import java.util.Scanner;
public class SoalETS2023No6 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.print("Masukkan integer positif: ");
        long n = inp.nextLong();
        System.out.println(n + "--> "+ f(n));
        System.out.println("25 --> "+ f(25));
        System.out.println("13579 --> " + f(13579));
    }
    public static int f(long n){
        int hasil = 0;
        while(n !=0){
            hasil += n%10;
            n /=10;
        }
        return hasil;
    }
}
