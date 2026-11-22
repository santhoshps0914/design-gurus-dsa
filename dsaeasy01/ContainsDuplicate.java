package dsaeasy01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {3,5,1,4,7,8,9};

         boolean isDuplicateExists = containsDuplicate(nums);
         boolean isDuplicateExistsByJava8streams = containsDuplicateByJava8Streams(nums);

         System.out.println(isDuplicateExists);
         System.out.println(isDuplicateExistsByJava8streams);
    }

    private static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else
                set.add(num);
        }

        return false;

    }

    private static boolean containsDuplicateByJava8Streams(int[] nums) {

        Set<Integer> set = new HashSet<>();

        return Arrays.stream(nums).anyMatch(e->!set.add(e));

    }

}
