
import java.util.Scanner;

public class LatihanDiskonBelanja {
   public static void main( String[] args){
       double totalbelanja;
       String status;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah anda member atau tidak(Ya/Tidak)");
        status = input.nextLine();
        
        
        if(status == "Ya"){
            System.out.println("Berapa total belanja anda");
            totalbelanja = input.nextDouble();
            
            if ( totalbelanja >= 100000 ){
                System.out.println("Anda tidak mendapat diskon");
            }
            else {
                System.out.println("Anda mendapat diskon 15000");
            }
        }
        else{
            System.out.println("Berapa total belanja anda");
            totalbelanja = input.nextDouble();
            
            if (totalbelanja >= 100000){
                System.out.println("Anda mendapat diskon 5000");
            }
            else{
                System.out.println("Anda tidak mendapat diskon");
            }
        }
    }
}
       
       

