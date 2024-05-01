public class Main {
    public static void main(String[] args) {
        // Задача 11
        int a = 5;
        if (a > 0 && a < 5) {
            System.out.println("Верно");
        } else {
            System.out.println("Невірно");
        }

        // Задача 12
        a = 5;
        if (a == 0 || a == 2) {
            a += 7;
        } else {
            a /= 10;
        }
        System.out.println("Нове значення a: " + a);

        // Задача 13
        int b = 3;
        if ((a <= 1 && b >= 3) || (a > 1 && b < 3)) {
            System.out.println("Сума a і b: " + (a + b));
        } else {
            System.out.println("Разность a и b: " + (a - b));
        }

        // Задача 14
        if ((a > 2 && a < 11) || (b >= 6 && b < 14)) {
            System.out.println("Верно");
        } else {
            System.out.println("Невірно");
        }
    }
}