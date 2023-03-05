import java.time.LocalDate;

class Scratch {
    public static void main(String[] args) {
        printInfoAboutYear(2023);
        printInfoAboutVersion(0, 2023);
        printInfoAboutDelivery(30);
    }


    private static void printInfoAboutYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private  static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 ==0;
    }


    private static void printInfoAboutVersion(int os, int productionYear) {
        if (os != 0 && os != 1) {
            System.out.println(" OS должна иметь значение 0 или 1!");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        String result = "Нужно установить" +
                (productionYear < currentYear ? "облегченную версию для " : "версию для ") +
                (os == 0 ? "IOS" : "Android");
        System.out.println(result);
    }

    private static int calculateDeliveryDays(double distance) {
        if ( distance < 0 || distance > 100) {
            return -1;
        } else if (distance <= 60) {
            return 2;
        }else {
            return 3;
        }
    }

    private static void printInfoAboutDelivery(double distance) {
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays != -1) {
            System.out.println("Кол-во дней доставки - " + deliveryDays);
        } else  {
            System.out.println("Доставка не осуществляется!");
        }
    }
}