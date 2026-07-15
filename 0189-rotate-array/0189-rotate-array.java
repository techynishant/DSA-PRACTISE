class Solution {
    public void rotate(int[] nums, int a) {
        int i =0 ;
        int j=nums.length-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums [j];
            nums[j]= temp;
            i++;
            j--;
        }
        int m =0 ;
        int n=a%nums.length-1;
        while(m < n){
           int  temp = nums[m];
            nums[m] = nums [n];
            nums[n]= temp;
            m++;
            n--;
        }
        int k =a%nums.length ;
        int l=nums.length-1;
        while(k < l){
            int temp = nums[k];
            nums[k] = nums [l];
            nums[l]= temp;
            k++;
            l--;
        }
    }
}