import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        // Arrange
        double cashAmount = 50.0;
        RewardValue rewardValue = new RewardValue(cashAmount);

        // Act
        double expectedMiles = cashAmount / 0.0035;
        double convertedMiles = rewardValue.convertCashToMiles();

        // Assert
        assertEquals(expectedMiles, convertedMiles, 0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        // Arrange
        int milesAmount = 5000;
        RewardValue rewardValue = new RewardValue(milesAmount);

        // Act
        double expectedCash = milesAmount * 0.0035;
        double convertedCash = rewardValue.convertMilesToCash();

        // Assert
        assertEquals(expectedCash, convertedCash, 0.001);
    }
}
