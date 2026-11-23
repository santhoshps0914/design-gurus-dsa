package dsaeasy01;

public class ReverseVowels {

    public static void main(String[] args) {

        String str = "hello";

        System.out.println("with reversed vowels is: "+reverseVowels(str));

    }

    private static String reverseVowels(String str) {

        int start = 0;
        int end = str.length()-1;
        char[] ch = str.toCharArray();
        while (start<end){

            while (start<end && !isVowel(ch[start])){
                start++;
            }
            while (start<end && !isVowel(ch[end])){
                end--;
            }

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        return new String(ch);

    }

    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }



}
