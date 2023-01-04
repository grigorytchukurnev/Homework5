public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }


    public static void task2() {
        System.out.println("Задача2");
        int clientDeviceYear = 2016;
        int clientOS = 1;
        if (clientOS ==0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        }else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для android по ссылке");
            } else {
                System.out.println("Установите версию приложения для android по ссылке.");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача3");
        int year = 2024;
        if (year%4 ==0 && year%100!=0 || year%400==0){
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void task4() {
        System.out.println("Задача4");{
        int deliveryDistance = 10;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день доставки.");
        }else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется 2 дня доставки.");
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется 3 дня доставки.");
            } else if (deliveryDistance > 100){
                System.out.println("Доставка не осуществляется");
            }
        }
    }
}
    public static void task5() {
        System.out.println("Задача5");
        int monthNumber = 19;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println(monthNumber + " месяца не существует");
        }
    }
}