import java.util.Scanner;
public class TugasPraktikumNo2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        n= input.nextInt();
        System.out.println("i\tm(i)");
        System.out.println("----------------------------");
        for(int j=1; j<=n; j++){
            System.out.println(j+"\t"+hitungDeret(j));
        }
    }
    public static double hitungDeret(int i){
        double hasil=0;
        for(double n=1; n<=i; n++){
            hasil += n/(n+1);
        }
        return hasil;
    }
}
