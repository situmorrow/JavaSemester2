
public class Nomor1 {
    public static void main(String[] args){
        int [] arr = {23,6,47,35,2,14};
        int n = arr.length;
        int temp =0;
        int total=0;
        //mengurutkan array
        for(int i=0; i<n; i++){
            for(int j=1; j<(n); j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Hasil Pengurutan ");
        for(int i =0; i<n; i++){
            total=total+arr[i];
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        //Hitung Rata-Rata
        double rata= total/n;
        System.out.println("Rata-rata pada array tersebut adalah "+ rata);
        
        //Data Maksimum dan Minimum
        max(arr);
        min(arr);
        
        //bilangan ganjil
        System.out.println("Bilangan ganjil dari array tersebut adalah");
        for(int i =0; i<n; i++){
            if(arr[i]%2 !=0){
            System.out.print(arr[i]);
            System.out.print(" ");
            }
        }
        System.out.println(" ");
        
        //bilangan prima
        System.out.println("Bilangan prima dari Array tersebut adalah ");
        for(int i =0; i<n; i++){
            boolean prima = true;
            for(int j=2; j<(arr[i]-1);j++)
                if(arr[i] % j ==0){
                prima = false;
                break;
            }
            if(prima && arr[i] >1){
            System.out.print(arr[i] + " ");
        }
        
        }
    }
    
    public static void max(int[] isi1){
        int maksimum=isi1[0];
        for(int i=1;i<isi1.length; i++){
            if(maksimum<isi1[i]) maksimum=isi1[i];
            
        }
        System.out.println("Nilai maksimum dari array tersebut adalah "+ maksimum);
    }
    
    public static void min(int[] isi1){
        int minimum=isi1[0];
        for(int i=1;i<isi1.length; i++){
            if(minimum>isi1[i]) minimum=isi1[i];
            
        }
        System.out.println("Nilai minimum dari array tersebut adalah "+ minimum);
    }
}
