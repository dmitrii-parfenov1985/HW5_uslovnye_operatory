public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача 2");

        int clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
        }
        System.out.println();
        System.out.println("Задача 3");
        int year = 2021;
        if (year <= 1584) {
            System.out.println();
        }
        System.out.println();
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60){
                System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100){
            System.out.println("Потребуется 3 дня");
        } else if (deliveryDistance >= 100){
            System.out.println("Доставки нет");
        }
        System.out.println();
        System.out.println("Задача 5");
        int monthNumber = 1;
        switch (monthNumber){
            case 1:
                System.out.println("Это зимний месяц");
                break;
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
                System.out.println("Это весенний месяц");
                break;
            case 4:
                System.out.println("Это весенний месяц");
                break;
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
                System.out.println("Это летний месяц");
                break;
            case 7:
                System.out.println("Это летний месяц");
                break;
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
                System.out.println("Это осенний месяц");
                break;
            case 10:
                System.out.println("Это осенний месяц");
                break;
            case 11:
                System.out.println("Это осенний месяц");
                break;
            case 12:
                System.out.println("Это зимний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}