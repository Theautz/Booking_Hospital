import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Booking booking = new Booking();
        booking.login();
        booking.enterName();
        booking.enterID();
        booking.enterDepartment();
        booking.enterInfo();
        booking.enterDateandTime();
        booking.getResult();
    }
}

