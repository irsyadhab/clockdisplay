import java.time.LocalTime;  // Import for real-time clock

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;

    // Constructor that initializes hours and minutes with real-time values
    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);

        // Get the current local time
        LocalTime currentTime = LocalTime.now();
        hours.setValue(currentTime.getHour());
        minutes.setValue(currentTime.getMinute());
    }

    // Set the current time manually
    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
    }

    // Increment the clock by one minute (for manual ticking)
    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {  // If minutes rolled over to 0, increment hours
            hours.increment();
        }
    }

    // Get the current time as a string in HH:MM format
    public String getTime() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    // Update the time based on real system time
    public void updateTimeToRealTime() {
        LocalTime currentTime = LocalTime.now();
        hours.setValue(currentTime.getHour());
        minutes.setValue(currentTime.getMinute());
    }
}
