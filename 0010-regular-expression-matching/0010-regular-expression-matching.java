class Solution {
    Boolean[][] dp;
    public boolean check(String s, String p,int i,int j){
        if(j==0) return i==0;
        if(dp[i][j]!=null) return dp[i][j];
        boolean ans= false;
        if (p.charAt(j - 1) != '*') {
            if (i > 0 && (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1))) {
                ans = check(s, p, i - 1, j - 1);
            }
        } 
         else {
            ans = check(s, p, i, j - 2);
            if (i > 0 && (p.charAt(j - 2) == '.' || s.charAt(i - 1) == p.charAt(j - 2))) {
                ans = ans || check(s, p, i - 1, j);
            }
        }
        return dp[i][j]=ans;
    }
    public boolean isMatch(String s, String p) {
        dp=new Boolean[s.length()+1][p.length()+1];
        return check(s,p,s.length(),p.length());
    }
}