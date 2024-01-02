
package qwerty;

public class LatihanQuizUbahForkeDoWhile {
    public static void main(String[] args){
        int sum = 0;
        int i =1;
        do{
            i++;
            if(i % 3 == 0) continue;
            sum += i;
        } while (i < 10);
        System.out.println(sum);
    }
}
