
public class TugasPraktikumNo1 {
    public static double hitungDeret(int i){
        double hasil=0;
        for(double n=1; n<=i; n++){
            hasil += n/(n+1);
        }
        return hasil;
    }
    public static void main(String[] args) {
        System.out.println(hitungDeret(5));
    }
}
