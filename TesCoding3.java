import java.util.Scanner;
public class TesCoding3 {
     public static boolean isPal(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        return isPal(s.substring(1, s.length()-1));
        return false;
    }

    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Kata atau kalimat:");
        String string = scanner.nextLine();
       
        if(isPal(string))
            System.out.println(string + " adalah palindrom");
        else
            System.out.println(string + " bukan palindrom");
    }

}
