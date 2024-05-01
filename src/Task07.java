import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание №7:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String symbol = sc.nextLine();

        Pattern patKirLetter = Pattern.compile("[а-яА-Я]");
        Matcher matKirLetter = patKirLetter.matcher(symbol);

        Pattern patLatLetter = Pattern.compile("[a-zA-Z]");
        Matcher matLatLetter = patLatLetter.matcher(symbol);

        Pattern patNumber = Pattern.compile("[0-9]");
        Matcher matNumber = patNumber.matcher(symbol);

        if (matLatLetter.matches()) {
            System.out.println("Латиница");
        } else if (matKirLetter.matches()) {
            System.out.println("Кириллица");
        } else if (matNumber.matches()) {
            System.out.println("Цифра");
        } else {
            System.out.println("Невозможно определить");
        }
    }
}
