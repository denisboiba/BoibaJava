import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String answer = "да";
        while (answer.equalsIgnoreCase("да")) {
            Scanner scanner = new Scanner(System.in);
            int num;
            System.out.print("Введите целое число: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num > 7) {
                    System.out.println("Привет");
                }
                System.out.println("Если хотите продожить введите 'да', для выхода - что угодно: ");
                answer = scanner.next();
                if (!answer.equalsIgnoreCase("да")) {
                    System.out.println("Пока, я буду скучать:)");
                }
            }
        }
    }
}