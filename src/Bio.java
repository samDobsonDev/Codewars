// Codewars - DNA to RNA Conversion - 8 kyu
public class Bio {
    public String dnaToRna(String dna) {
        //DNA = GCAT
        //RNA = GCAU
        StringBuilder dnaString = new StringBuilder(dna);
        int i;
        for (i = 0; i < dnaString.length(); i++) {
            if (dnaString.charAt(i) == 'T') {
                dnaString.setCharAt(i, 'U');
            }
        }
        return dnaString.toString();
    }
}