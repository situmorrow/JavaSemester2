import java.util.Scanner;
public class SoalEAS2020ANo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] i = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int [] data = {6,9,10,13,17,18,21,22,24,26,30,31,34,35,45};
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = input.nextInt();
        if(search(cari,data,i)) System.out.println("Data ditemukan");
        else System.out.println("Data tidak ditemukan");
    }
    public static boolean search(int x,int [] y,int [] z){
        int tengah;
        boolean found = false;
        
        int atas=0, bawah= y.length-1;
        while(atas<=bawah && !found){
            tengah =(atas+bawah)/2;
            if(y[tengah]==x) found=true;
            else if(x<y[tengah]) bawah=tengah-1;
            else atas=tengah+1;
        }
        return found;
    }
    
}
