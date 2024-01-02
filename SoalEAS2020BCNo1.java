import java.util.Scanner;
public class SoalEAS2020BCNo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nilai minimum: ");
        int min = input.nextInt();
        System.out.print("Masukkan nilai maksimum: ");
        int max = input.nextInt();
        System.out.println("Jumlah deret(k^3) dari "+min+" sampai "+max+" adalah "+hitung(min,max));
    }
    public static int hitung(int a,int b){
        int jumlah=0;
        if(b<a) return jumlah;
        else{
            for(int i=a;i<=b;i++){
                jumlah += i*i*i;
            }
            return jumlah;
        }
    }
}
