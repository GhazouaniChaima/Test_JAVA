import java.util.Arrays;
public class Algo2 {

    public static int[] solution(int[] A, int[] B) {
        int L = A.length;
        // determine the "max" for Fibonacci
        int max = 0;
        for (int i = 0; i < L; i++) {
            max = Math.max(A[i], max);
        }
        //max += 2; // for Fibonacci

        int[] fibonacci = new int[max + 1]; // plus one for "0"

        // initial setting of Fibonacci (importnat)
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i <= max; i++) {
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % (1 << 30);

        }

        // to find "results"
        int[] results = new int[L];

        for (int i = 0; i < L; i++) {
            results[i] = fibonacci[A[i]] % (1 << B[i]); // where, "1 << B[i]" means 2^B[i]
        }

        return results;
    }

    public static void main(String[] args) {
        int[] a = {4, 4, 5, 5, 1};
        int[] b = {3, 2, 4, 3, 1};
        System.out.println(Arrays.toString(solution(a, b)));
    }
}





