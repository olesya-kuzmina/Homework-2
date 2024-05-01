import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание №5:");
        String[] chineseHoroscope = {"Крыса", "Бык", "Тигр", "Кролик", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Петух", "Собака", "Свинья"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, месяц, год (например: 6 5 1997): ");
        int date = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        String zodiacYear = chineseHoroscope[(year - 4) % 12];
        String zodiacSing = "";
        switch (month) {
            case 1:
                if (date < 20) {
                    zodiacSing = "Козерог";
                } else {
                    zodiacSing = "Водолей";
                }
                break;
            case 2:
                if (date < 19) {
                    zodiacSing = "Водолей";
                } else {
                    zodiacSing = "Рыбы";
                }
                break;
            case 3:
                if (date < 21) {
                    zodiacSing = "Рыбы";
                } else {
                    zodiacSing = "Овен";
                }
                break;
            case 4:
                if (date < 20) {
                    zodiacSing = "Овен";
                } else {
                    zodiacSing = "Телец";
                }
                break;
            case 5:
                if (date < 21) {
                    zodiacSing = "Телец";
                } else {
                    zodiacSing = "Близнецы";
                }
                break;
            case 6:
                if (date < 22) {
                    zodiacSing = "Близнецы";
                } else {
                    zodiacSing = "Рак";
                }
                break;
            case 7:
                if (date < 23) {
                    zodiacSing = "Рак";
                } else {
                    zodiacSing = "Лев";
                }
                break;
            case 8:
                if (date < 23) {
                    zodiacSing = "Лев";
                } else {
                    zodiacSing = "Дева";
                }
                break;
            case 9:
                if (date < 23) {
                    zodiacSing = "Дева";
                } else {
                    zodiacSing = "Весы";
                }
                break;
            case 10:
                if (date < 23) {
                    zodiacSing = "Весы";
                } else {
                    zodiacSing = "Скорпион";
                }
                break;
            case 11:
                if (date < 23) {
                    zodiacSing = "Скорпион";
                } else {
                    zodiacSing = "Стрелец";
                }
                break;
            case 12:
                if (date < 22) {
                    zodiacSing = "Стрелец";
                } else {
                    zodiacSing = "Козерог";
                }
                break;
        }
        System.out.println("Знак зодиака: " + zodiacSing);
        System.out.println("Год: " + zodiacYear);
    }
}
