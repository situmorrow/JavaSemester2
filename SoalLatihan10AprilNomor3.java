import java.util.Scanner;
public class SoalLatihan10AprilNomor3 {
    public static void main(String[] args){
        String kalimat;
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan masukkan kalimat Anda");
        kalimat = input.nextLine();
        int jumlah = vokal(kalimat);
        System.out.println("Jumlah huruf vokal pada kalimat " + kalimat + " adalah " + jumlah);
    }
    public static int vokal(String kalimatmethod){
        int hitung =0;
        kalimatmethod = kalimatmethod.toLowerCase();
        for(int i=0; i<kalimatmethod.length(); i++){
            char huruf = kalimatmethod.charAt(i);
            if(huruf == 'a'|| huruf == 'e'|| huruf =='i'|| huruf == 'o'|| huruf == 'u')
                hitung++;
        }
        return hitung;
    }
}
