package roadmap;

import java.util.HashMap;

import arraytopic.learn;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxlength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxlength = Math.max(maxlength, right - left + 1);
        }
        System.out.println(maxlength);
    }

}
