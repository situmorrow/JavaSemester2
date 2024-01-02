
public class SoalEAS2021No5 {
    public static void main(String[] args) {
        System.out.println(func(5));
    }
    public static int func(int n) {
        if(n==0) return 1;
        else return func(n-1)+3;
    }
}

