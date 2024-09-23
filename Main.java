public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a clock display instance
        ClockDisplay clock = new ClockDisplay();

        // Loop to continuously display real time every minute
        while (true) {
            // Update the clock to real system time
            clock.updateTimeToRealTime();
            System.out.println("Current time: " + clock.getTime());

            // Wait for 60 seconds (1 minute)
            Thread.sleep(60000); // Sleep for 60,000 milliseconds (1 minute)
        }
    }
}
