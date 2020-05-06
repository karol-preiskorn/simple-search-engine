import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        if (divide(N, M, K)) return;
        if (divide(M, N, K)) return;
        System.out.println("NO");
    }

    private static boolean divide(int n, int m, int k) {
        for (int i = 1; i <= m; i++) {
            if (i * n == k) {
                //System.out.println(i + " * " + n + " = " + i * n + " == " + k);
                System.out.println("YES");
                return true;
            }
            //System.out.println(i + " * " + n + " = " + i * n + " != " + k);
        }
        return false;
    }
}