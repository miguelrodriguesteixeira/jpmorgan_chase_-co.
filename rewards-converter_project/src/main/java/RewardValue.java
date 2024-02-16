import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        convertFromCashToMiles();
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        convertFromMilesToCash();
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Conversion from cash to miles
    private void convertFromCashToMiles() {
        milesValue = (int) (cashValue / 0.0035);
    }

    // Conversion from miles to cash
    private void convertFromMilesToCash() {
        cashValue = milesValue * 0.0035;
    }
}
