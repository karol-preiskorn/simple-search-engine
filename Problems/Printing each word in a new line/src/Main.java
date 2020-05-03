import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[5];
        for (int i = 0; i < 5; i++) {
            stringArray[i] = scanner.next();
        }
        
        for (String n : stringArray) {
            System.out.println(n);
        }
        scanner.close();
    }
}