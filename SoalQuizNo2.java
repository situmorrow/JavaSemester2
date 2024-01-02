import java.util.Scanner;
public class SoalQuizNo2 {
    public static void main(String[] args){
        int pin, pinbenar=212121;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pin anda: ");
        
        for(int i=1; i<=3; i++){
           pin = input.nextInt();
           if(pin != pinbenar){
               System.out.println("PIN Anda salah. Silahkan masukkan kembali");
               if(i==3) System.out.println("Ditolak");
            }   
           else {
               System.out.println("PIN Anda benar. Silahkan lakukan tarik tunai");
               break;
           }
        } 
        
    }
}
