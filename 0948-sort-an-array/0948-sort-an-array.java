class Solution {
    // Rename mergeSort to sortArray
    public static int[] sortArray(int nums[]) {
        if (nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < nums.length; i++) {
            right[i - mid] = nums[i];
        }

        left = sortArray(left); // Recursive call
        right = sortArray(right); // Recursive call

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {5, 2, 1, 3, 6};
        int[] sortedArray = sortArray(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
