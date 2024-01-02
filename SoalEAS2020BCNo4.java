
import java.util.Arrays;


public class SoalEAS2020BCNo4 {
    public static void main(String[] args) {
        //jawaban a
        int [][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][] b={{4,3,2,1},{8,7,6,5},{12,11,10,9}};
        //jawaban b dan c
        int [][] jumlah= new int [3][4];
        for(int i=0; i<a.length;i++){
            for(int j=0;j<4;j++){
                jumlah [i][j]=a[i][j]+b[i][j];
                
            }
        }
        for (int[] row : jumlah) {
            System.out.println(Arrays.toString(row));
        }
    }
}
