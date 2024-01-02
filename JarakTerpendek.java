
import java.util.Arrays;
public class JarakTerpendek {
    public static void main(String[] args) {
        double [][] titik = {{2,2},{4,4},{6,9},{7,5},{8,4}};
        for(int i=0;i<titik.length;i++){
            for(int j=titik.length-1;j>i;j--){
                System.out.println("jarak titik "+ Arrays.toString(titik[i])+ " ke titik "+ Arrays.toString(titik[j])+" adalah "+JarakAntarTitik(titik[i],titik[j]));
            }
        }
    }
    public static double JarakAntarTitik(double[] titik1, double[] titik2){
        double d = Math.sqrt(Math.pow(titik1[0]-titik2[0],2)+Math.pow(titik1[1]-titik2[1],2));
        return d;
        
    }
}