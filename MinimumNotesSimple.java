import java.util.Scanner;
public class MinimumNotesSimple {
    public static int minNotes(int[] a) {
        int n = a.length;
        int max = 0;
        for (int v : a) max = Math.max(max, v);
        int ans = Integer.MAX_VALUE;
        for (int k = 1; k <= max; k++) {
            int nonDiv = 0;
            long sum = 0;
            for (int v : a) {
                if (v % k == 0) {
                    sum += v / k;
                } else {
                    nonDiv++;
                    if (nonDiv > 1) break; // more than one non-divisible => invalid k
                }
            }
            if (nonDiv > 1) continue;
            if (nonDiv == 1) sum += 1; // change that one person's salary to k (minimum multiple)
            ans = (int) Math.min(ans, sum);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] salaries = new int[n];
        for (int i = 0; i < n; i++) salaries[i] = sc.nextInt();
        System.out.println(minNotes(salaries));
        sc.close();
    }
}
