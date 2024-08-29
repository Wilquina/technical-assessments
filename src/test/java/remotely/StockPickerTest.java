package test.java.remotely;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.java.remotely.StockPicker;

class StockPickerTest {

  @Test
  void stockPicker() {
    // GIVEN
    int[] stockPrices1 = new int[]{44, 30, 24,  32, 35, 30, 40, 38, 15};
    int[] stockPrices2 = new int[]{20, 8};
    int[] stockPrices3 = new int[]{50, 30, 24,  60};

    // WHEN
    int profit1 = StockPicker.stockPicker(stockPrices1);
    int profit2 = StockPicker.stockPicker(stockPrices2);
    int profit3 = StockPicker.stockPicker(stockPrices3);

    // THEN
    assertEquals(16, profit1);
    assertEquals(-1, profit2);
    assertEquals(36, profit3);
  }
}