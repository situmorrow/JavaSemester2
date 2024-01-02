import java.util.Scanner;
public class EAS2022No2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sembarang angka: ");
        n= input.nextInt();
        System.out.println(aneh(n));
    }
    public static int aneh(int a){
        int jumlah=0;
        while(a>0){
            jumlah += a%10;
            a /=10;
        }
        return jumlah;
    }
}
