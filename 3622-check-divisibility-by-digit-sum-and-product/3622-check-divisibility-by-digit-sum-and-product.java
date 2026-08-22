class Solution {
    public boolean checkDivisibility(int n) {
        
        int m =n;
        int sum =0;
        int pro =1;
        while(m>0){
            int rem = m % 10;
            sum+=rem;
            pro*=rem;
            m/=10;
        }
        return n % (sum + pro) == 0;
    }
}