import java.util.Scanner;
public class SnilsValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите СНИЛС в формате ДДД-ДДД-ДДД ДД: ");
        String snils = scanner.nextLine();

        boolean isValidSnils = true;

        if (snils.length() == 14) {
            for (int i = 0; i < 14; i++) {
                char a = snils.charAt(i);
                if (i == 3 || i == 7) {
                    if (a != '-') {
                        isValidSnils = false;
                        break;
                    }
                } else if (i == 11) {
                    if (a != ' ') {
                        isValidSnils = false;
                        break;
                    }
                } else if (!Character.isDigit(a)) {
                    isValidSnils = false;
                    break;
                }
            }
        } else {
            isValidSnils = false;
        }

        if (isValidSnils) {
            System.out.println("Формат СНИЛС введен верно.");
        } else {
            System.out.println("Ошибка! Неверный формат СНИЛС.");
        }

        scanner.close();
    }
}