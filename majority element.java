class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == majority){
                count = count + 1;
            }
            else{
                count = count-1;
            }
            if(count == 0){
                majority = nums[i];
                count = 1;
            }
        }
        return majority;
    }
}
