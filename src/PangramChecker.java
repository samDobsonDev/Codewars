// Codewars - Detect Pangram - 6 kyu
public class PangramChecker {
    public boolean check(String sentence){
        boolean[] mark = new boolean[26]; // boolean array to track if a character is present or not
        sentence = sentence.toLowerCase();; // convert to lower case for easy handling
        int currentIndex = 0;
        boolean pangram = true;

        for (int i = 0; i < sentence.length(); i++) { // for each character in the string
            if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') { // if the character is between a-z
                currentIndex = sentence.charAt(i) - 'a'; // find the index value of the character
            }
            mark[currentIndex] = true; // mark the index being checked to true in the boolean array
        }

        for (int i = 0; i < mark.length; i++) { // for each boolean in the array
            System.out.println(mark[i]);
            if (mark[i] == false) { // if the boolean equals false
                pangram = false;
            }
        }
        return pangram;
    }
}
