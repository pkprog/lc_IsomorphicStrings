public class Solution {
    private final char EMPTY = 0xffff;

    private char[][] newMap(int length) {
        char[][] map = new char[length][2];
        return map;
    }

    private int add(char[][] map, char key, char value, int cnt) {
        for (int j = 0; j < cnt; j++) {
            if (map[j][0] == key) {
                if (map[j][1] != value) {
                    return -1;
                } else {
                    return cnt;
                }
            } else if (map[j][1] == value) {
                if (map[j][0] != key) {
                    return -1;
                } else {
                    return cnt;
                }
            }
        }

        map[cnt][0] = key;
        map[cnt][1] = value;
        return cnt+1;
    }

    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        char[][] testMap = newMap(s.length());
        int cnt = 0;

        final char[] charsS = s.toCharArray();
        final char[] charsT = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char c1 = charsS[i];
            char c2 = charsT[i];

            cnt = add(testMap, c1, c2, cnt);
            if (cnt > 0) {
                //ok
            } else {
                return false;
            }
        }

        return true;
    }

}
