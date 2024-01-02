import java.util.Scanner;
public class SoalLatihan10AprilNomor2 {
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        int rata = sum(num1, num2, num3);
        System.out.println("Rata-rata bilangan tersebut adalah " + (rata/3));
        
    }
    public static int sum(int i, int j, int k){
        int jumlah=0;
        jumlah=i+j+k;
        
        return jumlah;
    }
}
