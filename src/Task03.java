import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание №3:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете животное:");
        System.out.println("1. Кошка");
        System.out.println("2. Собака");
        System.out.println("3. Корова");
        System.out.println("4. Петух");
        System.out.println("5. Баран");
        System.out.println("6. Мышка");
        System.out.println("7. Лягушка");
        System.out.println("8. Утка");
        System.out.println("9. Лиса");
        System.out.println("10. Волк");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Кошка издает звук: мяу-мяу");
            break;
            case 2:
                System.out.println("Собака издает звук: гав-гав");
                break;
            case 3:
                System.out.println("Корова издает звук: му-у");
                break;
            case 4:
                System.out.println("Петух издает звук: ку-ка-ре-ку");
                break;
            case 5:
                System.out.println("Баран издает звук: бее-бее");
                break;
            case 6:
                System.out.println("Мышка издает звук: пи-пи-пи");
                break;
            case 7:
                System.out.println("Лягушка издает звук: ква-ква-ква");
                break;
            case 8:
                System.out.println("Утка издает звук: кря-кря-кря");
                break;
            case 9:
                System.out.println("Лиса издает звук: фыр-фыр");
                break;
            case 10:
                System.out.println("Волк издает звук: ууу-ууу");
                break;
            default:
                System.out.println("Выберите животное из списка");
                break;
        }
    }
}
