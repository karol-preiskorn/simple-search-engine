import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        boolean a = h1 > 0;
        boolean b = h2 > 0;
        boolean c = h3 > 0;
        System.out.println((a ^ b ^ c) && !(a && b && c));
    }
}