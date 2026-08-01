class Solution {
    public boolean predictTheWinner(int[] nums) {
        return game(nums,0,nums.length-1)>=0;
    }
    public int game(int[] nums,int i,int j){
        if(i==j){
            return nums[j];
        }
        int left=nums[i]-game(nums,i+1,j);
        int right=nums[j]-game(nums,i,j-1);
        return Math.max(left,right);
    }
}