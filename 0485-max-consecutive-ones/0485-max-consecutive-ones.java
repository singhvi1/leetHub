class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int  max=0;
        for(int i =0 ;i<nums.length;i++){
            if(nums[i] ==1 ){
                max +=1;
                maxCount=Math.max(max,maxCount);
            }else{
                max=0;
            }
            
        
        }
        return maxCount;
    }
}