import java.util.Scanner;


public class MencariFibonancciIterasi {
    public static void main(String[] args) {
        int a,jumlah=0;
        System.out.print("Masukkan ke-n untuk fibonancci: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        int fib1 = 1;
        int fib2 = 1;
        for(int i=1; i<=a; i++){
            if(i==1 || i==2) System.out.print(fib1 +" ");
            else if(i>1) {
                jumlah =fib1+fib2;
                System.out.print(jumlah +" ");
                fib1=fib2;
                fib2=jumlah;
            }
        }
    }
}
