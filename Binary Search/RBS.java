public class RBS {
    public static void main(String[] args) {
        int [] nums = {3, 3, 3, 1, 2, 3};
        int target = 2;
        System.out.println(search(nums, target));

    }
//    https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1572282210/

    static int search(int[] nums, int target) {
        int Pivot = findPivotWithDuplite(nums);
        // if you did not find a pivot, it means the array is not rotated
        if(Pivot == -1) {
            //just do normal binarySearch
            return binarySerch(nums, target, 0, nums.length-1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if(nums[Pivot] == target) {
            return Pivot;
        }
        if(target >= nums[0]){
            return binarySerch(nums, target, 0, Pivot-1);
        }else {
            return binarySerch(nums, target, Pivot+1, nums.length-1);
        }

    }

    // this use when given array is not pivot
    static int binarySerch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid  = start + ( end - start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[]nums) {   // this function give us pivot from rotate array
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + ( end - start )/2;
            // 4 case over here
            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            if(nums[mid] <= nums[start]) {
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplite(int[]nums) {   // this function give us pivot from rotate array
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + ( end - start )/2;
            // 4 case over here
            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            if(nums[mid] == nums[start] &&  nums[mid] == nums[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
