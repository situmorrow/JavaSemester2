
package qwerty;

public class PenjumlahanMatriks {
    public static void main(String[] args){
        int a [][]={{2,3},{6,3}};
        int b[][] ={{1,2},{9,8}};
        
        int jumlah[][]=new int [2][2];
        int kali[][]= new int [2][2];
        
        //jumlah
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                jumlah[i][j]=a[i][j]+b[i][j];
                System.out.print( jumlah[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    

}
