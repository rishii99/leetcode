import java.util.*;
public class LiftCapacity {
    public static int maxPeople(int N, int X, int[] A) {
        Arrays.sort(A);
        int count = 0;
        int totalWeight = 0;
        for (int i = 0; i < N; i++) {
            if (totalWeight + A[i] <= X) {
                totalWeight += A[i];
                count++;
            } else {
                break; // jaise hi weight exceed hua stop
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(maxPeople(N, X, A));
        sc.close();
    }
}
