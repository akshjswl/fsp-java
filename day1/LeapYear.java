// wap to accept a year from the user through command line and check whether it is a leap year or not

public class LeapYear {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java LeapYear <year>");
            return;
        }

        int year = Integer.parseInt(args[0]);

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
