public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");

        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 2
        System.out.println();
        System.out.println("Задача 2");

        clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 3
        System.out.println();
        System.out.println("Задача 3");

        int year = 2021;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }
        // task 4
        System.out.println();
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int oneDelivaryDay = 1;
        int twoDelivaryDay = 2;
        int threeDelivaryDay = 3;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + oneDelivaryDay + " день на доставку");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется " + twoDelivaryDay + " дня на доставку");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется " + threeDelivaryDay + " дня на доставку");
        } else {
            System.out.println("Доставки не будет");
        }
        // task 5
        System.out.println();
        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}