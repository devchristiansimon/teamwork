public class Main {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < (months.length); i++) {
            printCalendarForMonth(months[i]);
        }
    }
    public static void printCalendarForMonth(String monthName) {
        System.out.println(monthName);
    }
}