// class Solution {

//     void Search(int[] nums, ArrayList<ArrayList<Integer>> arr, int i, int idx) {

//         // move to next number
//         if (idx == nums.length) return;

//         // stop if already more than 4 divisors
//         if (arr.get(idx).size() > 4) {
//             Search(nums, arr, 1, idx + 1);
//             return;
//         }

//         // stop divisor loop at sqrt
//         if (i * i > nums[idx]) {
//             Search(nums, arr, 1, idx + 1);
//             return;
//         }

//         if (nums[idx] % i == 0) {
//             arr.get(idx).add(i);

//             if (i != nums[idx] / i) {
//                 arr.get(idx).add(nums[idx] / i);
//             }
//         }

//         // move to next divisor
//         Search(nums, arr, i + 1, idx);
//     }

//     public int sumFourDivisors(int[] nums) {

//         ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             arr.add(new ArrayList<>());
//         }

//         Search(nums, arr, 1, 0);

//         int sum = 0;
//         for (int i = 0; i < arr.size(); i++) {
//             if (arr.get(i).size() == 4) {
//                 for (int ele : arr.get(i)) {
//                     sum += ele;
//                 }
//             }
//         }
//         return sum;
//     }
// }







class Solution {

    void Search(int[] nums, ArrayList<ArrayList<Integer>> arr) {

        for (int idx = 0; idx < nums.length; idx++) {
            int n = nums[idx];

            for (int i = 1; i * i <= n; i++) {

                if (n % i == 0) {
                    arr.get(idx).add(i);

                    if (i != n / i) {
                        arr.get(idx).add(n / i);
                    }

                   
                    if (arr.get(idx).size() > 4) break;
                }
            }
        }
    }

    public int sumFourDivisors(int[] nums) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(new ArrayList<>());
        }

        Search(nums, arr);

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).size() == 4) {
                for (int ele : arr.get(i)) {
                    sum += ele;
                }
            }
        }
        return sum;
    }
}

