class Solution {
    public long gcd(long a ,long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long[] prefixGcd = new long[n];

        int mx = nums[0];
        for(int i =0 ;i < n ;i++){
            mx = Math.max(mx,nums[i]);
            prefixGcd[i]= gcd(nums[i],mx);
        }
        
        Arrays.sort(prefixGcd);
        
        int left = 0 ,right = n-1;
        long ans = 0;
        while(left<right){
            ans += gcd(prefixGcd[left],prefixGcd[right]);
            left++;
            right--;
        }
        return ans;
    }
}