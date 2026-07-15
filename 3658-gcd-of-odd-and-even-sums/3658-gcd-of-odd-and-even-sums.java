class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0 , even =0;
        int h =1;
        for(int i = 0 ; i < n ;i++){
            odd += h;
            even += h+1;
            h+=2;
        }
        return gcd(even,odd);
    }
    public int gcd(int even,int odd){
        if(odd == 0 ){
            return even;
        }
        return gcd(odd,even % odd);
    }
}