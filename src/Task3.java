import java.util.Scanner;

public class Task3 {
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String answer = "да";
        while (answer.equalsIgnoreCase("да")) {
            Scanner scanner = new Scanner(System.in);
            int n;
            System.out.print("Введите количество чисел для проверки на кратность трем: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                String[] arr = new String[n];
                System.out.print("Введите массив из " + n + " целых чисел: ");
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.next();
                }
                int counter = 0;
                for (String str : arr) {
                    if (isNumeric(str)) {
                        int number = Integer.parseInt(str);
                        if (number % 3 == 0) {
                            System.out.println(number + " кратно трем!");
                            counter += 1;
                        }
                    }
                }
                if (counter == 0) {
                    System.out.println("В массиве не было значений, кратных трем");
                }
                System.out.println("Чтобы попробовать еще раз введите 'да', для выхода - что угодно: ");
                answer = scanner.next();
                if (!answer.equalsIgnoreCase("да")) {
                    System.out.println("Пока, я буду скучать:)");
                }
            }
        }
    }
}
