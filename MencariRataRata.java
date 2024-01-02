
import java.util.Scanner;


public class MencariRataRata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int banyakbilangan;
        System.out.println("Masukkan banyak bilangan yang ingin dihitung");
        banyakbilangan= input.nextInt();
        double total=0;
        
        int[] angka = new int[banyakbilangan];
        
        for(int i=0; i < banyakbilangan ; i++){
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
            total +=angka[i];
        }
        System.out.println("Angka yang dimasukkan: ");
        for (int i = 0; i < banyakbilangan; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println("Maka rata-ratanya adalah " + total/banyakbilangan);
    }
}
