package dsaeasy01;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "rat"; String t = "car";

        boolean isAnagram = checkAnagram(s,t);

        System.out.println("is words anagram ? : "+isAnagram);


    }

    private static boolean checkAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();

        for (char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }

        return map.values().stream().allMatch(c->c==0);

    }

}
