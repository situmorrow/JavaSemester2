import java.util.Scanner;
public class MencariKPKdanFPB2bilangan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Masukkan bilangan 1 dan 2 dengan bilangan bilangan 1 > bilangan 2");
        System.out.println("Masukkan bilangan 1:");
        a = input.nextInt();
        System.out.println("Masukkan bilangan 1:");
        b= input.nextInt();
        
        if(a % b !=0){
            while(a % b == 0){
                c = a % b;
                a = b;
                b = c;
                if(a % b == 0){
                   System.out.println( b); 
                }
                else continue;
                
            }
        }
        else System.out.println( b);
    }
}
