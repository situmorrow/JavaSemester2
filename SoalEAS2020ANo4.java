import java.util.Scanner;
public class SoalEAS2020ANo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin di faktorial: ");
        int n = input.nextInt();
        System.out.println(n+" faktorial adalah "+faktorial(n));
    }
    public static int faktorial(int a){
        if(a==1) return 1;
        else return a*faktorial(a-1);
        
                
    }
}
