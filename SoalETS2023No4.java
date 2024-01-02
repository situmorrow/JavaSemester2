import java.util.Scanner;
public class SoalETS2023No4 {
    public static void main(String[] args){
        int berat;
        double tinggi, bmi;
        Scanner input =new Scanner(System.in);
        System.out.print("Masukkan berat badan anda(dalam kilogram): ");
        berat = input.nextInt();
        System.out.print("Masukkan berat tinggi anda(dalam meter): ");
        tinggi = input.nextDouble();
        bmi = berat/(tinggi*tinggi);
        if (bmi < 18.5) System.out.println("Kurus");
        else if (bmi >= 18.5 && bmi< 25) System.out.println("Normal");
        else if (bmi >= 25 && bmi < 30) System.out.println("Gemuk");
        else System.out.println("Gendut");
    }
}
