
package qwerty;

public class PraktikumSoal2 {
    public static void main(String[] args){
        int angka[] ={2,3,-4,5};
        int sumpo = 0;
        int sumne = 0;
       
        for(int i=0; i<4; i++){
            if(angka [i] > 0){
                sumpo= sumpo+ angka[i];
                
            }
            else if(angka [i] < 0){
                sumne= sumne+ angka[i];
                
            }
            
        }
        System.out.println(sumpo);
            System.out.println(sumne);
            
        
         
                 
    }
}
