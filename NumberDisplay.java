// NumberDisplay.java
public class NumberDisplay {
    private int limit;
    private int value;

    // Constructor to initialize limit and starting value
    public NumberDisplay(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    // Method to increment the value
    public void increment() {
        value = (value + 1) % limit;  // Ensures it rolls over when it reaches the limit
    }

    // Getter for the value
    public int getValue() {
        return value;
    }

    // Setter for the value
    public void setValue(int newValue) {
        if (newValue >= 0 && newValue < limit) {
            this.value = newValue;
        } else {
            System.out.println("Invalid value");
        }
    }

    // Returns the value as a two-digit string (e.g., "07", "12")
    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;  // Adds leading zero for single digits
        }
        return "" + value;
    }
}
