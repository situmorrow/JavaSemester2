
import java.util.Scanner;

public class PangkatRekursif {
   
   public static int pangkatRekursif(int x, int y) {
      if (y == 0) {
         return 1;
      }
      else {
         return x * pangkatRekursif(x, y - 1);
      }
   }
   public static void main(String[] args) {
       
    int angka, pangkat;
     //Scanner a=new Scanner(System.in);
        //System.out.print("Masukkan angka: ");
    angka=2;
    
    //System.out.print("Masukkan pangkat: ");
    //Scanner b=new Scanner(System.in);
    pangkat=3;
    System.out.println(angka+" dipangkatkan "+pangkat+" = "+pangkatRekursif(angka,pangkat));
   }
}
    

