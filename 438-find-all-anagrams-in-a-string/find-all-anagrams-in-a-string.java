class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int n = s.length();
        int m = p.length();

        List<Integer> ans = new ArrayList<>();
        if (m > n) return ans;

        int left = 0, right = 0;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < m; i++) {
            map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0) + 1);
        }

        while (right < n) {

            char rc = s.charAt(right);
            map2.put(rc, map2.getOrDefault(rc, 0) + 1);
            right++;

            if (right - left == m) {

                if (map1.equals(map2)) {
                    ans.add(left);
                }

                char lc = s.charAt(left);
                map2.put(lc, map2.get(lc) - 1);
                if (map2.get(lc) == 0) {
                    map2.remove(lc);
                }

                left++;
            }
        }

        return ans;
    }
}
