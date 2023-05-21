import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Введите первую строку: ");
        String str1 = input.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = input.nextLine();

        if (str1.contains(str2)) {
            System.out.println("Вторая строка является подстрокой первой строки");
        } else {
            System.out.println("Вторая строка не является подстрокой первой строки");
        }
    }
}
