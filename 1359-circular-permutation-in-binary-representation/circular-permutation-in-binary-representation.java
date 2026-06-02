class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        res.add(start);
        set.add(start);
        dfs(n, set, res, start);
        return res;
    }
    boolean dfs(int n, Set<Integer> set, List<Integer> res, int start) {
        if (set.size() == (int)Math.pow(2, n)) {
            int x = res.get(res.size() - 1) ^ start;
            return (x & (x - 1)) == 0;
        }
        int last = res.get(res.size() - 1);
        for (int i = 0; i < 16; i++) {
            int next = (last ^ (1 << i));
            if (next <= Math.pow(2, n) - 1 && !set.contains(next)) {
                set.add(next);
                res.add(next);
                if (dfs(n, set, res, start)) {
                    return true;
                }
                set.remove(next);
                res.remove(res.size() - 1);
            }
        }
        return false;
    }
}