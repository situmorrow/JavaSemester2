
import java.util.Scanner;
public class FaktorialDenganIterasi {
    public static void main(String[] args) {
        int n;
        int jumlah =1;
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan bilangan n faktorial: ");
        n= input.nextInt();
        for(int i=n; i>0;i--){

            jumlah *=i;
        }
        System.out.println(jumlah);
        
    }
}
