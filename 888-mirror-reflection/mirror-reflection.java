class Solution {
    public int mirrorReflection(int p, int q) {
        int g = gcd(p, q);

        int m = p / g; // room extension count
        int n = q / g; // vertical count

        if (m % 2 == 1 && n % 2 == 1) return 1;
        if (m % 2 == 1 && n % 2 == 0) return 0;
        return 2;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}