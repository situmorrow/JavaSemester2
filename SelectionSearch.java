import java.util.Scanner;

public class SelectionSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bilangan = {24,11,15,7,32,18,21,27};
        System.out.print("Bilangan Yang Dicari: ");
        int bilCari = sc.nextInt();
        
        boolean ditemukan = seqSearch(bilangan, bilCari);
        if(ditemukan)
        System.out.println("Data ditemukan.");
        else
        System.out.println("Data tidak ditemukan");
    }
    public static boolean seqSearch(int[] data, int cari){
        boolean found = false;
        int i=0;
        while(!found && i< data.length){
            if(data[i] == cari)
                found = true;
            else
                i +=1;
        }
        return found;
                      
        }
    }
}
