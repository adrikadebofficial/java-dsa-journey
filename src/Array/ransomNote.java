package Array;

public class ransomNote {

    public boolean canConstruct(String ransomNote, String magazine){
      int[] alphabet = new int[26];

      //magazine
        for(int c : magazine.toCharArray()){
            alphabet[c - 'a']++;
        }
        //ransomNote
        for(int c : ransomNote.toCharArray()){
            alphabet[c - 'a']--;
        }

        for(int i=0; i<alphabet.length; i++){
            if(alphabet[i] <0){
                return false;
            }
        }
        return true;

    }
}
