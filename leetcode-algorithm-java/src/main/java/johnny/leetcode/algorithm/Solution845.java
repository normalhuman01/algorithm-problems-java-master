package johnny.leetcode.algorithm;

/**
 * 845. Longest Mountain in Array
 * Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:
 * {@code B.length >= 3}
 * {@code There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]}
 * (Note that B could be any subarray of A, including the entire array A.)
 * <p>
 * Given an array A of integers, return the length of the longest mountain.
 * <p>
 * Return 0 if there is no mountain.
 * <p>
 * Example 1:
 * Input: [2,1,4,7,3,2,5]
 * Output: 5
 * Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
 * <p>
 * Example 2:
 * Input: [2,2,2]
 * Output: 0
 * Explanation: There is no mountain.
 * <p>
 * Note:
 * <pre>{@code
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * }</pre>
 * Follow up:
 * <p>
 * Can you solve it using only one pass?
 * Can you solve it in O(1) space?
 *
 * @author Johnny
 */
public class Solution845 {
    public int longestMountain(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }

        int longest = 0;
        int left = -1, right = -1;
        boolean peekFound = false;

        for (int i = 1; i < A.length; i++) {
            if (!peekFound) {
                if (A[i] > A[i - 1]) {
                    if (left == -1) {
                        left = i - 1;
                    }
                } else if (A[i] == A[i - 1]) {
                    left = -1;
                } else {
                    if (left != -1) {
                        peekFound = true;
                        right = i;
                    }
                }
            } else {
                if (A[i] < A[i - 1]) {
                    right = i;
                } else if (A[i] == A[i - 1]) {
                    longest = Math.max(longest, right - left + 1);
                    left = -1;
                    right = -1;
                    peekFound = false;
                } else {
                    longest = Math.max(longest, right - left + 1);
                    left = i - 1;
                    right = -1;
                    peekFound = false;
                }
            }
        }

        if (left != -1 && right != -1) {
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
