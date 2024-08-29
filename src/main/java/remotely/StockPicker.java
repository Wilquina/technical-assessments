package main.java.remotely;

public class StockPicker {

  public static int stockPicker(int[] arr) {
    // code goes here

    // First, we check if there are less than 2 days, because there would be no profit
    if (arr == null || arr.length < 2) {
      return -1;
    }

    // Save the first price as the lowest one
    int minPrice = arr[0];
    int maxProfit = -1;

    for (int i = 1; i < arr.length; i++) {
      int currentPrice = arr[i];
      // Check if the current price is bigger and set the maxProfit if bigger than profit.
      // If not, then set the minPrice as the currentPrice
      if (currentPrice > minPrice) {
        int profit = currentPrice - minPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        minPrice = currentPrice;
      }
    }
    return maxProfit;
  }

}
