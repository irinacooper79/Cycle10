public class Main {
    public static void main(String[] args) {
        // Домашка №1
        System.out.println("Домашка 1");

        // Задача №1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача №2
        System.out.println("Задача 2");
        for (int i1 = 10; i1 >= 0; i1--) {
            System.out.println(i1);
        }

        // Задача №3
        System.out.println("Задача 3");
        for (int i2 = 0; i2 < 17; i2 = i2 + 2) {
            System.out.println(i2);
        }

        // Задача №4
        System.out.println("Задача 4");
        for (int i3 = 10; i3 >= -10; i3--) {
            System.out.println(i3);
        }
        // Домашка №2
        System.out.println("Домашка 2");

        // Задача №1
        System.out.println("Задача 1");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

        // Задача №2
        System.out.println("Задача 2");
        for (int i1 = 7; i1 <= 98; i1 = i1 + 7) {
            System.out.println(i1);
        }

        // Задача №3
        System.out.println("Задача 3");
        for (int i2 = 1; i2 <= 512; i2 = i2 * 2) {
            System.out.println(i2);
        }

        // Домашка №3
        System.out.println("Домашка 2");

        // Задача №1
        System.out.println("Задача 1");
        int cash = 29000;
        int cash0 = 0;
        for (int i3 = 1; i3 <= 12; i3++) {
            cash0 = cash0 + cash;
            System.out.println("Месяц " + i3 + " сумма накоплений равна " + cash0 + " рублей");
        }

        // Задача №2
        System.out.println("Задача 2");
        int salary = 29000;
        int total = 0;
        for (int i4 = 1; i4 <= 12; i4++) {
            total = total + salary;
            total = total + total / 100;
            System.out.println("Месяц " + i4 + " сумма накоплений равна " + total + " рублей");
        }
        // Задача №4

        int firstFriday = 5;
        int daysInMonth = 31;
        for (int i = firstFriday; i <= daysInMonth; i = i + 7) {
            System.out.println("Сегодня пятница");
        }
    }
}
