
package qwerty;


public class SoalETS2021No1 {
        public static void main(String[] args) {
            int x = 5, y = 7;
            System.out.println("x1 = " + x + ", y1 = " + y);
            haha(x, y);
            System.out.println("x2 = " + x + ", y2 = " + y);
        }
        
        public static void haha(int x, int y) {
            int hihi = x;
            x = y;
            y = hihi;
            System.out.println("x3 = " + x + ", y3 = " + y);
        }
}
