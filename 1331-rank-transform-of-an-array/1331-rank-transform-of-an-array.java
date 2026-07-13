class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n =arr.length;
        int[] dup = arr.clone();
        Arrays.sort(dup);

        int[] ans = new int[n];

        HashMap<Integer,Integer> map = new HashMap<>();
        int idx = 1;
        for(int i =0; i<n ; i++){
            if(!map.containsKey(dup[i])){
                map.put(dup[i],idx++);
            }
        }

        for(int i = 0 ;i < n ;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}