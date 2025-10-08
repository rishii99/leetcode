import java.util.ArrayList;
class previous_smaller_element {
    static ArrayList<Integer> prevSmaller(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) result.add(-1);
        for (int i = 0; i < n; i++) { // using nested loops 
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    result.set(i, arr[j]);
                    break;
                }
            }
        }
        return result; 
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 0, 3, 4, 5};
        ArrayList<Integer> ans = prevSmaller(arr);
        for (int x : ans) System.out.print(x + " ");
    }
}

