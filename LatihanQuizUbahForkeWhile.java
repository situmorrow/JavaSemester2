
package qwerty;

public class LatihanQuizUbahForkeWhile {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        
        while (i < 10){
            i++;
            if(i % 3 == 0) continue;
            sum +=i;
        }
        System.out.println(sum);
    }
}
