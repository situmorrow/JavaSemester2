
public class SoalLatihan10AprilNomor1 {
    public static void main(String[] args){
        int num1=25;
        int num2=27;
        int num3=29;
        int bilangankecil = kecil(num1, num2, num3);
        System.out.println("Bilangan terkecil pada bilangan tersebut adalah " + bilangankecil);
        
    }
    public static int kecil(int i, int j, int k){
        int result;
        if(i<j && i<k) result=i;
        else if(j<k && j<i) result=j;
        else result=k;
        
        return result;
    }
}