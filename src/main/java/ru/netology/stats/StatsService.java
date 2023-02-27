package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
            maxMonth = i;
            }
            if (sales[maxMonth] == sales[i]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1; // номер месяца с максимальным количеством продаж
    }


    public int amountSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;// общее количество продаж
    }

    public int averageSales(int[] sales) {

        double average = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            average = sum / sales.length;
        }
        return (int) average;// среднее значение продаж
    }

    public int salesUnderAverage(int[] sales) {
        int underAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= 15) {
                continue;
            } else {

                underAverage += 1;// количество месяцев продаж ниже среднего значения
            }
        }

        return underAverage;

    }

    public int salesOverAverage(int[] sales) {
        int overAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < 15) {
                continue;
            } else {

                overAverage += 1;// количество месяцев продаж выше среднего значения
            }
        }

        return overAverage;
    }
}


