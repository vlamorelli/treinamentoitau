package br.com.letscode.turmaitau.sequencialetra;

public class SolucaoProfessor {

    public void substring(String[] input) {
        String longestSequence = "";
        String sequence = "";
        for (String s : input) {
            for (int i = 0; i < s.length(); i++) {
                sequence = extracted(s.charAt(i), s.substring(i+1));
                if (sequence.length() > longestSequence.length()) {
                    longestSequence = sequence;
                }
            }
        }
        System.out.println(longestSequence);
    }

    private String extracted(char c, String s) {
        if (s.isEmpty() || c > s.charAt(0)) {
            return c+"";
        }
        return c + extracted(s.charAt(0), s.substring(1));
    }

}
