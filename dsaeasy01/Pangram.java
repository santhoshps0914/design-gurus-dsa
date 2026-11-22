package dsaeasy01;

public class Pangram {

    public static void main(String[] args) {

        boolean isPangram = checkIsPangram("TheQui =ckBrownFoxJumpsOverTheLazyDog");

        System.out.println("given sentence is a pangram:"+isPangram);

    }

    private static boolean checkIsPangram(String sentence) {

        boolean[] visited = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c>='A' && c<='Z') visited[c - 'A'] = true;
            if (c>='a' && c<='z') visited[c - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!visited[i]) return false;
        }

        return true;

    }

}
