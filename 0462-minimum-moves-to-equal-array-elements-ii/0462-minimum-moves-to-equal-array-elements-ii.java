class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid  = nums[n/2];

        // if(n % 2 == 0){
        //     mid = ( nums[n/2] + nums[(n/2)-1] ) / 2 ;
        // }else{
        //     mid = nums[n/2];
        // }

        int sum = 0;
        for(int i =0 ; i <n ;i++){
            sum += Math.abs(mid - nums[i]);
        }
        return sum;
    }
}