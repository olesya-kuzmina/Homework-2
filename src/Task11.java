import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание №11:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни квадратного уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Корень квадратного уравнения: x = " + x);
        } else {
            System.out.println("Квадратное уравнение не имеет действительных корней");
        }
    }
}
