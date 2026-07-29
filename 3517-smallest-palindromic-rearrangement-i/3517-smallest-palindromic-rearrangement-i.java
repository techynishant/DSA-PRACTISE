class Solution {
    public String smallestPalindrome(String s) {
        int n= s.length();
        if(n<2){
            return s;
        }
        String str = s.substring(0,n/2);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        String f = new String(ch);
        StringBuilder sb = new StringBuilder();
        sb.append(f);

        if(n % 2 != 0) sb.append(s.charAt(n/2));

        sb.append(new StringBuilder(f).reverse());

        return sb.toString();
    }
}