import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = input.nextLine();

        if (str.length() > 10) {
            str = str.substring(0, 6);
        } else {
            while (str.length() < 12) {
                str += 'o';
            }
        }

        System.out.println("Результат: " + str);
    }
}