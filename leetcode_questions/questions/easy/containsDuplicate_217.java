import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Iterate through each number in the array
        for (int num : nums) {
            // If the number is already in the set, we found a duplicate
            if (numbers.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            numbers.add(num);
        }

        // No duplicates found
        return false;
    }
}

//    Time: O(n)
//    Space: O(n)

