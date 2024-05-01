import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание №4:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите координату y: ");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0){
            System.out.println("Точка находится в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится в 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в 3 четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в 4 четверти");
        } else {
            System.out.println("Точка находится на окружности");
        }
    }
    }