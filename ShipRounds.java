import java.util.Scanner;

public class ShipRounds {
    public static int numberOfRounds(int C, int N) {
        if (N <= C) {
            return 1;
        }
        int fullTrips = N / C;     // full trips kitne ho sakte hain
        int remaining = N % C;     // kitne log bache hain
        if (remaining == 0) {
            return 2 * fullTrips - 1;  // last trip ke baad wapas nahi aana
        } else {
            return 2 * fullTrips + 1;  // ek extra trip lagegi
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();  // ship ki capacity
        int N = sc.nextInt();  // total log
        System.out.println(numberOfRounds(C, N));
        sc.close();
    }
}

