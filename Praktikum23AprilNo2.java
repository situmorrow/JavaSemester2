import java.util.Scanner;
public class Praktikum23AprilNo2 {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2!=0 && i%3==0) System.out.println(i);
        }
    }
}
