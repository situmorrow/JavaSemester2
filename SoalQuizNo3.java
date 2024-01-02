
import java.util.Scanner;
public class SoalQuizNo3 {
    public static void main(String[] args){
        int a, b, x=1, d = 0, bil_1,bil_2, kecil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan_1: ");
        bil_1 = input.nextInt();
        System.out.println("Masukkan bilangan_2: ");
        bil_2 = input.nextInt();
        if(bil_1>bil_2) kecil=bil_2;
        else kecil=bil_1;
        for(x=1 ; x<=kecil; ){
            a= bil_1%x;
            b= bil_2%x;
            x=x+1;
            if(a==0 && b==0) d=x;
            else continue;
        }
        System.out.println(d);
    }
    
}
