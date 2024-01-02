import java.util.Scanner;
public class SoalLatihan10AprilNomor4 {
    public static void main(String[] args){
        String kata;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat yang ingin dihitung hurufnya:");
        kata = input.nextLine();
        int jumlah = huruf(kata);
        System.out.println("Jumlah huruf pada kalimat" + kata +" jumlah "+ jumlah);
        
    }
    public static int huruf(String katamethod){
        int hitung =0;
        katamethod = katamethod.toLowerCase();
        for(int i= 0; i<katamethod.length(); i++)
            if (katamethod.charAt(i)== ' ') {
                continue;
            }
            else hitung++;
        
        return hitung;
    }
}
