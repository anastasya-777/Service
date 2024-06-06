package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // Последний месяц с максимальными продажами
        int actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // Последний месяц с минимальными продажами
        int actual = service.minSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateBelowAverageSalesMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSalesMonths(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverageSalesMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSalesMonths(sales);

        Assertions.assertEquals(expected, actual);
    }
}

