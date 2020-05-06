package search;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String search = scanner.next();
        Integer result = Arrays.asList(input.split(" ")).indexOf(search);
        System.out.println((result > 0) ? result + 1 : "Not Found");
    }
}
