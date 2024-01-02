import java.util.Scanner;
public class LatihanJumlahKuadratBilanganGanjil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, sum=0, x=1, y;
        System.out.println("Masukkan nilai n");
        n = input.nextInt();
        
        for(int i=1; i<=n; i++){
            if(i % 2 == 0) continue;
            for(int j=1; j<=i ; j++ ){
                x=x*i;
                System.out.print(x + " ");
            }
            sum +=x;
            
        }
        System.out.print(sum);
    }
}
