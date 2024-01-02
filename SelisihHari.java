
package qwerty;
import java.util.Scanner;

public class SelisihHari {
    public static void main(String[] args){
        int tahun,bulan,tglawal,selisihhari;
        
        Scanner input = new Scanner(System.in);
        tahun = input.nextInt();
        bulan = input.nextInt();
        tglawal = input.nextInt();
        
        
        switch(bulan){
            case 1:
               selisihhari = 31-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 2:
                if(tahun%4==0){
                    selisihhari = 29-tglawal+1;
                    System.out.println(selisihhari);
                }
                else {
                    selisihhari = 28-tglawal+1;
                    System.out.println(selisihhari);
                }
               break;
            case 3:
               selisihhari = 31-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 4:
               selisihhari = 30-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 5:
               selisihhari = 31-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 6:
               selisihhari = 30-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 7:
               selisihhari = 31-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 8:
               selisihhari = 31-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 9:
               selisihhari = 30-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 10:
               selisihhari = 31-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 11:
               selisihhari = 30-tglawal+1;
               System.out.println(selisihhari);
               break;
            case 12:
               selisihhari = 31-tglawal+1;
               System.out.println(selisihhari);
               break;
            
        }
    }
}
