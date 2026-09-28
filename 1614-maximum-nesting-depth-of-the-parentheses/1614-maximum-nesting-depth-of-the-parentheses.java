class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int dep = 0;
        int len = s.length();
        for(int i =0 ; i < len ; i++){
            if (s.charAt(i)== '('){
                dep++;
            }
            else if(s.charAt(i)== ')'){
                dep--;
            }
             max = Math.max(dep,max);
        }
        return max;
    }
}