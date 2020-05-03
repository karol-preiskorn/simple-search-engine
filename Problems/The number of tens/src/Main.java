import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int i = scanner.nextInt();
        if (i < 0 || i > 1_000_000) {
            return;
        }
        System.out.println(i % 100 / 10);
    }
}