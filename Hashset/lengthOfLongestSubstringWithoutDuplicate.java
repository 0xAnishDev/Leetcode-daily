class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxSize = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));

            maxSize = Math.max(maxSize, i - left + 1);
            set.add(s.charAt(i));

            maxSize = Math.max(maxSize, i - left + 1);
        }
        return maxSize;
    }
}
