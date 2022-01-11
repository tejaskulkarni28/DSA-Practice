package com.company;

class FindFirstAndLastPositionOfTheTarget {
    public static void main(String[] args){
        int target = 7;
        int[] arr = {1,2,3,4,5,6,7,7,7,7,7,7,7,8,9,10,11,12,13,14};
        callBS(arr, target);
    }
    static void callBS(int[] arr, int target){
        int[] ans = {-1, -1};
        ans[0] = binarySearch(arr, target, true);
        if(arr[0] != -1){
            ans[1] = binarySearch(arr, target, false);
        }
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
    static int binarySearch(int[] arr, int target, boolean value){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target < arr[mid]){
                high = mid - 1;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }else{
                // POTENTIAL ANSWER FOUND
                ans = mid;
                if(value){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }

        return ans;
    }
}
//class FindFirstAndLastPositionOfTheTarget {
//    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,4,5,5,5,5,6,7,8,9};
//        int target = 5;
//        searchRange(nums, target);
//    }
//
//    static void searchRange(int[] nums, int target) {
//
//        int[] ans = {-1, -1};
//        // check for first occurrence if target first
//        ans[0] = search(nums, target, true);
//        if (ans[0] != -1) {
//            ans[1] = search(nums, target, false);
//        }
//        System.out.println(ans[0]);
//    }
//
//    // this function just returns the index value of target
//    static int search(int[] nums, int target, boolean findStartIndex) {
//        int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < nums[mid]) {
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                // potential ans found
//                ans = mid;
//                if (findStartIndex) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//    }
//}