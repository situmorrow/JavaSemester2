
package praktikum.array;


public class PraktikumArray {

    public static void main(String[] args) {
        int [] arr = {16,4,4,10,10,10,10,90,27,3,12,28,50,50,50,30,30};
        int n = arr.length;
        int temp =0;
        int median=0;
        int mean =0;
        int total =0;
        
        //mengurutkan array
        for(int i=0; i<n;i++){
            for(int j=1;i<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        System.out.println("Hasil Pengurutan: ");
        for(int i=0; i<n ;i++){
            total = total + arr[i];
            System.out.print(arr[i]);
            System.out.print(" ");

        }

    }
    
}
