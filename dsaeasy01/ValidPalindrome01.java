package dsaeasy01;

import java.util.regex.Pattern;

public class ValidPalindrome01 {

    private static final Pattern NON_ALPHANUMERIC = Pattern.compile("[^a-z0-9]");

    public static void main(String[] args) {


        String str = "";


        String result =  NON_ALPHANUMERIC.matcher(str.toLowerCase()).replaceAll("");

        System.out.println(result);

        System.out.println(checkPalindrome(result));


    }

    private static boolean checkPalindrome(String str){
        char[] ch = str.toCharArray();

        int start = 0, end = ch.length-1;

        while (start<end){
            if (ch[start]!=ch[end]){return false;}
            start++;
            end--;
        }

        return true;

    }


}
