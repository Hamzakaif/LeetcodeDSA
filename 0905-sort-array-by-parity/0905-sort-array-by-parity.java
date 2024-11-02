class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] arr = new int [nums.length];
        int count = 0;
        for(int i =0;i<nums.length;i++){
             if(nums[i]%2==0){
                arr[count]=nums[i];
                count++;
             }

        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                arr[count]=nums[i];
                count++;
            }
        }
        return arr;
    }
}