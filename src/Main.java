import Maps.HashMaps;

public class Main {

    public static void main(String[] args) {
       String paragraph = "The sun rises in the east and sets in the west." +
               " The sky is blue during the day and dark during the night." +
               " The sun is a star and the moon is not a star." +
               " Stars are far away and the moon is not far." +
               " The sky full of stars at night is a beautiful sight.";

       String text = "the";
       HashMaps maps = new HashMaps();
        System.out.println(maps.wordFrequencyCalc(paragraph, text));
        System.out.println(maps.wordFrequencyCalc(paragraph, "star"));
        System.out.println(maps.wordFrequencyCalc(paragraph, "is"));
        System.out.println(maps.wordFrequencyCalc(paragraph, "night"));


    }
}