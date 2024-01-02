import java.util.Scanner;
public class SoalETS2023No2 {
    public static void main(String[] args){
        int a=5, b=3, sn=0, un, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai n");
        n = input.nextInt();
        for(int i=0; i<n; i++){
            un= a+b*i;
            System.out.print(un + " + ");
            sn += un;
        }
        System.out.println("Jumlah suku ke-"+ n + " adalah "+ sn);
    }
}
