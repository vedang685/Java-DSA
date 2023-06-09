import java.util.Arrays;
//leetcode problem 455

public class LeetcodeQuestion34E {
    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        Arrays.sort(g);
        Arrays.sort(s);
        System.out.println(ContentChildren(g, s));
    }

    static int ContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i;
    }
}