class Solution {
    public int[] searchRange(int[] nums, int target) {
       int [] arr = new int [2]; // 2 is size of index;;;;
       arr[0] = Findfirst(nums,target);
       arr[1]=Findlast(nums,target);
       return arr;
    }
    public int Findfirst(int []nums,int target){
        int start = 0;
        int end = nums.length-1;
        int pos=-1;
        while(start<=end){
            int mid  = start+(end-start)/2;

            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else
            {
                pos = mid;
                end =mid-1;
            }
        }
        return pos;
    }
    public int Findlast(int []nums,int target){
        int start = 0;
        int end = nums.length-1;
        int pos=-1;
        while(start<=end){
            int mid  = start+(end-start)/2;

            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else
            {
                pos = mid;
                start = mid+1;
            }
        }
        return pos;
    }
}