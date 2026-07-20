class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int n = grid[0].length;
        int m = grid.length;

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp.add(grid[i][j]);
            }
        }

        int size = temp.size();
        k = k % size;

        int st = 0;
        int end = size - 1;

        while (st < end) {
            int t = temp.get(st);
            temp.set(st, temp.get(end));
            temp.set(end, t);
            st++;
            end--;
        }

        st = 0;
        end = k - 1;

        while (st < end) {
            int t = temp.get(st);
            temp.set(st, temp.get(end));
            temp.set(end, t);
            st++;
            end--;
        }

        st = k;
        end = size - 1;

        while (st < end) {
            int t = temp.get(st);
            temp.set(st, temp.get(end));
            temp.set(end, t);
            st++;
            end--;
        }

        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0;

        for (int i = 0; i < m; i++) {
            List<Integer> num = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                num.add(temp.get(idx));
                idx++;
            }

            ans.add(num);
        }

        return ans;
    }
}