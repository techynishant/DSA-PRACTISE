class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int n = s.length;
        int m = g.length;

        int i = 0, j = 0;
        int ans = 0;
        while (i < m && j < n) {
            if (s[j] >= g[i]) {
                ans++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return ans;
    }
}