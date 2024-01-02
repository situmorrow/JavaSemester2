import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int panggilan_2;
    int harga;
    int jumlah_harga;
    Scanner input= new Scanner (System.in);
    System.out.println("Masukkan jumlah panggilan :");
    int panggilan=input.nextInt();
    if(panggilan <= 100){
      System.out.println("Harga : Rp" + 200000);
    }
    else if (panggilan>100 && panggilan <=150){
      panggilan_2 = panggilan - 100;
      harga = panggilan_2 * 600;
      jumlah_harga =200000 + harga;
      System.out.println("Harga : Rp" + jumlah_harga);
    }
    else if (panggilan>150 && panggilan <=200){
      panggilan_2 = panggilan - 150;
      harga = panggilan_2 * 500;
      jumlah_harga = 230000 + harga;
      System.out.println("Harga : Rp" + jumlah_harga);
    }
    else {
      panggilan_2 = panggilan - 200;
      harga = panggilan_2 * 400;
      jumlah_harga = harga + 255000;
      System.out.println("Harga : Rp" + jumlah_harga);
    }
   }
 }
