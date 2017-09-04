package javaPOC.String;

/**
 * Convert  ababc  --> babac
 * or Arpan --> rAapn
 */
public class problem1 {
    public void print(int n, char[] k, char[] A) {
        if (n <= 0) {
            System.out.print(String.valueOf(A) + " ");
        } else {
            for (int i = 0; i < k.length; i++) {
                A[n - 1] = k[i];
                print(n - 1, k, A);
            }
        }
    }

    public static void main(String[] args) {
        String k = "ARPAN";
        int n = 5;
        problem1 i = new problem1();
        i.print(n, k.toCharArray(), new char[n]);
    }
}
