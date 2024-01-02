import java.util.Scanner;
public class EAS2022No4 {
    public static void main(String[] args) {
        String passbenar= "Agus1234";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password anda: ");
        String pass = input.next();
        System.out.println(cek(pass,passbenar));
    }
    public static String cek(String tes1, String tes2){
        if(tes1.length()!=8) return "Password salah";
        else{
              if(tes1.equals(tes2)) {
                  return "Password benar";
              }
              else return "Password salah" ;
            
        }
    }
}
