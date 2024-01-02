
public class SoalQuizNo1 {
    public static void main(String[] args){
        int sum=6, count;
        for(count=1; count<=20; count++){
            if(count % 2 == 0) sum=sum+count;
        }
        System.out.println(sum);
    }
}
