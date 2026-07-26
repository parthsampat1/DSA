class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end_idx = m + n - 1; // last valid index in nums1

        while (m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[end_idx] = nums1[m - 1];
                m--;
            } else {
                nums1[end_idx] = nums2[n - 1];
                n--;
            }
            end_idx--;
        }

        // Copy remaining nums2 elements if any
        while (n > 0) {
            nums1[end_idx] = nums2[n - 1];
            n--;
            end_idx--;
        }
    }
}
