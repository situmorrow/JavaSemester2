
public class EAS2022No3 {
    public static void main(String[] args) {
        int [][] array ={{1,2,3,4,-1},{5,6,7,8,-2},{9,10,11,12,-3}};
        System.out.println(m1(array) [0]);
        System.out.println(m1(array) [1]);
        System.out.println(m1(array)[2] );
    }
    public static int[] m1(int [] [] m){
        int [] h = new int[4];
        h[0] = m.length;
        h[1] = m[0].length;
        h[2] = m[1].length;
        h[3] = m[2].length;
        return h;
    }
}
