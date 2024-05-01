import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание №10:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер квартиры: ");
        int number = scanner.nextInt();
        var porch = (number + 39) / 40;
        number -= (porch - 1) * 40;
        var floor = (number + 3) / 4;
        System.out.println("Подъезд = " + porch);
        System.out.println("Этаж = " + floor);
    }
}
