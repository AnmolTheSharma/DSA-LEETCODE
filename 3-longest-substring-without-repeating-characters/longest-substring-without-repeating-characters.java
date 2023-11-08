class Solution {


public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int maxLength = 0;
    int i = 0;
    int j = 0;
    HashSet<Character> uniqueChars = new HashSet<>();

    while (j < n) {
        if (!uniqueChars.contains(s.charAt(j))) {
            uniqueChars.add(s.charAt(j));
            j++;
            maxLength = Math.max(maxLength, j - i);
        } else {
            uniqueChars.remove(s.charAt(i));
            i++;
        }
    }

    return maxLength;
}

}