public class Main {
    public static int sum(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
        return year;
        }
        public static void definitionDevice () {
            int clientOS = 1;
            int clientDeviceYear = 2015;
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию для IOS по cсылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию для android по ссылке");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для IOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для android по ссылке");
            }
        }
        public static void printTerm () {
            int deliveryDistance = 100;
            int days = 1;
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (deliveryDistance > 20) {
                    days ++;
                }
                if (deliveryDistance > 60) {
                    days ++;
                }
                System.out.println("Потребуется дней " + days);
            }
        }

        public static void main (String[]args){
            String firstName = "Семён ";
            String middleName = "Семёнович ";
            String lastName = "Иванов ";
            String fullName = lastName + firstName + middleName;
            fullName = fullName.replace('ё', 'е');
            System.out.println("Данные Ф.И.О. сотрудника " + fullName.toUpperCase());

            int year = 2021;
            year = sum(year);
            definitionDevice();
            printTerm();

        }
    }

