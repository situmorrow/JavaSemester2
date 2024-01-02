import java.util.Scanner;
public class MencariBilanganFibonancciRekursif {
    public static void main(String[] args) {
        int a;
        System.out.print("Masukkan ke-n untuk fibonancci: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for(int i=0; i<=a; i++){
        System.out.print(fibo(i) + " ");
        }
    }
    public static int fibo( int angka){
        if(angka==0) return 0;
        else if(angka==1||angka ==2) return 1;
        else{
            return fibo(angka-1)+fibo(angka-2);
        }
        
        
    }
}
