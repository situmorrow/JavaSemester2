import java.util.Scanner;
public class SoalEAS2020BCNo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.print(HitungMundur(n));
    }
    public static String HitungMundur(int a){
        if(a==0) return "blum";
        else return a+", "+HitungMundur(a-1);
    }
}
