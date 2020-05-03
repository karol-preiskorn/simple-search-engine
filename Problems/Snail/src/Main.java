import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int H = scanner.nextInt();
        if (H < 0 || H > 100) {
            System.out.println(">0 and < 100");
            return;
        }
        int A = scanner.nextInt();
        if (A < 0 || A > 100) {
            System.out.println(">0 and < 100");
            return;
        }
        int B = scanner.nextInt();
        if (B < 0 || B > 100) {
            System.out.println(">0 and < 100");
            return;
        }
        if (H < B || A < B) {
            System.out.println("A > B. and H > B");
            return;
        }

        int distance = 0;
        int day = 0;
        while (distance < H) {
            day++;
            distance = distance + A;
            if (distance >= H) {
                System.out.println(day);
                return;
            }
            //System.out.println("day: " + day + ", distance: " + distance);
            distance = distance - B;
        }
    }
}