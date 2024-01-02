import java.util.Scanner;
public class SoalEAS2021No3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int angka = input.nextInt();
        int banyak = input.nextInt();
        System.out.println(format(angka,banyak));
    }
    public static String format(int bilangan, int p){
        boolean found = false;
        String bilanganbaru = Integer.toString(bilangan);
        while(bilanganbaru.length()< p){
            bilanganbaru="0"+bilanganbaru;
        }
        return bilanganbaru;
    }
    
}
