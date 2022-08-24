import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String answer = "да";
        while (answer.equalsIgnoreCase("да")) {
            Scanner scanner = new Scanner(System.in);
            String curName = "Вячеслав";
            String entName;
            System.out.print("Введите имя: ");
            if (scanner.hasNextLine()) {
                entName = scanner.nextLine();
                if (entName.equals(curName)) {
                    System.out.println("Привет, Вячеслав!!!");
                } else {
                    System.out.println("Нет такого имени");
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