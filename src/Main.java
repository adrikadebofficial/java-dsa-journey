import Array.ransomNote;

public class Main {

    public static void main(String[] args) {
        //unit test 1 -- expected output : false
    String ransomNote = "a";
    String magazine = "b";

    ransomNote _ransomSolution = new ransomNote();
    System.out.println(_ransomSolution.canConstruct(ransomNote,magazine));
//unit test 2 -- expected output : false
    ransomNote = "aa";
    magazine = "ab";

    System.out.println(_ransomSolution.canConstruct(ransomNote,magazine));
        //unit test 3 -- expected output : true
    ransomNote = "aa";
    magazine = "aab";


    System.out.println(_ransomSolution.canConstruct(ransomNote,magazine));

    }
}