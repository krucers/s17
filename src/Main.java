import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        checkLeapYear(2024);
        checkLeapYear(1900);
        checkLeapYear(2000);
        System.out.println("\n Задача №2");
        recommendApp(0, 2014); // iOS, старый телефон (до 2015)
        recommendApp(1, 2015); // Android, ровно 2015
        recommendApp(0, 2023); // iOS, новый телефон
        recommendApp(1, 2010); // Android, старый телефон
        System.out.println("\n Задача №3");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставка свыше 100 км невозможна");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
    public static void checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void recommendApp(int clientOS, int clientDeviceYear) {
        final int THRESHOLD_YEAR = 2015;
        String osName = (clientOS == 0) ? "iOS" : "Android";
        String versionType = (clientDeviceYear < THRESHOLD_YEAR) ? "облегченную версию" : "версию";
        System.out.println("Установите " + versionType + " приложения для " + osName + " по ссылке");
    }
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}