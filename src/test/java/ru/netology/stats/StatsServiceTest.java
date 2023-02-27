package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    void shouldCalculateMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth , actualMinMonth);
    }

    @Test
    void shouldCalculateMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    void shouldCalculateAmountSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        int expectedAmount = 180;
        int actualAmount = service.amountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);


    }

    @Test
    void shouldCalculateAverageAmountSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmount = 15;
        int actualAverageAmount = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    void shouldCalculateUnderAverageAmountSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedUnderAverageAmount = 5;
        int actualUnderAverageAmount = service.salesUnderAverage(sales);

        Assertions.assertEquals(expectedUnderAverageAmount, actualUnderAverageAmount);
    }

    @Test
    void shouldCalculateOverAverageAmountSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedOverAverageAmount = 7;
        int actualOverAverageAmount = service.salesOverAverage(sales);

        Assertions.assertEquals(expectedOverAverageAmount, actualOverAverageAmount);
    }
}



