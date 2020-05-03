import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine();
            for (String strEl : line.split(" ")) {
                list.add(strEl);
            }

        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        scanner.close();
    }
}