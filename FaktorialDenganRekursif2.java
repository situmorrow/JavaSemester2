import java.util.Scanner;
public class FaktorialDenganRekursif2 {
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan bilangan n faktorial: ");
        n= input.nextInt();
        System.out.println(" ");
        bilangan(n);
        System.out.println(n+ " Faktorial adalah "+ bilangan(n));
        
    }
    public static int bilangan(int angka){
        if(angka == 0 || angka ==1){
            return 1;
        }
        else{
            return angka* bilangan(angka-1);
        }
    }
    
}
