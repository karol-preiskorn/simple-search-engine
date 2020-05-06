import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();

        if ((x > -15 && x <= 12) || (x > 14 && x < 17) || x >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}