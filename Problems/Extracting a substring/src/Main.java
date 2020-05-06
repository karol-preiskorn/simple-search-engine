import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        System.out.print(str.substring(i1, ++i2));
    }
}