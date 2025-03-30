public class Main {
    public static void main(String[] args) {
        System.out.println("Home work 8");
        System.out.println();
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Целое число " + i);
        }
        System.out.println();
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Целое число " + i);
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0)
                System.out.println("Четное число " + i);
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0)
                System.out.println(i + " год является високосным");
        }
        System.out.println();
        System.out.println("Задание 6");
        for (int i = 1; i <= 14; i++) {
            System.out.println(i * 7);
        }
        System.out.println();
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задание 8");
        int saving = 0;
        for (int month = 1; month <=12; month++) {
            saving += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + saving + " рублей");
        }
        System.out.println();
        System.out.println("Задание 9");
        float savin = 0;
        float savingPerYear = 12;
        float savingPerMonth = ((savingPerYear / 12) / 100) + 1;
        for (int month = 1; month <=12; month++) {
            savin += 29000;
            savin *= savingPerMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savin + " рублей");
        }
        System.out.println();
        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}