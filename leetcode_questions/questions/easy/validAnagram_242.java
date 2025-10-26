class Solution_242 {
    public boolean validAnagram_242(String s, String t) {

        // Step 1: If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create an array to store character counts for 26 lowercase letters
        int[] charCounts = new int[26];

        // Step 3: Traverse both strings simultaneously
        // - Increment for characters in s
        // - Decrement for characters in t
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // Step 4: Check if all counts are zero
        // If not zero, it means extra/missing characters exist
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        // Step 5: If all counts match, s and t are anagrams
        return true;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
