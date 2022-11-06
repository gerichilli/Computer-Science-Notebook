import java.util.Scanner;

public class GameHelper {
    static public int getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }
}
