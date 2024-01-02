
public class TesCoding {
    public static void main(String [] args){
    String sentence = "Aku suka pemrograman dan ingin mahir.";
    char letter = 'z';

    int occurrenceOfChar = 0;

    for (int i = 0; i < sentence.length(); i++) 
    {
        if (sentence.charAt(i) == letter) {
            occurrenceOfChar++;
        }
        
    }
    if( occurrenceOfChar == 0) System.out.println("Tidak ada huruf '"+letter+"' pada kalimat");

    else System.out.println("Huruf '" + letter + "' muncul " + occurrenceOfChar+ " kali dalam kalimat tersebut ");
    }
}
