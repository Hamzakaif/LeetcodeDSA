class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] sqroot = new int [nums.length];
        int temp =0;
        for(int i =0;i<nums.length;i++){
             sqroot[temp] = nums[i]*nums[i];
           Arrays.sort(sqroot);
            
        }
        return sqroot;

    }
}