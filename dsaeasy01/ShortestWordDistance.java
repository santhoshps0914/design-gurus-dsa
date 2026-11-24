package dsaeasy01;

public class ShortestWordDistance {

    public static void main(String[] args) {

        String[] words = {"a", "b", "c", "d", "e"};
        String word1 = "a";
        String word2 = "e";

        int distance = shortestDistance(words,word1,word2);

        System.out.println("distance between two words is: "+distance);


    }

    private static int shortestDistance(String[] words, String word1, String word2){

        int word1Index = -1;
        int word2Index = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {

            if (!word1.equalsIgnoreCase(word2) && word1.equalsIgnoreCase(words[i])){
                word1Index = i;
                if (word2Index != -1) {
                    int distance = Math.abs(word1Index - word2Index);
                    minDistance = Math.min(minDistance, distance);
                }
            }

            if (!word1.equalsIgnoreCase(word2) && word2.equalsIgnoreCase(words[i])){
                word2Index = i;
                if (word1Index != -1) {
                    int distance = Math.abs(word1Index - word2Index);
                    minDistance = Math.min(minDistance, distance);
                }
            }
        }

        return minDistance;
    }

    public int shortestDistanceBetterSolution(String[] words, String word1, String word2) {
        int shortestDistance = words.length;
        int first = -1;
        int second = -1;


        // loop through words and set shortest distance each round
        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(word1)) {
                first = i;
            }

            if (words[i].equals(word2)) {
                second = i;
            }

            if (first != -1 && second != -1) {
                shortestDistance = Math.min(shortestDistance, Math.abs(first - second));
            }
        }

        return shortestDistance;
    }


}
