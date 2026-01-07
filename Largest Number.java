class Solution {
    public String largestNumber(int[] nums) {

        int n = nums.length;

        
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String s1 = arr[i] + arr[j];
                String s2 = arr[j] + arr[i];

                if (s1.compareTo(s2) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if (arr[0].equals("0")) {
            return "0";
        }

        String result = "";
        for (int i = 0; i < n; i++) {
            result += arr[i];
        }

        return result;
    }
}