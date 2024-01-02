import java.util.Scanner;
public class SoalETS2023No8 {
    public static void main(String[] args){
        int tahun1,tahun2,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun pertama: ");
        tahun1 = input.nextInt();
        System.out.print("Masukkan tahun kedua: ");
        tahun2 = input.nextInt();
        for(int i=tahun1;tahun1<=tahun2;i++){
            hari(i);
            sum += hari(i);
        }
        System.out.println("Jumlah hari dari 1 Januari "+tahun1+" ke 31 Desember "+tahun2+" adalah "+ sum +" hari");
    }
    public static int hari (int kabisat1){
        int jumlahhari;
        if(kabisat1 %4==0) jumlahhari=366;
        else jumlahhari =365;
        return jumlahhari;
    }
}
